public class seguroResidencial extends seguros {
    private Double valorImovel;
    private boolean altoPadrao;
    private boolean documentosApresentados;

    /*RF02 (Apólice Residencial) — o prêmio mensal corresponde a 1,5% do valor do imóvel ao ano,
dividido por 12. Imóveis classificados como alto padrão recebem acréscimo de 25% sobre o
prêmio anual. A contratação exige a apresentação de escritura ou contrato de locação; sem
esse documento, a contratação deve ser rejeitada. Documentos exigidos: escritura ou contrato
de locação e comprovante de residência.*/



    public seguroResidencial(Double valorImovel, boolean altoPadrao, boolean documentosApresentados) {
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.documentosApresentados = documentosApresentados;
    }

    @Override
    public String listagemDosDocumentosPedidos() {
        return "escritura ou contrato de locação e comprovante de residência";
    }

    @Override
    public String validarCobertura() {
        if (!documentosApresentados) {
            return "aplicação para o seguro rejeitada por documentos exigidos não apresentados";
        }
        return "aplicação aprovada";
    }

    @Override
    public Double calculcarPremio() {
        Double premioAnual = valorImovel * 0.015;
        if (altoPadrao) {
            premioAnual += premioAnual * 0.25;
        }
        return premioAnual / 12;
    }

    @Override
    public String gerarResumo() {
        return "Seguro residencial // premio mensal: RS" + String.format("%.2f", calculcarPremio()) + " // " + validarCobertura();
    }
}