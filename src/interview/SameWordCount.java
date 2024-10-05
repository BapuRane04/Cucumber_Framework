package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SameWordCount {
	public static void main(String[] args) {

		String duplicate = "";
		String str[]= {"bapu","atharv","shubham","smita","shantaram","bapu","smita","bapu","smita"};
		duplicate = getDuplicateWordCount(str);
		System.out.println("Duplicate Word Count Is : "+duplicate);

	}

	private static String getDuplicateWordCount(String[] str) {
		int cnt = 0;
		Set<String> seen = new HashSet<String>();
		List<String> duplicate = new ArrayList<String>();
		for(String s : str) {
			if(!seen.add(s)) {
				if(duplicate.add(s)) {
					cnt ++;
				}
				
			}
		} 
		return duplicate.iterator().next().toString()+" Repeated "+cnt+" Times";
		
		}
}
