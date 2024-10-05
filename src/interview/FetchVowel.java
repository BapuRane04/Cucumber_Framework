package interview;

public class FetchVowel {

	public static void main(String[] args) {
		int count =0;
		String s ="Bapu";
		char ch[]=s.toCharArray();
		System.out.print("Vowel Are: ");
		for(int i=0;i<ch.length;i++) {
			if(ch[i] == 'a' | ch[i] == 'e' | ch[i] == 'i' | ch[i] == 'o' | ch[i] == 'u'|ch[i] == 'A' | ch[i] == 'E' | ch[i] == 'I' | ch[i] == 'O' | ch[i] == 'U' ) {
				count++;
			}
		}
		System.out.print(count);
	}

}
