public class disciplinasGrad extends disciplinas {
    private double conceito;
    
    public disciplinasGrad(String nome, double cargaHoraria, double conceitoGrad) {
        super (nome, cargaHoraria);
        this.conceito = conceitoGrad;
    }

    @Override
    public String getConceito() {
       if(this.conceito < 7.0){
            System.out.println("Reprovado,Conceito da disciplina degraduação: " + this.conceito);    
        }else{

            System.out.println("Aprovado, Conceito da disciplina degraduação: " + this.conceito);
        }
        return String.valueOf(this.conceito);
    }

    public void setConceito(double conceito) {
        System.out.println("Conceito alterado para: " + conceito);
        this.conceito = conceito;
    }



}
