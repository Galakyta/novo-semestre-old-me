public class fabricaTriangulo implements iFabricaForma{
    public iForma criarForma(){
        return new triangulo();
    }
}
