package sec_accessModifier.Ex01;

import sec_accessModifier.Ex01.pack01.A;
import sec_accessModifier.Ex01.pack01.B;
import sec_accessModifier.Ex01.pack02.C;
import sec_accessModifier.Ex01.pack02.D;

public class AccessModifierOfMember {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();  System.out.println();
        b.print();  System.out.println();
        c.print();  System.out.println();
        d.print1(); System.out.println();
    }
}
