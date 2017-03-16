import java.util.*;
public class keyhas {
public static void main(String args[]){
	HashMap<Integer,String>hm=new HashMap<Integer,String>();
	hm.put(101, "Faruk");
	hm.put(102, "Raj");
	hm.put(201, "Rohit");
	hm.put(201, "Faruk");
    for(@SuppressWarnings("rawtypes") Map.Entry m:hm.entrySet()){
	System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}


