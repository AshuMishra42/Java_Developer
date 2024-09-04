// wAP TO ADD TWO NUMBERS BY TAKING USER INPUT :

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        int a,b,sum=0;
       Scanner myObj = new Scanner(System.in);
        System.out.println("enter First numbers:");
         a = myObj.nextInt();
         System.out.println("enter second numbers:");
         b = myObj.nextInt(); 
       
        sum=a+b;
        System.out.println("Addition:"+sum);
    }
}
