package sec02_staticModifier.Ex03;

class A {

    static int a = 1;
    int b = 10;
    void abc() {
        System.out.println("instance method");
    }

    static void bcd() {
        System.out.println("static method");
        System.out.println(a);
//        System.out.println(b);
    }
}


public class StaticMethod {
    public static void main(String[] args) {

        // #1. 인스턴스 메서드 활용 방법
        A a = new A();

        a.abc();

        // #2. 정적 메서드 활용방법
        //@방법1. 클래스명으로 접근
        A.bcd();

        //@방법2. 인스턴스를 활용하여 접근 -> 지양하는 방법
        A a2 = new A();
        a2.bcd();
    }
}
