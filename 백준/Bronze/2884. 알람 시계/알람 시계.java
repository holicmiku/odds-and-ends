import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        boolean minus= minute - 45 < 0 ? true : false;
        if(minus)
        {
            hour-=1;
            minute += 15;
        }
        else
        {
            minute -= 45;
        }

        if(hour < 0)
        {
            hour = 23;
        }

        System.out.println(hour + " " +minute);
        
    } 
} 
