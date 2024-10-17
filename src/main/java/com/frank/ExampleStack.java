package com.frank;

import java.util.Stack;

public class ExampleStack {

    private static Stack<String> pastCommands = new Stack<>();
    private static Stack<String> futureCommands = new Stack<>();

    public static void undo(){
        if( !pastCommands.isEmpty()) {

            futureCommands.push(pastCommands.pop());
        }
    }
    public static void redo(){
        if (!futureCommands.isEmpty()) {
            pastCommands.push(futureCommands.pop());
        }
    }

    public static void main(String[] args) {
        pastCommands.push("Draw a box");
        pastCommands.push("Fill in box");
        pastCommands.push("Change the color");
        pastCommands.push("Drar a circle");
        pastCommands.push("Move the circle");


        undo();

        redo();

        redo();

    }

}
