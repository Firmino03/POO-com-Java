public class Conversao {
    void main() {

    // CONVERSAO IMPLICITA: de menor para maior (Java faz automaticamente)

    int    inteiro = 10;
    double decimal = inteiro;   // int -> double, sem perda de dado
    IO.println("Double: " + decimal);  // 10.0

    // CONVERSAO EXPLICITA (cast): de maior para menor (voce decide)

    double altura  = 1.758;
    int    arredondado = (int) altura;  // corta os decimais, nao arredonda!
    IO.println("Int: " + arredondado); // 1 (nao 2!)

    // CONVERSAO DE STRING PARA NUMERO

    String textoNota = "8.5";
    String textoIdade = "300";
    int    idadeNum   = Integer.parseInt(textoIdade);
    double notaNum    = Double.parseDouble(textoNota);
    IO.println("Nota como numero: " + (notaNum + 1)); // 9.5
    IO.println("Idade como numero: " + (idadeNum + 1)); // 301

    // CONVERTER numero para String

    int    numero = 100;
    String texto  = String.valueOf(numero);  // "100"
    String texto2 = "karol" + numero;             // forma rapida: "100"
    IO.println("Numero como texto: " + texto);
    IO.println("Numero como texto2: " + texto2);


    }
}
