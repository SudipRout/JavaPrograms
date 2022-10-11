import java.util.Stack;

public class Stamck {
    public static void main(String[] args) {
        //stack = LIFO data structure, Last-In First-Out
        //        stores objects into a sort of "Vertical tower"
        //        push() to add to the top
        //        pop() to remove from the top

        // Uses of Stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
//      stack.pop();
        System.out.println(stack.search("j"));
//        for(int i = 0; i < 100000; i++) {
//            stack.push("Skyrim");
    }
}
