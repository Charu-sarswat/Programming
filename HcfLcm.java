public class HcfLcm{
    public static int LcmandHcf(int A,int B){
   int hcf=gcd(A,B);
   int lcm=(A*B)/hcf;
   return lcm; 
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String args[]){
        System.out.println(LcmandHcf(4,12));
        System.out.println(gcd(4,12));
    }
}