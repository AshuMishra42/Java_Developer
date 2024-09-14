import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        System.out.println("Enter the button between 1,2,3:");
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();
        switch (button) {
            case  1: System.out.println("Namaste");
            break;
            case 2:  System.out.println("Hello");
            break;
            case 3:  System.out.println("Bonjour");
            break;
            default: System.out.println("You are Choosing wrong number, please choose numbers between 1 , 2 , 3");
            break;
        }
    }
}
