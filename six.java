// WAP to print weather belongs to an adult group age or not: 

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:");
        Scanner sc=new Scanner(System.in);
        age= sc.nextInt();
        if(age>=18){
            System.out.println("YOU ARE AN ADULT PERSON");
        }
        else{
            System.out.println("YOU ARE  not AN ADULT PERSON");
        }
    }
}
