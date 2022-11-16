package top.hyzhu.java.basic.circulation.FOR;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int right = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 5; i++) {
            int a = (int) (Math.random() * 100 + 1);
            int b = (int) (Math.random() * 100 + 1);
            System.out.println(a + "+" + b + "=");
            int answer = sc.nextInt();
            if (answer == a + b) {
                right += 1;
                System.out.println("   correct");
            }else{
                System.out.println("   wrong");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("您花了" + (endTime - startTime) / 1000 + "秒做题,做对" + right + "道题目。");
    }
}
