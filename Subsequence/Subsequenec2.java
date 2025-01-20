public class Subsequenec2 {
    public static void subs(int[] arr, int idx, String ans){
        if(idx == arr.length){
            System.out.println(ans + " ");
            return;
        }
        //include
        subs(arr, idx + 1, ans + arr[idx] + " ");
        //exclude
        subs(arr, idx + 1, ans);
    } 
    public static void main(String[] args) {
    int[] arr = {3,1,2};
    String ans = "";
    subs(arr, 0, ans);
    }
}
