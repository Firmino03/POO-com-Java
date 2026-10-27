//Exercício 8.1 — Funcionario -> Gerente (fixo + bonus), Vendedor (comissão), 
// Tecnico (fixo + hora extra). Calcule a folha com polimorfismo.

public class Funcionario {
    public String nome;
    public String cargo;
    private double salario;
 
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    public double setSalario(double salario) {
        this.salario = salario;  
        return salario;
    }

    public static class Gerente extends Funcionario {
        private double bonus;

        public Gerente(String nome, String cargo, double salario, double bonus) {
        super(nome, cargo, salario);
            this.bonus = bonus;
        }

        public double getBonus() {
            return bonus;
        }
        public void setBonus(double bonus) {
            this.bonus = bonus;
        }
        @Override
        public double getSalario() {
            return super.getSalario() + bonus;
        }

    }

    public static class Vendedor extends Funcionario {
        private double comissao;

        public Vendedor(String nome, String cargo, double salario, double comissao) {
            super(nome, cargo, salario);
            this.comissao = comissao;
        }

        public double getComissao() {
            return comissao;
        }   
        public void setComissao(double comissao) {
            this.comissao = comissao;
        }
        @Override
        public double getSalario() {
            return super.getSalario() + comissao;
        }
    }
    
    public static class Tecnico extends Funcionario {
        private double horaExtra;

        public Tecnico(String nome, String cargo, double salario, double horaExtra) {
            super(nome, cargo, salario);
            this.horaExtra = horaExtra;
        }

        public double getHoraExtra() {
            return horaExtra;
        }
        public void setHoraExtra(double horaExtra) {
            this.horaExtra = horaExtra;
        }
        @Override
        public double getSalario() {
            return super.getSalario() + horaExtra;
        }
    }

    public double calcularFolha (Funcionario[] funcionarios) {
        double totalFolha = 0; //aqui está sendo cauculado o tatal de salarios, inicialmente é zero.
        for (Funcionario funcionario : funcionarios){ //aqui esta sendo pecorrido o array de funcionarios.
            totalFolha += funcionario.getSalario(); //aqui esta sendo somado o salario de cada funcionario ao total da folha.
        }
        return totalFolha;
    }

    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Pedro", "Gerente", 5400.00, 150.00);
        Funcionario vendedor = new Vendedor("Maria", "Vendedor", 1500.00, 300.00);
        Funcionario tecnico = new Tecnico("João", "Tecnico", 2100.00, 250.00);

        Funcionario[] funcionarios = {gerente, vendedor, tecnico}; 

        IO.println("Nome do Funcionario: " + gerente.nome + ", Cargo: " + gerente.cargo + ", Salário: R$ " + gerente.getSalario());
        IO.println("Bonus: R$ " + ((Gerente) gerente).getBonus());
        
        IO.println("Nome do Funcionario: " + vendedor.nome + ", Cargo: " + vendedor.cargo + ", Salário: R$ " + vendedor.getSalario());
        IO.println("Comissão: R$ " + ((Vendedor) vendedor).getComissao());

        IO.println("Nome do Funcionario: " + tecnico.nome + ", Cargo: " + tecnico.cargo + ", Salário: R$ " + tecnico.getSalario());
        IO.println("Hora Extra: R$ " + ((Tecnico) tecnico).getHoraExtra());

        IO.println("Total da folha de pagamento: " + new Funcionario("nome", "cargo", 0).calcularFolha(funcionarios));
        
    }
}