package sec01_finalModifier.Ex02_FinalModifier_2;

class A {
    void abc() {}
    final void bcd() {}
}

class B extends A {
    void abc() {}
//    void bcd() {}     -> final 메서드는 오버라이딩 불가능

}

final class C {}

// class D extends C {}  -> final 클래스스는 상 자체가 불가능

public class FinalModifier_2 {
}
