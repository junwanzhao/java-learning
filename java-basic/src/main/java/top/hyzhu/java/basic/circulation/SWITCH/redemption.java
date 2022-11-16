package top.hyzhu.java.basic.circulation.SWITCH;

import java.util.Scanner;

public class redemption {
    public static void main(String[] args) {
        System.out.println("请输入消费金额：");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("是否参加优惠换购活动：是(y)否（n)");
        Scanner input = new Scanner(System.in);
        String a = input.next();
        if (a.equals("y")) {
            System.out.println(" 1.满50元，加2元换购百事可乐饮料1瓶");
            System.out.println(" 2.满100元，加3元换购500ml可乐一瓶");
            System.out.println(" 3.满100元，加10元换购5公斤面粉");
            System.out.println(" 4.满200元，加10元可换购1个苏波尔炒菜锅");
            System.out.println(" 5.满200元，加20元可换购欧莱雅爽肤水一瓶");
            System.out.println(" 0.不换购");
            System.out.println("请选择：");
            int y = scanner.nextInt();
            switch (y) {
                case 1:
                    if (x>=50) {
                        int b = x + 2;
                        System.out.println(" 本次消费金额：" + b);
                        System.out.println(" 成功换购:百事可乐饮料一瓶。");
                        break;
                    }
                case 2:
                    if (x>=100) {
                        int c = x + 3;
                        System.out.println(" 本次消费金额：" + c);
                        System.out.println(" 成功换购:500ml可乐一瓶。");
                        break;
                    }
                case 3:
                    if (x>=100) {
                        int d = x + 10;
                        System.out.println(" 本次消费金额：" + d);
                        System.out.println(" 成功换购:5公斤面粉。");
                        break;
                    }
                case 4:
                    if (x>=200) {
                        int e = x + 10;
                        System.out.println(" 本次消费金额：" + e);
                        System.out.println(" 成功换购:1个苏波尔炒菜锅");
                        break;
                    }
                case 5:if (x>=200) {
                    int f = x + 20;
                    System.out.println(" 本次消费金额：" + f);
                    System.out.println(" 成功换购：欧莱雅爽肤水一瓶");
                    break;
                }
                case 0:
                    System.out.println("不换购。");
                    break;
            }
        }else{
            System.out.println("您选择了不换购，谢谢您的惠顾！");
        }
    }
}
