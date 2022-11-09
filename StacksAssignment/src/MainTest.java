import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        int choice = 1;
        while (choice != 0){
            Double answer = null;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to infix evaluator");
            System.out.println("Type an infix expression");
            String [] infixExpr = scanner.nextLine().split(" ");

            answer = Evaluator.evaluateInfixExpr(infixExpr);
            if(answer == null)
                System.out.println("Error evaluating infix expression");
            else
                System.out.println("Expression accepted.");
                System.out.println("Parathesis balanced.");
                System.out.println("Solution is  "+answer);
            System.out.println("Would you like to continue?");
            System.out.println("1 to continue");
            System.out.println("0 to exit");
            //System.out.println("yes to continue, no to stop");
            choice = scanner.nextInt();
            if(choice == 0){
                System.out.println("Closing program");
                System.out.println("Goodbye");
            }
        }
    }
}
