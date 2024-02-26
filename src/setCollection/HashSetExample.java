package setCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example 1
		//It Do not follow insertion order
		//it do not follow any order(some times sorting sometimes not)
		
		Set<String> hash=new HashSet<String>();
		hash.add("D");
		hash.add("X");
		hash.add("C");
		hash.add("A");
		hash.add("B");
		hash.add(null);
		hash.add("F");
		hash.add("E");
		hash.add("E");
		hash.add(null); 
		hash.add(null);
		System.out.println(hash); //follows sorting order
		//Do Not Allow Duplicates
		//allows only 1 single null value
		
		//////////////////////////////////////////////
		//Example 2 follows insertion order
		 // Create a HashSet
        Set<String> set = new HashSet<>();

        // Add elements
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("apple"); // Duplicate element, won't be added

        // Print the set
        System.out.println("HashSet: " + set);

        // Remove an element
        set.remove("banana");

        // Check if an element exists
        System.out.println("Contains 'apple': " + set.contains("apple")); // true
        System.out.println("Contains 'banana': " + set.contains("banana")); // false

        // Iterate over the set
        System.out.print("Set elements: ");
        for (String element : set) {
            System.out.print(element + " ");
        }
		
		
		
		
		
		

	}

}
