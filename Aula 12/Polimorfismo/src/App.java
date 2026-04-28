import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---- POLIMORFISMO Com Animais ----");
        //Animal animais[] = new Animal[10];
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animaisList = new ArrayList<>();
        String menu = "1 - Cadastrar animais \n" +
                      "2 - Listar animais \n" +
                      "3 - Mover animais \n" +
                      "4 - Editar animais \n" +
                      "0 - Sair";
        int option = 0;
        do { 
            System.out.println(menu);
            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1: 
                    System.out.println("Cadastrar de Animais");
                        System.out.println("Escolha qual animal deseja cadastrar: \n1 - Animal generico \n2 - Peixe \n3 - Passaro");
                        int animalOption = sc.nextInt();
                        System.out.println("Digite o nome do animal: ");
                        String nome = sc.next();
                        System.out.println("Digite a quantidade de patas do animal: ");
                        int patas = sc.nextInt();
                        System.out.println("Digite a velocidade do animal: ");
                        double velocidade = sc.nextDouble();
                        System.out.println("Digite a localização do animal: ");
                        int localizacao = sc.nextInt();
                        switch (animalOption){
                            case 1: 
                                Animal animal = new Animal(nome, patas, velocidade, localizacao);
                                animaisList.add(animal);
                                break;
                            case 2: 
                                System.out.println("Digite em qual tipo de agua o peixe vive:\n 0 - Doce \n1 - Salgada");
                                int agua = sc.nextInt();
                                Peixe peixe = new Peixe(nome, patas, velocidade, localizacao, agua);
                                animaisList.add(peixe);
                                break;
                            case 3: 
                                System.out.println("Digite a altitude do pássaro: ");
                                double altitude = sc.nextDouble();
                                Passaro passaro = new Passaro(nome, patas, velocidade, localizacao, altitude);
                                animaisList.add(passaro);
                                break;
                            default:
                                break;    
                        }
                        System.out.println("Temos "+ animaisList.size() + " animais cadastrados!");
                    break;
                case 2: 
                    System.out.println("Listar animais ");
                    for (Animal a : animaisList){
                        System.out.println(a.toString());
                    }
                    break;
                case 3: 
                    System.out.println("Mover animais");
                    for (Animal a : animaisList){
                        a.mover();
                    }
                    break;
                case 4: 
                    System.out.println("Editar animais");
                    break;
                case 0: 
                    System.out.println("Encerrando programa...");
                    break;                           
            }
        } while (option != 0);
        sc.close();   
    }
}
