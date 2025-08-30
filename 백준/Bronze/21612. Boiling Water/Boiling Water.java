import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B = Integer.parseInt(br.readLine());
        int P = 5*B-400;
        System.out.println(P);
        System.out.println(P>100 ? -1  : P==100 ? 0 : 1);
    } 
} 
