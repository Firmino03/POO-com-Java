public class Veiculo {
    String marca;
    String modelo;

    Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla");
        Moto moto = new Moto("Honda", "CG 160");
        Barco barco = new Barco("Focker", "215");

        System.out.println("--- CARRO ---");
        carro.exibir();

        System.out.println("\n--- MOTO ---");
        moto.exibir();

        System.out.println("\n--- BARCO ---");
        barco.exibir();
    }
}

class VeiculoTerrestre extends Veiculo {

    VeiculoTerrestre(String marca, String modelo) {
        super(marca, modelo);
    }
}

class VeiculoAquatico extends Veiculo {

    VeiculoAquatico(String marca, String modelo) {
        super(marca, modelo);
    }
}

class Carro extends VeiculoTerrestre {

    Carro(String marca, String modelo) {
        super(marca, modelo);
    }
}

class Moto extends VeiculoTerrestre {

    Moto(String marca, String modelo) {
        super(marca, modelo);
    }
}

class Barco extends VeiculoAquatico {

    Barco(String marca, String modelo) {
        super(marca, modelo);
    }
}