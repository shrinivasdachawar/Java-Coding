package javaPractise;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample{
	public static void main(String args[]){
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
		hm.put(100,"Jeorge");
		hm.put(102,"Smith");
		hm.put(101,"Sarah");
		hm.put(103,"John");
		for(Map.Entry m:hm.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
		}
		}
		}
