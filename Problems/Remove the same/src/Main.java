import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void removeTheSame(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        int k = 0;


//        while (k < 10) {
//
//            for (int i = 0; i < linkedList.size(); i++) {
//
//                if (linkedList.get(i).equals(arrayList.get(i))) {
//                    linkedList.remove(i);
//                    arrayList.remove(i);
//                }
//
//            }
//
//            k++;
//        }


        for (int i = linkedList.size() - 1; i >= 0; i--) {
            if (linkedList.get(i).equals(arrayList.get(i))) {
                linkedList.remove(i);
                arrayList.remove(i);
            }
        }


    }
}