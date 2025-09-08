import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int min=1001;
        int max=-1;
        int first=0;
        for(int i=0; i<N; i++)
        {
            int difficulty = Integer.parseInt(br.readLine());
            if(i==0)
            {
                first = difficulty;
            }
            
            if(max <= difficulty)
            {
                max = difficulty;
            }

            if(min >= difficulty)
            {
                min = difficulty;
            }
        }
        System.out.println(first == max ? "hard" : first == min ? "ez" : "?" );
    } 
} 
