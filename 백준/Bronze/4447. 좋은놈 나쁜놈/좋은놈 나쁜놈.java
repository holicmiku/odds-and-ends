import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int gcount = 0;
            int bcount = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'g' || str.charAt(j) == 'G') {
                    gcount++;
                } else if (str.charAt(j) == 'b' || str.charAt(j) == 'B') {
                    bcount++;
                }
            }

            if (gcount == bcount) {
                sb.append(str).append(" is NEUTRAL").append("\n");
            } else if (gcount > bcount) {
                sb.append(str).append(" is GOOD").append("\n");
            } else {
                sb.append(str).append(" is A BADDY").append("\n");
            }
        }
        System.out.print(sb);
    }
}
