import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String meses[] = {"Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho","Agosta","Setembro","Outubro","Novembro","Dezembro"};

        Scanner sc = new Scanner(System.in); //Leitor do teclado
        System.out.println("Digite um numero entre 1 e 12: ");
        int digitando = sc.nextInt();
        digitando--;

        if (digitando <= 0 || digitando <= 12 ) {
            System.out.println("O mês escolhido foi: "+ meses[digitando]);
        //Exiba a qual mes o numero difitado se refere (somente de 1 a 12)
        }else{
            System.out.println("Digite um valor entre 1 e 12!");
        }
        
        sc.close();// Sempre no final do código 
    }
}
