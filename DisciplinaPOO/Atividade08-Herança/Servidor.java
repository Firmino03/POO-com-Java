public class Servidor {
    private String nome;
    private String matricula;

    public Servidor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
        public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
        public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibirInformacoes() {
        IO.println("Nome: " + nome);
        IO.println("Matrícula: " + matricula);
    }

    public static class Professor extends Servidor {
        private String disciplina;
        private String titulacao;

        public Professor(String nome, String matricula, String disciplina, String titulacao) {

            super(nome, matricula);

            this.disciplina = disciplina;
            this.titulacao = titulacao;
        }

        public String getDisciplina() {
            return disciplina;
        }
            public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }

        public String getTitulacao() {
            return titulacao;
        }
            public void setTitulacao(String titulacao) {
            this.titulacao = titulacao;
        }

        @Override
        public void exibirInformacoes() {
            IO.println("=== PROFESSOR ===");
            super.exibirInformacoes();
            IO.println("Disciplina: " + disciplina);
            IO.println("Titulação: " + titulacao);
        }
    }

    public static class TecnicoAdministrativo extends Servidor {
        private String setor;
        private String cargo;

        public TecnicoAdministrativo(String nome, String matricula, String setor, String cargo) {

            super(nome, matricula);

            this.setor = setor;
            this.cargo = cargo;
        }

        public String getSetor() {
            return setor;
        }
            public void setSetor(String setor) {
            this.setor = setor;
        }

        public String getCargo() {
            return cargo;
        }
            public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        @Override
        public void exibirInformacoes() {
            IO.println("TÉCNICO ADMINISTRATIVO");
            super.exibirInformacoes();
            IO.println("Setor: " + setor);
            IO.println("Cargo: " + cargo);
        }
    }

    public static void main(String[] args) {

        Professor professor = new Professor(
            "Ana Maria",
            "IFPE001",
            "Programação Java",
            "Mestrado"
        );

        TecnicoAdministrativo tecnico = new TecnicoAdministrativo(
            "Carlos",
            "IFPE002",
            "Secretaria Acadêmica",
            "Assistente em Administração"
        );

        Servidor[] servidores = {
            professor,
            tecnico
        };

        IO.println("SERVIDORES DO IFPE");

        for (Servidor servidor : servidores) {
            servidor.exibirInformacoes();
            IO.println("----------------------------");
        }
    }
}