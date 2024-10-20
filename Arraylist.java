import java.util.*;
public class Arraylist {
  public static void main(String args[]){
ArrayList<Integer> list=new ArrayList<>();
list.add(12);
list.add(13);
list.add(14);
list.add(17);
System.out.print(list);
System.out.println(list.contains(72));
list.set(0,99);
System.out.println(list);
list.remove(1);
System.out.print(list);
for(int i=0;i<3;i++){
    System.out.println(list.get(i));
}
  }
}
