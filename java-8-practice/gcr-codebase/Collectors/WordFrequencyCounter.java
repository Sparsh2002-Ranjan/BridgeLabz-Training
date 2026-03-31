
import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "java streams java collectors streams";

        Map<String, Integer> wordCount =
            Arrays.stream(paragraph.split("\\s+"))
            .collect(Collectors.toMap(
                w -> w,
                w -> 1,
                Integer::sum
            ));

        System.out.println(wordCount);
    }
}
