class A
{
	public void a() {
		System.out.println("Method A");
	}
}

class B extends A
{
	public void b() {
		System.out.println("Method B");
	}
}

class C extends B
{
	public void c() {
		System.out.println("Method C");
	}
}

class D extends A
{
	public void d() {
		System.out.println("Method D");
	}
}


public class Inheritance {

	public static void main(String args[]) {
		System.out.println("B inherits A");
		B b = new B();
		b.a();
		
		System.out.println("C inherits B and B inherits A ");
		C c = new C();
		c.a();
		c.b();
		
		System.out.println("B inherits A and D inherits A");
		b.a();
		D d = new D();
		d.a();
		
	}
}
