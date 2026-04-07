public class Livro extends Produto {
    private  String autor;

    public String getAutor() { return this.autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public Livro(){}

    public Livro(String nome, double preco, String autor, String codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + " | Autor: " + autor;
    }
}
