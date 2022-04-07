import java.util.*;
import java.lang.*;

public class Solution1 {
    public static void main(String[] args) {
        //System.out.println("Take input");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.

        for (int i = 1; i <= t; ++i) {
            //System.out.println("Hello");
            int a = sc.nextInt();
            int b = sc.nextInt();

            //System.out.println("Hello1");

            int k = 0, prod = 0, sum = 0, ans = 0, num = 0, dig = 0;

            for (k = a; k <= b; k++) {
                num = k;
                sum = 0;
                prod = 1;
                dig = 0;

                while (num != 0) {
                    dig = num % 10;
                    sum += dig;
                    prod = prod * dig;
                    num = num / 10;
                }

                //System.out.println(prod + " " + sum);
                if ((prod % sum) == 0) {
                    ans++;
                }
            }

            System.out.println("Case #" + i + ": " + ans);
        }
    }
}

/*
model entity
services

Front (MVC)
Back(Api, business, dao)
 */