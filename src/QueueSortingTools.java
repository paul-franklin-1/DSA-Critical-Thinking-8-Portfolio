import java.util.Arrays;

public  class QueueSortingTools {
    static int[] indexArray = {0, 1, 2, 3, 4};
    public static void quickSortArray(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortArray(arr, low, pi - 1);
            quickSortArray(arr, pi + 1, high);
        }
    }
    public static void quickSortArray(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortArray(arr, low, pi - 1);
            quickSortArray(arr, pi + 1, high);
        }
    }

    public static int partition(String[] arr, int low, int high) {
        int pivotIndex = PersonQueueManager.copyIndexArray()[high];
        String pivot = arr[pivotIndex];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[indexArray[j]].compareTo(pivot) < 0) { // Sort by values in arr
                i++;
                // Swap indices in indexArray
                int indexTemp = indexArray[i];
                indexArray[i] = indexArray[j];
                indexArray[j] = indexTemp;
            }
        }
        // Swap indices in indexArray
        int indexTemp = indexArray[i + 1];
        indexArray[i + 1] = indexArray[high];
        indexArray[high] = indexTemp;

        return i + 1;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int indexTemp = indexArray[i];
                indexArray[i] = indexArray[j];
                indexArray[j] = indexTemp;
            }
        }
        int indexTemp = indexArray[i + 1];
        indexArray[i + 1] = indexArray[high];
        indexArray[high] = indexTemp;
        return i + 1;
    }

    public static PersonQueueManager[] finalSort(PersonQueueManager[] personArray) {
        PersonQueueManager[] finalSortedArray = new PersonQueueManager[5];
        for (int i = 0; i < 5; i++) {
            finalSortedArray[i] = personArray[indexArray[i]];
        }
        for(int i = 0; i<5; i++){
            indexArray[i] = i;
        }

        return finalSortedArray;

    }
}