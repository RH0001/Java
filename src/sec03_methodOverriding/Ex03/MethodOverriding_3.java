package sec03_methodOverriding.Ex03;

class A {
    void print1() {
        System.out.println("A class print1");
    }
    void print2() {
        System.out.println("A class print2");
    }
}

class B extends A {
    @Override
    void print1() {
        System.out.println("B class print1");
    }

    void print2(int a) {
        System.out.println("B class print2: " + a);
    }
}


public class MethodOverriding_3 {
    public static void main(String[] args) {
        // #1. Type : A / Constructor: A
        A aa = new A();
        aa.print1(); // A
        aa.print2(); // A

        // #2. Type : B / Constructor: B
        B bb = new B();
        bb.print1(); // B
        bb.print2(); // A
        bb.print2(100); //B

        // #3. Type : A / Constructor: B
        A ab = new B();
        ab.print1(); // B
        ab.print2(); // A
//        ab.print2(100);
    }
}
