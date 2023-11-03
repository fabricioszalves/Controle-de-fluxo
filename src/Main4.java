import java.util.Scanner;

public class Main4 {
    public static void main(String args[]) {
        wile();
        dwile();
        swit();
    }

    private static void wile() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    private static void dwile() {
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("Digite 1 para repetir a mensagem");
        int r = s.nextInt();
        do {
            if (r == 1) {
                System.out.println("takaka");

                r = s.nextInt();
            }
        } while (r <= 1);
        System.out.println("errado");

    }

    private static void swit() {
        System.out.println("Digite sua idade");
        Scanner s = new Scanner(System.in);
        int idade = s.nextInt();
        String result="a";
        switch (idade) {
            case 0:
            case 5:
                result = "This is bebe";
                break;
            case 6:
            case 17:
                result = "This is adult";
                break;
            case 18:
            case 25:
                result = "This is oldman";
                break;
        }System.out.println(result);
    }
}
