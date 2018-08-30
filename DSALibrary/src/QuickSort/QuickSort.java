package QuickSort;

public class QuickSort {

    public int partition(int [] a, int low, int high){
        int pivot = a[(low + high)/2];
        int i = low;
        int j = high;

        while(i<=j){
            while(a[i] < pivot){
                i++;
            }
            while(a[j] > pivot){
                j--;
            }

            //swap
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return i;
    }

    public void sort(int [] a, int low, int high){
        int index = partition(a, low, high);
        if(low < index-1){
            sort(a, low, index-1);
        }
        if(high > index){
            sort(a, index, high);
        }
    }

    public void print(int [] a){
        int length = a.length;
        for(int i = 0; i < length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int [] array = {5,2,8,0,12,56};
        int length = array.length;
        qs.sort(array, 0, length-1);
        qs.print(array);
    }

}
