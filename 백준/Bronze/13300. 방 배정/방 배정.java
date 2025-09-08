import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int male[] = {0,0,0,0,0,0,0};
        int female[] = {0,0,0,0,0,0,0};
        for(int i=0; i<N; i++)
        {
            st = new StringTokenizer(br.readLine());
            if(Integer.parseInt(st.nextToken()) == 0)
            {
                female[Integer.parseInt(st.nextToken())]++;
            }
            else
            {
                male[Integer.parseInt(st.nextToken())]++;
            }
        }

        int result=0;
        for(int i=1; i<=6; i++)
        {
            if(male[i]%K == 0)
            {
                
                result+=male[i]==0 ? 0 : male[i]/K;
            }
            else
            {
                result+=male[i]==0 ? 0 : male[i]/K+1;
            }

            if(female[i]%K == 0)
            {
                result+=female[i]==0 ? 0 : female[i]/K;
            }
            else
            {
                result+=female[i]==0 ? 0 : female[i]/K+1;
            }
        }

        System.out.println(result);
    } 
} 
