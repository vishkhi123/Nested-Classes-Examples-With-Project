package setCollection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       //follows insertion order
		
				LinkedHashSet<String> hash=new LinkedHashSet<String>();
				hash.add("D");
				hash.add("C");
				hash.add("A");
				hash.add("B");
				hash.add(null);
				hash.add("F");
				hash.add("E");
				hash.add("E");
				hash.add(null); 
				//hash.add(null);
				System.out.println(hash); //Do not follow sorting order
				//Do Not Allow Duplicates
				//allows only 1 single null value

	}

}
