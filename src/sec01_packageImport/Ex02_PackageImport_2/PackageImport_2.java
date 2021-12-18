package sec01_packageImport.Ex02_PackageImport_2;

import sec01_packageImport.common.A;

public class PackageImport_2 {
    public static void main(String[] args) {
        // 객체 생성
        A a = new A();

        //맴버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
