public class Gerente extends Funcionario {
    public int numeroDeFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario, String senha, int numeroDeFuncionariosGerenciados) {
        super(nome, cpf, salario, senha);
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    @Override
    public double getBonificacao() {
         double bonusBase = super.getBonificacao();
         double bonusAdicional = 0.2 * this.numeroDeFuncionariosGerenciados;
         return bonusBase + bonusAdicional;
        // return this.salario * (0.2 + this.numeroDeFuncionariosGerenciados);
    }
}