public class DuplicateEvenNumbersFinder {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = { 3, 7, 3, 3, 8, 8, 12, 99, 9, 12, 9 };
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            boolean found = false; // To check whether we have previously found a duplicate number
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    found = true;
                    break;
                }
            }
            if (found && !isFind(duplicate, list[i]) && list[i] % 2 == 0) {
                duplicate[startIndex++] = list[i];
            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
