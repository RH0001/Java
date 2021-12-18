package sec_accessModifier.Ex01.pack01;

public class B {
    A a = new A();

    public void print() {
        System.out.printf("%d, ", a.a);    // 사용 가능
        System.out.printf("%d, ", a.b);    // 사용 가능
        System.out.printf("%d", a.c);    // 사용 가능
//        System.out.println(a.d);  // 사용 불가능, private 접근지정자는 같은 클래스내에서만 가능
    }
}
