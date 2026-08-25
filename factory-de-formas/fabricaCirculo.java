public class fabricaCirculo implements iFabricaForma{
    public iForma criarForma(){
        return new circulo();
    }
}
