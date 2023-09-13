public class MT2 {

    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;
            System.out.printf("H(%d) = %.3f\n", i, sum);
        }
    }

}
