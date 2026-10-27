class Animal {
    protected String nome;
    Animal(String nome) { 
    this.nome = nome;  
    }
    void fazerSom() { IO.println(nome + " faz algum som..."); }
    void dormir()   { IO.println(nome + " esta dormindo."); }
}

class Cachorro extends Animal {
    Cachorro(String nome) { super(nome); }

    @Override
    void fazerSom() { IO.println(nome + ": Au au!"); }
}

class Gato extends Animal {
    Gato(String nome) { super(nome); }

    @Override
    void fazerSom() { IO.println(nome + ": Miau!"); }
}

class Vaca extends Animal {
    Vaca(String nome) { super(nome); }

    @Override
    void fazerSom() { IO.println(nome + ": Muuuu!"); }
}

void main() {
    // Array do tipo Animal aceita qualquer subclasse
    Animal[] animais = {
        new Cachorro("Rex"),
        new Gato("Mimi"),
        new Vaca("Mimosa"),
        new Cachorro("Bolt")
    };

    IO.println("=== Todos os animais fazendo som ===");
    for (Animal a : animais) {
        a.fazerSom(); // Java decide qual versão chamar em tempo de execução
    }

    IO.println("=== Hora de dormir ===");
    for (Animal a : animais) {
        a.dormir(); // não sobrescrito: mesmo comportamento para todos
    }
}