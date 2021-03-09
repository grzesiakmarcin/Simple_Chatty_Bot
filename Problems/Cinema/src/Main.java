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


        int howManyTickersNeeded = sc.nextInt();

        int currentRow = 0;
        int avaliableSeatsNextToEachOther = 0;
        boolean stopSearching = false;
        boolean anotherSeatIsFree = false;
        int seekedRow = 0;
        int maxFreeSeetsCounted = -1;

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length - 1; j++) {

                System.out.println("w rzedzie " + currentRow + " zliczono: " + avaliableSeatsNextToEachOther);
                avaliableSeatsNextToEachOther = 0;

                if (currentRow != i) {
                    currentRow++;
                }


                anotherSeatIsFree = cinema[j][i] == 0 && cinema[j][i + 1] == 0;


                if (anotherSeatIsFree == true) {

                    avaliableSeatsNextToEachOther++;

                    if (avaliableSeatsNextToEachOther == 1) {
                        avaliableSeatsNextToEachOther++;
                    }


                    if (avaliableSeatsNextToEachOther > maxFreeSeetsCounted) {
                        maxFreeSeetsCounted = avaliableSeatsNextToEachOther;
                    }

                    if (howManyTickersNeeded == maxFreeSeetsCounted) {
                        seekedRow = (currentRow + 1);


                    }


                }

            }


        }


        System.out.println(seekedRow);
    }
}