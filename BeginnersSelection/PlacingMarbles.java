import java.io.*;
import java.util.*;

public class PlacingMarbles {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        String s = sc.next();

        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        out.println(count);
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