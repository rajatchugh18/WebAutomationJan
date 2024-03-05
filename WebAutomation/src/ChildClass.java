
public class ChildClass extends ParentClass{
	
	
	public ChildClass() {
		super(2,2);
		System.out.println("Child Default constructor");
	}
	public ChildClass(int x) {
		this(1,2,3);
		System.out.println("Child  One Para constructor");
	}
	public ChildClass(int x, int y) {
		this();
		System.out.println("Child  Two Para constructor");
	}
	public ChildClass(int x, int y, int z) {
		this(1,2);
		System.out.println("Child  Three Para constructor");
	}
	public ChildClass(int x, int y, int z, int a) {
		System.out.println("Child Four Para constructor");
	}
	public static void main(String[] args) {
		
		ChildClass ob = new ChildClass(1);
		
	}
}
