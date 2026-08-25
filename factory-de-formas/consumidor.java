public class consumidor {
    public static void main(String[] args) {
        iFabricaForma retanguloFactory = new fabricaRetangulo();
        iForma retangulo = retanguloFactory.criarForma();
        retangulo.desenhar();

        iFabricaForma circuloFactory = new fabricaCirculo();
        iForma circulo = circuloFactory.criarForma();
        circulo.desenhar();

        iFabricaForma trianguloFactory = new fabricaTriangulo();
        iForma triangulo = trianguloFactory.criarForma();
        triangulo.desenhar();
    }
}
