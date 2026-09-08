public class Cinema {
    String filme;
    String horario;
    String sala;
    int capacidade;
    double preco;
    boolean disponivel;

    //METODO COMUM
    void exibirInformacoes (){  
        
        System.out.println ("Filme: " + filme + "\nHorario: " + horario + "\nSala: " + sala + "\nCapacidade: " + capacidade + "\nPreco: " + preco);

    }

    //METODO CONSTRUTOR
    Cinema(String filme, String horario, String sala, int capacidade, double preco, boolean disponivel){
        this.filme = filme;
        this.horario = horario;
        this.sala = sala;
        this.capacidade = capacidade;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    String getSituacao (){
        return disponivel ? "Disponível" : "Indisponível";
    }

    public static void main(String[] args) {
        
        Cinema cinema01 = new Cinema("Vingadores Ultimato", "19:00", "Sala 1", 100, 20.0, true);
        Cinema cinema02 = new Cinema("O Rei Leão", "21:00", "Sala 2", 80, 15.0, false);

        //INVOCANDO METODOS
        System.out.println("--------------");
        cinema01.exibirInformacoes();
        System.out.println("Situação: " + cinema01.getSituacao());

        System.out.println("--------------");
        cinema02.exibirInformacoes();
        System.out.println("Situação: " + cinema02.getSituacao());
    }
} 
