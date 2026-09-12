public class Filme {
    char inicial;
    float nota;
    String nome;
    String genero;
    int duracao;
    boolean disponivel;
    int anoLancamento;

    public Filme(char inicial, float nota, String nome, String genero, int duracao, boolean disponivel, int anoLancamento) {
        this.inicial = inicial;
        this.nota = nota;
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.disponivel = disponivel;
        this.anoLancamento = anoLancamento;
    }

    public char getInicial() {
        return inicial;
    }
    public void setInicial(char inicial) {
        this.inicial = inicial;
    }


    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


    public static class DC extends Filme {

        public DC(char inicial, float nota, String nome, String genero,
                  int duracao, boolean disponivel, int anoLancamento) {

            super(
                inicial,
                nota,
                nome,
                genero,
                duracao,
                disponivel,
                anoLancamento
            );
        }
    }


    public static void main(String[] args) {

        // OBJETO VINGADORES
        Filme VingadoresUltimato = new Filme(
            'V',
            8.4f,
            "Vingadores: Ultimato",
            "Ação",
            181,
            true,
            2019
        );

        System.out.println("=== VINGADORES: ULTIMATO ===");

        System.out.println("Nome do filme: " + VingadoresUltimato.getNome());
        System.out.println("Gênero do filme: " + VingadoresUltimato.getGenero());
        System.out.println("Duração do filme: " + VingadoresUltimato.getDuracao() + " minutos");
        System.out.println("Ano de lançamento: " + VingadoresUltimato.getAnoLancamento());
        System.out.println("Nota do filme: " + VingadoresUltimato.getNota());

        System.out.println(
            "Disponibilidade: "
            + (VingadoresUltimato.isDisponivel()
            ? "Disponível"
            : "Indisponível")
        );


        // ALTERANDO A DISPONIBILIDADE
        VingadoresUltimato.setDisponivel(false);

        System.out.println(
            "Disponibilidade após alteração: "
            + (VingadoresUltimato.isDisponivel()
            ? "Disponível"
            : "Indisponível")
        );


        // OBJETO DA CLASSE DC

        DC CavaleiroDasTrevas = new DC(
            'K',
            9.0f,
            "Batman: O Cavaleiro das Trevas",
            "Ação",
            152,
            true,
            2008
        );


        // IMPRIMINDO CAVALEIRO DAS TREVAS

        System.out.println("\n=== CAVALEIRO DAS TREVAS ===");

        System.out.println("Nome do filme: " + CavaleiroDasTrevas.getNome());
        System.out.println("Gênero do filme: " + CavaleiroDasTrevas.getGenero());
        System.out.println("Duração do filme: " + CavaleiroDasTrevas.getDuracao() + " minutos");
        System.out.println("Ano de lançamento: " + CavaleiroDasTrevas.getAnoLancamento());
        System.out.println("Nota do filme: " + CavaleiroDasTrevas.getNota());

        System.out.println("Disponibilidade: " + (CavaleiroDasTrevas.isDisponivel() ? "Disponível" : "Indisponível")
        );
    }
}
