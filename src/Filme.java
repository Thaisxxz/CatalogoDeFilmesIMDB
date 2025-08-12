import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Filme {

    private String nome;
    private String dataLancamento;
    private BigDecimal orcamento;
    private String descricao;
    private Diretores diretores;
    private List<Atores> atores;

    public Filme(String nome, String dataLancamento, BigDecimal orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
        this.atores = new ArrayList<>();
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(BigDecimal orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Diretores getDiretores() {
        return diretores;
    }

    public void setDiretores(Diretores diretores) {
        this.diretores = diretores;
    }

    public List<Atores> getAtores() {
        return atores;
    }

    public void adicionarAtor(Atores ator) {
        this.atores.add(ator);
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Data de Lançamento: " + dataLancamento);
        System.out.println("Orçamento: " + orcamento);
        System.out.println("Descrição: " + descricao);
        System.out.println("Diretores: " + (diretores != null ? diretores.getNome() : "Não definido"));
        System.out.println("Atores: ");
        for (Atores ator : atores) {
            System.out.println("- " + ator.getNome());
        }
    }
}
