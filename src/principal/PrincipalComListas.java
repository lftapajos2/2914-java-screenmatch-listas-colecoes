package principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> nomes = new ArrayList<>();
        nomes.add(filmeDoPaulo);
        nomes.add(meuFilme);
        nomes.add(outroFilme);
        nomes.add(lost);
//        nomes.forEach(nome -> System.out.println(nome));
//        nomes.forEach(System.out::println);
        for (Titulo item: nomes) {
            System.out.println(item.getNome());
            //Verifica o tipo já declarando o filme
            //Ainda inclui uma verificaçãi de classificação mínima
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
    }
}
