package sec02_typeCasting.Ex01_TypeCasting_1;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class TypeCasting_1 {
    public static void main(String[] args) {
        // Upcasting(auto casting): 캐스팅 구문을 생략했을 때 컴파일러가 자동으로 추가
        A ac = (A) new C();
        B bc = (B) new C();

        B bb = new B();
        A a = bb;

        // downCasting(수동 변환): 캐스팅이 가능할 수 없을 떄(실행할 떄 예외 발생)
        A aa = new A();
//        B b = (B) aa;
//        C c = (C) aa;

        // DownCasting(수동 변환): 캐스팅이 가능할 때
        A ab = new B();
        B b = (B) ab;
//        C c = (C) ab;

        B bd = new D();
        D d = (D) bd;

        A ad = new D();
        B b1 = (B) ad;
        D d1 = (D) ad;
    }
}
