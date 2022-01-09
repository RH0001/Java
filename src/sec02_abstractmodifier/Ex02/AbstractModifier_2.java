package sec02_abstractmodifier.Ex02;

// < 추상클래스 / 추상메서드 > 사용하는 경우

// 추상 메서드를 하나이상 가지고 있다면 클래스는 반드시 abstract 이어야한다.
abstract class Animal {
    abstract void cry();
}

class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    @Override
    void cry() {
        System.out.println("멍멍");
    }
}

public class AbstractModifier_2 {
    public static void main(String[] args) {
        // #1. 객체 생성
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        // #2. method 호출
        animal1.cry(); // 야옹
        animal2.cry(); // 멍멍
    }
}
