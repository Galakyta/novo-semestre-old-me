public class fabricaDeSeguroAuto extends fabricaDeSeguros {

    private Double valorFipe;
    private int idadeDoMotorista;
    private int anosHabilitado;
    private Double coberturaContratada;

    public fabricaDeSeguroAuto(Double valorFipe, int idadeDoMotorista, int anosHabilitado, Double coberturaContratada) {
        this.valorFipe = valorFipe;
        this.idadeDoMotorista = idadeDoMotorista;
        this.anosHabilitado = anosHabilitado;
        this.coberturaContratada = coberturaContratada;
    }

    @Override
    public seguros criarSeguro() {
        return new seguroAuto(valorFipe, idadeDoMotorista, anosHabilitado, coberturaContratada);
    }
}