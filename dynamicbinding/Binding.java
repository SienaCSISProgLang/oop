/**
   Example demonstrating dynamic method binding in Java.

   @author Jim Teresco
   @version Fall 2019
*/

class X {

    public void a() {
	System.out.println("X.a");
    }
}

class Y extends X {

    @Override
    public void a() {
	System.out.println("Y.a");
    }
}

public class Binding {

    public static void main(String args[]) {
	X first = new X();
	Y second = new Y();
	X third = new Y();
	
	first.a();
	second.a();
	third.a();

	third = first;
	third.a();
    }
}
