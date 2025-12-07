import java.io.*;
import java.util.*;

public class KagamiMochi {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] d = new int[N];

        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }

        Arrays.sort(d);

        int count = 1;
        for (int i = 0; i < N - 1; i++) {
            if (d[i] < d[i + 1]) {
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