import java.util.*;
import java.util.Arrays;
public class SearchStr{
    public static void main(String args[]){
        /*String str[]=new String[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.print(Arrays.toString(str));*/
        System.out.println(Search("charu",'i'));
    }
    public static boolean Search(String str,char key){
            if(str.length()==0){
                return false;
            }
            for(int i=0;i<str.length();i++){
                if(key==str.charAt(i)){
                    return true;
                }
            }
            return false;
        }
    }
    
