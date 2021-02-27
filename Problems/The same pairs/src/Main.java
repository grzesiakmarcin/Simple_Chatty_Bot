import java.util.Map;

class MapFunctions {

    public static void calcTheSamePairs(Map<String, String> map1, Map<String, String> map2) {
        int counter = 0;

        for (Map.Entry<String, String> pair : map1.entrySet()) {

            for (Map.Entry<String, String> riap : map2.entrySet()) {
                if (pair.getKey().equals(riap.getKey()) && pair.getValue().equals(riap.getValue())) {

                    counter++;

                }
            }
        }


        System.out.println(counter);
    }
}