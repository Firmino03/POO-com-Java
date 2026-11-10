
// Exercício 9.2 — Interface Exportavel
// RelatorioAlunos e RelatorioVendas implementam Exportavel
public class Exportavel {

    public static void main(String[] args) {

        RelatorioAlunos alunos = new RelatorioAlunos(
            "Ana Maria",
            "Informática para Internet",
            9.5
        );

        RelatorioVendas vendas = new RelatorioVendas(
            "Coxinha",
            50,
            250.00
        );

        alunos.exportarCSV();
        IO.println("\n----------------------------\n");

        vendas.exportarCSV();
        IO.println("\n============================\n");

        alunos.exportarJSON();
        IO.println("\n----------------------------\n");

        vendas.exportarJSON();
    }
}

interface ExportavelInterface {
    void exportarCSV();
    void exportarJSON();
}

class RelatorioAlunos implements ExportavelInterface {

    private String nome;
    private String curso;
    private double nota;

    public RelatorioAlunos(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    @Override
    public void exportarCSV() {
        IO.println("=== RELATÓRIO DE ALUNOS (CSV) ===");
        IO.println("Nome,Curso,Nota");
        IO.println(nome + "," + curso + "," + nota);
    }

    @Override
    public void exportarJSON() {
        IO.println("=== RELATÓRIO DE ALUNOS (JSON) ===");
        IO.println("{");
        IO.println("  \"nome\": \"" + nome + "\",");
        IO.println("  \"curso\": \"" + curso + "\",");
        IO.println("  \"nota\": " + nota);
        IO.println("}");
    }
}

class RelatorioVendas implements ExportavelInterface {

    private String produto;
    private int quantidade;
    private double valorTotal;

    public RelatorioVendas(String produto, int quantidade, double valorTotal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    @Override
    public void exportarCSV() {
        IO.println("=== RELATÓRIO DE VENDAS (CSV) ===");
        IO.println("Produto,Quantidade,Valor Total");
        IO.println(produto + "," + quantidade + "," + valorTotal);
    }

    @Override
    public void exportarJSON() {
        IO.println("=== RELATÓRIO DE VENDAS (JSON) ===");
        IO.println("{");
        IO.println("  \"produto\": \"" + produto + "\",");
        IO.println("  \"quantidade\": " + quantidade + ",");
        IO.println("  \"valorTotal\": " + valorTotal);
        IO.println("}");
    }
}
