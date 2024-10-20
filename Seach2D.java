import java.util.*;
import java.util.Arrays;
public class Seach2D {
    public static int[] Search(int arr[][],int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==key){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int Maximum(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int i[]:arr){
            for(int element:i){
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[][]={
            {1, 2, 3},
            {4,5,6},
            {7,8,9}
        };
        int key=6;
        int ans[]=Search(arr,key);

        System.out.println(Arrays.toString(ans));
        System.out.println(Maximum(arr));
    }
}
