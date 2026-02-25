import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        int numeroUm = leitura.nextInt();
        System.out.println("Informe o segundo numero");
        int numeroDois = leitura.nextInt();
        if ( numeroUm == numeroDois){
            System.out.println("Os numeros são iguais");
        } else if (numeroUm < numeroDois){
            System.out.println("O primeiro numero é menor do que o segundo");
        } else {
            System.out.println("O primeiro numero é maior do que o segundo");
        }
    }
}
