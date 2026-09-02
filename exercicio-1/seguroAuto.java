public class seguroAuto extends seguros{
    private Double valorFipe; //eu pensei em deixar como int arredondado mas ai lembrei q ia copiar e colar os valores do
    // site vermelho de carro q eu n lembro o nome mas ia ficar mais chato de fazer ent deixei double msm
    private int idadeDoMotorista;
    private int anosHabilitado;
    private Double coberturaContratada;

    public seguroAuto(Double valorFipe, int idadeDoMotorista, int anosHabilitado, Double coberturaContratada) {
        this.valorFipe = valorFipe;
        this.idadeDoMotorista = idadeDoMotorista;
        this.anosHabilitado = anosHabilitado;
        this.coberturaContratada = coberturaContratada;
    }
    

    @Override
    public String listagemDosDocumentosPedidos() {
        return "CNH e CRLV mais o comprovante de residencia";
        //nem sabia que crlv existia mas tamo ai 
    }
    


    @Override
    public String validarCobertura() {
        double coberturaMinima = 50000.00; //que na minha opiniao deveria ser até bem maior mas tudo bem

        if (coberturaContratada == null || coberturaContratada < coberturaMinima) {
            return "aplicação para o seguro rejeitada por cobertura inferior a " + coberturaMinima + " contra terceiros";
        }

        return "aplicação aprovada, cobertura contra terceiros de RS: " + coberturaContratada;
    }

    @Override
    public Double calculcarPremio() {
        // 8 pcrnt da  fipe no enunciado
        Double premioAnual = valorFipe * 0.08;

        // os bonus de insalubridade mental do motorista ja que eu assino em baixo que quem dirige com menos de 25 tem merda na cabeça
        // inclusive eu, menos que a media mas inclusive eu
        if (idadeDoMotorista < 25) {
            premioAnual += premioAnual * 0.30;
        }

        // aq eu ja acho sacanagem pq quem é  recem habiltiado tem mais medo de fazer merda e aprendeu as leis a menos tempo mas ok
        if (anosHabilitado < 2) {
            premioAnual += premioAnual * 0.20;
        }

        // dai aq ja sai com os acrescimos
        return premioAnual / 12;
    }

     @Override
    public String gerarResumo() {
        return "Seguro automotivo //  premio mensal: RS" + String.format("%.2f", calculcarPremio())+ " // " + validarCobertura(); //achei q ficou feio esse return
        //mas tmbm n to motivado o suficiente pra deixar ele melhor
    }
}
