public  class QueueSortingTools {
    /**
     * indexArray initialized as a tool to communicate the order of elements
     * from personArray to finalSortedArray
     */
    static int[] indexArray = {0, 1, 2, 3, 4};

    /**
     * recursively employs quickSort to sort String[] lastNameArray
     * @param arr
     * @param low
     * @param high
     */
    public static void quickSortArray(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortArray(arr, low, pi - 1);
            quickSortArray(arr, pi + 1, high);
        }
    }

    /**
     * recursively employs quickSort to sort int[] ageArray
     * @param arr
     * @param low
     * @param high
     */
    public static void quickSortArray(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortArray(arr, low, pi - 1);
            quickSortArray(arr, pi + 1, high);
        }
    }

    /**
     * sorts indexArray according to values in String[] arr
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int partition(String[] arr, int low, int high) {
        int pivotIndex = indexArray[high];
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

     /**sorts indexArray according to values in int[] arr
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int partition(int[] arr, int low, int high) {
        int pivotIndex = indexArray[high];
        int pivot = arr[pivotIndex];
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

    /**
     * uses order of indexArray to sort PersonQueue[] personArray into new array
     * finalSortedArray, and after returning personArray, reverts indexArray to
     * its original state
     * @param personArray
     * @return
     */
    public static PersonQueueManager[] finalSort(PersonQueueManager[] personArray) {
        PersonQueueManager[] finalSortedArray = new PersonQueueManager[5];
        for (int i = 0; i < 5; i++) {
            finalSortedArray[4-i] = personArray[indexArray[i]];
        }
        for(int i = 0; i<5; i++){
            indexArray[i] = i;
        }
        return finalSortedArray;
    }
}