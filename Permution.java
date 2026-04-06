public class Permution {
    public static void main(String[] args) {
        pnc(2);
    }
    public static void pnc(int num){
        if (num ==1){
            System.out.println(1);
        }
        else if(num==2 || num==3){
            System.out.println("No Solution");
        }
        else{
            for(int i=2;i<=num;i+=2){
                System.out.println(i);
            }
            for(int i=1;i<=num;i+=2){
                System.out.println(i);
            }
        }
    }
}
