package top.hyzhu.java.basic.circulation.IF;

import java.util.Scanner;

public class member {
    public static void main(String[] args) {
        System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息\n");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入会员号(<4位整数）：");
        int x = input.nextInt();
        System.out.println("请输入会员生日（月/日<用两位数表示>)：");
        String y = input.next();
        System.out.println("请输入积分：");
        int z = input.nextInt();
        if (x >= 1000 && x <= 9999) {
            System.out.println("\n已录入的会员信息是：");
            System.out.println(x + "\t" + y + "\t" + z);
        }else {
            System.out.println("\n客户" + x + "是无效会员！");
            System.out.println("录入信息失败！");
        }

    }
}
