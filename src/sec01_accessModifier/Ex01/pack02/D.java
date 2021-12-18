package sec01_accessModifier.Ex01.pack02;

import sec01_accessModifier.Ex01.pack01.A;

public class D extends A{
    //    A a = new A();    // 상속을 했기 때문에, 객체 생성은 불필요하다.
    public void print1() {
        System.out.printf("%d, ", a);
        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
    }


}
