
public class BinarySearchRec {
    public static int binaryRec(int arr[], int start, int end, int key){
        if (start > end){
            return -1;
        }
        int mid = (start + end)/2;
        if(arr[mid] ==key)return mid;
        if(arr[mid] < key)return binaryRec(arr, mid +1, end, key);
        else return binaryRec(arr, start, mid -1, key);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = arr.length -1;
        int key = 5;
        System.out.println(binaryRec(arr, start, end , key));
    }
}

