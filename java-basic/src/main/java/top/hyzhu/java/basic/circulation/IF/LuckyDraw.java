package top.hyzhu.java.basic.circulation.IF;

import java.util.Scanner;

public class LuckyDraw {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入4位会员卡号");
        int x = input.nextInt();
        int y = x/1000;
        int z = x%1000/100;
        int m = x%1000%100/10;
        int n = x%3560;
        int a =y+z+m+n;
        System.out.println("会员卡号"+x+"各位之和："+a);
        System.out.println("是幸运客户吗？");
        if (a>20) {
            System.out.println("ture");
        }else {
            System.out.println("false");
        }
    }
}

