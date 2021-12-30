package sec01_finalModifier.Ex01_FinalModifier_1;

// 선언과 동시에 값을 대입했을 때
class A1 {
    int a = 3;
    final int b = 4;
    A1() {

    }
}

// 선언과 값의 대입을 분리했을 때
class A2 {
    int a;
    final int b;
    A2() {
        a = 3;
        b = 4;
    }
}

// final 필드값을 대입한 후에는 추가 값 대입 불가능
class A3 {
    int a = 4;
    final int b = 3;
    A3() {
        a = 5;
//        b = 4; (불가능)
    }
}

class B {
    void bcd() {
        int a = 3;
        final int b = 5;
        a = 4;
//        b = 9;
    }
}

public class FinalModifier_1 {
    public static void main(String[] args) {
        // 객체 생성
        A1 a1 = new A1();
        A2 a2 = new A2();

        // 필드값 변경
        a1.a = 7;
//        a1.b = 5;

        a2.a = 7;
//        a2.b = 5;

    }
}
