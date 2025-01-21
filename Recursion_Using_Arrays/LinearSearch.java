package RecUsingArrays;

public class Ls {
    public static int linearSearch(int[] arr, int n, int idx, int key){
        if(idx==n)return -1;
        if(arr[idx] == key)return idx;
        return linearSearch(arr, n, idx+1, key);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(linearSearch(arr, n, 0, 4));
    }
}
