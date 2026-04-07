public class App {
    public static void main(String[] args) throws Exception {
    Produto[] produtos = new Produto[5];

        produtos[0] = new CDs("Castelo", 10.0, 12, "123456789");
        produtos[1] = new CDs("Princesa", 15.0, 10, "987654321");
        produtos[2] = new Livro("Diario de um Banana", 20.0, "Peppa", "111222333");
        produtos[3] = new Livro("As cronicas de narnia", 25.0, "Papai Pig", "444555666");
        produtos[4] = new DVDs("Carros ", 30.0, "disney", "777888999");

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
