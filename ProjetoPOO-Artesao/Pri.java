
public class Pri {

    public static void main(String[] args) {

        Artesao artesao1 = new Artesao();
        artesao1.nome = "Maria";
        artesao1.cidade = "Caruaru";
        artesao1.tecnica = "Cerâmica";
        artesao1.precoPecaMedia = 80.00;

        Artesao artesao2 = new Artesao();
        artesao2.nome = "João";
        artesao2.cidade = "Tracunhaém";
        artesao2.tecnica = "Escultura em barro";
        artesao2.precoPecaMedia = 120.00;

        Artesao artesao3 = new Artesao();
        artesao3.nome = "Ana";
        artesao3.cidade = "Olinda";
        artesao3.tecnica = "Renda";
        artesao3.precoPecaMedia = 60.00;

        Artesao artesao4 = new Artesao();
        artesao4.nome = "José";
        artesao4.cidade = "Juazeiro do Norte";
        artesao4.tecnica = "Madeira";
        artesao4.precoPecaMedia = 100.00;

        System.out.println("Artesão: " + artesao1.nome);
        System.out.println("Cidade: " + artesao1.cidade);
        System.out.println("Técnica: " + artesao1.tecnica);
        System.out.println("Preço médio: R$ " + artesao1.precoPecaMedia);

        System.out.println();

        System.out.println("Artesão: " + artesao2.nome);
        System.out.println("Cidade: " + artesao2.cidade);
        System.out.println("Técnica: " + artesao2.tecnica);
        System.out.println("Preço médio: R$ " + artesao2.precoPecaMedia);

        System.out.println();

        System.out.println("Artesão: " + artesao3.nome);
        System.out.println("Cidade: " + artesao3.cidade);
        System.out.println("Técnica: " + artesao3.tecnica);
        System.out.println("Preço médio: R$ " + artesao3.precoPecaMedia);

        System.out.println();

        System.out.println("Artesão: " + artesao4.nome);
        System.out.println("Cidade: " + artesao4.cidade);
        System.out.println("Técnica: " + artesao4.tecnica);
        System.out.println("Preço médio: R$ " + artesao4.precoPecaMedia);
    }

    
}
