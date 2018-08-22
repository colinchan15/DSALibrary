package BinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int array[] = {1,5,9,10,78,95};
        int array2 [] = {5,87,6,95,45,23,5,10};
        int length = array.length;
        int length2 = array2.length;

        bs.sort(array2,0,length2-1);
        bs.print(array2);
        System.out.println(bs.binarySearch(array2,0,length2-1,45));

    }

    public int binarySearch(int[] array, int low, int high, int desired) {
        int index = (low + high) / 2;
        int pivot = array[index];

        if (low > high) {
            return -1;
        }
        if (desired < pivot) {
            return binarySearch(array, low, index - 1, desired);
        } else if (desired > pivot) {
            return binarySearch(array, index + 1, high, desired);
        } else {
            return index;
        }
    }

    public int partition(int array [], int low, int high){
        int index = (low+high)/2;
        int pivot = array[index];
        int i = low;
        int j = high;

        while(i<=j){
            while(array[i] < pivot){
                i++;
            }
            while(array[j] > pivot){
                j--;
            }

            // swap

            if(i<=j){ // need this part in case most of list already sorted and i goes past j on the first iteration or something
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    public void sort(int array[], int low, int high){
        int index = partition(array,low,high);

        if(low<high) {
            if (array[low] < array[index]) {
                sort(array, low, index - 1);
            }
            if (array[high] > array[index]) {
                sort(array, index, high);
            }
        }
    }

    public void print(int array[]){
        int length = array.length;

        for(int i = 0; i < length; i++){
            System.out.print(array[i] + " ");
        }
    }

}
