//Outros métodos úteis do ArrayList
void main() {
    var frutas = new ArrayList<String>();

    frutas.add("Manga");
    frutas.add("Caju");
    frutas.add(1, "Acerola");        // insere na posição 1: [Manga, Acerola, Caju]
    frutas.set(0, "Goiaba");         // substitui a posição 0: [Goiaba, Acerola, Caju]

    IO.println(frutas.indexOf("Caju"));   // 2 (posição); devolve -1 se não achar
    IO.println(frutas.isEmpty());         // false
    IO.println(frutas.size());            // 3

    var extras = new ArrayList<String>();
    extras.add("Umbu");
    extras.add("Cajá");
    frutas.addAll(extras);                // junta as duas listas

    IO.println(frutas);                   // [Goiaba, Acerola, Caju, Umbu, Cajá]

    frutas.clear();                       // esvazia a lista
    IO.println(frutas.isEmpty());         // true
}