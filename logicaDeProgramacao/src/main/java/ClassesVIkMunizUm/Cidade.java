package ClassesVIkMunizUm;

public class Cidade {
    private String nome;
    private int totalDeBarcos;
    Boolean disponivelAtracar;

    //Consturtor
    public Cidade(String nome, int totalDeBarcos, Boolean disponivelAtracar) {
        this.nome = nome;
        this.totalDeBarcos = totalDeBarcos;
        this.disponivelAtracar = disponivelAtracar;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTotalDeBarcos() {
        return totalDeBarcos;
    }
    public void setTotalDeBarcos(int totalDeBarcos) {
        this.totalDeBarcos = totalDeBarcos;
    }
    public Boolean getDisponivelAtracar() {
        return disponivelAtracar;
    }
    public void setDisponivelAtracar(Boolean disponivelAtracar) {
        this.disponivelAtracar = disponivelAtracar;
    }


    //Metodo
    public void abastecerBarco(int combustivel){
        if (getDisponivelAtracar() == true){
            Barco barco = new Barco();
            int combustivelAtual = barco.getCombustivel();
            barco.setCombustivel(combustivel);
            System.out.printf("Abastecendo barco modelo %s. Combustivel anterior: %d. Combustivel atual:%d\n", barco.getModelo(), combustivelAtual, barco.getCombustivel());
        }
    }
}
