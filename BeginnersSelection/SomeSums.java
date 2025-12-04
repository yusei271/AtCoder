import java.io.*;
import java.util.*;

public class SomeSums {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int totalSum = 0;
        for (int i = 1; i <= N; i++) {
            int digitSum = 0;
            int temp = i;

            while (temp > 0) {
                digitSum += temp % 10;
                temp /= 10;
            }

            if (digitSum >= A && digitSum <= B) {
                totalSum += i;
            }
        }
        out.println(totalSum);
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