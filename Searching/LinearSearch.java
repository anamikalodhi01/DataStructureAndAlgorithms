package Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr ,int n){
        int key = 3;
        for(int i=0; i<n; i++){
            if(i == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println(linearSearch(arr, n));
    }
}
