import java.util.*;
import java.util.Arrays;
public class reverse {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    int arr[]=new int[5];
    int n=arr.length;
    int start=0;
    int end=arr.length-1;
    //enter the element of array
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    while(start<end){
    Swap(arr,start,end);
    start++;
    end--;
    }
    System.out.println(Arrays.toString(arr));
    }
    public static void Swap(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
