import java.util.*;
public class solidrectangle{
    public static void main(String[] args) {
        int n = 4; //no. of rows  
        int m = 5; //no. of coloumn
        //outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}