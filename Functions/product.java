import java.util.*;
public class product{
    public static int calculatingProd(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculatingProd(a,b);
        System.out.println("The product of a and b is : "+ product);
    }
}