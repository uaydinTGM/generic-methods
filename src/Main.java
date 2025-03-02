import java.sql.Array;

/**
 * Main class to demonstrate the functions of the GenericUtils class.
 */
public class Main {

    public static void main(String[] args) {

        // Create and print a String array
        String[] array = {"Max", "Sebastian", "Moritz", "Lukas", "David"};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // Reverse and print the String array
        GenericUtils.reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // Create an Integer array and calculate the sum
        Integer[] array2 = {2, 4, 5, 1, 2};
        System.out.println(GenericUtils.sum(array2));

        // Create a Byte array and calculate the sum
        Byte[] array3 = {1, 1, 0, 1, 0};
        System.out.println(GenericUtils.sum(array3));
    }
}
