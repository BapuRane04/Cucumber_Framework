package This_Keyword;

public class ThisConstructor {
	public ThisConstructor() {
		System.out.println("Default Constructor");
	}
	public ThisConstructor(String str) {
		this();
		System.out.println("Parameterized "+str);
	}
	public static void main(String[] args) {
		ThisConstructor tc = new ThisConstructor("Constructor");
	}
}
