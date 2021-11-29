package sec01_array.Ex09;

public class ReadArrayData2D {
    public static void main(String[] args) {

        // 2차원 데이터의 배열의 길이

        // 2차원 정방 행렬
        int[][] array1 = new int[2][3];
        System.out.println(array1.length + " " + array1[0].length + " " + array1[1].length);

        // 2차원 비 비정방 행렬
       int[][] array2 = new int[][]{{1, 2}, {3, 4, 5}};
        System.out.println(array2.length + " " + array2[0].length + " " + array2[1].length);
//        System.out.println(array2.length);
//        System.out.println(array2[0].length);
//        System.out.println(array2[1].length);

        // 2차원 배열 출력하는 방법
            // (하나하나 적어서 출력하는 방법은 생략하도록 한다.)

        // for
        for(int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
        }
        System.out.println();

        // for-each
        for (int[] oneArray : array2) {
            for (int num : oneArray) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

    }
}
