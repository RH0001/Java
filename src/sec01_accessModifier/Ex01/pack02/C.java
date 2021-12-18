package sec01_accessModifier.Ex01.pack02;

import sec01_accessModifier.Ex01.pack01.A;

public class C {
    A a = new A();

    public void print() {
        System.out.print(a.a);
//        System.out.println(a.b);  // protected 접근지정자는 동일패키지 및 다른패키지의 자식 클래스에서만 사용가능하다.
//        System.out.println(a.c);  // default 접근 지정자는 동일 패키지에서만 사용가능하다.
//        System.out.println(a.d);  // private 접근 지정자는 같은 클래스에서만 사용 가능하다.
    }
}
