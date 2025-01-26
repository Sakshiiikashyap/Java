import java.util.*;
public class greater{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. =");
        int a = sc.nextInt();
        System.out.print("Enter the no. =");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Equal");
            } else{
                if(a>b) {
                    System.out.println("a is greater");
            } else{
                if(a<b){
                    System.out.println("a is lesser");
                }
            }
        }
    }
}