import java.util.*;
public class button{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        //switch statement
        switch(Button){

            case 1 : System.out.print("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid button");
        }
    }
}