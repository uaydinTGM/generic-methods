import java.sql.Array;

import java.sql.Array;

/**
 * Hauptklasse zur Demonstration der Funktionen der GenericUtils-Klasse.
 */
public class Main {

    public static void main(String[] args) {

        // String-Array erstellen und ausgeben
        String[] array = {"Max", "Sebastian", "Moritz", "Lukas", "David"};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // String-Array umkehren und ausgeben
        GenericUtils.reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // Integer-Array erstellen und die Summe berechnen
        Integer[] array2 = {2, 4, 5, 1, 2};
        System.out.println(GenericUtils.sum(array2));

        // Byte-Array erstellen und die Summe berechnen
        Byte[] array3 = {1, 1, 0, 1, 0};
        System.out.println(GenericUtils.sum(array3));
    }
}

