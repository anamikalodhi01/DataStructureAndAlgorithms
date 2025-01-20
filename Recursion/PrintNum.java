import java.util.*;

public class PrintNum{

    public static void printing(int num){
        if(num==11){
            return;
        }
        printing(num+1);
        System.out.print(num+ " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printing(num);
    }
}

