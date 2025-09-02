import java.io.*; 
import java.util.*; 
import java.math.*;
public class Main { 
    static BigInteger[] arr = new BigInteger[91];
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Arrays.fill(arr,BigInteger.valueOf(-1));
        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;
        System.out.println(fibo(n));
    }
    public static BigInteger fibo(int n)
    {
        if(arr[n] == BigInteger.valueOf(-1))
        {
            arr[n] = fibo(n-1).add(fibo(n-2));
        }
        return arr[n];
    } 
} 
