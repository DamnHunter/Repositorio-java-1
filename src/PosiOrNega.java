import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PosiOrNega {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Por favor insira um numero");
        int numero = leitura.nextInt();
        if (numero < 0){
            System.out.println("Este numero é negativo");
        } else{
            System.out.println("Este numero é positivo");
        }
    }
}