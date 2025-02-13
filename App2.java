import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Informe o numero ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

           
            System.out.println("" + num + " X " + i + "=" + (2 * i));
        }
        sc.close();
    }

}
