import java.io.*;
import java.util.*;

public class Travelling {
    static FastScanner sc = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = sc.nextInt(); // Get the number of travel plans
        int t_prev = 0; // Variables to store the previous state
        int x_prev = 0;
        int y_prev = 0;
        boolean canTravel = true;

        // Iterate through each plan
        for (int i = 0; i < N; i++) {
            int t_curr = sc.nextInt();
            int x_curr = sc.nextInt();
            int y_curr = sc.nextInt();

            int dt = t_curr - t_prev; // Calculate the time available

            int dist = Math.abs(x_curr - x_prev) + Math.abs(y_curr - y_prev); // Calculate the distance to travel

            // Condition1
            if (dist > dt) {
                canTravel = false;
                break;
            }

            // Condition2
            if ((dt -dist) % 2 != 0) { // Parity must be matched
                canTravel = false;
                break;
            }

            // Check accepted and loop next
            t_prev = t_curr;
            x_prev = x_curr;
            y_prev = y_curr;

        }

        // Output
        if (canTravel) {
            out.println("Yes");
        } else {
            out.println("No");
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