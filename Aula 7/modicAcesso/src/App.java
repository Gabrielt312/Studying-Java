import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Conta conta1 = new Conta(); 
                 
            System.out.println("Digite o nome: ");
            String n = sc.next(); 
            conta1.setNome(n);
            
            //conta1.setSaldo(1000);
            conta1.setNumero(2); 
            System.out.println("o nomero da conta é: " + conta1.getNome());

            //conta 2
            Conta conta2 = new Conta();
            conta2.setNumero(5);
            //Visualizar contas
            System.out.println("Número da conta 1: " + conta1.getNumero());
            System.out.println("Número da conta 2: " + conta2.getNumero());

            sc.close();
    }
}
