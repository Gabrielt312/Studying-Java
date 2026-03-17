import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Você digitou um texto com "+nome.length() + " caracteres");

        System.out.println("Digite outro nome: ");
        String nome2 = sc.nextLine();

        if (nome.equals(nome2)) {
            System.out.println("São iguas!!");
        }else{
            System.out.println("São diferentes");
        }

        String textoQuebrado[] = nome.split(",");
        System.out.println("Tamanho da array:"+textoQuebrado[0]);
        sc.close();
    }
}