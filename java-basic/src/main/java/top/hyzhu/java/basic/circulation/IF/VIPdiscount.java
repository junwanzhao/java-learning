package top.hyzhu.java.basic.circulation.IF;

import java.util.Scanner;

public class VIPdiscount {
    public static void main(String[] args) {
        System.out.println("请输入会员积分：");
        Scanner input = new Scanner(System.in);
        double  a =input.nextDouble();
        if (a<4000){
            if (a<2000 ){
                System.out.println("该会员享受的折扣是：0.9");
            }else {
                System.out.println("该会员享受的折扣是：0.8");
            }
        }else {
            if(a<8000){
                System.out.println("该会员享受的折扣是：0.7");
            } else{
                System.out.println("该会员享受的折扣是：0.6");
            }
        }
    }
}
