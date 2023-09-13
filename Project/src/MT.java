public class MT {

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int sumFor = 0;
            int sumWhile = 0;
            int sumDoWhile = 0;

            // сумма элементов массива с помощью цикла for
            for (int i = 0; i < array.length; i++) {
                sumFor += array[i];
            }

            // сумма элементов массива с помощью цикла while
            int i = 0;
            while (i < array.length) {
                sumWhile += array[i];
                i++;
            }

            // сумма элементов массива с помощью цикла do while
            int j = 0;
            do {
                sumDoWhile += array[j];
                j++;
            } while (j < array.length);

            System.out.println("Сумма элементов массива с помощью цикла for: " + sumFor);
            System.out.println("Сумма элементов массива с помощью цикла while: " + sumWhile);
            System.out.println("Сумма элементов массива с помощью цикла do while: " + sumDoWhile);
        }

}
