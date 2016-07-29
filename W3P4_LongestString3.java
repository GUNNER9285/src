
import java.util.Scanner;


public class W3P4_LongestString3 {
        public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int max = Integer.MIN_VALUE;
        String longestStr = " ";
        for (int i=0; i<5; ++i)
        {
            String str = scan.nextLine();
            int maxR=str.length();
            if (maxR>=max)
            {
                max=maxR;
                longestStr = str;
            }
        }
        System.out.println(longestStr);
    }
    
}
