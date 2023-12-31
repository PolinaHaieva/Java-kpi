public class second {
    public static void main(String[] args) {
        byte[][] arr = new byte[][] {
                { 1, 2, 1, 3 },
                { 1, 3, 1, 2 },                 //створення матриць
                { 1, 2, 1, 3 }
        };
        byte[][] arr1 = new byte[][] {
                { 2, 4, 2, 5 },
                { 2, 5, 2, 4 },
                { 2, 6, 2, 4 },
                { 2, 4, 2, 6 }
        };
        //розрахунок розмірності матриці результату
        int a = arr.length + arr1.length;
        int b = arr[0].length + arr1[0].length;
        byte[][] C = new byte[a][b];
        //заповнення матриці результату 
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i < arr.length && j < arr[0].length) {
                    C[i][j] = arr[i][j];
                } else if (i >= arr.length && j >= arr[0].length) {
                    C[i][j] = arr1[i - arr.length][j - arr[0].length];
                } else
                    C[i][j] = 0;
            }
        }
        //виведення матриці результату
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        //Обчислюємо суму найбільших елементів в стовпцях матриці з непарними номерами
        //та найменших елементів в стовпцях матриці з парними номерами
        int mxsum = 0, mnsum = 0;
        for (int i = 0; i < C.length; i++) {
            int min = C[i][0], max = C[i][1];
            for (int j = 2; j < C[0].length; j++) {
                if (j % 2 != 0) {
                    if (max < C[i][j]) {
                        max = C[i][j];
                    }
                } else {
                    if (C[i][j] < min) {
                        min = C[i][j];
                    }
                }
            }
            mxsum += max;
            mnsum += min;
        }
        System.out.println("Sum of max=" + mxsum);
        System.out.println("Sum of min=" + mnsum);
        System.out.println();
    }
}
