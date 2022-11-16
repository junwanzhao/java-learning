package top.hyzhu.java.basic.circulation.IF;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.println("请输入是否是会员：是(y)否（n)");
        Scanner input = new Scanner(System.in);
        String  a =input.next();
        System.out.println("请输入购物金额：");
        double num1= input.nextDouble();
        if (a.equals("y")){
            if (num1<200 && num1 >= 0){
                double num2= num1*0.8;
                System.out.println("实际支付"+num2);
            }else {
                double num2=num1*0.75;
                System.out.println("实际支付"+num2);
            }
        }else {
            if(num1 >=100){
                double num2=num1*0.9;
                System.out.println("实际支付"+num2);
            }
            if (num1<100&&num1>=0){
                System.out.println("实际支付"+num1);
            }
        }
    }
}
