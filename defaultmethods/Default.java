/**
   Example of default methods in interfaces in Java.

   @author Jim Teresco
   @version Fall 2019
*/

interface A {

    default void f() {
	System.out.println("default f in A");
    }
}

interface B {

    default void f() {
	System.out.println("default f in B");
    }
}

class A1 implements A {

    public void f() {
	System.out.println("f in A1");
    }
}

class A2 implements A { }

// this one's not allowed, we get a compiler error if we try
//class AB implements A, B { }

class AB2 implements A, B {

    public void f() {
	System.out.println("f in AB2");
    }
}

public class Default {

    public static void main(String args[]) {

	// cannot do these, still not allowed to instantiate an interface
	//A a = new A();
	//B b = new B();

	// these are OK, just one f in the interface which can optionally
	// be overridden
	A1 a1 = new A1();
	a1.f();
	
	A2 a2 = new A2();
	a2.f();

	// we can also construct an A1 or an A2 and assign it to a
	// variable of type A
	A a3 = new A1();
	a3.f();

	// dynamic binding means we'll get the A2 version of f even when
	// referencing through something of type A
	A a4 = new A2();
	a4.f();

	// if we implement both, we must override to eliminate the ambiguity
	AB2 ab2 = new AB2();
	ab2.f();
    }
}

