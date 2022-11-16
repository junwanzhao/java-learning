package top.hyzhu.java.basic.circulation.FOR;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        int n=0;
        int i=0;
        int t=0;
        int k=0;
        System.out.println("Enter the number of lines:");
        Scanner input=new Scanner(System.in);
        n = input.nextInt();
        k=n;
        for ( i = 0; i <= n;i++){
            for (int j = k-1;j>0;j--) {
                System.out.print("");
            }
            for( t =i+1;t>0;t--){
                System.out.print(t);
            }
            for(int p=1;p<i+1;p++){
                System.out.print(p+1);
            }
            for(int j=k-1;j>0;j--) {
                System.out.print(" ");
            }
            System.out.println();
            k-=1;
        }

    }
}
