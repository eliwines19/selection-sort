


public class SelectionSort {

    void sort(int arr[]){

        // Iterate through the unsorted list
        for (int i = 0; i < arr.length-1; i++) {

            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SelectionSort ex = new SelectionSort();
        int arr[] = {43, 45, 1, 23, 29, 36, 14, 18, 41};
        ex.sort(arr);
        System.out.println("Sorted Array");
        ex.printArray(arr);
    }

}