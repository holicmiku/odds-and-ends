import java.io.*; 
import java.util.*; 
 
public class Main { 
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num[] = {
                        "0000\n" + 
                        "0  0\n" + 
                        "0  0\n" + 
                        "0  0\n" + 
                        "0000",
                        "   1\n" + 
                        "   1\n" + 
                        "   1\n" + 
                        "   1\n" + 
                        "   1",
                        "2222\n" + 
                        "   2\n" + 
                        "2222\n" + 
                        "2\n" + 
                        "2222",
                        "3333\n" + 
                        "   3\n" + 
                        "3333\n" + 
                        "   3\n" + 
                        "3333",
                        "4  4\n" + 
                        "4  4\n" + 
                        "4444\n" + 
                        "   4\n" + 
                        "   4",
                        "5555\n" + 
                        "5\n" + 
                        "5555\n" + 
                        "   5\n" + 
                        "5555",
                        "6666\n" + 
                        "6\n" + 
                        "6666\n" + 
                        "6  6\n" + 
                        "6666",
                        "7777\n" + 
                        "   7\n" + 
                        "   7\n" + 
                        "   7\n" + 
                        "   7",
                        "8888\n" + 
                        "8  8\n" + 
                        "8888\n" + 
                        "8  8\n" + 
                        "8888",
                        "9999\n" + 
                        "9  9\n" + 
                        "9999\n" + 
                        "   9\n" + 
                        "   9",
    };
    String str = br.readLine();
    for(int i=0; i<str.length(); i++)
    {
        if(str.charAt(i)=='0')
        {
            System.out.println(num[0]);
        }
        else if(str.charAt(i)=='1')
        {
            System.out.println(num[1]);
        }
        else if(str.charAt(i)=='2')
        {
            System.out.println(num[2]);
        }
        else if(str.charAt(i)=='3')
        {
            System.out.println(num[3]);
        }
        else if(str.charAt(i)=='4')
        {
            System.out.println(num[4]);
        }
        else if(str.charAt(i)=='5')
        {
            System.out.println(num[5]);
        }
        else if(str.charAt(i)=='6')
        {
            System.out.println(num[6]);
        }
        else if(str.charAt(i)=='7')
        {
            System.out.println(num[7]);
        }
        else if(str.charAt(i)=='8')
        {
            System.out.println(num[8]);
        }
        else if(str.charAt(i)=='9')
        {
            System.out.println(num[9]);
        }
        System.out.println();
    }
    
    } 
} 
