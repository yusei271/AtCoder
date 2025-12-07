import java.io.*;
import java.util.*;

public class Hakuchumu {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String s = sc.next();

        String[] words = {"dreamer", "eraser", "dream", "erase"};

        boolean ok = true;
        while (!s.isEmpty()) {
            boolean matched = false;

            for (String w : words) {
                if (s.endsWith(w)) {
                    s = s.substring(0, s.length() - w.length());
                    matched = true;
                    break;
                }
            }
            if (!matched) {
                ok = false;
                break;
            }
        }
        if (ok) {
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