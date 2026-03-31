import java.util.*;

public class ParagraphAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine();
        String target = sc.nextLine();
        String replacement = sc.nextLine();
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Word Count: 0");
            System.out.println("Longest Word: None");
            System.out.println("Modified Paragraph:");
            return;
        }
        String[] words = paragraph.trim().split("\\s+");
        int wordCount = words.length;
        String longestWord = "";
        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }
        String newParagraph = paragraph.replaceAll(
                "(?i)\\b" + target + "\\b",
                replacement
        );
        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Modified Paragraph:");
        System.out.println(newParagraph);
    }
}
