import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();

        int[][] cinema = new int[rows][column];

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                cinema[i][j] = sc.nextInt();
            }
        }


        int howManyTickers = sc.nextInt();
        int counter = 0;
        int moreThanOne = 0;
        int currentRow = 0;
        boolean stopCounting = false;
        int answer = 0;

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length - 1; j++) {

                if (howManyTickers == 1) {


                    if (stopCounting != true) {
                        answer = (currentRow + 1);
                    }
                    stopCounting = true;
                } else {


                    if (i != currentRow) {
                        counter = 0;
                        moreThanOne = 0;
                        currentRow++;
                    } else {

                        if (cinema[i][j] == 0) {
                            counter++;

                            if (cinema[i][j + 1] == 0) {
                                moreThanOne++;

                                if (moreThanOne + 1 >= howManyTickers) {

                                    // System.out.println("udało się: "+(currentRow + 1));

                                    if (stopCounting != true) {
                                        answer = (currentRow + 1);
                                    }
                                    stopCounting = true;


                                }

                            }
                        }
                    }


                }

            }
        }


        System.out.println(answer != 0 ? answer : 0);


    }
}


