public  class QueueSortingTools {
    static int[] indexArray = {0, 1, 2, 3, 4};

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
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) > 0) {
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
        for (int p = 0; p<5; p++) {
            for (int i = 0; i<5; i++) {
                if (indexArray[i] == p){
                    finalSortedArray[p] = personArray[i];
                }
            }
        }
        return finalSortedArray;
    }
}
