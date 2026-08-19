
public class disciplinasGrad extends disciplinas {
    int nota = 0;
    
    @Override
    public String definirResultado() {
        if (this.nota >= 7) {
            this.resultado = "Aprovado";
        } else {
            this.resultado = "Reprovado";
        }
        return this.resultado;
    }
}
