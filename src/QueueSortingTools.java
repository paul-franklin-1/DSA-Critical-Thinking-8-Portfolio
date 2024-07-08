public class QueueSortingTools {
    /**
     * IndexArray initialized as a tool to communicate the order of elements
     * from personArray to finalSortedArray.
     */
    static int[] indexArray = {0, 1, 2, 3, 4};

    /**
     * Recursively employs quickSort to sort String[] lastNameArray.
     * @param arr
     * @param low
     * @param high
     */
    public static void quickSortArray(String[] arr, int low, int high) {
        try {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSortArray(arr, low, pi - 1);
                quickSortArray(arr, pi + 1, high);
            }
        } catch (Exception e) {
            System.err.println("Error during quick sort of string array: " + e.getMessage());
        }
    }

    /**
     * Recursively employs quickSort to sort int[] ageArray.
     * @param arr
     * @param low
     * @param high
     */
    public static void quickSortArray(int arr[], int low, int high) {
        try {
            if (low < high) {
                int pi = partition(arr, low, high);
                quickSortArray(arr, low, pi - 1);
                quickSortArray(arr, pi + 1, high);
            }
        } catch (Exception e) {
            System.err.println("Error during quick sort of integer array: " + e.getMessage());
        }
    }

    /**
     * Sorts indexArray according to values in String[] arr.
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int partition(String[] arr, int low, int high) {
        try {
            int pivotIndex = indexArray[high];
            String pivot = arr[pivotIndex];
            int i = (low - 1);
            for (int j = low; j < high; j++) {
                if (arr[indexArray[j]].compareTo(pivot) < 0) {
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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds during partition: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error during partition: " + e.getMessage());
        }
        return low; // Return a default value in case of error
    }

    /**
     * Sorts indexArray according to values in int[] arr.
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int partition(int[] arr, int low, int high) {
        try {
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
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds during partition: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error during partition: " + e.getMessage());
        }
        return low; // Return a default value in case of error
    }

    /**
     * Uses order of indexArray to sort PersonQueue[] personArray into new array
     * finalSortedArray, and after returning personArray, reverts indexArray to
     * its original state.
     * @param personArray
     * @return
     */
    public static PersonQueueManager[] finalSort(PersonQueueManager[] personArray) {
        PersonQueueManager[] finalSortedArray = new PersonQueueManager[5];
        try {
            for (int i = 0; i < 5; i++) {
                finalSortedArray[4-i] = personArray[indexArray[i]];
            }
            for(int i = 0; i < 5; i++){
                indexArray[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array index out of bounds during final sort: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error during final sort: " + e.getMessage());
        }
        return finalSortedArray;
    }
}
