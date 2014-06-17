import java.util.Comparator;

public class SelecaoByPontosComparator implements Comparator<Selecao>{

    @Override
    public int compare(Selecao s1, Selecao s2) {
        //http://en.wikipedia.org/wiki/FIFA_World_Cup#Final_tournament
        if (s1.pontos > s2.pontos)
            return -1;
        else if (s1.pontos < s2.pontos)
            return 1;
        else //mesmo número de pontos; então vamos para saldo de gols
            if ((s1.golsAFavor - s1.golsContra) > (s2.golsAFavor - s2.golsContra))
                return -1;
            else if ((s1.golsAFavor - s1.golsContra) < (s2.golsAFavor - s2.golsContra))
                return 1;
            else //mesmo saldo de gols; então vamos para gols a favor
                if (s1.golsAFavor > s2.golsAFavor)
                    return -1;
                else if (s1.golsAFavor < s2.golsAFavor)
                    return 1;
                else    
                    return 0;
    }
    

}
