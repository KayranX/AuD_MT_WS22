import java.util.Scanner;

public class Ex1_basics {
    public static void main(String[] args) {
        // 1. Variables and constants
        // 1.1 Integers
        byte byte_var = 127;                    // 8 bit
        short short_var = 1000;                 // 16 bit
        int int_var = 1_000_000_000;            // 32 bit (standard)
        long long_var = 10_000_000_000L;        // 64 bit (use L, else saved as int)

        // 1.2 Floating point numbers
        float float_var = 100f;                 // 32 bit (use f, else saves as double)
        double double_var = 1_000_000_000;      // 64 bit (standard)

        // 1.3 Truth values
        boolean bool_var = true;                // only true and false possible

        // 1.4 Strings
        char char_var = 'A';                    // 16 bit (save single signs, use '')
        String string_var = "Ex1_incomplete";             // use ""

        // 1.5 Changing variables
        int int_var2;                           // without initialization
        int_var2 = 10;                          // initialization
        bool_var = false;                       // changing existing variables

        // 1.6 Constants
        final String STRING_CONST = "Ex1_incomplete";     // cannot be changed anymore, written in uppercase
        final int INT_CONST;                    // without initialization
        INT_CONST = 5;                          // initialization


        // 2. Output
        System.out.print("Hello World");        // print text, stay in current line
        System.out.print("\n");                 // go to next line (due to \n)
        System.out.print("Hello World\n");      // combination of both
        System.out.println("Ex1_incomplete");             // go to next line without \n
        System.out.println(STRING_CONST);       // print a variable (or constant)
        System.err.println("Error");            // print an error message (in red)


        // 3. Input
        Scanner sc1 = new Scanner(System.in);   // scanner to read inputs
        System.out.println("Please enter an integer and a string");
        int sc_int = sc1.nextInt();             // read an integer
        String sc_string = sc1.next();          // read a string
        System.out.println(sc_int);
        System.out.println(sc_string);


        // 4. Calculations
        int calc1 = 28;
        int calc2 = 7;
        int plus = calc1 + calc2;               // plus
        int minus = calc1 - calc2;              // minus
        int multi = calc1 * calc2;              // multiplication
        int div = calc1 / calc2;                // division (always rounded down to the next full integer for integers)
        int mod = calc1 % calc2;                // modulo (calculates the remainder)
        double exp = Math.exp(5);               // more options in math library
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;        // concatenating strings


        // 5. Comparison
        int comp1 = 5;
        int comp2 = 10;
        System.out.println(comp1 == comp2);     // false
        System.out.println(comp1 != comp2);     // true
        System.out.println(comp1 < comp2);      // true
        System.out.println(comp1 > comp2);      // false
        System.out.println(comp1 <= comp2);     // true
        System.out.println(comp1 >= comp2);     // false


        // 6. Logic operators
        boolean log1 = true;
        boolean log2 = false;
        System.out.println(!log1);              // negation
        System.out.println(log1 && log2);       // and (both conditions must be true)
        System.out.println(log1 || log2);       // or (one condition must be true)
        System.out.println(log1 ^ log2);        // xor (one most be true, one must be false)


        // 7. If-else
        // condition in brackets must be true for case to apply
        // multiple else if blocks possible
        int if_var = 5;
        if (if_var >= 3) {
            System.out.println("Larger than 2");
        } else if (if_var < 10){
            System.out.println("Smaller than 10");
        } else {
            System.out.println("Your number is: " + if_var);
        }


        // 8. Switch
        // default case always required
        // goes into next case if not stopped by break
        switch (if_var) {
            case 1:
                System.out.println("1");
            case 3:
                System.out.println("3");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("Your number is not 1, 3 or 5!");
                break;
        }
    }
}
