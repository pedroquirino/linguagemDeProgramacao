package ClassesMusica;

import ClasseEscritaLeitura.CSVEscritaLeitura;

import java.io.File;

public class Pao {
    private int energia;
    private Double tamanho;
    private String formato;

    //Construtor
    public Pao(int energia, Double tamanho, String formato) {
        this.energia = energia;
        this.tamanho = tamanho;
        this.formato = formato;
    }
    //Getters e Setters
    public int getEnergia() {
        return energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public Double getTamanho() {
        return tamanho;
    }
    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void alimentar(int quantidade){
        Ave ave = new Ave();
        setEnergia(getEnergia()+quantidade);
        System.out.printf("%s foi alimentado(a). Energia atual: %d \n",ave.getEspecie(), getEnergia());
    }

    public void salvarPao() {
        String caminho = "musicaPao.csv";
        File arquivo = new File(caminho);
        String[] cabecalho;
        if (arquivo.exists()) cabecalho=null;
        else cabecalho = new String[]{"Energia ao Consumir o Pão", " Tamanho", " Formato"};
        String[][] dados = {
                {String.valueOf(getEnergia()), String.valueOf(getTamanho()), getFormato()},
        };
        CSVEscritaLeitura cwr = new CSVEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }
}
