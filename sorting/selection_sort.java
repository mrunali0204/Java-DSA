package sorting;

class selection_sort {
    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 2, 1};

        // Selection Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i; // Assume the smallest element is at index 'i'
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j; // Update the index of the smallest element
                }
            }
            // Swap the smallest element with the element at index 'i'
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        printArray(arr);
    }
}
