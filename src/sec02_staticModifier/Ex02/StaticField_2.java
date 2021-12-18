package sec02_staticModifier.Ex02;

// static field 의 공유 특징
class A {
    int m = 3;
    static int n = 5;
}

public class StaticField_2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        // instance field
        a1.m = 1;
        a2.m = 10;

        System.out.println(a1.m);
        System.out.println(a2.m);

        // static field
        a1.n = 2;
        a2.n = 20;

        System.out.println(a1.n);
        System.out.println(a2.n);

    }
}
