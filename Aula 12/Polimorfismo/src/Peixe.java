public class Peixe extends Animal {
    private int agua;

    public Peixe(){}

    public Peixe(String nome, int patas, double velocidade, int localizacao, int agua) {
        super(nome, patas, velocidade, localizacao); //Atributos Animal
        this.agua = agua; //Atributo da classe peixe
    }

    public int getAgua(){return agua;}
    public void setAgua(int agua){this.agua = agua;}

    @Override
    public void mover(){
        System.out.println("Peixe " + getNome() + " movendo ~ ~ ~ ~ >");
        int localAtual = getLocalizacao();
        localAtual += 2;
        super.setLocalizacao(localAtual);
    }

}
