
import java.util.Scanner;


public class W3P2_LongestString1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int max = Integer.MIN_VALUE;
        for (int i=0; i<5; ++i)
        {
            String str = scan.nextLine();
            int maxR=str.length();
            if (maxR>max)
            {
                max=maxR;
            }
        }
        System.out.println(max);
    }
    
}
