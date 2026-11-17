void main() {
    var estoque = new HashMap<String, Integer>();
    estoque.put("Rapadura", 30);
    estoque.put("Cuscuz", 12);

    // getOrDefault: evita null quando a chave não existe
    int qtd = estoque.getOrDefault("Tapioca", 0);
    IO.println(qtd);                          // 0

    // putIfAbsent: só insere se a chave ainda não existir
    estoque.putIfAbsent("Rapadura", 99);      // ignorado, já existe (continua 30)
    estoque.putIfAbsent("Beiju", 8);          // inserido

    // Percorrer só as chaves ou só os valores
    for (String produto : estoque.keySet()) {
        IO.println("Produto: " + produto);
    }
    for (int quantidade : estoque.values()) {
        IO.println("Quantidade: " + quantidade);
    }

    // containsValue: procura entre os valores
    IO.println(estoque.containsValue(12));    // true
}