package sec_accessModifier.Ex01.pack01;

public class A {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    public void print() {
        System.out.printf("%d, ", a);  // 사용 가능
        System.out.printf("%d, ", b);  // 사용 가능
        System.out.printf("%d, ", c);  // 사용 가능
        System.out.print(d);  // 사용 가능
    }
}
