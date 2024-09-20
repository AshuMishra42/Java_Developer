// PRINT THE SUM OF FIRST N NATURAL NUMBERS : 

import java.util.Scanner;

public class thirteen {
    public static void main(String[] args) {
        System.out.println("Enter the value of nnumbers:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int  sum=0;
        int i=1;
        do{
            sum= sum+i;
            i++;
        }
        while(i<=n);
        System.out.println(sum);

    }
}
