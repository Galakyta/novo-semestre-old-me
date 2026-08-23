public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected String senha;

    public Funcionario(String nome, String cpf, double salario, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.senha = senha;
    }

    public double getBonificacao() {
        return this.salario * 0.15;
    }
}