public abstract class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
        public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract double calcularConsumo(double km);
    //abstract porque cada tipo de veículo terá uma forma diferente de calcular o consumo

    public static class Carro extends Veiculo {
        public Carro(String modelo) {
            super(modelo);
        }

        @Override
        public double calcularConsumo(double km) {
            return km / 10.0;
        }
    }

    public static class Moto extends Veiculo {
        public Moto(String modelo) {
            super(modelo);
        }

        @Override
        public double calcularConsumo(double km) {
            return km / 20.0;
        }
    }

    public static class Caminhao extends Veiculo {
        public Caminhao(String modelo) {
            super(modelo);
        }

        @Override
        public double calcularConsumo(double km) {
            return km / 4.0;
        }
    }

    public static void main(String[] args) {

        Carro carro = new Carro("Toyota Corolla");
        Moto moto = new Moto("Honda CG 160");
        Caminhao caminhao = new Caminhao("Volvo FH");

        Veiculo[] veiculos = {
            carro, moto, caminhao
        };

        double distancia = 200.0;

        IO.println("---- CONSUMO DOS VEÍCULOS ----");

        for (Veiculo veiculo : veiculos) {

            IO.println("Modelo: " + veiculo.getModelo());
            IO.println("Distância percorrida: " + distancia + " km");
            IO.println("Consumo: " + veiculo.calcularConsumo(distancia) + " litros");
            IO.println("----------------------------");
        }
    }
}