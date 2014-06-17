import java.util.Comparator;

public class SelecaoByNomeComparator implements Comparator<Selecao>{

    @Override
    public int compare(Selecao s1, Selecao s2) {
        return s1.pais.compareTo(s2.pais);
    }    


}
