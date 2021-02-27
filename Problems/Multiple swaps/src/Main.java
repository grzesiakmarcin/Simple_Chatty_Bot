import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> myList = new ArrayList<>();

        List<String> myOther = new ArrayList<>();


        while (sc.hasNextLine()) {
            myList.add(sc.next());
        }
        int howManySwaps = sc.nextInt();

        while (sc.hasNext()) {
            myOther.add(sc.next());
        }


        System.out.println("pierwsza list:");
        for (String ele:myList
             ) {
            System.out.println(ele);

        }

        System.out.println(" ilosc swapów :" +howManySwaps+ "kolejna lista:");

        for (String element:myOther
             ) {
            System.out.println(element);

        }
    }
}

class Methods {

    public char[] doTheArray(String s) {
        char[] array = new char[s.length() + 1];

        for (int i = 0; i < s.length(); i = i + 2) {
            array[i] = s.charAt(i);

        }


        return array;
    }


}