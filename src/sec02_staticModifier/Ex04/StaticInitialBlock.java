package sec02_staticModifier.Ex04;

//static(정적) 초기화 블럭
class A {

    int a;
    static int b;

    // static {}은 클래스 로더 -> 클래스 영역을 로드될때 실행된다.
    static {
        b = 50; // static field 의 초기화는 static {} 내에서 수행한다.
        System.out.println("클래스 로더에 클래스 A가 로딩되었습니다!");
    }

    A() {
        a = 3; //인스턴스 필드 초기화는 생성자에서 수행한다.
        b = 5;
    }

}

public class StaticInitialBlock {
    public static void main(String[] args) {

        A a = new A();
        System.out.println(a.a);
        System.out.println(A.b);
    }
}
