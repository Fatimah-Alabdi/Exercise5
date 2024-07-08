import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//1 - Write a Java method to find the smallest number among three numbers.
       /* System.out.println("input the first number: ");
        int f = scanner.nextInt();
        System.out.println("input the second number: ");
        int s = scanner.nextInt();
        System.out.println("input the third number: ");
        int t = scanner.nextInt();

        System.out.println("the smallest number is :"+smallest(f,s,t));

        */
//2 - Write a Java method that check if the entered number is
//negative or positive or zero.
       /* System.out.println("enter the number:");
        int n = scanner.nextInt();
        System.out.println("the number is :"+check(n));

        */

//3 - Write a Java method to check whether a string is a valid password.
//Password rules:

        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits");
        System.out.println("Input a password (You are agreeing to the above Terms and Conditions.):");
        String pass = scanner.next();
        if(password(pass)) {
            System.out.println("is valid "+pass);
        }else
            System.out.println("not valid "+pass);

    }

    public static int smallest(int n1, int n2, int n3) {
        if (n1 < n2 && n1 < n3) {
            return n1;


        } else if (n2 < n1 && n2 < n3) {
            return n2;
        } else return n3;

    }

    public static String check(int number) {

        if (number > 0) {
            return "positive";

        } else if (number < 0) {
            return "negative";
        } else
            return "zero";

    }

    public static boolean password(String number) {

        if (number.length() < 8) {

            return false;
        }


        int n=0;
        int c=0;
        for (int i = 0; i < number.length(); i++) {

            char ch = number.charAt(i);

            if ((digit(ch))) {
                n++;
            }
            else if (Letter(ch)) {
                c++;
            }
            else
                return false;
        }


        return ( n >= 2);

    }
    public static boolean Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean digit(char ch) {

        return (ch >= '0' && ch <= '9');
    }
    }




