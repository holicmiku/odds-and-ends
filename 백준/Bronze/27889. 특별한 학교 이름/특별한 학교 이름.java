import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = br.readLine().charAt(0);
        StringBuilder sb = new StringBuilder();
        if(c == 'N')
        {
            sb.append("North London Collegiate School");
        }
        else if(c == 'B')
        {
            sb.append("Branksome Hall Asia");
        }
        else if(c == 'K')
        {
            sb.append("Korea International School");
        }
        else if(c == 'S')
        {
            sb.append("St. Johnsbury Academy");
        }
        System.out.println(sb);
    } 
} 
