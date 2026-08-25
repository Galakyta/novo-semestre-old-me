public class consumidor {
    public static void main(String[] args) {
        iFabricaForma retanguloFactory = new fabricaRetangulo();
        iForma retangulo = retanguloFactory.criarForma();
        retangulo.desenhar();
    }
}
