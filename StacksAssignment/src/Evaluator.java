import java.util.Stack;

public class Evaluator {

    private static Stack operandStack = new Stack();
    private static Stack operatorStack = new Stack();

    public static Double evaluateInfixExpr(String[] infixExpr){

        for(String str : infixExpr){

            if(!isValidOperator(str)){
                try {
                    Double operand = Double.parseDouble(str);
                    operandStack.push(Double.toString(operand));
                } catch (NumberFormatException e) {
                    System.out.println("Not a valid input");
                    System.out.println("Format example: num + num or ( num + num )");
                    e.printStackTrace();
                    System.exit(0);
                }
            }
            else{
                if(operatorStack.isEmpty())
                    operatorStack.push(str);
                else if(str.equals("(") || operatorStack.peek().equals("("))
                    operatorStack.push(str);
                else if(str.equals(")")){
                    while(!operatorStack.peek().equals("(")){
                        compute();
                    }
                    operatorStack.pop();
                }
                else{
                    while(!operatorStack.isEmpty() && !operatorStack.peek().equals("(") && getPrecendence(str) <= getPrecendence((String) operatorStack.peek())){
                        compute();
                    }
                    operatorStack.push(str);
                }
            }
        }

        while(!operatorStack.isEmpty()){
            compute();
        }

        return Double.parseDouble((String) operandStack.pop());
    }

    private static void compute(){

        double operand2 = Double.parseDouble((String) operandStack.pop());
        double operand1 = Double.parseDouble((String) operandStack.pop());
        String operator = (String) operatorStack.pop();
        double result;
        try {
            result = calculate(operand1, operand2, operator);
            operandStack.push(Double.toString(result));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    private static Double calculate(Double op1, Double op2, String str) throws ArithmeticException{

        switch(str){
            case "^":
                return(Math.pow(op1, op2));
            case "*":
                return (op1 * op2);
            case "/":
                return (op1 / op2);
            case "%":
                return (op1 % op2);
            case "+":
                return (op1 + op2);
            case "-":
                return (op1 - op2);
        }
        return null;
    }

    private static int getPrecendence(String c){
        switch(c){
            case "(":
            case ")":
                return 4;
            case "^":
                return 3;
            case "*":
            case "/":
            case "%":
                return 2;
            case "+":
            case "-":
                return 1;
            default :
                return -1;
        }
    }
    private static Boolean isValidOperator(String str){

        switch(str){
            case "(":
            case ")":
            case "^":
            case "*":
            case "/":
            case "%":
            case "+":
            case "-":
                return true;
            default:
                return false;
        }
    }
}

