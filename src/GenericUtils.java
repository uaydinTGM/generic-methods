public class GenericUtils {

    public static <T> void reverse(T[] array) {


        int l = 0;

        int r = array.length -1;

        while(l < r){

            T temp = array[l];

            array[l] = array[r];

            array[r] = temp;

            l ++;

            r--;


        }

    }

    public static <T extends Number> double sum(T[] array){

        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i].doubleValue();

        }

        return sum;




    }

}
