import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        char[] str = new char[20];
        for(int i=0; i<N; i++)
        {
            str = br.readLine().toCharArray();
            for(int j=0; j<str.length; j++)
            {
                if(str[j] - 65 < 32)
                {
                    str[j] = (char)(str[j] + 32);
                }
            }
            String answer = new String(str);
            sb.append(answer+"\n");

        }
        System.out.println(sb);
           
    } 
} 
