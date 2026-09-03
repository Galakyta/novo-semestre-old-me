import java.util.Scanner;
public class UIClienteAuto {

    public static fabricaDeSeguroAuto coletarDados(Scanner scanner) {
        System.out.println("Digite a fipe do carro");
        Double valorFipe = scanner.nextDouble();

        System.out.println("idade do motora:");
        int idade = scanner.nextInt();

        System.out.println("anos de CNH:");
        int anosHabilitado = scanner.nextInt();

        System.out.println("Valor contratado contra terceiros:");
        Double cobertura = scanner.nextDouble();

        return new fabricaDeSeguroAuto(valorFipe, idade, anosHabilitado, cobertura);
    }
}