package ss10_DSAStack.bai_tap;

import java.util.Stack;

//[Bài tập] Đảo ngược phần tử trong mảng số nguyên sử dụng Stack
public class b1 {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<Integer>();
        Stack <Integer> Wstack = new Stack<Integer>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(5);
        int temp, loop = stack.size();
        for(int i =0; i<loop; i++) {
            temp = stack.pop();
            Wstack.push(temp);
        }
        System.out.println(stack);
        System.out.println(Wstack);
    }
}
