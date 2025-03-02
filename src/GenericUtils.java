/**
 * The GenericUtils class provides generic utility methods for arrays.
 */
public class GenericUtils {

    /**
     * Reverses the order of elements in a generic array.
     * @param array The array to be reversed.
     * @param <T> The type of elements in the array.
     */
    public static <T> void reverse(T[] array) {
        int l = 0;
        int r = array.length - 1;

        // Swap elements from outer to inner
        while (l < r) {
            T temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            l++;
            r--;
        }
    }

    /**
     * Calculates the sum of elements in an array containing numbers.
     * @param array The array with numbers.
     * @param <T> The type of numbers in the array (must extend Number).
     * @return The sum of elements as a double.
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;

        // Adds up elements using doubleValue()
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }

        return sum;
    }
}
