// Print all even numbers till n.
public class even{
    public static void main(String[] args){
        int n=30;
        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}