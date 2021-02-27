import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next().toLowerCase();
        String secondWord = sc.next().toLowerCase();
        char [] firsArray = firstWord.toCharArray();
        char [] secArray = secondWord.toCharArray();
        Map<Character, Integer> myMap = new TreeMap<>();
        Map<Character, Integer> mySecondMap = new TreeMap<>();


        for (int i = 0; i < firsArray.length; i++) {
            if (!myMap.containsKey(firsArray[i])) {
                myMap.put(firsArray[i], 1);

            } else {
                myMap.replace(firsArray[i], myMap.get(firsArray[i]), myMap.get(firsArray[i]) + 1);

            }
        }

        for (int i = 0; i < secArray.length; i++) {
            if (!mySecondMap.containsKey(secArray[i])) {
                mySecondMap.put(secArray[i], 1);
            } else {
                mySecondMap.replace(secArray[i], mySecondMap.get(secArray[i]), mySecondMap.get(secArray[i]) + 1);
            }
        }

        String result = myMap.equals(mySecondMap)?"yes":"no";
        System.out.println(result);



    }


}
