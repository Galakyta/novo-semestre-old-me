import java.util.Locale;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        // aq eu prefiro definir como US pra sempre ter q usar virgula mas é só pq eu tenho preguiça de 
        // descobrir como faz um ignore case entre virgula e ponto 100% das vzs em qlqr ambiente, ja que no meu note por exemplo
        //o vs enche o saco com isso ent sla
        /*fabricaDeSeguros fabrica = UIClienteAuto.coletarDados(scanner);
        fabrica.processarContratacao();
        */
        fabricaDeSeguroResidencial fabricaResidencial = UIClienteResidencia.coletarDados(scanner);
        fabricaResidencial.processarContratacao();
    }
}