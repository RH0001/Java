package sec02_String;

public class practice {
    public static void main(String[] args) {
        //Q8.
        String str = "내 이름은 [홍길동]압니다. 나이는 [15]살 입니다.";
        String name;
        int age;

        int startIdx = str.indexOf("[") + 1;
        int lastIdx = str.indexOf("]");
        name = str.substring(startIdx, lastIdx);

        startIdx = str.lastIndexOf("[")+1;
        lastIdx = str.lastIndexOf("]") ;

        age = Integer.valueOf(str.substring(startIdx, lastIdx));

        System.out.println(name);
        System.out.println(age);
//        idx = str.lastIndexOf("[");
    }
}
