abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    Funcionario(String nome, double salarioBase) {
        this.nome        = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato: obriga subclasses a implementar
    abstract double calcularSalario();
    abstract String getCargo();

    // Método concreto: compartilhado por todos
    void exibirContracheque() {
        IO.println("---");
        IO.println("FUNCIONARIO: " + nome);
        IO.println("CARGO:       " + getCargo());
        IO.println("SALARIO:     R$ " + String.format("%.2f", calcularSalario()));
        IO.println("---");
    }
}

class Professor extends Funcionario {
    private int    aulasPorSemana;
    private static final double VALOR_AULA = 50.0;

    Professor(String nome, double salarioBase, int aulasPorSemana) {
        super(nome, salarioBase);
        this.aulasPorSemana = aulasPorSemana;
    }

    @Override
    double calcularSalario() {
        return salarioBase + (aulasPorSemana * VALOR_AULA * 4);
    }

    @Override
    String getCargo() { return "Professor EBTT"; }
}

class Diretor extends Funcionario {
    private double gratificacao;

    Diretor(String nome, double salarioBase, double gratificacao) {
        super(nome, salarioBase);
        this.gratificacao = gratificacao;
    }

    @Override
    double calcularSalario() { return salarioBase + gratificacao; }

    @Override
    String getCargo() { return "Diretor"; }
}

void main() {
    // Funcionario f = new Funcionario(...); // ERRO: não pode instanciar!

    Funcionario[] equipe = {
        new Professor("Adriano Franca", 4000.00, 20),
        new Diretor("Ana Souza", 6000.00, 2000.00),
        new Professor("Carlos Lima", 3800.00, 18)
    };

    for (Funcionario f : equipe) {
        f.exibirContracheque(); // polimorfismo!
    }
}