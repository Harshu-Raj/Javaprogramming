import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int key : freqMap.keySet()) {
            System.out.println(key + " → " + freqMap.get(key));
        }
    }
}
