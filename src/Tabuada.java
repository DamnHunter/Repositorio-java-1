import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Informe o numero que você quer a tabuada");
        Scanner leitura = new Scanner(System.in);
        int num = leitura.nextInt();
        int multi;
        for (int i = 1; i <= 10; i++) {
            multi = num * i;
            System.out.println(num + " x " + i + " = " + multi);
        }
    }
}
