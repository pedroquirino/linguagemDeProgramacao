package ClassesVIkMunizUm;

public class Barco {
    private String modelo;
    private int combustivel;
    private int velocidade;

    //Construtor
    public Barco(String modelo, int combustivel, int velocidade){
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.velocidade = velocidade;
    }

    public Barco(){}

    //Getters e Setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    //Metodo
    public void navegar(Agua tipoDeAgua){
        Agua agua = new Agua();
        System.out.printf("Barco modelo: %s comecou a navegar no %s. Velocidade média: %d.\n",getModelo(),agua.getTipoDeAgua(),getVelocidade());
    }
}
