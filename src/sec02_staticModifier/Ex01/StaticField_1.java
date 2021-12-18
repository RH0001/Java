package sec02_staticModifier.Ex01;

class A {
    int m = 3;          // instance field (인스턴스 필드)
    static int n = 5;   // static field (정적 필드)
}

public class StaticField_1 {
    public static void main(String[] args) {

        // #1. 인스턴스 필드 활용방법 (객체 생성 o)
        A a1 = new A();
        System.out.println(a1.m);

        // #2. static(정적) 필드 활용방법
        // @방법1. class 생성 없이 바로 사용
        System.out.println(A.n);

        // @방법2. 객체 생성 후 객체를 이용하여 사용 -> 지양하는 방법
        A a2 = new A();
        System.out.println(a2.n);
    }
}
