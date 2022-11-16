package top.hyzhu.java.basic.circulation;

import java.util.Scanner;

public class tests {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    static void test1() {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i += 2;
        }
        System.out.println("计算100之内的所有奇数之和：" + sum);
    }

    static void test2() {
        int count = 0;
        for (int i = 2; i < 100; i++) {
            boolean b = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                count++;
                System.out.print(i + " ");
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
    static void test3() {
        int max;
        int min;
        int num;
        System.out.println("请输入一些数据，输入0终止程序");
        Scanner scan=new Scanner (System.in);
        max=min=num= scan.nextInt();
        while (num!=0){
            if (num>max){
                max=num;
            }
            if (num<min){
                min=num;
            }
            System.out.println("请继续输入，输入0终止程序");
            num= scan.nextInt();
        }
        System.out.println("输入的整数最大为："+max);
        System.out.println("输入的整数最小为："+min);
    }
    static void test4(){
        int ge,shi,bai;
        for(int i=100;i<1000;i++)
        {
            ge = i%10;
            shi = i/10%10;
            bai = i/10/10%10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i)
            {
                System.out.println("1000以内水仙花数"+i);
            }
        }
    }
}
