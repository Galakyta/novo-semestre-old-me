public class factory1 extends factoryAbstrata {
    @Override
    abstract iProdutoA createProductA(){
        return new productA1();
    }

    abstract iProdutoB createProductB(){
        return new productB1();
    }
       

}
