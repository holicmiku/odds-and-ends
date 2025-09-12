import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        
        if(W<L)
        {
            System.out.println(0);
        }
        else if(H<L)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println((W/L)*(H/L) >= N ? N : (W/L)*(H/L));
        }
    } 
} 
