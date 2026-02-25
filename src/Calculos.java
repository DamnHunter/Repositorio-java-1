import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String opcExplicacao = """
                Informe a opção que quer!
                1 - Área do Quadrado.
                2 - Área do Círculo.
                """;
        System.out.println(opcExplicacao);
        int opc = leitura.nextInt();
        double area;

        switch (opc){
            case 1:
                System.out.println("Me diga o tamanho de um dos lados");
                area = leitura.nextDouble();
                area = area * area;
                System.out.println("A área do quadrado é: " + area + "cm");
                break;

            case 2:
                System.out.println("Me diga o tamanho do raio do círculo");
                area = leitura.nextDouble();
                area = Math.pow(area,2) * 3.14;
                System.out.println("Seu círculo tem área do valor de: " + area + "cm");
        }
    }
}
