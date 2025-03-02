/**
 * Die Klasse GenericUtils bietet generische Hilfsmethoden für Arrays.
 */
public class GenericUtils {

    /**
     * Kehrt die Reihenfolge der Elemente in einem generischen Array um.
     * @param array Das zu umkehrende Array.
     * @param <T> Der Typ der Elemente im Array.
     */
    public static <T> void reverse(T[] array) {
        int l = 0;
        int r = array.length - 1;

        // Vertauscht die Elemente von außen nach innen
        while (l < r) {
            T temp = array[l];
            array[l] = array[r];
            array[r] = temp;

            l++;
            r--;
        }
    }

    /**
     * Berechnet die Summe der Elemente in einem Array, das Zahlen (Number) enthält.
     * @param array Das Array mit Zahlen.
     * @param <T> Der Typ der Zahlen im Array (muss von Number erben).
     * @return Die Summe der Elemente als double.
     */
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;

        // Summiert die Elemente unter Verwendung von doubleValue()
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }

        return sum;
    }
}
