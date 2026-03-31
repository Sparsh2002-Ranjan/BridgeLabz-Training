package jasonpractice;

import java.io.File;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class IPLCensorship {

    public static void main(String[] args) throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();

        Match[] jsonMatches = jsonMapper.readValue(new File("IPL.json"), Match[].class);
        List<Match> matchList = new ArrayList<>(Arrays.asList(jsonMatches));

        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        List<Map<String, String>> csvRows = csvMapper
                .readerFor(new com.fasterxml.jackson.core.type.TypeReference<Map<String, String>>() {})
                .with(schema)
                .<Map<String, String>>readValues(new File("IPL.csv"))
                .readAll();

        for (Map<String, String> row : csvRows) {

            String idStr = row.get("match_id");
            String s1Str = row.get("score_team1");
            String s2Str = row.get("score_team2");

            if (idStr == null || s1Str == null || s2Str == null) {
                continue;
            }

            Match m = new Match();
            m.setMatch_id(Integer.parseInt(idStr));
            m.setTeam1(row.get("team1"));
            m.setTeam2(row.get("team2"));
            m.setWinner(row.get("winner"));
            m.setPlayer_of_match(row.get("player_of_match"));

            Map<String, Integer> score = new HashMap<>();
            score.put(row.get("team1"), Integer.parseInt(s1Str));
            score.put(row.get("team2"), Integer.parseInt(s2Str));
            m.setScore(score);

            matchList.add(m);
        }

        for (Match m : matchList) {
            m.setTeam1(maskTeamName(m.getTeam1()));
            m.setTeam2(maskTeamName(m.getTeam2()));
            m.setWinner(maskTeamName(m.getWinner()));
            m.setPlayer_of_match("REDACTED");

            Map<String, Integer> oldScore = m.getScore();
            Map<String, Integer> newScore = new HashMap<>();

            for (Map.Entry<String, Integer> entry : oldScore.entrySet()) {
                newScore.put(maskTeamName(entry.getKey()), entry.getValue());
            }
            m.setScore(newScore);
        }

        jsonMapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("IPL_censored.json"), matchList);

        CsvSchema outSchema = CsvSchema.builder()
                .addColumn("match_id")
                .addColumn("team1")
                .addColumn("team2")
                .addColumn("score_team1")
                .addColumn("score_team2")
                .addColumn("winner")
                .addColumn("player_of_match")
                .build()
                .withHeader();

        List<Map<String, Object>> csvOutput = new ArrayList<>();

        for (Match m : matchList) {
            Map<String, Object> row = new LinkedHashMap<>();
            row.put("match_id", m.getMatch_id());

            Iterator<Map.Entry<String, Integer>> it = m.getScore().entrySet().iterator();
            Map.Entry<String, Integer> t1 = it.next();
            Map.Entry<String, Integer> t2 = it.next();

            row.put("team1", m.getTeam1());
            row.put("team2", m.getTeam2());
            row.put("score_team1", t1.getValue());
            row.put("score_team2", t2.getValue());
            row.put("winner", m.getWinner());
            row.put("player_of_match", m.getPlayer_of_match());

            csvOutput.add(row);
        }

        csvMapper.writer(outSchema)
                .writeValue(new File("IPL_censored.csv"), csvOutput);

        System.out.println("Censored files created successfully!");
    }

    private static String maskTeamName(String team) {
        String[] parts = team.split(" ");
        if (parts.length >= 2) {
            return parts[0] + " ***";
        }
        return team;
    }
}
