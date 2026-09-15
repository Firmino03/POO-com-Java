    public class Qacademico {
    String matricula;
    String curso;
    String campus;
    int vaga;
    String turno;
    String disciplina;
    String semestre;

    public Qacademico(String matricula, String curso, String campus, int vaga, String turno, 
        String disciplina, String semestre) {
        this.matricula = matricula;
        this.curso = curso;
        this.campus = campus;
        this.vaga = vaga;
        this.turno = turno;
        this.disciplina = disciplina;
        this.semestre = semestre;
    }

    private static class Aluno extends Qacademico {
        String nomeAluno;
        String email;
        String telefone;

        public Aluno(String matricula, String curso, String campus, int vaga, String turno, 
            String disciplina, String semestre,
            String nomeAluno, String email, String telefone) {

            super(matricula, curso, campus, vaga, turno, disciplina, semestre);

            this.nomeAluno = nomeAluno;
            this.email = email;
            this.telefone = telefone;
        }
    }

    private static class Professor extends Qacademico {
        String nomeProfessor;
        String email;
        String telefone;

        public Professor(String matricula, String curso, String campus, int vaga,
                String turno, String disciplina, String semestre,
                String nomeProfessor, String email, String telefone) {

            super(matricula, curso, campus, vaga, turno, disciplina, semestre);

            this.nomeProfessor = nomeProfessor;
            this.email = email;
            this.telefone = telefone;
        }
    }

    public static class Disciplina extends Qacademico {
        String nomeDisciplina;
        String codigo;
        int cargaHoraria;

        public Disciplina(String matricula, String curso, String campus, int vaga,
                    String turno, String disciplina, String semestre,
                    String nomeDisciplina, String codigo, int cargaHoraria) {

            super(matricula, curso, campus, vaga, turno, disciplina, semestre);

            this.nomeDisciplina = nomeDisciplina;
            this.codigo = codigo;
            this.cargaHoraria = cargaHoraria;
        }
    }

    public static void main(String[] args) {

        Aluno Karolayne = new Aluno(
            "2023001",
            "Engenharia de Software",
            "Campus Central",
            30,
            "Noturno",
            "Programação Orientada a Objetos",
            "2024.1",
            "João Silva",
            "joao.silva@email.com",
            "(11) 99999-9999"
        );

        Professor ProfJoao = new Professor(
            "2023002",
            "Engenharia de Software",
            "Campus Central",
            30,
            "Noturno",
            "Programação Orientada a Objetos",
            "2024.1",
            "Prof. João Souza",
            "joao.souza@email.com",
            "(11) 88888-8888"
        );

        Disciplina poo = new Disciplina(
            "2023001",
            "Engenharia de Software",
            "Campus Central",
            30,
            "Noturno",
            "Programação Orientada a Objetos",
            "2024.1",
            "Programação Orientada a Objetos",
            "POO101",
            60
        );

        System.out.println("=== ALUNO ===");
        System.out.println("Nome do aluno: " + Karolayne.nomeAluno);
        System.out.println("Email do aluno: " + Karolayne.email);
        System.out.println("Telefone do aluno: " + Karolayne.telefone);

        System.out.println("\n=== PROFESSOR ===");
        System.out.println("Nome do professor: " + ProfJoao.nomeProfessor);
        System.out.println("Email do professor: " + ProfJoao.email);
        System.out.println("Telefone do professor: " + ProfJoao.telefone);

        System.out.println("\n=== DISCIPLINA ===");
        System.out.println("Nome da disciplina: " + poo.nomeDisciplina);
        System.out.println("Código da disciplina: " + poo.codigo);
        System.out.println("Carga horária: " + poo.cargaHoraria + " horas");
    }
}