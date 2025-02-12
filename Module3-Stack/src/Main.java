public class Main {
    public static void main(String[] args){
        ArrayStack playerStack = new ArrayStack(10);
        playerStack.push(new Player(1,"Saitama", 999));
        playerStack.push((new Player(2, "Deku", 100)));
        playerStack.push((new Player(3, "Saiki. K.", 500)));

        //Initial Stack
        System.out.println("Print Stack");
        playerStack.printStack();

        System.out.println("\nPopping: " + playerStack.pop());

        System.out.println("\nPeeking: " + playerStack.peek());

        System.out.println("\nNew Stack:");
        playerStack.printStack();

        playerStack.push(new Player(4, "Sakamoto", 10));
        System.out.println("\nNew Stack:");
        playerStack.printStack();
    }
}
