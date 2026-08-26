public class factory2 extends factoryAbstrata {
    @Override
    abstract iProdutoA createProductA2(){
        return new productA2();
    }

    abstract iProdutoB createProductB2(){
        return new productB2();
    }
       

}
