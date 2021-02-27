import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void transferAllElements(LinkedList<String> linkedList, ArrayList<String> arrayList) {

        LinkedList<String> copiedLinkedList = new LinkedList<String>(linkedList);
        ArrayList<String> copiedArrayList = new ArrayList<String>(arrayList);


        arrayList.clear();

        for (int i = 0; i < copiedLinkedList.size(); i++) {
            arrayList.add(i, copiedLinkedList.get(i));
        }

        linkedList.clear();
        for (int i = 0; i < copiedArrayList.size(); i++) {
            linkedList.add(i, copiedArrayList.get(i));
        }

    }
}