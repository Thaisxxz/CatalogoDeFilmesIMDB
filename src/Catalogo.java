import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    List<Filme> filmesList=new ArrayList();
    List<Pessoa> pessoasList =new ArrayList();

    //cadastrarFilmes
    public Filme cadastrarFilme (Filme novoFilme){
   //ADD novo filme ao catalogo
   filmesList.add(novoFilme);
   return novoFilme;
    }

    //cadastrarAtores
    public Atores cadastrarAtores (Atores novoAtor){
        pessoasList.add(novoAtor);
        return novoAtor;
    }

    //Cadastrardiretores
    public Diretores cadastrarDiretores (Diretores novoDiretor){
        pessoasList.add(novoDiretor);
        return novoDiretor;
    }

    //associarAtores
    //AssociarDiretores
    //pesquisa
    //listaAtoresGeral
    //ListaDiretoresGeral
    //listaFilmesGeral
}
