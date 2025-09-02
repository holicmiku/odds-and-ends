import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[2];
        st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken()); // 앞면
        arr[1] = Integer.parseInt(st.nextToken()); // 뒷면
        boolean flag = true; // 앞면
        for(int i=0; i<M; i++)
        {
            int call = Integer.parseInt(br.readLine());
            if(flag == true && arr[0] <= call)
            {
                flag =!flag;
            }
            else if(flag == false && arr[1] <= call)
            {
                flag =!flag;
            }
        }
        System.out.println(flag ? arr[0] : arr[1]);
    } 
} 
