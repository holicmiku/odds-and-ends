import java.io.*; 
import java.util.*; 
import java.math.*;
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());
        sb.append(A.add(B)+"\n").append(A.subtract(B)+"\n").append(A.multiply(B));
        System.out.println(sb);
    } 
} 
