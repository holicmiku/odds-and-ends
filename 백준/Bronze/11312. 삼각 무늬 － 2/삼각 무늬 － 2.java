import java.io.*; 
import java.util.*; 
import java.math.*;

public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger A = new BigInteger(st.nextToken());
            BigInteger B = new BigInteger(st.nextToken());
            sb.append(A.divide(B).multiply(A.divide(B))).append("\n");
        }
        System.out.print(sb);
    } 
} 
