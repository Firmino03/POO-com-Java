import java.util.ArrayList;
import java.util.HashSet;

public class Pacientes {

    public static void main(String[] args) {
        ArrayList<String> pacientes = new ArrayList<>();

        pacientes.add("Ana");
        pacientes.add("Carlos");
        pacientes.add("Maria");
        pacientes.add("Ana");
        pacientes.add("João");
        pacientes.add("Carlos");
        pacientes.add("Pedro");

        // O HashSet elimina automaticamente os nomes repetidos.
        HashSet<String> pacientesUnicos = new HashSet<>(pacientes);

        IO.println("--- PACIENTES CADASTRADOS ---");
        IO.println(pacientesUnicos);
        IO.println("Quantidade de pacientes únicos: " + pacientesUnicos.size());

        // Testa a adição de um paciente que já está cadastrado.
        boolean resultado = pacientesUnicos.add("Ana");

        IO.println("\n--- TESTANDO NOVO CADASTRO ---");
        IO.println("Resultado ao cadastrar Ana novamente: " + resultado);
        IO.println("Quantidade de pacientes únicos: " + pacientesUnicos.size());

        // Testa a adição de um paciente que ainda não está cadastrado.
        boolean novoPaciente = pacientesUnicos.add("Fernanda");

        IO.println("\n--- CADASTRANDO NOVO PACIENTE ---");
        IO.println("Resultado ao cadastrar Fernanda: " + novoPaciente);

        // Exibe a quantidade atualizada
        IO.println("Quantidade de pacientes únicos: " + pacientesUnicos.size());
    }
}