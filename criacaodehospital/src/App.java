import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando e preenchendo os dados do Hospital
        System.out.println("=== Cadastro do Hospital ===");
        Hospital hospital = new Hospital();
        System.out.print("Digite o nome do hospital: ");
        hospital.setNome(scanner.nextLine());
        System.out.print("Digite o endereço do hospital: ");
        hospital.setEndereco(scanner.nextLine());

        // Criando e preenchendo os dados do Paciente
        System.out.println("\n=== Cadastro do Paciente ===");
        Paciente paciente = new Paciente();
        System.out.print("Digite o tipo sanguíneo do paciente: ");
        paciente.setTpSangue(scanner.nextLine());
        System.out.print("Digite o endereço do paciente: ");
        paciente.setEndereco(scanner.nextLine());
        System.out.print("Digite o plano de saúde do paciente: ");
        paciente.setPlanoSaude(scanner.nextLine());

        // Criando e preenchendo os dados do Médico
        System.out.println("\n=== Cadastro do Médico ===");
        Medico medico = new Medico();
        System.out.print("Digite a especialidade do médico: ");
        medico.setEspecialidade(scanner.nextLine());
        System.out.print("Digite o CRM do médico: ");
        medico.setCrm(scanner.nextLine());

        // Criando e preenchendo os dados do Prontuário
        System.out.println("\n=== Cadastro do Prontuário ===");
        Prontuario prontuario = new Prontuario();
        System.out.print("Digite o histórico médico do prontuário: ");
        prontuario.setHistMedico(scanner.nextLine());
        System.out.print("Digite a data de criação do prontuário: ");
        prontuario.setDataCriacao(scanner.nextLine());

        // Exibindo os dados cadastrados
        System.out.println("\n=== Dados Cadastrados ===");

        System.out.println("\nHospital:");
        System.out.println("Nome: " + hospital.getNome());
        System.out.println("Endereço: " + hospital.getEndereco());

        System.out.println("\nPaciente:");
        System.out.println("Tipo Sanguíneo: " + paciente.getTpSangue());
        System.out.println("Endereço: " + paciente.getEndereco());
        System.out.println("Plano de Saúde: " + paciente.getPlanoSaude());

        System.out.println("\nMédico:");
        System.out.println("Especialidade: " + medico.getEspecialidade());
        System.out.println("CRM: " + medico.getCrm());

        System.out.println("\nProntuário:");
        System.out.println("Histórico Médico: " + prontuario.getHistMedico());
        System.out.println("Data de Criação: " + prontuario.getDataCriacao());

        scanner.close();
    }
}
