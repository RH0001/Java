package sec_accessModifier.Ex02;

public class AccessModifierOfClass_1 {
    public static void main(String[] args) {
        // #1. 객체 생성
        A a = new A(); // public Class,  public Constructor   , 자동 생성자
        B b = new B(); // default Class, default Constructor  , 자동 생성자
        C c = new C(); // public Class,  default Constructor  , 수동 생성자

    }
}
