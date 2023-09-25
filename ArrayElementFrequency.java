public class ArrayElementFrequency {
    public static void main(String[] args) {
        int[] list = { 3, 7, 3, 3, 8, 8, 12, 99, 9, 1, 3, 12 };

        for (int i = 0; i < list.length; i++) {
            int element = list[i];
            int frequency = 0; // start to count

            for (int j = 0; j < list.length; j++) {
                if (element == list[j]) {
                    frequency++;
                }
            }

            boolean calculated = false;
            for (int k = 0; k < i; k++) {
                if (element == list[k]) {
                    calculated = true;
                    break;
                }
            }

            if (!calculated) {
                System.out.println("Element " + element + " appears " + frequency + " times.");
            }
        }
    }
}
