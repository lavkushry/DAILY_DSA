package Array;

public class Sliding_window {
    //Bruteforce of Doing this
//    static  int maxSum(int []arr,int k){
//        int n= arr.length;
//        int max_sum=Integer.MIN_VALUE;
//        for (int i = 0; i <k+1 ; i++) {
//            int sum=0;
//            for (int j = 0; j < k; j++) {
//                sum += arr[i + j];
//            }
//            max_sum = Math.max(max_sum, sum);
//        }
//        return max_sum;
//    }
    //Efficient way of Doing this
    static  int maxSum(int []arr,int k){
        int n= arr.length;
        
        int sum=0;
        for (int i = 0; i <k ; i++) {
            sum=sum+arr[i];
        }
        int max_sum=sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);

            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 30, -5, 20, 7}, k = 3;
        System.out.println(maxSum(arr,k));
    }
}
