package com.sgu.mathutil;

public class Main {
    public static void main(String[] args) {
        long resutl = MathUtil.getFactorial(5);
        System.out.println("5! = " + resutl);
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("0! = 1;   actual: " + MathUtil.getFactorial(0)) ;
    }
}
