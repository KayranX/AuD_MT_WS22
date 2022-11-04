import java.util.Arrays;

public class Ex2_loops {
    // simple method using the arrays library to print 2d images
    public static void print2dIntArray(int[][] array) {
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
    }

    // simple method using the arrays library to print 1d images
    public static void print1dIntArray(int[] array) {
        System.out.println(Arrays.toString(array).replace("], ", "]\n"));
    }


    public static void main(String[] args) {
        // 1. Loops
        // 1.1 for-loops
        // for (variable; condition; increment) {}

        // this loop prints all the values between 0 and 10 (inclusive)
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // this loop prints all uneven numbers between 1 and 10 (inclusive)
        for (int i = 1; i < 11; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // this loop prints all uneven numbers 1 and 10 (inclusive), but is less efficient
        for (int i = 1; i < 11; i++) {
            // check if the number is uneven
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // infinite for-loop, break needed to leave
        for (int i = 0;;) {
            if (i >= 10) {
                break;
            } else {
                System.out.print(i + " ");
                i++;
            }
        }
        System.out.println();

        // decreasing for-loop (just for demonstration)
        for (int i = 25; i > 10; i -= 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 1.2 while-loop
        // while(condition) {}

        // print all even numbers between 2 and 10
        int k = 0;
        while (k < 10) {
            k += 2;
            System.out.print(k + " ");
        }
        System.out.println();

        // infinite loop (because of condition always evaluates to true), exit loop with break, use jump to skip rest of
        // loop and start back at the top, calculate the sum of all even numbers between 0 and 10 (exclusive)
        k = 0;
        int sum = 0;
        while (true) {
            if (k > 10) {
                break;
            } else {
                if (k % 2 == 0) {
                    k++;
                    continue;
                }
                sum += k;
                k++;
            }
        }
        System.out.println(sum);

        // do-while-loop
        // do {} while(condition)
        // always runs through at least once

        // prints all numbers between 0 an 9 (inclusive)
        k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k < 10);
        System.out.println();

        // 2. arrays
        // arrays are fixed in size

        // create 1d array with certain size
        int[] intArr1 = new int[5];
        print1dIntArray(intArr1);

        // create 1d array and fill it with certain values
        int[] intArr2 = new int[] {1, 2, 3, 4, 5};
        print1dIntArray(intArr2);

        // each value in der array gets assigned a new value which is 2^(value)
        for (int i = 0; i < intArr2.length; i++) {
            intArr2[i] = (int) Math.pow(2, intArr2[i]);
        }

        // simple for loop to print out the values in an array
        for (int i = 0; i < intArr2.length; i++) {
            System.out.print(intArr2[i] + " ");
        }
        System.out.println();

        // alternative approach
        for (int entry : intArr2) {
            System.out.print(entry + " ");
        }
        System.out.println();

        // string array
        String[] strArr1 = new String[] {"Hello", "World"};

        // example from exercise, increment each value by 1 but the last one (increase that one by 2)
        int[] intArr3 = new int[] {24, 11, 98};
        for (int i = 0; i < intArr3.length; i++) {
            if (i == intArr3.length - 1) {
                intArr3[i]++;
            }
            intArr3[i]++;
        }
        print1dIntArray(intArr3);

        // create empty 2d array, first bracket corresponds to the lines, second to the columns
        int[][] array2dTst = new int[3][3];

        // create 2d array with certain values
        int[][] array2d = new int[][] {
                {1, 2, 3, 4},
                {2, 3, 4,},
                {3, 4}
        };

        // create random integer in range (Min, Max), Min + (int)(Math.random() * ((Max - Min) + 1))
        // print 100 values between 0 and 10
        int min = 0;
        
        for (int i = 0; i < 100; i++) {
            System.out.print(0 + (int)(Math.random() * ((10 - 0) + 1)) + " ");
        }

        for (int x = 0; x < array2d.length; x++) {
            for (int y = 0; y < array2d[x].length; y++) {
                System.out.print(array2d[x][y] + " ");
            }
            System.out.println();
        }

        print2dIntArray(array2d);
        int[] array1d = new int[] {1, 2, 3};

        // print2dIntArray(array2dTst);
        // print1dIntArray(array1d);

        int tmp_array[] = {1, 2, 3};
        // print1dIntArray(tmp_array);

        // does not work




    }
}