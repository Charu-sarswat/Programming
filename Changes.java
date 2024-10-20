import java.util.Arrays;
public class Changes {
    public static void main(String args[]){
        int arr[]={1,2,3,4};
        change(arr);
        
        System.out.print(Arrays.toString(arr));
        
       // change(arr);
    }
    static void change(int arr[]){
        arr[0]=99;
    }
}
