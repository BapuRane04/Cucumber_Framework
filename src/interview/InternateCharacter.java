package interview;

public class InternateCharacter {
	public static void main(String[] args) {
		String s = "India Private Limited";
		String trimString = s.trim();
		char ch[]=trimString.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0) {
				System.out.print(ch[i]);
				System.out.print(",");
			}else if(i==1){
				System.out.print(ch[i+1]);
				System.out.print(",");
				
			}else {
				System.out.print(ch[i+i]);
				System.out.print(",");
			}
		}
	}
}
