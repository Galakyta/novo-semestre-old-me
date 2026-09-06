import java.util.Scanner;

public class UIClienteResidencia {

    public static fabricaDeSeguroResidencial coletarDados(Scanner scanner) {
        System.out.println("Digite o valor do imóvel:");
        Double valorImovel = scanner.nextDouble();

        System.out.println("O imóvel é de alto padrão? (true/false)");
        boolean altoPadrao = scanner.nextBoolean();

        System.out.println("Os documentos exigidos (escritura ou contrato de locação e comprovante de residência) foram apresentados? (true/false)");
        boolean documentosApresentados = scanner.nextBoolean();

        return new fabricaDeSeguroResidencial(valorImovel, altoPadrao, documentosApresentados);
    }
}