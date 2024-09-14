import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        System.out.println("Enter the button number 1,2,3");
        Scanner sc=new Scanner(System.in);
        int button= sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }
        else if(button==2){
            System.out.println("Namaste");
        }
        else if(button==3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("You are Choosing wrong number, please choose numbers between 1 , 2 , 3");
        }
    }
}
