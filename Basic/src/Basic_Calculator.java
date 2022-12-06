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
    int a = user_input.nextInt();

    //Input for Operation
    System.out.println("Enter Operators (Eg : Sum(+) , Diff(-) , Multiplication( *) , Divison (/ ), Modulus (%) , Power(^)");
    char o  = user_input.next().charAt(0);

    //Input for second Integer
    System.out.println("Enter Your Second Number:");
    int b = user_input.nextInt();
    user_input.close();

    //Print new line to 
    System.out.println();

    

    switch(o){
        
        case '+':
        int sum = a+b;
        System.out.println( "ANSWER:" +"     "+ a +"     "+ "+" + "       "+ b +"       "+"=" +"       "+ sum);
        break;

        case '-':
        int sub = a-b;
        System.out.println("ANSWER:" +"       " + a +"       " + "-" +"       " + b +"       " +"=" +"       " + sub);
        break;

        case '*':
        int mul = a*b;
        System.out.println("ANSWER:" +"       " +a +"       " + "*" +"       " +  b +"       "+"=" +"       " + mul);
        break;

        case '/':
        int div = a/b;
        System.out.println("ANSWER:"+"       " +a +"       " + "/" +"       " + b +"       "+"=" +"       "+ div);
        break;

        case '%':
        int mod = a%b;
        System.out.println("ANSWER:"+"       " +a +"       " + "%" +"       " + b +"       "+"=" +"       " + mod);

        case '^':
        double pow = Math.pow(a, b);
        System.out.println("ANSWER:"+"       " +a +"       " + "^" +"       " + b +"       "+"=" +"       "+pow);

        
    }
}
}