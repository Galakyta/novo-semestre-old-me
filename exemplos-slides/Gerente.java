public class Gerente extends Funcionario {
    public int numeroDeFuncionariosGerenciados;

    public Gerente(String nome, String cpf, double salario, String senha, int numeroDeFuncionariosGerenciados) {
        super(nome, cpf, salario, senha);
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }

    //@Override tirando o verride pra ter a herança na implkementacao
    public double getBonificacao( double adicional) {
        return super.getBonificacao() + adicional;
        }
}