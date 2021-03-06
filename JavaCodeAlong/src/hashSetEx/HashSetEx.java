package hashSetEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(4);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);
		set.remove(2);
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(7);
		set1.add(4);
		set1.add(9);
		
		
		set.addAll(set1);
		System.out.println(set);
		
		
//		set1.removeIf(val -> set1.contains(7));
//		System.out.println(set1);
		
		int size = set.size();
		System.out.println("Size: "+size);
		
		System.out.println("Empty: "+set.isEmpty());

		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
