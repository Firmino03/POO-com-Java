
import java.util.HashMap;
import java.util.Map;

public class ArtesaosTecnicas {
    public static void main(String[] args) {
        var contagem = new HashMap<String, Integer>();

        String[] tecnicas = {
            "Renda", "Cerâmica", "Pintura", "Cerâmica", "Renda", "Cerâmica"};

        for (String tecnica : tecnicas) {
            int quantidade = contagem.getOrDefault(tecnica, 0); // Obtém a quantidade atual ou 0 se não existir.
            contagem.put(tecnica, quantidade + 1);
        }

        System.out.println("---QUANTIDADE DE ARTESÃOS POR TÉCNICA ---");

        for (var entry : contagem.entrySet()) { // entry significa que estamos percorrendo cada par chave-valor do mapa
            System.out.println( "Técnica: " + entry.getKey() + " - Quantidade: " + entry.getValue());
        }

        String tecnicaMaisUtilizada = "";
        int maiorQuantidade = 0;

        for (var entry : contagem.entrySet()) {

            if (entry.getValue() > maiorQuantidade) {
                maiorQuantidade = entry.getValue();
                tecnicaMaisUtilizada = entry.getKey();
            }
        }
        System.out.println("\n---TÉCNICA MAIS UTILIZADA ---");
        System.out.println("Técnica: " + tecnicaMaisUtilizada);
        System.out.println("Quantidade: " + maiorQuantidade);
    }
}
