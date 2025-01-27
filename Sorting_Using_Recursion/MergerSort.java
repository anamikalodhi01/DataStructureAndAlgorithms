package Sorting_Using_Recursion;

public class MergerSort {
    public static void mergeSort(int arr[], int s, int e){
        // base case
        if(s >= e)return; 

        // process
        int mid = s + (e - s)/2;

        // function call
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);

        //merge 2 sorted array
        merge(arr, s, mid, e);
    }

    public static void merge(int arr[], int s, int mid, int e){
        int l =s;
        int r = mid+1;
        int temp[] = new int[e-s+1];
        int idx = 0;
        while(l <= mid && r<=e){
            if(arr[l] < arr[r]){
                temp[idx++] = arr[l++];
            }
            else{
                temp[idx++] = arr[r++];
            }
        }
        while(l <= mid){
            temp[idx++] = arr[l++];
        }
        while(r <= e){
            temp[idx++] = arr[r++];
        }

        for(int i=0; i<temp.length; i++){
            arr[i+s] = temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int s = 0;
        int e = arr.length - 1;
        mergeSort(arr, s, e);
        for(int itr : arr){
            System.out.print(itr + " ");
        }
    }
}
