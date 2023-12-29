
import java.util.Scanner;

public class syntax_analysis {
    static int count = 0;
    static char[] str = new char[20];

    public static void main(String[] args) {
        System.out.println("The Grammar is ");
        System.out.println("S -> aAb/ccB");
        System.out.println("A -> a/b");
        System.out.println("B -> b/c");
        System.out.println("Enter the string ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        str = input.toCharArray();

        S_rule();

        if (count == str.length) {
            System.out.println("String is valid");
        } else {
            System.out.println("String is invalid");
        }
    }

    static void S_rule() {
        if (str[count] == 'a') {
            count++;
            A_rule();
            if (str[count] == 'b') {
                count++;
            } else {
                System.out.println("String is invalid");
            }
        } else if (str[count] == 'c') {
            count++;
            if (str[count] == 'c') {
                count++;
                B_rule();
            } else {
                System.out.println("String is invalid");
            }
        }
    }

    static void A_rule() {
        if (str[count] == 'a' || str[count] == 'b') {
            count++;
        } else {
            System.out.println("String is invalid");
        }
    }

    static void B_rule() {
        if (str[count] == 'b' || str[count] == 'c') {
            count++;
        } else {
            System.out.println("String is invalid");
        }
    }
}