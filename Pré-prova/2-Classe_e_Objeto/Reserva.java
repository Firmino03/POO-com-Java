public class Reserva {
    String nomeHospede;
    int numeroQuarto;
    int quantidadeNoite;
    double valor;
    boolean reservado;

    Reserva(String nomeHospede, int numeroQuarto, int quantidadeNoite, double valor, boolean reservado) {
        this.nomeHospede = nomeHospede;
        this.numeroQuarto = numeroQuarto;
        this.quantidadeNoite = quantidadeNoite;
        this.valor = valor;
        this.reservado = reservado;
    }

    void exibirDados() {
        IO.println("Nome: " + nomeHospede +
            "\nNumero do quarto: " + numeroQuarto +
            "\nQuantidade de noites: " + quantidadeNoite +
            "\nValor: " + valor +
            "\nReservado? " + reservado);
    }

    double valorReserva() {
        if (reservado) {
            if (quantidadeNoite <= 0) {
                IO.println("Quantidade de noites invalida.");
                return 0;
            }
            return quantidadeNoite * valor;
        } else {
            IO.println("Pendente");
            return 0;
        }
    }

    public static void main(String[] args) {
        Reserva reserva1 = new Reserva("joao", 19, 2, 130.00, true);
        Reserva reserva2 = new Reserva("maria", 25, 3, 190.00, true);
        Reserva reserva3 = new Reserva("pedro", 14, 2, 130.00, false);

        reserva1.exibirDados();
        IO.println("Valor da reserva: " + reserva1.valorReserva());

        reserva2.exibirDados();
        IO.println("Valor da reserva: " + reserva2.valorReserva());

        reserva3.exibirDados();
        IO.println("Valor da reserva: " + reserva3.valorReserva());
    }
}