import java.util.Arrays;

public class Ex2_loops_arrays {
    public static void print2dIntArray(int[][] array) {
        System.out.println(Arrays.deepToString(array).replace("], ", "]\n"));
    }

    public static void print1dIntArray(int[] array) {
        System.out.println(Arrays.toString(array).replace("], ", "]\n"));
    }


    public static void main(String[] args) {
        int i = 1;
        int a = i++;            // i++ performs 2 operations: 1. a = i; 2. i += 1;
        System.out.println(a);
        System.out.println(i);

        i = 1;
        a = ++i;                // ++i performs 2 operations: 1. i += 1: 2. i = a;
        System.out.println(a);
        System.out.println(i);

        int[][] array2dTst = new int[3][3];

        int[][] array2d = new int[][] {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };

        int[] array1d = new int[] {1, 2, 3};

        print2dIntArray(array2dTst);
        print1dIntArray(array1d);

        int tmp_array[] = {1, 2, 3};
        print1dIntArray(tmp_array);

        // does not work
        /*
        int age = 18;
        switch (true)
        {
            case (age >= 18):
                System.out.println("You are allowed to drink alcohol!");
                break;
            case (age >= 16):
                System.out.println("You are allowed to drink beer!");
                break;
            default:
                System.out.println("You are not allowed to drink alcohol!");
                break;
        }
         */


    }
}
