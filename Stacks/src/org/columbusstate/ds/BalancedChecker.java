package org.columbusstate.ds;

import java.util.Scanner;

public class BalancedChecker {
    public static void main(String args[]){
        // This program should ask a user for an expression with balanced parenthesis
        // and should return that the expression is balanced or not.

        Scanner scan = new Scanner(System.in);

        System.out.println("Type an expression that contains ( and ) characters");
        String input = scan.nextLine();

        LinkedStack<Character> stack = new LinkedStack<Character>();

        for(int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            if(character == '(')
            {
                stack.push('(');
            }
            else if(character == ')')
            {
                Character value = stack.pop();
                if(value == null)
                {
                    System.out.println("Your string is not balanced ");
                    System.exit(0);
                }
            }
        }

        if(stack.isEmpty())
        {
            System.out.println("Your string is balanced ");

        }
        else
        {
            System.out.println("Your string is not balanced ");
        }
    }
}
