public class DVDs extends Produto {
    private String diretor;

    public String getDiretor() { return this.diretor; }
    public void setDiretor(String diretor) { this.diretor = diretor; }

    public DVDs(){}

    public DVDs(String nome, double preco, String diretor, String codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Diretor: " + diretor;
    }
}
