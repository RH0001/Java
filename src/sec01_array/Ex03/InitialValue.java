package sec01_array.Ex03;

import java.util.Arrays;

public class InitialValue {
    public static void main(String[] args) {
        // 스택 메모리값 (강제 초기화 x)
        int value1;
        // System.out.println(value1);
        // error
        // java: variable value1 might not have been initialized

        int[] value2;
//        System.out.println(value2);

        int value3 = 0;
        System.out.println(value3); // 0으로 초기화를 했기 때문에 출력가능.

        int[] value4 = null;
        System.out.println(value4); // null로 초기화를 했기 때문에 출력가능.
        System.out.println();


        // heap 메모리값 (강제 초기화 o)
        // @기본 자료형 배열
        boolean[] array1 = new boolean[3];
        for(int i = 0; i < 3; i++) {
            System.out.println(array1[i] + " ");
        }

        int[] array2 = new int[3];
        for(int i = 0; i < 3; i++) {
            System.out.println(array2[i] + " ");
        }

        double[] array3 = new double[3];
        for(int i = 0; i < 3; i++) {
            System.out.println(array3[i] + " ");
        }

        // @참조 자료형 배열
        String[] array4 = new String[3];
        for(int i = 0; i < 3; i++) {
            System.out.println(array4[i] + " ");
        }

        //배열을 한번에 출력
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));
    }
}
