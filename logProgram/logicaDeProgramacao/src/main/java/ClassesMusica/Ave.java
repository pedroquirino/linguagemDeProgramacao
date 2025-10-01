package ClassesMusica;

import ClasseEscritaLeitura.CSVEscritaLeitura;

import java.io.File;

public class Ave {

    //Atributos
    private String especie;
    private Double tamanho;
    private int velocidade;

    //Construtores
    public Ave(String especie, Double tamanho, int velocidade) {
        this.especie = especie;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
    }

    public Ave(){}

    //Getters e Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    //Metodo
    public void Voar(int velocidade){
        setVelocidade(velocidade);
        System.out.printf("Voando na velocidade: %.2f km/h \n", getVelocidade());
    }

    public void salvarAve() {
        String caminho = "musicaAve.csv";
        File arquivo = new File(caminho);
        String[] cabecalho;
        if (arquivo.exists()) cabecalho=null;
        else cabecalho = new String[]{"Espécie", " Tamanho", " Velocidade"};
        String[][] dados = {
                {String.valueOf(getEspecie()), String.valueOf(getTamanho()), String.valueOf(getVelocidade())},
        };
        CSVEscritaLeitura cwr = new CSVEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }
}
