class Produto {
    String nome;
    double preco;
    int    estoque;

    void exibir() {
        IO.println(nome + " - R$ " + preco + " (estoque: " + estoque + ")");
    }
}

void main() {
    var p1 = new Produto();
    var p2 = new Produto();
    var p3 = new Produto();
    var p4 = new Produto();

    p1.nome = "Mel de Abelha";     p1.preco = 25.00; p1.estoque = 50;
    p2.nome = "Castanha de Caju";  p2.preco = 18.50; p2.estoque = 200;
    p3.nome = "Rapadura";          p3.preco =  5.00; p3.estoque = 100;
    p4.nome = "Amendoim";          p4.preco = 4.80;  p4.estoque = 50;
    
    Produto[] catalogo = { p1, p2, p3, p4 };

    IO.println("=== CATALOGO DA LOJA ===");
    for (int i = 0; i < catalogo.length; i++) {
        catalogo[i].exibir();
    }
}