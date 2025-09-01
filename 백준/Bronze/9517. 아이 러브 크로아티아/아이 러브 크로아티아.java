import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int total=0;
        int boomber = start;
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int solvetime = Integer.parseInt(st.nextToken());
            char result = st.nextToken().charAt(0);
            total+=solvetime;
            if(total > 210 && !flag)
            {
                sb.append(boomber);
                flag=true;
            }

            if(result=='T' && boomber == 8)
            {
                boomber = 1;
            }
            else if(result=='T')
            {
                boomber++;
            }
        }
        System.out.println(sb);
    } 
} 
