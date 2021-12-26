package sec01_inheritancePolymorphism.Ex01_Inheritance;

class Human {
    String name;
    int age;

    void eat() {}
    void sleep() {}
}

class Student extends Human {
    int studentID;
    void goToSchool() {}
}

class Worker extends Human {
    int workerID;
    void goToWork() {}
}

public class Inheritance {
    public static void main(String[] args) {
        // Human 객체 생성
        Human human = new Human();
        human.name = "권우희";
        human.age = 23;
        human.eat();
        human.sleep();

        // Student 객체 생성
        Student student = new Student();
        student.name = "홍길동";
        student.age = 15;

        student.eat();
        student.sleep();

        student.studentID = 1513;
        student.goToSchool();

        // Worker 객체 생성
        Worker worker = new Worker();
        worker.name = "갈길동";
        worker.age = 30;
        worker.workerID = 3012;

        worker.eat();
        worker.sleep();

        worker.goToWork();

    }
}
