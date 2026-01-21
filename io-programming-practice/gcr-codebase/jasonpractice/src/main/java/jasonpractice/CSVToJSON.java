package jasonpractice;
import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CSVToJSON {

    public static void main(String[] args) throws Exception {

        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        MappingIterator<Object> iterator =
                csvMapper.readerFor(Object.class)
                         .with(schema)
                         .readValues(new File("users.csv"));

        List<Object> data = iterator.readAll();

        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writerWithDefaultPrettyPrinter()
                                .writeValueAsString(data);

        System.out.println(json);

        jsonMapper.writeValue(new File("users.json"), data);
    }
}
