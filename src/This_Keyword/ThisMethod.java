package This_Keyword;

public class ThisMethod {
	public void eat() {
		System.out.println("Eating");
	}
	public void sleep() {
		this.eat();
		System.out.println("Sleeping");
	}
	public void coding() {
		this.sleep();
		System.out.println("Coding");
	}
	public static void main(String[] args) {
		ThisMethod tm = new ThisMethod();
		tm.coding();
	}
}
