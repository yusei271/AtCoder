import java.io.*;
import java.util.*;

public class WelcomeToAtcoder {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        // a, b, c, s を読む
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String s = sc.next();

        int sum = a + b + c;

        // a + b + c と s を空白区切りで出力
        out.println(sum + " " + s);
        out.flush();
    }

    // ===== テンプレ =====
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