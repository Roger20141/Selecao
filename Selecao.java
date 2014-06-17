public class Selecao {

    public String pais;
    public int pontos;
    public int golsAFavor;
    public int golsContra;
    
    public Selecao(String p) {
        pais = p;
        pontos = 0;
        golsAFavor = 0;
        golsContra = 0;
    }
    
    public void setResultado(int ga, int gc) {
        golsAFavor = ga;
        golsContra = gc;
        if (golsAFavor > golsContra)
            pontos +=3;
        else if (golsAFavor == golsContra)
            pontos++;
        //derrota não altera pontos
    }    
    
    public String toString() {
        return pais +": " +pontos +", " +golsAFavor +", " +golsContra;
    }
    
}
