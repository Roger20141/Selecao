import java.util.ArrayList;
import java.util.Collections;

public class TesteSelecao {


    public static void main(String[] args) {
        
        Selecao brasil = new Selecao("Brasil");
        brasil.setResultado(3, 1);
        Selecao croacia = new Selecao("Croacia");      
        croacia.setResultado(1, 3);

        Selecao holanda = new Selecao("Holanda");
        holanda.setResultado(5, 1);
        Selecao espanha = new Selecao("Espanha");
        espanha.setResultado(1, 5);

        Selecao alemanha = new Selecao("Alemanha");
        alemanha.setResultado(4, 0);
        Selecao portugal = new Selecao("Portugal");
        portugal.setResultado(0, 4);

        
        ArrayList<Selecao> copa = new ArrayList<>();
        copa.add(brasil);
        copa.add(croacia);
        copa.add(alemanha);
        copa.add(portugal);
        copa.add(holanda);
        copa.add(espanha);
        
        //Sem ordenação
        System.out.println(copa.toString());
        
        //Ordenando por pontos
        Collections.sort(copa, new SelecaoByPontosComparator());
        System.out.println(copa.toString());
        
        //Ordenando por nome
        Collections.sort(copa, new SelecaoByNomeComparator());
        System.out.println(copa.toString());
        
        
    }

}
