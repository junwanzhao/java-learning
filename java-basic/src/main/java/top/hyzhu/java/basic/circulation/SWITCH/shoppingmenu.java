package top.hyzhu.java.basic.circulation.SWITCH;

import java.util.Scanner;

public class shoppingmenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("          欢迎使用购物系统");
        System.out.println(" 1.登录系统");
        System.out.println(" 2.退出");
        System.out.println("* * * * * * * * * * * * * * * *     ");
        System.out.println(" 请输入选择，输入数字：");
        if (scanner.hasNextInt()) {
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println("******主菜单********");
                    System.out.println("   1.客户信息管理");
                    System.out.println("   2.购物结算");
                    System.out.println("   3，真情回馈");
                    System.out.println("   4.注销");
                    y = scanner.nextInt();
                    switch (y) {
                        case 1:
                            System.out.println("购物管理系统>客户信息管理");
                            System.out.println("1.显示所有客户信息");
                            System.out.println("2.添加客户信息");
                            System.out.println("3，修改客户信息");
                            System.out.println("4.查询客户信息");
                            break;
                        case 3:
                            System.out.println("购物管理系统>真情回馈");
                            System.out.println("1.幸运大放送");
                            System.out.println("2.幸运抽奖");
                            System.out.println("3，生日问候");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("感谢您的使用！");
                    break;
                default:
                    System.out.println("请输入正确数字：");

            }

        }
    }
}
