public class MaxSubarrayOptimal {
    public static void Kadans(int arr[]){
        int max=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            max=Math.max(max,cs);
        }
        System.out.println("our max subarray sum = "+max);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        Kadans(arr);

    }
}
