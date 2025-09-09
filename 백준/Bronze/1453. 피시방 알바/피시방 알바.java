import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sit[] = new int[101];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++)
        {
            int customer = Integer.parseInt(st.nextToken());
            sit[customer]++;
        }

        int dup = 0;

        for(int i=1; i<=100; i++)
        {
            dup += sit[i] >= 1 ? sit[i]-1 : 0;
        }

        System.out.println(dup);


        

    } 
} 
