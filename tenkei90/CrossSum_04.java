// Precompute rowSum + colSum and subtract A[i][j].

package tenkei90;

import java.io.*;
import java.util.*;

public class CrossSum_04 {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int H = sc.nextInt();
        int W = sc.nextInt();

        int[][] A = new int[H][W];
        long[] rowSum = new long[H];
        long[] colSum = new long[W];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                int x = sc.nextInt();
                A[i][j] = x;
                rowSum[i] += x;
                colSum[j] += x;
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                long blackCount = rowSum[i] + colSum[j] - A[i][j];
                out.print(blackCount);
                if (j + 1 < W) out.print(" ");
            }
            out.println();
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