//Exercício 11.2 HashMap<String, ArrayList<String>> com catálogo de artesãos nordestinos por estado.
//Dicas: a chave é o estado e o valor é a lista de nomes de artesãos daquele estado. 

// Ao cadastrar um artesão, verifique com containsKey se o estado já existe; se não existir, crie a lista antes 
// (put(estado, new ArrayList<String>())) e depois adicione o nome. 
// Para exibir, percorra o mapa com entrySet() e imprima o estado seguido da lista de artesãos.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArtesaosMap {
    public static void main(String[] args) {
        var catalogo = new HashMap<String, ArrayList<String>>();

        catalogo.put("PE", new ArrayList<String>());
        catalogo.get("PE").add("João da Renda");

        catalogo.put("BA", new ArrayList<String>());
        catalogo.get("BA").add("Maria da Cerâmica");

        catalogo.put("CE", new ArrayList<String>());
        catalogo.get("CE").add("Ana da Pintura");

        IO.println("Tem CE? " + catalogo.containsKey("CE"));

        Scanner scanner = new Scanner(System.in);
        IO.println("Digite o estado do artesão (sigla): ");

        String estado = scanner.nextLine().toUpperCase();
        IO.println("Digite o nome do artesão: ");

        String nome = scanner.nextLine();

        if (!catalogo.containsKey(estado)) {
            catalogo.put(estado, new ArrayList<String>());
        }

        catalogo.get(estado).add(nome);

        IO.println("\nCadastro realizado com sucesso!");
        for (var entry : catalogo.entrySet()) { //o entry significa que estamos percorrendo cada par chave-valor do mapa
            IO.println( "Estado: " + entry.getKey() + " — Artesãos: " + entry.getValue());
        }
                
        catalogo.get(estado).add(nome);
        IO.println("\nArtesão cadastrado: " + nome);
        IO.println("Estado: " + estado);

        scanner.close(); //encerrando o scanner
    }
    
}
