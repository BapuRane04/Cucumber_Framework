package interview;

public class PalindromString {
	public static void main(String[] args) {
		String s ="radar";
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println(s+" Is Palindrom");
		}else {
			System.out.println(s+" Is Not A Palindrom");
		}
	}
}
