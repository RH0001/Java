package sec04_overlapMember.Ex03_OverlapStaticMethod;

class A {
    static void print() {
        System.out.println("Class A");
    }
}

class B extends A {
    static void print() {
        System.out.println("Class B");
    }
}

public class OverlapStaticMethod {
    public static void main(String[] args) {
        // 클래스명으로 바로 접근
        A.print(); // A
        B.print(); // b

        // 객체 생성
        A aa = new A();
        B bb = new B();
        A ab = new B();

        // 객체를 통한 메서드 호출
        aa.print(); // a
        bb.print(); // b
        ab.print(); // a
    }
}
