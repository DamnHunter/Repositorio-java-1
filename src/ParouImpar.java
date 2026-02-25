import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        int numUm = leitura.nextInt();

        if (numUm % 2 == 0){
            System.out.println("O numero é par!");
        } else {
            System.out.println("O numero é impar!");
        }
    }
}
