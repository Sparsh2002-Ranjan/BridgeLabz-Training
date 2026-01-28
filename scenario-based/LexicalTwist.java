import java.util.*;

public class LexicalTwist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.contains(" ")) {
            System.out.println(s1 + " is an invalid word");
            return;
        }
        if (s2.contains(" ")) {
            System.out.println(s2 + " is an invalid word");
            return;
        }

        boolean b = true;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        StringBuilder sb = new StringBuilder();

        if (s1.length() != s2.length()) {
            b = false;
        } else {
            int a = s1.length() - 1;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(a) != s2.charAt(i)) {
                    b = false;
                    break;
                }
                a--;
            }
        }

        if (b) {
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    sb.append('@');
                } else {
                    sb.append(ch);
                }
            }
            System.out.println(sb.toString());
        } else {
            String combined = (s1 + s2).toUpperCase();

            int vowels = 0, consonants = 0;
            for (int i = 0; i < combined.length(); i++) {
                char ch = combined.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            if (vowels > consonants) {
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for (int i = 0; i < combined.length(); i++) {
                    char ch = combined.charAt(i);
                    if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                        set.add(ch);
                    }
                    if (set.size() == 2) break;
                }
                for (char c : set) {
                    System.out.print(c);
                }
            } else if (consonants > vowels) {
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for (int i = 0; i < combined.length(); i++) {
                    char ch = combined.charAt(i);
                    if (!(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                        set.add(ch);
                    }
                    if (set.size() == 2) break;
                }
                for (char c : set) {
                    System.out.print(c);
                }
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
