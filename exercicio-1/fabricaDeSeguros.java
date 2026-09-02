public abstract class fabricaDeSeguros {
public abstract seguros criarSeguro();
// q vai ser meu metodo fabrica proriamente dito

public final void processarContratacao() {
System.out.println("Documentos pedidos para a contratação" + apolice.listagemDosDocumentosPedidos());
System.out.println("Validação da cobertura: " + apolice.validarCobertura());
System.out.println("Calculo do premio: " + apolice.calculcarPremio());
System.out.println("resumindo: " + apolice.gerarResumo());
System.out.println();
}


}
