import java.util.*;

class LongestPalindromicSubstring {

    static int maxLen = 0;
    static int maxStart = 0;
    static int maxEnd = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(longestPalindrome(s));
    }

    static boolean solveRec(int start, int end, String s, Boolean[][] dp) {
        if (start > end) return true;
        if (dp[start][end] != null) return dp[start][end];

        boolean match = s.charAt(start) == s.charAt(end);
        boolean finalMatch = match && solveRec(start + 1, end - 1, s, dp);

        if (!finalMatch) {
            solveRec(start + 1, end, s, dp);
            solveRec(start, end - 1, s, dp);
        }

        if (finalMatch && end - start + 1 > maxLen) {
            maxLen = end - start + 1;
            maxStart = start;
            maxEnd = end;
        }

        return dp[start][end] = finalMatch;
    }

    static String longestPalindrome(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n];
        solveRec(0, n - 1, s, dp);
        return s.substring(maxStart, maxEnd + 1);
    }
}
