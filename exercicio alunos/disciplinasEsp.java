public class disciplinasEsp extends disciplinas {
    private String conceito;
    
    public disciplinasEsp(String nome, double cargaHoraria, String conceitoEsp) {
        super (nome, cargaHoraria);
        this.conceito = conceitoEsp;
    }

    @Override
    public String getConceito() {
        if(this.conceito.equalsIgnoreCase("D")){
            System.out.println("Reprovado,Conceito da disciplina de especialização: " + this.conceito);    
        }else{

            System.out.println("Aprovado, Conceito da disciplina de especialização: " + this.conceito);
        }
        return this.conceito;
    }

    public void setConceito(String conceito) {
        System.out.println("Conceito alterado para: " + conceito);
        this.conceito = conceito;
    }



}
