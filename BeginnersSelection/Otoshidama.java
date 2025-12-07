import java.io.*;
import java.util.*;

public class Otoshidama {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int Y = sc.nextInt();

        int resX = -1;
        int resY = -1;
        int resZ = -1;

        for (int x = 0; x <= N; x++) {
            for (int y = 0; y <= N - x; y++) {
                int z = N - x - y;

                int total = 10000 * x + 5000 * y + 1000 * z;

                if (total == Y) {
                    resX = x;
                    resY = y;
                    resZ = z;
                    break;
                }
            }
            if (resX != -1) {
                break;
            }
        }
        out.println(resX + " " + resY + " " + resZ);
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