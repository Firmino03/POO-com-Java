public class Pessoas {
   public String nome;
    public char sexo;
    public int idade;
    
    public Pessoas (String nome, char sexo, int idade)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public static class Paciente extends Pessoas{
        public String condicao;
        public boolean doador;
        private int numeroTelefone;
        private String endereco;
        
        public Paciente (String nome, char sexo, int idade, String condicao, boolean doador, int numeroTelefone, String endereco){
            super (nome, sexo, idade);

            this.condicao = condicao;
            this.doador = doador;
            this.numeroTelefone = numeroTelefone;
            this.endereco = endereco;

        }

        
        void dadosPaciente (){
        IO.println("Nome: " + nome + "\nSexo:" + sexo + "\nIdade: " + idade + "\nCondição saúde: " + condicao + 
     "\nÉ doador? " + doador + "\nTelefone: " + numeroTelefone + "\nEndereço: " + endereco);
    }

    }

    public static class Medico extends Pessoas{
        private String crm;
        private String area;
        public double horarioAtendimento;
        public double valorConsulta;
        public boolean disponibilidade;

        public Medico (String nome, char sexo, int idade, String crm, String area, double horarioAtendimento, double valorConsulta, boolean disponibilidade){
        super (nome, sexo, idade);

        this.crm = crm;
        this.area = area;
        this.horarioAtendimento = horarioAtendimento;
        this.valorConsulta = valorConsulta;
        this.disponibilidade = disponibilidade;
        }

        public String getArea(){
            return area;
            }
            public void setArea (String area){
            this.area = area;
        }

        public String getCrm(){
            return crm;
            }
            public void setCrm(String crm){
            this.crm = crm;
            }

        public double getHorarioAtendimento(){
            return horarioAtendimento;
            }
            public void setHorarioAtendimento(double horarioAtendimento){
            this.horarioAtendimento = horarioAtendimento;
        }

        public double getValorConsulta(){
            return valorConsulta;
            }
            public void setValorConsulta(double valorConsulta){
            this.valorConsulta = valorConsulta;
        }

        public boolean getDisponibilidade(){
            return disponibilidade;
            }
            public void setDisponibilidade(boolean disponibilidade){
            this.disponibilidade = disponibilidade;
        }

            
        void dadosMedico (){
        IO.println("Nome do médico: " + nome + "\nSexo:" + sexo + "\nIdade: " + idade + "\nCRM: " + crm + 
        "\nÁrea atuação: " + area + "\nHorário de atendimento: " + horarioAtendimento + "\nValor da consulta: " 
        + valorConsulta + "\nDisponibilidade: " + disponibilidade);
    }
    }

    
    public static void main(String[] args) {
        Paciente adulto1 = new Paciente ("Pedro jose", 'M', 34, "pneumonia", false, 123456789, "Rua A, 123");
        Paciente crianca1 = new Paciente ("Leticia", 'F', 14, "Psicopatia", true, 987654321, "Rua B, 456");

        Medico medico1 = new Medico("Antonio", 'M', 45, "FJH4789", "Psiquiatria", 9.0, 100.0, true);

        adulto1.dadosPaciente();
        IO.println("---------------------------");
        crianca1.dadosPaciente();
        IO.println("---------------------------");
        medico1.dadosMedico();
    }

        
}