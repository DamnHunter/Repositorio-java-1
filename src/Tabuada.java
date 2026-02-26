import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Informe o numero que você quer a tabuada");
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();
        int multi;
        for (int i = 1; i <= 10; i++) { // o for seria um comum já que o que mudaria seria apenas a entrada de dados do usuário.
            multi = num * i; // Esta variável seria apenas para armazenar o resultado da multiplicação.
            System.out.println(num + " x " + i + " = " + multi);
        }
    }
}
