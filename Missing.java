import java.util.Scanner;

public class Missing {
   static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        int n =sc.nextInt();
        System.out.println(missingnum(n));
    }
    public static int missingnum(int n){
          int actualsum=0;
          int givensum = n*(n+1)/2;
          for(int i=0;i<n-1;i++){
            actualsum += sc.nextInt();
          }
          return (givensum - actualsum);

    }
}
