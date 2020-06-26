package org.fullstack;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Data<K,V>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
		
}

public class App {

	public static void main(String[] args) {
		
		Comparator<Data<Integer,String>> COMMPARE_KEY = new Comparator<Data<Integer,String>>(){

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if(obj1.getKey() < obj2.getKey()) {
					return -1;
				}
				else if(obj1.getKey() > obj2.getKey()) {
					return 1;
				}else {
					return 0;
				}
			
			}
			
		};
		
		Comparator<Data<Integer,String>> COMMPARE_NAME_LENGTH = new Comparator<Data<Integer,String>>(){

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if(obj1.getValue().length() < obj2.getValue().length()) {
					return -1;
				}
				else if(obj1.getValue().length() > obj2.getValue().length()) {
					return 1;
				}else {
					return 0;
				}
			
			}
			
		};
		
		
		//Set<Data<Integer, String> set = new LinkedHashSet<>();
		Set<Data<Integer, String>> set = new TreeSet<>(COMMPARE_NAME_LENGTH); //Show error in compariton because javo does not know how sorting  
		
		
		//set.add(new Data<Integer, String> ("Key" , "Value"));
		set.add(new Data<Integer, String> (3 , "Aalama"));
		set.add(new Data<Integer, String> (1 , "CHAND"));
		set.add(new Data<Integer, String> (5 , "MIKE"));
		set.add(new Data<Integer, String> (9 , "bob esponja"));
		set.add(new Data<Integer, String> (2 , "tremendo"));
		set.add(new Data<Integer, String> (5 , "fivers"));
		set.add(new Data<Integer, String> (1 , "CHAND"));

		
		for(Data<Integer, String> element : set) {
			System.out.println(element);
		}
		

	}

}
