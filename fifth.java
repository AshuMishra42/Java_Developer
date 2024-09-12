// SIMPLIFY THE GIVEN EQUATION AND FIND THE SOLLUTION 


import java.util.*;

public class fifth {
    public static void main(String[] args) {
        int a,b,sum;
        Scanner rem= new Scanner(System.in);
        System.out.println("Enter the First Number:");
         a= rem.nextInt();
         System.out.println("Enter the Second Number:");
         b= rem.nextInt();
        sum = (a*b)/(a-b);
        System.out.println("Calculate the equation:" +sum);
    }
}
