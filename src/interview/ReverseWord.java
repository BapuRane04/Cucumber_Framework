package interview;

public class ReverseWord {

	public static void main(String[] args) {
		String s = "Bapu Rane Is An Automation Tester";
		String splitStr[]= s.split(" ");
		String reverseWord = "";
		for(int i=splitStr.length-1;i>=0;i--) {
			reverseWord = reverseWord + splitStr[i]+" ";
		}
		System.out.println("Reverse Word "+reverseWord);
	}

}
