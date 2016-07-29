
import java.util.Scanner;


public class W3P5_LongestString4 {
            public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int max = Integer.MIN_VALUE;
        String longestStr = " ";
        for (;;)
        {
            String str = scan.nextLine();
            int maxR=str.length();
            if (maxR==0)
            {
                break;
            }
            if (maxR>=max)
            {
                max=maxR;
                longestStr = str;
            }
        }
        System.out.println(longestStr);
    }
}
