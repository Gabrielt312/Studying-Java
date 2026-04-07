class Produto {
    private String nome;
    private double preco;
    private String codigoDeBarras;
    
    // Construtores

    public Produto() {}
    
    public Produto(String nome, double preco, String codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }

    // Getters e Setters

    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return this.preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String getCodigoDeBarras() { return this.codigoDeBarras; }
    public void setCodigoDeBarras(String codigoDeBarras) { this.codigoDeBarras = codigoDeBarras; }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: R$" + preco + " | Código de Barras: " + codigoDeBarras;
    }
}