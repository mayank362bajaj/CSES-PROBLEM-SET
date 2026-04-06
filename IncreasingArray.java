public class IncreasingArray {
    public static void main(String[] args) {
        int arr[] = {3,2,5,1,7};
        System.out.println(answer(arr));
    }
    public static int answer(int arr[]){
        int sum=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i-1]){
                int val = arr[i-1]-arr[i];
                sum+=val;
            }

        }
        return sum;
}
}
