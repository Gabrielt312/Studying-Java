import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome (Funcionario): ");
        String nome = sc.nextLine();
        System.out.println("Nome do departamento: ");
        String departamento = sc.nextLine();
        System.out.println("Salário: ");
        double salario = sc.nextDouble();
        System.out.println("Digite a data de entrada no banco: ");
        String dataEntradaBanco = sc.nextLine();
        System.out.println("Digite o RG: ");
        String rg = sc.nextLine();

        empresa funcionario = new empresa(nome, departamento, salario, dataEntradaBanco, rg);
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Data de entrada no banco: " + funcionario.getDataEntradaBanco());
        System.out.println("RG: " + funcionario.getRg());
        

        sc.close();
    }
}
