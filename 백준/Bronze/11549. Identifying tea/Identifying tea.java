import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum=0;
        sum += Integer.parseInt(st.nextToken()) == T ? 1 : 0;
        sum += Integer.parseInt(st.nextToken()) == T ? 1 : 0;
        sum += Integer.parseInt(st.nextToken()) == T ? 1 : 0;
        sum += Integer.parseInt(st.nextToken()) == T ? 1 : 0;
        sum += Integer.parseInt(st.nextToken()) == T ? 1 : 0;
        System.out.println(sum);
        
    } 
} 
