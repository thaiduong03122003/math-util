package com.sgu.mathutil;

public class MathUtil {
    //n! = 1.2.3.4.5...n
    //Quy ước 0! = 1
    //Không tính giai thừa cho số âm
    //20! là vừa khớp kiểu long
    //21! là vượt quá phạm vi của kiểu dữ liệu 'long'
    //nếu đưa vào âm, 21 giai thừa thì đặt một cái hàm ngoại lệ
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument, number must be between 0 .. 20!");
        if (n == 0 || n == 1)
            return 1;
        long product = 1; //tích khởi đầu = 1, nhồi 2 3 4 5 ... n

        for (int i = 2; i <= n; i++)
            product *= i;
        return product;

    }
}