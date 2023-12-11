package java231106;

public class unidirectionalArray {

    public static void main(String[] args) {
        int[][] data = {
                {90, 80, 70, 0},
                {88, 99, 0},
                {77, 66, 88, 99, 00, 0},
        };
        // 일반적인 for문 사용
        System.out.println("일반적인 for문");
        for(int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
                data[i][data[i].length - 1] += data[i][j];
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        // For-each문 사용
        System.out.println("for-each문 사용");
        for(int [] temp: data) {
            for(int score : temp) {
                System.out.print(score + " ");
            }
            System.out.println();
        }
    }
}
