package ClassesVIkMunizUm;

public class Agua {
    private String tipoDeAgua;
    private int forcaCorrenteza;
    private String sentidoFluxo;

    //Construtores
    public Agua(String tipoDeAgua, int forcaCorrenteza, String sentidoFluxo) {
        this.tipoDeAgua = tipoDeAgua;
        this.forcaCorrenteza = forcaCorrenteza;
        this.sentidoFluxo = sentidoFluxo;
    }

    public Agua(){}

    //Getters e Setters
    public String getTipoDeAgua() {
        return tipoDeAgua;
    }
    public void setTipoDeAgua(String tipoDeAgua) {
        this.tipoDeAgua = tipoDeAgua;
    }
    public int getForcaCorrenteza() {
        return forcaCorrenteza;
    }
    public void setForcaCorrenteza(int forcaCorrenteza) {
        this.forcaCorrenteza = forcaCorrenteza;
    }
    public String getSentidoFluxo() {
        return sentidoFluxo;
    }
    public void setSentidoFluxo(String sentidoFluxo) {
        this.sentidoFluxo = sentidoFluxo;
    }

    //Metodo
    public void virarBarco(){
        if (getForcaCorrenteza() > 7){
            Barco barco = new Barco();
            System.out.printf("O barco modelo: %s acabou de virar no %s\n", barco.getModelo(), getTipoDeAgua());
        }
    }
}
