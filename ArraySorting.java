import java.util.Scanner;

public class ArraySorting { // BubbleSort
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Element:");
            arr[i] = input.nextInt();
        }
        // Create Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
}
