public class SequenciaIJ3 {
    public static void main(String[] args) {
        int i = 1;
        int j = 7;

        while (i <= 10) {
            int k = j - 2;

            while (j >= k) {
                System.out.println("I=" + i + " J=" + j);
                --j;
            }

            j += 5;
            i += 2;
        }
    }
}
