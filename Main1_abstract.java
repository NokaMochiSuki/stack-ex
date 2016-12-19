/**
 * Created by tnal on 2016/12/14.
 */
public class Main1_abstract {
    public static void main(String[] args){
        AbstractStack stack = new StackArray(5);

        stack.push("this");
        stack.push("is");
        stack.push("test");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop()); // when stack is empty.
    }
}
