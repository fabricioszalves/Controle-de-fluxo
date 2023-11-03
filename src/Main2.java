import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String args[]) {
        //fore0();
        fore1();
    }
    private static void fore0(){
        List<Integer> valores = new ArrayList<>();
        int n;
        for (n = 0; n <= 10; n++) {
            System.out.println("linha " + n);
            valores.add(n);
        }
        for (Integer i : valores) {
            System.out.println("linh " + i);
        }
        valores.forEach(i -> System.out.println("lin " + i));
    }
    private static void fore1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("GERADOR DE TABUADA, DIGITE UM NUMERO:");
        int i = scanner.nextInt();
        int n;
        for (n=0;n <= 10; n++){
            System.out.println(i+"X"+n+"="+i*n);

        }

    }

}
