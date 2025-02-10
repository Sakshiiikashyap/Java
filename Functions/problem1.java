import java.util.*;
public class problem1{
    public static int calculatingSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatingSum(a,b);
        System.out.println("Sum of a and b : "+ sum);
    }
}