import java.io.*;
import java.util.*;

public class ShiftOnly {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int firstA = sc.nextInt();
        int minCount = 0;

        while (firstA > 0 && firstA % 2 == 0) {
            firstA /= 2;
            minCount++;
        }
        
        for (int i = 1; i < N; i++) {
            int a = sc.nextInt();
            int count = 0;

            while (a > 0 && a % 2 == 0) {
                a /= 2;
                count++;
            }

            if (count < minCount) {
                minCount = count;
            }
        }
        out.println(minCount);
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