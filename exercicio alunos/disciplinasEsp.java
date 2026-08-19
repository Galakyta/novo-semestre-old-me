

public class disciplinasEsp extends disciplinas{
    @Override

    public void definirResultado() {
        if (this.resultado.equals("D")) {
            this.resultado = "Reprovado";
        } else {
            this.resultado = "Aprovado";
        }
    }   
}
