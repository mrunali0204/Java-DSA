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

        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    printArray(arr);
}
}

