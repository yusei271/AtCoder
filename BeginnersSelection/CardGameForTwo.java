import java.io.*;
import java.util.*;

public class CardGameForTwo {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int sumAlice = 0;
        int sumBob = 0;

        for (int i = 0; i < N; i++) {
            if ((N - i) % 2 == 0) {
                sumAlice += a[N - 1 - i];
            } else {
                sumBob += a[N - 1 - i];
            }
        }
        out.println(sumAlice - sumBob);
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