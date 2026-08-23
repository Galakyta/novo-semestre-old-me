public class testeHerança {
    public static void main(String[] args){
        Gerente gerente = new Gerente("ana", "123", 10000.0, "123", 5);
        System.out.println(gerente.getBonificacao(1000.0));
    }
}
