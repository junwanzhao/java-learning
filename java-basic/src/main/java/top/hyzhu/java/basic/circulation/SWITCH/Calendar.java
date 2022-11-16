package top.hyzhu.java.basic.circulation.SWITCH;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        int year;
        int firstDay;
        int num = 0;
        int date, num_blank; // 日期，当月第一天前面的空格数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份和该年第一天是星期几：");
        year = scanner.nextInt();
        firstDay = scanner.nextInt();
        for(int month=1;month<=12;month++){
            System.out.print("           ");
            switch(month){
                case 1:
                    System.out.println("January"+year);
                    num= 31;
                    break;
                case 2:
                    System.out.println("February"+year);
                    if(year%400==0||(year%4==0&&year%10!=0)){
                        num= 29;
                    }else {
                        num = 28;
                    }
                    break;
                case 3:
                    System.out.println("March"+year);
                    num= 31;
                    break;
                case 4:
                    System.out.println("April"+year);
                    num= 30;
                    break;
                case 5:
                    System.out.println("May"+year);
                    num= 31;
                    break;
                case 6:
                    System.out.println("June"+year);
                    num= 31;
                    break;
                case 7:
                    System.out.println("July"+year);
                    num= 31;
                    break;
                case 8:
                    System.out.println("August"+year);
                    num= 31;
                    break;
                case 9:
                    System.out.println("September"+year);
                    num= 30;
                    break;
                case 10:
                    System.out.println("October"+year);
                    num= 31;
                    break;
                case 11:
                    System.out.println("November"+year);
                    num= 30;
                    break;
                case 12:
                    System.out.println("December"+year);
                    num= 31;
                    break;
            }
            System.out.println("----------------------------------------------------");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
            for (num_blank = 0; num_blank < num % 7; num_blank++)
                System.out.print(" \t");
            for (date = 1; date <= num; date++)
                if ((date + num_blank) % 7 == 0)
                    System.out.println(date);
                else
                    System.out.print(date + "\t");
            if ((date - 1 + num_blank) % 7 != 0)
                System.out.println();
        }
    }
}

