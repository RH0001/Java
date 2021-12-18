package sec02_method.Ex01_ExternalCallMethods;

class A {
    // 리턴 타임 void, 입력매개변수 없음
    void print() {
        System.out.println("HI");
    }

    // 리턴 타입 int, 입력매개변수 없음.
    int data() {
        return 3;
    }

    // 리턴 타입 double, 입력 매개변수 2개
    double sum(int a, int b) {
        return a + b;
    }

    // 리턴 타입 void, 내부에 리턴 포함
    void printMonth(int m) {
        if (m < 0 || m >12) {
            System.out.println("잘못된 입력");
            return ;
        }
        System.out.println(m + "월 입니다.");
    }
}

public class ExternalCallMethods {
    public static void main(String[] args) {

        // 객체 생성
        A a = new A();

        // 메서드 호출 (맴버 활용)

        a.print();
        int k = a.data();
        System.out.println(k);

        double result = a.sum(1, 3);
        System.out.println(result);

        a.printMonth(5);
        a.printMonth(154);
    }
}
