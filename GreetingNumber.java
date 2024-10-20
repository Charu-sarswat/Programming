import java.util.*;
public class GreetingNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="charu";

String name=sc.nextLine();
boolean t=str.equals(name);//(str.compareTo(name))is also used
if(t==true){
System.out.println("Greeting");
}
    }    
}
/* we can not used == because the value 
stored in the heap mamory and reference variable are in stack here we compare the 
reference variable  which are name and str*/
