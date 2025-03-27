public class Sorting24 {
    int[] data;
    int size;

    public Sorting24(int[] data) {
        this.data = data;
        this.size = data.length;
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false; // Flag to check if a swap occurred
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true; // Set the flag to true if a swap occurred
                }
            }
            if (!swapped) break; // If no swaps occurred, the array is sorted
        }
    }

    public void print() {
        for (int num : data) {
            System.out.print(num + " "); // Print the actual numbers
        }
        System.out.println();
    }

    // Adding selection sort method (B. SORTING-SELECTION SORT)
    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            // Only swap if minIndex is different from i
            if (minIndex != i) {
                int temp = data[minIndex];
                data[minIndex] = data[i];
                data[i] = temp;
            }
        }
    }

    // Adding insertion sort method (C. SORTING-INSERTION SORT)
    public void insertionSort() {
        for (int i = 1; i < size; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        Sorting24 sorter = new Sorting24(array);

        System.out.println("Original array:");
        sorter.print();

        sorter.bubbleSort();
        System.out.println("Sorted array using Bubble Sort:");
        sorter.print();

        // Resetting the array for demonstration
        sorter = new Sorting24(new int[]{64, 34, 25, 12, 22, 11, 90});
        sorter.selectionSort();
        System.out.println("Sorted array using Selection Sort:");
        sorter.print();

        // Resetting the array for demonstration
        sorter = new Sorting24(new int[]{64, 34, 25, 12, 22, 11, 90});
        sorter.insertionSort();
        System.out.println("Sorted array using Insertion Sort:");
        sorter.print();
    }
}