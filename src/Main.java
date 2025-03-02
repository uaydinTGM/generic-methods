import java.sql.Array;

public class Main {

    public static void main(String[]args){

        String[] array = {"Max","Sebastian","Moritz","Lukas","David"};

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

        System.out.println();

        GenericUtils.reverse(array);

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

        System.out.println();

        Integer[] array2 = {2,4,5,1,2};

        System.out.println(GenericUtils.sum(array2));

        Byte[] array3 = {1,1,0,1,0};

        System.out.println(GenericUtils.sum(array3));

    }
}
