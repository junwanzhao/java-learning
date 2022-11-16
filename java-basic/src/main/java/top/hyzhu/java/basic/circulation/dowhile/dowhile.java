package top.hyzhu.java.basic.circulation.dowhile;

import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        System.out.println("欢迎使用MyShopping管理系统");
        System.out.println("********************************");
        System.out.println("1.客户信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.真情回馈");
        System.out.println("4.注销");
        System.out.println("************************************");
        int a=0;
        Scanner input = new Scanner(System.in);
        System.out.println("请选择，输入数字：");
        do {
            a = input.nextInt();
            switch (a) {
                case 1:
                    System.out.println("执行客户信息管理");
                    break;
                case 2:
                    System.out.println("执行购物结算");
                    break;
                case 3:
                    System.out.println("执行真情回馈");
                    break;
                case 4:
                    System.out.println("执行注销");
                    break;
                default:
                    System.out.println("输入错误，请重新输入数字：");
            }
        }
        while (!( 0 <a && a<5) );
    }
}
