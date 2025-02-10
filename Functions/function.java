import java.util.*;

public class function{
    // function declare
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your name:");
        String name = sc.next(); //function call
        System.out.println(name);

    }
}