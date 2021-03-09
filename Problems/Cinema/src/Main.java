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
        int avaliableSeatsNextToEachOther = 0;

        int currentRow = 0;
        boolean stopSearching = false;
        boolean anotherSeatIsFree=false;
        int seekedRow = 0;
        int max=-1;


        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length - 1; j++) {

                if (howManyTickersNeeded == 1) {
                    if (cinema[i][j] == 0) {

                        if (stopSearching != true) {
                            seekedRow = (currentRow + 1);
                        }
                        stopSearching = true;
                    }
                } else {


                    if (i != currentRow) {
                        avaliableSeatsNextToEachOther = 0;
                        currentRow++;

                    } else {

                        anotherSeatIsFree = cinema[i][j] == 0 && cinema[i][j+1] == 0;


                        if (anotherSeatIsFree == true) {

                            avaliableSeatsNextToEachOther++;

                            if(avaliableSeatsNextToEachOther==1){
                                avaliableSeatsNextToEachOther++;}


                            if (avaliableSeatsNextToEachOther > max) {
                                max = avaliableSeatsNextToEachOther;
                            }

                            if(max==howManyTickersNeeded){
                                seekedRow=(currentRow+1);
                            }



                        } else {
                            avaliableSeatsNextToEachOther = 0;
                        }

                    }


                }

            }
        }


        System.out.println(seekedRow);



    }
}