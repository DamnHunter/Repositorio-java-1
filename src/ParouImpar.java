import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        int numUm = leitura.nextInt();

        if (numUm % 2 == 0){ // Aqui é claro. Se numa divisão com 2 o resto do calculo ser exato, no caso 0, o número é par. Caso não, é impar.
            System.out.println("O numero é par!");
        } else {
            System.out.println("O numero é impar!");
        }
    }
}
