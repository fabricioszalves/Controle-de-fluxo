import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        comparacaoTest();
        comparacaoEe();
        comparacaoii();
    }

    private static void comparacaoTest() {
        Scanner xr = new Scanner(System.in);
        System.out.println("DESCUBRA SE O NUMERO É MAIOR OU MENOS QUE 9:");
        int x = xr.nextInt();
        if (x <= 9) {
            System.out.println(x + " é menor ou igual a 9");
        } else {
            System.out.println(x + " não é menor ou igual a 9");
        }
        System.out.println("*************************************************");
        System.out.println(" ");
    }

    private static void comparacaoEe() {
        Scanner xr = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO DE 0 A 10:");
        int x = xr.nextInt();
        if (x >= 5 && x <= 10) { // && é "AS DUAS CONDIÇOES TEM QUE ACEITA"
            System.out.println(x + " esta em 5 e 10");
        } else if (x >= 0 && x <= 4) {
            System.out.println(x + " esta entre 0 a 4");
        } else {
            System.out.println(x + " é numero desconhecido");
        }
        System.out.println("*************************************************");
        System.out.println(" ");
    }

    private static void comparacaoii() {
        Scanner xr = new Scanner(System.in);
        System.out.println("Type it Dog or Cat");
        String x = xr.next();
        if (x.equals("Dog") || x.equals("Cat")) { // || UMAS DAS DUAS CONDIÇOES TEM QUE ESTA CONDIZENTE
            System.out.println(x + " Is animal domestic");
        } else if (x.equals("Fruit") || x.equals("Old")) {
            System.out.println(x + " Is animal ???");
        } else {
            System.out.println("what duiu ???");
        }

        Scanner xt = new Scanner(System.in);
        System.out.println("How old are you ?");
        int s = xr.nextInt();
        if (s <= 17) {
            System.out.println("child");
        } else if (s >= 18 && s <= 65) {
            System.out.println("adult");
        } else if (s <= 95) {
            System.out.println("Old man");
        } else {
            System.out.println("Centenario");
        }
    }
}

