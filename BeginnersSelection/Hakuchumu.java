import java.io.*;
import java.util.*;

public class Hakuchumu {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String S = sc.next();

        StringBuilder sb = new StringBuilder(S);
        String reversedS = sb.reverse().toString();

        String[] words = {"dream", "dreamer", "erase", "eraser"};
        String[] reversedWords = new String[4];
        for (int i = 0; i < 4; i++) {
            reversedWords[i] = new StringBuilder(words[i]).reverse().toString();
        }

        int i = 0;
        boolean canConstruct = true;

        while (i < reversedS.length()) {
            boolean matched = false;

            for (String word : reversedWords) {
                if (reversedS.startsWith(word, i)) {
                    i += word.length();
                    matched = true;
                    break;
                }
            }

            if (!matched) {
                canConstruct = false;
                break;
            }
        }

        if (canConstruct) {
            out.println("YES");
        } else {
            out.println("NO");
        }
        out.flush();
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
    }
}