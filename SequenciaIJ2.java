public class SequenciaIJ2 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            int j = 7;

            while (j >= 5) {
                System.out.println("I=" + i + " J=" + j);
                --j;
            }

            i += 2;
        }
    }
}
