import java.util.Scanner;
import javax.swing.SpringLayout;
import javax.swing.text.AbstractDocument.BranchElement;
public class Basic_Calculator{




public static void main(String [] args){

    //To print Basic Calculator in Star Pattern

        //Sorry too lazy to write calculator

        System.out.println("*****      *      *****  *  *****           *****       *       *       *****");
        System.out.println("*   *    *   *    *      *  *               *         *   *     *       *");
        System.out.println("*****   *******   *****  *  *               *        *******    *       *");
        System.out.println("*   *  *       *      *  *  *               *       *       *   *       *");
        System.out.println("***** *         * *****  *  *****           *****  *         *  *****   *****");

    //Takes input from User
    Scanner  user_input = new Scanner(System.in);

    System.out.println("Enter Your First Number:");

    //Input for first Integer
    double a = user_input.nextDouble();

    //Input for Operation
    System.out.println("Enter Operators (Eg : Sum(+) , Diff(-) , Multiplication( *) , Divison (/ ), Modulus (%) , Power(^)");
    char o  = user_input.next().charAt(0);

    //Input for second Integer
    System.out.println("Enter Your Second Number:");
    double b = user_input.nextDouble();
    user_input.close();

    //Print new line to 
    System.out.println();

    

    switch(o){
        
        case '+':
        double sum = a+b;
        System.out.println( "ANSWER:" +"     "+ a +"     "+ "+" + "       "+ b +"       "+"=" +"       "+ sum);
        break;

        case '-':
        double sub = a-b;
        System.out.println("ANSWER:" +"       " + a +"       " + "-" +"       " + b +"       " +"=" +"       " + sub);
        break;

        case '*':
        double mul = a*b;
        System.out.println("ANSWER:" +"       " +a +"       " + "*" +"       " +  b +"       "+"=" +"       " + mul);
        break;

        case '/':
        double div = a/b;
        System.out.println("ANSWER:"+"       " +a +"       " + "/" +"       " + b +"       "+"=" +"       "+ div);
        break;

        case '%':
        double mod = a%b;
        System.out.println("ANSWER:"+"       " +a +"       " + "%" +"       " + b +"       "+"=" +"       " + mod);

        case '^':
        double pow = Math.pow(a, b);
        System.out.println("ANSWER:"+"       " +a +"       " + "^" +"       " + b +"       "+"=" +"       "+pow);

        
    }
}
}