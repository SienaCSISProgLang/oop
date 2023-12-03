/**
   Example showing how subclass constructors are called.

   @author Jim Teresco
   @version Fall 2019

*/

class A {

    public A() {
	System.out.println("A default");
    }

    public A(String x) {
	System.out.println("A " + x);
    }

}

class B extends A {

    public B() {
	System.out.println("B default");
    }

    public B(String x) {
	System.out.println("B " + x);
    }

}

class C extends A {

    public C() {
	super("C");
	System.out.println("C default");
    }

    public C(String x) {
	super(x);
	System.out.println("C " + x);
    }
}


public class JavaConstructors {

    public static void main(String args[]) {

	A a = new A();
	B b = new B();
	A a1 = new A("a1");
	B b1 = new B("b1");
	C c = new C();
    }
}

