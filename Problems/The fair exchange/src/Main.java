import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void changeHeadsAndTails(LinkedList<String> linkedList, ArrayList<String> arrayList) {

        String firstFromLinked = linkedList.getFirst();
        String lastFromLinked = linkedList.getLast();
        String firstFromArray = arrayList.get(0);
        String lastFromArray = arrayList.get(arrayList.size() - 1);

        linkedList.remove(0);
        linkedList.add(0, firstFromArray);

        linkedList.remove(linkedList.size() - 1);
        linkedList.add(lastFromArray);

        arrayList.remove(0);
        arrayList.add(0, firstFromLinked);

        arrayList.remove(arrayList.size() - 1);
        arrayList.add(lastFromLinked);


        // write your code here

    }
}