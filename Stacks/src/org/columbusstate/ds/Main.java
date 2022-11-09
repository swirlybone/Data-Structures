package org.columbusstate.ds;

public class Main {

    public static void main(String[] args) {
	     //Write an algorithm that given a paragraph it inverts the words in the paragraph
        String paragraph =  "In the beginning the earth was empty";

        //the algorithm should return "emtpy was earth the beginning the In"
        //LinkedStack<String> aStack = new LinkedStack<String>();

        java.util.Stack<String> aStack = new java.util.Stack<String>();

        String[] words = paragraph.split(" ");

        for(String word : words){
            aStack.push(word);
        }

        StringBuilder aStringBuilder = new StringBuilder();

        while(! aStack.isEmpty())
        {
            String topElement = aStack.pop();
            aStringBuilder.append(topElement+ " ");
        }

        System.out.println(aStringBuilder.toString());
    }
}
