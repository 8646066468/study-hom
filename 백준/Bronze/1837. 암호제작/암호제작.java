import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger; 
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
       
        BigInteger P = new BigInteger(st.nextToken());
        
        
        int K = Integer.parseInt(st.nextToken());

        
        boolean isGood = true;
        int result = 0;

        
        for (int i = 2; i < K; i++) {
            
            if (P.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO) == 0) {
                isGood = false;
                result = i;
                break; 
            }
        }

        if (isGood) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD " + result);
        }
    }
}