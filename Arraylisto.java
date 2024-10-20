import java.util.*;
import java.util.Arrays;
public class Arraylisto {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
       for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
       }
       System.out.print(Arrays.toString(arr));
       Swap(arr,0,1);
       System.out.print(Arrays.toString(arr));
    }
    public static void Swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
