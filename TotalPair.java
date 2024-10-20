public class TotalPair{
    public static int Totalpair(int arr[]){
        int n=arr.length;
        int tp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+i +"," +j+")");
tp++;
            }
        }
        return tp;
    }
    public static void main(String args[]){
        int arr[]={1,3,4,5,6,7};
        System.out.println(Totalpair(arr));
    }//total pair =n(n-1)/2;
}