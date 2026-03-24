import java.util.*;
public class weird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        while(n>=2){
            System.out.println(n);
            if(n%2==0){
                n=n/2;
            }
            else{
                n=(n*3)+1;
            }
        }
        
    }
}
