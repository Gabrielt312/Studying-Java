public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---- POLIMORFISMO Com Animais ----");
        Animal animais[] = new Animal[10];
        Animal doguinho = new Animal("Zeus", 4, 10.0, 1); // Instanciando 1 obj da classe Animal

        animais[0] = doguinho;
        //animais[0].mover(); 

        animais[1] = new Peixe("Nemo", 1, 0.2, 1, 100); // Instanciando 1 obj da classe Peixe
        //animais[1].mover();

        animais[2] = new Passaro("Piu-Piu", 2, 5.0, 1, 100); // Instanciando 1 obj da classe Passaro

        for(Animal a: animais){
            a.mover();
        }

    }

}
