public class ReStack{
    private String[] nuArray = new String[1];
    private String[] tempArray = null;
    private int top = -1;

    private void resizeStack(int newCapacity){

        tempArray = new String[newCapacity];
        for(int i=0;i<=top;i++)
            tempArray[i] = nuArray[i];
        nuArray = tempArray;
    }

    public String peek(){

        return nuArray[top];
    }

    public void push(String str){

        if(top == nuArray.length - 1)
            resizeStack(nuArray.length * 2);
        nuArray[++top] = str;
    }

    public String pop(){

        if(top == -1){
            System.out.println("Empty Stack");
            System.exit(0);
        }

        if(top < nuArray.length/4)
            resizeStack(nuArray.length / 2);

        String str = nuArray[top];
        nuArray[top] = null;
        top--;
        return str;
    }

    public Boolean isEmpty(){

        if(top == -1)
            return true;
        else
            return false;
    }
}
