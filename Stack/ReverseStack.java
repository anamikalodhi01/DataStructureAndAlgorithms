package Stack;
import java.util.*;

public class ReverseStack {

    public static void stackReverse(Stack<Integer> stack,int  key){
        int ele = stack.pop();
        if(key >= ele){
            stackReverse(stack, key);
            stack.push(key);
        }
        System.out.println(stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int key = 3;
        stackReverse(stack, key);
    }
}
