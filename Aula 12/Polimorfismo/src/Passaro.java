public class Passaro extends Animal {
    private double altitude;

    public Passaro(){}

    public Passaro(String nome, int patas, double velocidade, int localizacao, double altitude) {
        super(nome, patas, velocidade, localizacao); //Atributos Animal
        this.altitude = altitude; //Atributo da classe Passaro
    }

    public double getAltitude(){return altitude;}
    public void setAltitude(double altitude){this.altitude = altitude;}

    @Override
    public void mover(){
        setLocalizacao(getLocalizacao() + 3);
        System.out.println("Ave "+ getNome() + " voando ^^^^^" + getLocalizacao() + " metros de distância");
    }

}
