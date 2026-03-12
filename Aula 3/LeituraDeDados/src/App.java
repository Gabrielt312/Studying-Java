import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        /* Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        System.out.println("Voce digitou o número "+ numero +"!!");

        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();
        System.out.println("Voce digitou o número "+ numero2 +"!!");    */   

        for(int cont = 0; cont <= 100; cont++){
            System.out.println(cont);
        }

        int num3 = 0, soma = 0;

        do{
            num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor"));
            soma += num3;
        }while (num3 > 0);

        System.out.println("Soma total: " + soma);

        /* int num1 = 0;
        while(num1 < 10){
            System.out.println("- " +(num1++));
        }
 */
    }
}
