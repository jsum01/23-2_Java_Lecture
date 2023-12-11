package java231030;

public class MultipleArray {
    public static void main(String[] args) {
        int[][] data = {
                {10, 20},
                {100, 200, 300},
                {1000, 2000, 3000}
        }; //new int[3][4];
        System.out.println(data); //이 상태에선 주소를 출력
        System.out.println(data[1]); //이 상태에선 주소를 출력
        System.out.println(data[1][1]); //이 상태에선 주소를 출력

        // 1. for문을 사용
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("----------------------------------");
        // 2. for-each문을 사용
        for(int[] temp: data) {
            for(int score: temp) {
                System.out.print(score + " ");
            }
            System.out.println();
        }
    }
}
