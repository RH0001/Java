package sec01_packageImport.Ex01_PackageImport_1;

public class PackageImport_1 {
    public static void main(String[] args) {

        // 객체 생성
        // A a = new A();       import를 하지 않았기때문에 오류가 발생한다.
        sec01_packageImport.common.A a = new sec01_packageImport.common.A();

        //맴버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
