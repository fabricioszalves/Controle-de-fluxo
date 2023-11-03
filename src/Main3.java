public class Main3 {
    public static void main(String args[]) {
        pare();
        cont();
    }

    private static void pare() {
        int i;

        for (i = 0; i <= 80; i++) {
            System.out.println(i);
            if (i == 10) {
                break;
            }
        }
    }

    private static void cont() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                continue;
            }System.out.println("Contador: "+i);
        }
    }
}
