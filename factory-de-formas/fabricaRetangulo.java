public class fabricaRetangulo implements iFabricaForma{
    public iForma criarForma(){
        return new retangulo();
    }
}
