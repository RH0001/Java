package sec02_abstractmodifier.Ex02;

// 일반 클래스 상속
class Animal {
    void cry() {}
}

class Cat extends Animal {
    void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍");
    }
}
public class AbstractModifier_1 {
    public static void main(String[] args) {

        // #1. 객체 생성
        Animal animal = new Cat();
        Animal animal1 = new Dog();

        // #2. 메서드 호출
        animal.cry(); // 야옹
        animal1.cry(); // 멍멍


    }
}
