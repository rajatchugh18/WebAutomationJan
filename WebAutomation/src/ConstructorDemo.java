public class ConstructorDemo {

	
	public ConstructorDemo() {
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public ConstructorDemo (int x) {
		this();
		System.out.println("One para Constructor");
	}
	public ConstructorDemo(int x, int y) {
		this(1);
		System.out.println("Two para Constructor");
	}
	public ConstructorDemo(int x, int y, int z) {
		
		System.out.println("Three para Constructor");
	}
	public ConstructorDemo(int x, int y, int z, int a) {
		this(1,2);
		System.out.println("Four para Constructor");
	}
	
	
	public static void main(String[] args) {
		ConstructorDemo ob = new ConstructorDemo(1,2,3,4);
	

	}

}
