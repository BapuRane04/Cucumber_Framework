package This_Keyword;

public class ThisVariable {
	int id;
	String name;
	public ThisVariable(int i,String n) {
		this.id=i;
		this.name = n;
	}
	public void display() {
		System.out.println("ID "+id+" Name "+name);
	}
	public static void main(String[] args) {
		ThisVariable tv = new ThisVariable(1,"Shubham");
		tv.display();
	}
}
