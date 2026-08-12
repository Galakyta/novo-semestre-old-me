public class Teste {
    public static void main(String[] args) {
        Gerente Exemplo = new Gerente("ANA",
         "123",
          8000.0,
           "exemplo,",
            5);
        System.out.println(Exemplo.getBonificacao());
        
        Gerente Exemplo2 = new Gerente("ANA",
            "123", 5000.0,
    "exemplo", 15);
    Financeiro financeiro = new Financeiro();
        financeiro.computaBonus(Exemplo2);
        financeiro.computaBonus(Exemplo);

        System.out.println(financeiro.getTotalBonus());
    

    }

    Funcionario func = new Gerente("silvio", "123", 8000.0, "abc"); 

}

