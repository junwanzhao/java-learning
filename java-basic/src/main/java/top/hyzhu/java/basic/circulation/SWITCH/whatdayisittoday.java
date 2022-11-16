package top.hyzhu.java.basic.circulation.SWITCH;

import java.util.Scanner;

public class whatdayisittoday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: (e.g, 2012): ");
        int year = input.nextInt();
        System.out.print("Enter a month: 1-12:  ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: ");
        int day = input.nextInt();
        int Month = month;
        switch (Month){
            case 1:
                month = 13; year -=1;
                break;
            case 2:
                month = 14; year -=1;
                break;
        }
        int century = year / 100;
        int yearOfCentury = year % 100;
        int TheDayIs = (day + 26 * (month + 1) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;
        switch (TheDayIs){
            case 0 :
                System.out.println("Day of the week is Saturday");
                break;
            case 1 :
                System.out.println("Day of the week is Sunday");
                break;
            case 2 :
                System.out.println("Day of the week is Monday");
                break;
            case 3 :
                System.out.println("Day of the week is Tuesday");
                break;
            case 4 :
                System.out.println("Day of the week is Wednesday");
                break;
            case 5 :
                System.out.println("Day of the week is Thursday");
                break;
            case 6 :
                System.out.println("Day of the week is Friday");
                break;
        }

    }
}
