package String_methods;
class abc{
	String str="Digital";
	public void charat(int index) {
		if(index <0 || index >=str.length()) {
			throw new StringIndexOutOfBoundsException(index);
		}
		System.out.println(str.charAt(index));
	}
}
public class charat {

	public static void main(String[] args) {
		 abc ob=new abc();
		 ob.charat(4);
         String str1="Vector Consulting Group";
         int size=str1.length();
         System.out.println(str1.charAt(5));
         System.out.println("character at 0 index:"+ str1.charAt(0));
         System.out.println("character at last index:"+ str1.charAt(size-1));
	}

}
