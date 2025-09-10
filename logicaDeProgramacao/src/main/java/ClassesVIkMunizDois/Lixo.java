package ClassesVIkMunizDois;

public class Lixo {
    private String tipo;
    private Double peso;
    private int quantidade;

    //Construtor
    public Lixo(String tipo, Double peso, int quantidade) {
        this.tipo = tipo;
        this.peso = peso;
        this.quantidade = quantidade;
    }

    //Getters e Setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Metodo
    public int colocarNoCesto(int quantidade){
        return this.quantidade+=quantidade;
    }
}
