import java.util.*;

public class eight {
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        a= sc.nextInt();
        System.out.println("Enter the Second number");
        b= sc.nextInt();
        if(a==b){
            System.out.println("Both numbers are equal");
        }
        else {
            if(a>b){
                System.out.println("The First number is grrater than second number");
            }
            else{
                System.out.println("The Second number is grrater than First number");
            }
          
        }


    }
}
