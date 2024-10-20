public class LinearReEl {
    public static void main(String args[]){
 int arr[]={1,5,3,8,3};
 System.out.print(Linear(arr,8));
    }
    public static int Linear(int arr[],int key){
        for(int element:arr){
            if(element==key){
                return element;
            }
        }
        return -1;
    } 
}
