//Exercício 8.2 — Pagamento -> CartaoCredito, Boleto, Pix. Método processar(double valor) diferente para cada tipo.
public class Pagamento {
    public String tipo;
    private double valor;

    public Pagamento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;  
    }

    public static class CartaoCredito extends Pagamento {
        private String numeroCartao;

        public CartaoCredito(String tipo, double valor, String numeroCartao) {
            super(tipo, valor);
            this.numeroCartao = numeroCartao;
        }

        public String getNumeroCartao() {
            return numeroCartao;
        }
        public void setNumeroCartao(String numeroCartao) {
            this.numeroCartao = numeroCartao;
        }
        @Override
        public double getValor() {
            return super.getValor();
        }
    }

    public static class Boleto extends Pagamento {
        private String codigoBoleto;

        public Boleto(String tipo, double valor, String codigoBoleto) {
            super(tipo, valor);
            this.codigoBoleto = codigoBoleto;
        }

        public String getCodigoBoleto() {
            return codigoBoleto;
        }   
        public void setCodigoBoleto(String codigoBoleto) {
            this.codigoBoleto = codigoBoleto;
        }
        @Override
        public double getValor() {
            return super.getValor();
        }
    }

    public static class Pix extends Pagamento {
        private String chavePix;

        public Pix(String tipo, double valor, String chavePix) {
            super(tipo, valor);
            this.chavePix = chavePix;
        }

        public String getChavePix() {
            return chavePix;
        }   
        public void setChavePix(String chavePix) {
            this.chavePix = chavePix;
        }
        @Override
        public double getValor() {
            return super.getValor();
        }
    }

    public static void main(String[] args) {
    Pagamento pagamento1 = new Pagamento("CartaoCredito", 1500.0);
    Pagamento pagamento2 = new Pagamento("Boleto", 2800.50);
    Pagamento pagamento3 = new Pagamento("Pix", 310.30);

    IO.println("Pagamento 1: Tipo: " + pagamento1.tipo + "Valor: " + pagamento1.getValor());
    IO.println("Pagamento 2: Tipo: " + pagamento2.tipo + "Valor: " + pagamento2.getValor());
    IO.println("Pagamento 3: Tipo: " + pagamento3.tipo + "Valor: " + pagamento3.getValor());

    }
}