package blinof_java;

public class FistProgram {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.printf("Argument->> %s%n", str);
        }
        Action action = new Action();
        action.PrintAction("Hello java!!!");
    }


    static class Action {
        void PrintAction(String str) {
            System.out.println(str);
        }
    }
}
