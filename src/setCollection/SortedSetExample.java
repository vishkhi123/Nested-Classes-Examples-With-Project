package setCollection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Follows Sorting Order
		SortedSet<String> hash=new TreeSet<String>();
		hash.add("D");
		hash.add("X");
		hash.add("C");
		hash.add("A");
		hash.add("B");
	//	hash.add(null);
		hash.add("F");
		hash.add("E");
		hash.add("E");
	//	hash.add(null); 
	//	hash.add(null);
		System.out.println(hash);
		//Do not allow Null Values
		//Do not ALlow Duplicates
		
		//Methods of (sortedSet)
		//1.first()
		System.out.println(hash.first());
		
		//2.last()
		System.out.println(hash.last());
		
		//3.headSet(Object ob)
		System.out.println(hash.headSet("F"));
		
		//4.tailSet(Object ob)
		System.out.println(hash.tailSet("F"));
		
		//5.subSet(Object ob1,Object ob2)
		System.out.println(hash.subSet("B", "F"));
		

	}

}
