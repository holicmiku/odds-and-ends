import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int arr[] = new int[N+1];
        int target[] = new int[M+1];
        int miss=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=M; i++)
        {
            int score = Integer.parseInt(st.nextToken());
            target[i]=score;
        }
        
        for(int i=1; i<=M; i++)
        {
            st = new StringTokenizer(br.readLine());
            int target_num = target[i];
            miss=0;
            for(int j=1; j<=N; j++)
            {
                int choose = Integer.parseInt(st.nextToken());
                if(target[i] == choose)
                {
                    arr[j]++;
                }
                else{
                    miss++;
                }
            }
            arr[target_num]+=miss;
        }
        for(int i=1; i<=N; i++)
        {
            System.out.println(arr[i]);
        }
    } 
} 
