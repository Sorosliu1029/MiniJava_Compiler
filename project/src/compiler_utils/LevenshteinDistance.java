package compiler_utils;

/**
 * Created by SorosLiu on 16/12/10.
 */
public class LevenshteinDistance {
    public static double similarity(String wrongWord, String rightWord) {
        final int m = wrongWord.length();
        final int n = rightWord.length();

        int[][] d = new int[m + 1][n + 1];
        for (int j = 0; j <= n; ++j) {
            d[0][j] = j;
        }
        for (int i = 0; i <= m; ++i) {
            d[i][0] = i;
        }

        for (int i = 1; i <= m; ++i) {
            char ci = wrongWord.charAt(i - 1);
            for (int j = 1; j <= n; ++j) {
                char cj = rightWord.charAt(j - 1);
                if (ci == cj) {
                    d[i][j] = d[i - 1][j - 1];
                } else {
                    d[i][j] = Math.min(d[i - 1][j - 1] + 1, Math.min(d[i][j - 1] + 1, d[i - 1][j] + 1));
                }
            }
        }
        return 1 - (double) d[m][n] / Math.max(m, n);
    }
}
