package interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {
public static void main(String[] args) {
	String duplicate = "";
	String str[]= {"bapu","atharv","shubham","smita","shantaram","bapu","smita"};
	duplicate = getDuplicateWord(str);
	System.out.println("Duplicate Word Is : "+duplicate);
}

private static String getDuplicateWord(String[] str) {
	Set<String> seen = new HashSet<String>();
	Set<String> duplicate = new HashSet<String>();
	for(String s : str) {
		if(!seen.add(s)) {
			duplicate.add(s);
		}
	} 
	return duplicate.toString();
	
	}
 }
