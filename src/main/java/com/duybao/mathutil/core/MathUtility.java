package com.duybao.mathutil.core;

public class MathUtility {

    public static final double PI = 3.1415;

    //hàm getF() là hàm tính n! = 1.2.3..n
    //thiết kế hàm như sau:
    //0! = 1! = 1
    //ko có giai thừa cho số âm. Nếu đưa -5! -> CHỬI; ném ra Exception
    //vì giai thừa tăng rất nhanh, 21! long ko chứa nổi ( long 18 số 0 )
    //20! vừa đủ cho long
    //21! 22! .... -> CHỬI, ném ra Exception
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20, plz");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return (long) n * getFactorial(n - 1);

    }
}
