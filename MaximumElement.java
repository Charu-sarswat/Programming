import java.util.*;
import java.util.Arrays;
public class MAximumElement{
public static void main(String args[]){
int arr[]=new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}


System.out.println(Arrays.toString(arr));
System.out.println(Maximum(arr));
}
public static int Maximum(int arr[]){
int max=Integer.MIN_VALUE;
if(arr==null){
    return -1;
}
if(arr.length==0){
    return-1;
}
for(int i=0;i<arr.length;i++){
if(arr[i]>max){
    max=arr[i];
}

}
return max;
}
}