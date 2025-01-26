import java.util.*;
public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number =");
        int a = sc.nextInt();
        System.out.println("Enter the number =");
        int b = sc.nextInt();
        System.out.println("Choose your choice");
        System.out.println("1. Addition(+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Multiplication(*)");
        System.out.println("4. Division(/)");
        System.out.println("Enter your choice (1/2/3/4) =");
        int choice = sc.nextInt();
        double result;
        switch(choice){
            case 1 : result = a+b;
            System.out.println("Result =" + result);
            break;
            case 2 : result = a-b;
            System.out.println("Result =" + result);
            break;
            case 3 : result = a*b;
            System.out.println("Result =" + result);
            break;
            case 4 : result = a/b;
            System.out.println("Result =" + result);
            break;
        }
    }
}