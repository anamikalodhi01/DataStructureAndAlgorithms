public class printingNum {
    public static void printinginc(int num){
        if(num==6){
            return;
        }
        System.out.print(num+ " ");
        printinginc(num+1);
    }

    public static void printingdec(int num){
        if(num==6){
            return;
        }
        printingdec(num+1);
        System.out.print(num+ " ");
    }

    public static void main(String[] args) {
        int num =1;
        printinginc(num);
        printingdec(num);
    }
}
