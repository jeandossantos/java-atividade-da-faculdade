public class SequenciaIJ1 {
    public static void main(String[] args) {
        int i = 1;

        for (int j = 60; j >= 0; j -= 5) {
            while (j >= 0) {
                System.out.println("I=" + i + " J=" + j);
                i += 3;
                break;
            }
        }
    }
}
