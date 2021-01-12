import java.util.*; 

public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(final int[] arr) {
         int size = arr.length;
         int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                array[i] = arr[i / 2];
            } else {
                array[i] = arr[i / 2 + size / 2];
            }
        }

        return array;
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(final int[] arr) {
        final int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            double rand1 =  size * Math.random();
            double rand2 =  size * Math.random();
            int rand3 = (int) rand2;
            int rand4 = (int) rand1;
            final int temp = arr[rand3];
            arr[rand3] = arr[rand4];
            arr[rand4] = temp;
        }
        return arr;
    }

    public static void main(final String[] args) {
        // Write some code here to test your methods!
         int[] xps = { 1, 2, 3, 4 };
        for (int i = 0; i < 4; i++) {
            System.out.println(perfectShuffle(xps)[i]);
        }
         int[] xps2 = selectionShuffle(xps);
        for(int i = 0; i<4;i++){
            System.out.println(xps2[i]);

        }
    }
}
