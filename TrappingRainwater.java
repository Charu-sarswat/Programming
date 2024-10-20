public class TrappingRainwater {
    public static int Trappingrain(int height[]){
    int n=height.length;
    //Calculate left max height
    int leftmax[]=new int[n];
    leftmax[0]=height[0];
    for(int i=1;i<n;i++){
         leftmax[i]=Math.max(height[i],leftmax[i-1]);
    }
    //Caalculate rightmax height
    int rightmax[]=new int[height.length];
    rightmax[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(rightmax[i+1],height[i]);
    }
int tp=0;
for(int i=0;i<n;i++){
    int waterlevel=Math.min(leftmax[i],rightmax[i]);
    tp+=(waterlevel-height[i]);
}
return tp;
}
public static void main(String args[]){
    int height[]={4,2,0,6,3,2,5};
    System.out.println(Trappingrain(height));
}
}
