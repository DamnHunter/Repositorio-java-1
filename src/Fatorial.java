import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num ; i++) {
            fatorial *= i;
        }
        System.out.println("fatorial de " + num + " é: " + fatorial);
    }
}
