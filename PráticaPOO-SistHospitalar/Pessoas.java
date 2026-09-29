public class Pessoas {
    String nome;
    char sexo;
    int idade;
    
    public Pessoas (String nome, char sexo, int idade)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public static class Paciente extends Pessoas{
        String condicao;
        boolean doador;

        public Paciente (String nome, char sexo, int idade, String condicao, boolean doador){
            super (nome, sexo, idade);

            this.condicao = condicao;
            this.doador = doador;
        }

        
    void dadosPaciente (){
        IO.println("Nome: " + nome + "\nSexo:" + sexo + "\nIdade: " + idade + "\nCondição saúde: " + condicao + 
         "\nÉ doador? " + doador);
    }

    }

    public static class Medico extends Pessoas{
        private String crm;
        private String area;

        public Medico (String nome, char sexo, int idade, String crm, String area){
        super (nome, sexo, idade);

        this.crm = crm;
        this.area = area;
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

            
    void dadosMedico (){
        IO.println("Nome: " + nome + "\nSexo:" + sexo + "\nIdade: " + idade + "\nCRM: " + crm + "\nÁrea atuação: " + area);
    }
    }

    
    public static void main(String[] args) {
        Paciente adulto1 = new Paciente ("Pedro jose", 'M', 34, "pneumonia", false);
        Paciente crianca1 = new Paciente ("Leticia", 'F', 14, "Psicopatia", true);

        Medico medico1 = new Medico("Antonio", 'M', 45, "FJH4789", "Psiquiatria");

        adulto1.dadosPaciente();
        IO.println("---------------------------");
        crianca1.dadosPaciente();
        IO.println("---------------------------");
        medico1.dadosMedico();
    }

        
}