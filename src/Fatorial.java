import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num ; i++) {
            fatorial *= i; // A lógica aqui é armazenar e calcular, de acordo com o percorrer do for, a variável irá armazenar o resultado da multiplicação anterior e multiplicará com o próximo número.
        }
        System.out.println("fatorial de " + num + " é: " + fatorial);
    }
}
