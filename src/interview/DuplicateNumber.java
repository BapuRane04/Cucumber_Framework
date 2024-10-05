package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,1,2,3,5};
		Set<Integer> seen = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		for(int num : a) {
			if(!seen.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println(new ArrayList<>(duplicate));
	}
}
