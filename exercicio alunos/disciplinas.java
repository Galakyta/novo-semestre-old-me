public abstract class disciplinas {
    
    protected String nome;
    protected double cargaHoraria;
  
    public disciplinas(String nome, double cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    
    }

    public abstract String getConceito();
    // fui pelo exemplo do slide e pensei em usar algo abstrato(na verdade parando pra pensar foi a bruna que pensou primeiro mas eu nn manjei a logica na aula
    //e pensando agora eu manjei) de usar ela assim pra aplicar os metodos de forma especifica pros 2 tipos de conceito nas classes especificas
 
}

