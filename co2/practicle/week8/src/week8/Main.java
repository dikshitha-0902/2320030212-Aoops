package week8;
public class Main {
    public static void main(String[] args) {
        // Test ArrayStack with Integer
        Stack<Integer> arrayStack = new ArrayStack<>(5);
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        System.out.println("ArrayStack (Integer) peek: " + arrayStack.peek());
        System.out.println("ArrayStack (Integer) pop: " + arrayStack.pop());
        System.out.println("ArrayStack (Integer) isEmpty: " + arrayStack.isEmpty());

        // Test LinkedListStack with String
        Stack<String> linkedListStack = new LinkedListStack<>();
        linkedListStack.push("apple");
        linkedListStack.push("banana");
        linkedListStack.push("cherry");
        System.out.println("LinkedListStack (String) peek: " + linkedListStack.peek());
        System.out.println("LinkedListStack (String) pop: " + linkedListStack.pop());
        System.out.println("LinkedListStack (String) isEmpty: " + linkedListStack.isEmpty());

        // Test LinkedListStack with Character
        Stack<Character> charStack = new LinkedListStack<>();
        charStack.push('A');
        charStack.push('B');
        charStack.push('C');
        System.out.println("LinkedListStack (Character) peek: " + charStack.peek());
        System.out.println("LinkedListStack (Character) pop: " + charStack.pop());
        System.out.println("LinkedListStack (Character) isEmpty: " + charStack.isEmpty());
    }
}

