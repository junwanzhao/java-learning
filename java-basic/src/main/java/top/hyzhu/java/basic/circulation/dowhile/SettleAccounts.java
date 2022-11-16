package top.hyzhu.java.basic.circulation.dowhile;

import java.util.Scanner;

public class SettleAccounts {
    public static void main(String[] args) {
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.T组        2·网球鞋        3·网球拍");
        System.out.println("*************************************");
        int a;
        int b = 0;
        int c = 0;
        int d = 0;
        String answer = null;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入商品编号：");
            a = input.nextInt();
            switch (a) {
                case 1:
                    System.out.println("请输入购买数量：");
                    b = input.nextInt();
                    System.out.println("T恤￥245.0" + "\t\t\t" + "数量" + b + "\t\t\t" + "合计￥" + 245.0 * b);
                    System.out.println("是否继续(y/n)");
                    answer = input.next();
                    break;
                case 2:
                    System.out.println("请输入购买数量：");
                    c = input.nextInt();
                    System.out.println("网球鞋￥300.0" + "\t\t\t" + "数量" + c + "\t\t\t" + "合计￥" + 300.0 * c);
                    System.out.println("是否继续(y/n)");
                    answer = input.next();
                    break;
                case 3:
                    System.out.println("请输入购买数量：");
                    d = input.nextInt();
                    System.out.println("网球拍￥320.2" + "\t\t\t" + "数量" + d + "\t\t\t" + "合计￥" + 320.0 * d);
                    System.out.println("是否继续(y/n)");
                    answer = input.next();
                    break;
                default:
            }
        }
        while ("y".equals(answer));
        System.out.println("折扣：0.8");
        int e = 245 * b + 300 * c + 320 * d;
        System.out.println("应付金额：" + e);
        System.out.println("实付金额：" + e * 0.8);
        System.out.println("找钱：" + e * 0.2);
    }
}
