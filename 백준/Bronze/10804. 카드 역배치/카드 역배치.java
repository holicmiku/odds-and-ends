import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
      
        
        for(int i=0; i<10; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            change_pos(arr,start,end);
        }
        
        for(int i=1; i<=20; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static int[] change_pos (int[] arr, int start, int end)
    {
        int[] copy_arr = new int[21];
        for(int i=1; i<21; i++)
        {
            copy_arr[i] = arr[i];
        }

        for(int i=0; i<=end-start; i++)
        {
            int temp=0;
            temp = arr[end-i]; 
            arr[end-i] = copy_arr[start+i];
            copy_arr[start+i] = temp;
        }

        return copy_arr;
    }
} 
