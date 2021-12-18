package sec_accessModifier.Ex03;

import sec_accessModifier.Ex03.pack.A;
import sec_accessModifier.Ex03.pack.C;

public class AccessModifierOfClass_2 {
    public static void main(String[] args) {
        // #1. 객체 생성
        A a = new A();
//        B b = new B(); // 다른 패키지에서 사용 불가능 (default)
        C c;             // 객체생성(o), 생성자(x, 다른 패키지에서 사용 불가능(default))
    }
}
