public class Artesao {
String nome;
String cidade;
String tecnica;
double precoPecaMedia;

Artesao (String nome, String cidade, String tecnica, double precoPecaMedia){
this.nome = nome;
this.cidade = cidade;
this.tecnica = tecnica;
this.precoPecaMedia = precoPecaMedia;
}

public void exibirInfo() { 
IO.println( "Nome: " + nome + "\nCidade: " + cidade + "\nTecnica: " + tecnica + "\nPreco medio da peca: R$ " + precoPecaMedia ); 
} 

public static void main (String [] args){
Artesao mestreVitalino = new Artesao ("Vitalino Pereira dos Santos", "Pernambuco", "Barro", 2900.00);
Artesao mestreEspedito = new Artesao ("Espedito Seleiro", "Ceará", "Couro", 945.00);
Artesao mestreJBorges = new Artesao ("José Francisco Borges", "Pernambuco", "Madeira", 1250.00);
Artesao mestreZuza = new Artesao ("José Edvaldo Batista", "Pernambuco", "Ceramica", 750.00);


    mestreVitalino.exibirInfo(); 
IO.println("\n--------------------\n"); 
    mestreEspedito.exibirInfo(); 
IO.println("\n--------------------\n"); 
    mestreJBorges.exibirInfo(); 
IO.println("\n--------------------\n"); 
    mestreZuza.exibirInfo(); 
    } 
}
