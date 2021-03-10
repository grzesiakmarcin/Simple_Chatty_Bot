import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int column = sc.nextInt();

        int[][] array = new int[rows][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int positionN = Integer.MAX_VALUE;
        int positionM = Integer.MAX_VALUE;

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {


                if (array[i][j] >= max) {
                    max = array[i][j];
                    positionN = i;
                    positionM = j;


                }
            }

        }

        System.out.println(positionN + " " + positionM);

    }
}