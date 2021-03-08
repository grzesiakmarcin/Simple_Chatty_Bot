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
        int answer = 0;
        int currentRow = 0;


        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length - 1; j++) {

                if (i != currentRow) {
                    counter = 0;
                    moreThanOne = 0;
                    currentRow++;
                }

                if (cinema[i][j] == 0) {
                    counter++;
                    if (cinema[i][j + 1] == 0) {

                        moreThanOne++;


                        if (moreThanOne + 1 >= howManyTickers) {

                            System.out.println(+(currentRow + 1));
                            break;

                        }

                    }
                }


            }


        }

        if(moreThanOne + 1 <howManyTickers){
            System.out.println(0);
        }
    }
}


