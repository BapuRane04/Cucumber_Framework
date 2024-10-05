package Super_Keyword;

	class Animal{
		public void eat() {
			System.out.println("Eating");
		}
	}
	 class Dog extends Animal{
		public void eat() {
			System.out.println("Dog Eating");
		}
		public void bark() {
			System.out.println("Barking");
		}
		public void work() {
			super.eat();
			bark();
		}
	}
	class testsuper{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.work();
	}
}
