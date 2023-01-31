


public class SelectionSort {

    void sort(int arr[]){
        int n = arr.length;

        // One by one iterate through unsorted list
        for (int i = 0; i < n-1; i++) {

            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
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
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
    }

}