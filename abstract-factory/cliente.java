public class cliente {
    public static void main(String[] args) {
        
        iProdutoA pA = new factory1().createProductA();
        
        iProdutoB pB = new factory2().createProductB2();

        //da pra tirar esse new

        //esconder as duas fabricas
    }
}
