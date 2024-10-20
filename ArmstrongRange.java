public class ArmstrongRange {
    public static boolean Armstrong(int n){
       
        int temp=n;
        int sum=0;
        while(n>0){
     int lastdigit=n%10;
     sum+=Math.pow(lastdigit,3);
  n=n/10;
        }
        if(sum!=temp){
            return false;
        }
        return true;
    }
    public static void Range(int n1,int n2){
        for(int i=n1;i<=n2;i++){
            if(Armstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        Range(100,200);

    }
}
