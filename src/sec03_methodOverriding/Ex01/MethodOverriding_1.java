package sec03_methodOverriding.Ex01;

class A {
    void print() {
        System.out.println("A Class");
    }
}

class B extends A {
    @Override
    void print() {  // overriding
        System.out.println("B class");
    }
}

public class MethodOverriding_1 {
    public static void main(String[] args) {
        // #1. Type: A / Constructor: A
        A aa = new A();
        aa.print(); // A


        // #2. Type: B / Constructor: B
        B bb = new B();
        bb.print(); // B

        // #3. Type: A / Constructor: B
        A ab = new B();
        ab.print(); // B


    }
}
