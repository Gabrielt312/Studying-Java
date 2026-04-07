public class CDs extends Produto {
    private int numeroFaixas;

    public int getNumeroFaixas() { return this.numeroFaixas; }
    public void setNumeroFaixas(int numeroFaixas) { this.numeroFaixas = numeroFaixas;}

    public CDs(){}

    public CDs(String nome, double preco, int numeroFaixas, String codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Número de Faixas: " + numeroFaixas;
    }
}
