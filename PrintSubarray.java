public class PrintSubarray {
    public static int SubArray(int arr[]){
        int tp=0;
        int maxsum=0;
        int currSum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int start=i;
        for(int j=0;j<n;j++){
  int end=j;
   currSum=0;
  for(int k=start;k<=end;k++){
System.out.print(arr[k]);
currSum+=arr[k];
if(currSum>maxsum){
    maxsum=currSum;
}
   
  }
  System.out.println();

        }
        }
        return maxsum;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
       System.out.println(SubArray(arr));

        
    }
}
