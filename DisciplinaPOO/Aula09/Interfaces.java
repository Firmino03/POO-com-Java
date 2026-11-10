interface Imprimivel {
    void imprimir();
    void salvarEmArquivo();
}

interface Notificavel {
    void enviarEmail(String dest);
    void enviarSMS(String telefone);

    // Método default: tem implementação padrão (pode ser sobrescrito)
    default void notificarTodos(String dest, String tel) {
        enviarEmail(dest);
        enviarSMS(tel);
    }
}

// Implementando MÚLTIPLAS interfaces
class Relatorio implements Imprimivel, Notificavel {
    private String titulo;
    private String conteudo;

    Relatorio(String titulo, String conteudo) {
        this.titulo   = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        IO.println("==================================================");
        IO.println("RELATORIO: " + titulo);
        IO.println("--------------------------------------------------");
        IO.println(conteudo);
        IO.println("==================================================");
    }

    @Override
    public void salvarEmArquivo() {
        IO.println("'" + titulo + "' salvo em arquivo.");
    }

    @Override
    public void enviarEmail(String dest) {
        IO.println("E-mail para " + dest + ": " + titulo);
    }

    @Override
    public void enviarSMS(String tel) {
        IO.println("SMS para " + tel + ": " + titulo);
    }
}

void main() {
    var rel = new Relatorio("Desempenho Academico", "Media geral: 7.8");
    rel.imprimir();
    rel.notificarTodos("prof@ifpe.edu.br", "(81) 99999-0000");
}