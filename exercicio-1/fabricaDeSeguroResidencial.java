public class fabricaDeSeguroResidencial extends fabricaDeSeguros {
   
    private Double valorImovel;
    private boolean altoPadrao;
    private boolean documentosApresentados;
    public fabricaDeSeguroResidencial(Double valorImovel, boolean altoPadrao, boolean documentosApresentados) {
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.documentosApresentados = documentosApresentados;
    }

    @Override
    public seguros criarSeguro() {
        return new seguroResidencial(valorImovel, altoPadrao, documentosApresentados);
    }
}

