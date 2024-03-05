
public class ParentClass {

	public ParentClass() {
		this(1,2,3);
		System.out.println("Parent  default constructor");
	}
	public ParentClass(int x) {
		this();
		System.out.println("Parent  One Para constructor");
	}
	public ParentClass(int x, int y) {
		this(1);
		System.out.println("Parent  Two Para constructor");
	}
	public ParentClass(int x, int y, int z) {
		System.out.println("Parent  Three Para constructor");
	}
	public ParentClass(int x, int y, int z, int a) {
		System.out.println("Parent  Four Para constructor");
	}
	

}
