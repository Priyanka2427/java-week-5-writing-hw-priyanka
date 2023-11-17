package Programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaration a scanner object
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please first number : "); // input wizard
            int a = sc.nextInt();
            System.out.println("Please Second number : "); // input wizard
            int b = sc.nextInt();
            System.out.println("Please enter one of symbol + , - ,* , / ,: "); // input wizard
            char symbol = sc.next().charAt(0);
            Calculator obj = new Calculator();
            obj.calculateResult(a, b, symbol);
            System.out.println("would you like to do more calculation Please enter “Y” or “N” : "); // input wizard
            answer = sc.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));
        // Closing a scanner object
        sc.close();
    }
}
