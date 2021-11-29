package sec01_array.Ex07;

import java.util.Arrays;

public class RectangleValueAssignment {
    public static void main(String[] args) {
        // 배열 객체의 생성 + 원소 값 대입(방법1)
        int[][] array1 = new int[2][3];
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;
        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6;

        for (int[] tmp:array1) {
            for (int n : tmp) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // 배열 객체의 생성 및 원소값 대입 (방법 2)
        int[][] array2 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        for (int[] tmp:array2) {
            for (int n : tmp) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        int[][] array3;
        array3 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        for (int[] tmp:array3) {
            for (int n : tmp) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        // 배열 객체의 생성 및 원소값 대입 (방법 3)
        int[][] array4 = {{1, 2, 3}, {4, 5, 6}};
        for (int[] tmp:array4) {
            for (int n : tmp) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
