public class Lab_1_3 {
    public static void main(String[] args) {
        double max_value=0;
        double A[][] = {{4.75, -2.1, 5.4},
                {-3.01, 2.5, -7.1},
                {-1.25, 2.31, -3.17}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i=" + i + ";j=" + j + ";A=" + A[i][j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    if (A[i][j] > max_value) {
                        max_value = A[i][j];
                    }
                }
            }
        }
        System.out.println("Максимальне значення серед елементів масиву, що розміщені на його двох діагоналях:" + max_value);


    }
}


