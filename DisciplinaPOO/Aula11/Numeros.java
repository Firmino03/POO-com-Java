void main() {
    var numeros = new ArrayList<Integer>();
    numeros.add(10);
    numeros.add(20);
    numeros.add(30);

    numeros.remove(1);                    // remove a POSIÇÃO 1 (o valor 20)
    IO.println(numeros);                  // [10, 30]

    numeros.remove(Integer.valueOf(30));  // remove o VALOR 30
    IO.println(numeros);                  // [10]
}

//Quando a lista é de Integer, remove(1) é interpretado como "remover a posição 1", e não "remover o valor 1". 
// Para remover por valor, é preciso informar um objeto, como em Integer.valueOf(30).

