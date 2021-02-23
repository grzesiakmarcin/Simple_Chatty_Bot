import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        String input = sc.next();

        char[] array = input.toCharArray();
        int length = array.length;
        int result = 0;

        for (int i =0; i<length;i++){
            if(array[i]==array[(array.length-1)-i]){
                result++;
            }
        }


        System.out.println(result==length?"yes":"no");

    }
}