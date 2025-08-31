import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int count=0;
            for(int a=1; a<=W; a++)
            {
                for(int b=1; b<=H; b++)
                {
                    count+=1;
                    if(count == N)
                    {
                        sb.append(b*100+a+"\n");
                    }
                }
            }
        }
        System.out.print(sb);
    } 
} 
