
import java.util.Scanner;


public class W3P6_LongestCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int max = Integer.MIN_VALUE;
        String longestStr = " ";
        int count=0;
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
                if (maxR>max)
                {
                    max=maxR;
                    count=0;
                }
                if (maxR==max)
                {
                    ++count;
                }
            }
        }

        System.out.println(""+max+"\n"+""+count);
    }
}
