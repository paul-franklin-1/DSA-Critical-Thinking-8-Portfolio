public  class QueueSortingTools {
    public static void quickSortArray(String arr[], int low, int high) {
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
        String pivot = arr[high];
        int[] indexArray = {0, 1, 2, 3, 4};
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) > 0) {
                i++;
                int indexTemp = indexArray[i];
                indexArray[i] = indexArray[j];
                indexArray[j] = indexTemp;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int indexTemp = indexArray[i + 1];
        indexArray[i + 1] = indexArray[high];
        indexArray[high] = indexTemp;

        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int[] indexArray = {0, 1, 2, 3, 4};
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int indexTemp = indexArray[i];
                indexArray[i] = indexArray[j];
                indexArray[j] = indexTemp;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int indexTemp = indexArray[i + 1];
        indexArray[i + 1] = indexArray[high];
        indexArray[high] = indexTemp;

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
}
    public static void sortQueueBasedOnArray(int sortedArray,PersonQueueManager[] personQueue){
        for(int i = 0;i<5;i++) {
            if personQueue[i] ==
        }
        }
        }


