package top.hyzhu.java.basic.circulation.FOR;

import java.util.Scanner;

public class proportion {
    public static void main(String[] args) {
        double num=0;
        double num1=0;
        int age=0;
        for(int i=1;i<11;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入第"+i+"位顾客的年龄；"+age);
            age = input.nextInt();
            if(age>=30) {
                num+=1;
            }else{
                num1+=1;
            }
        }
        double up=num/10*100;
        double down= num1/10*100;
        System.out.println("30岁以上的比例是："+up+"%");
        System.out.println("30岁以下的比例是："+down+"%");
    }
}
