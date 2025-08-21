package Stack;

public class Entry {
    public static void main(String[] args) {
        Stack stack = new Stack();

        for(int i = 1; i<10;i+=2){
            stack.push(i);
        }

        while(stack.size() > 0){
            System.out.println("Popped: " + stack.pop());
            System.out.println("Current size: " + stack.size());
        }
    }
}
