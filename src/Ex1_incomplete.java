import java.util.Scanner;

public class Ex1_incomplete {
    public static void main(String[] args) {
        // 1. Variables
        // Integers
        byte byteVar = 127;             // 8 bit
        short shortVar = 10_000;        // 16 bit
        int intVar = 2_000_000_000;     // 32 bit (standard)
        long longVar = 3_000_000_000L;  // 64 bit

        // Floating point numbers
        float floatVar = 10.3f;         // 32 bit
        double doubleVar = 10.3;        // 64 bit (standard)

        // Truth values
        boolean boolVar = false;

        // Strings
        char charVar = 'A';             // 16 bit
        int charVal = charVar;
        String stringVar = "Hello";

        // Without initialization
        int noInit;
        noInit = 128;
        byteVar = 10;

        // Constants
        final int CONST_VAR = 10;
        final double PI;
        PI = 3.14;

        // Type casting
        byte castVar = (byte) noInit;

        // 2. Output
        // System.out.print("Hello World!\n");
        // System.out.print("\tHello AuD-MT!\n");
        // System.out.println("Ex1_incomplete");
        // System.out.println(stringVar);

        // 3. Input
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        int tst = scInt.nextInt();
        int tst2 = sc.nextInt();
        // System.out.println("How old are you?");
        // int scInt = sc.nextInt();
        // System.out.println("You are " + scInt + " years old.");
        // System.out.println("What is your name?");
        // String scString = sc.next();
        // System.out.println("Your name is " + scString);

        // 4. Calculations
        /*
        System.out.println("Enter two integers");
        int calc1 = sc.nextInt();
        int calc2 = sc.nextInt();
        int plus = calc1 + calc2;
        int minus = calc1 - calc2;
        int multi = calc1 * calc2;
        int intDiv = calc1 / calc2;
        double div = calc1 / (double) calc2;
        int mod = calc1 % calc2;
        // System.out.println(div);
        // System.out.println(mod);

        double sqrt36 = Math.sqrt(36);
        double abs = Math.abs(-10);

        plus += minus;
         */

        // 5. Comparison
        // ==, !=, <, >, <=, >=, .equals()
        /*
        int compVar1 = sc.nextInt();
        int compVar2 = sc.nextInt();
        System.out.println(compVar1 == compVar2);
        System.out.println(compVar1 >= compVar2);
        System.out.println(compVar1 != compVar2);
         */

        // 6. Logic operators
        // AND (&&), OR (||), XOR (^), Neg (!)
        // System.out.println(true && false);
        // System.out.println(!(5 > 3 && 3 == 4));
        // System.out.println(true || false);
        // System.out.println(true ^ false);

        // 7. if-else
        int age = sc.nextInt();
        /*
        if (age >= 18) {
            System.out.println("You are allowed to drink alcohol!");
        } else if (age >= 16) {
            System.out.println("You are allowed to drink beer!");
        } else {
            System.out.println("You are not allowed to drink alcohol!");
        }

        if (age >= 18) {
            System.out.println("You are allowed to drink alcohol!");
        }
        if (age >= 16) {
            System.out.println("You are allowed to drink beer!");
        }
         */


        // 8. switch
        switch (age) {
            case 18:
                System.out.println("You are 18 years old");
                break;
            case 16:
                System.out.println("You are 16 years old");
                break;
            default:
                System.out.println("There is no case for you");
                break;
        }

        scInt.close();
        sc.close();
    }
}
