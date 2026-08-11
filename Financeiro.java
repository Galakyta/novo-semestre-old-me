public class Financeiro {
    private double totalBonus = 0.0;
    public void computaBonus(Gerente gerente){
        this.totalBonus += gerente.getBonificacao();
    };
    public double getTotalBonus(){
        return this.totalBonus; 
    }

}
