public class App {
    public static void main(String[] args) throws Exception {
        // Utilizando construtor cheio
        Carro car = new Carro("Polo", "Cinza platinium", "QWS-6397", 4);
        System.out.println(car.toString());      

        // Utilizando o construtor vazio
        Carro car2 = new Carro(); 

    }
}
