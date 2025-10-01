package ClassesVideo;

import ClasseEscritaLeitura.CSVEscritaLeitura;

import java.io.File;

public class Robo {
    private String material;
    private int bateria;
    private int nivelDeOleo;

    //Construtor

    public Robo(String material, int bateria, int nivelDeOleo) {
        this.material = material;
        this.bateria = bateria;
        this.nivelDeOleo = nivelDeOleo;
    }

//Getters e Setters

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getNivelDeOleo() {
        return nivelDeOleo;
    }

    public void setNivelDeOleo(int nivelDeOleo) {
        this.nivelDeOleo = nivelDeOleo;
    }
    public void flertar() {
        Pessoa pessoa = new Pessoa();
        System.out.printf("Android mandou s2 para %s.\n",pessoa.getNome());
        setBateria(getBateria()-5);
        setNivelDeOleo(getNivelDeOleo()-5);
    }

    public void pararDeFuncionar() {
        Coracao coracao = new Coracao();
        if(coracao.getBatimentoPorMinuto() == 0){
            coracao.alterarSentimento();
            setBateria(0);
            transformar();
        }
    }

    public void transformar() {
        setMaterial("Sucata");

    }
    public void salvarRobo() {
        String caminho = "videoRobo.csv";
        File arquivo = new File(caminho);
        String[] cabecalho;
        if (arquivo.exists()) cabecalho=null;
        else cabecalho = new String[]{"Material da Estrutura", " Nível da Bateria", " Nível de Óleo"};
        String[][] dados = {
                {getMaterial(), String.valueOf(getBateria()), String.valueOf(getNivelDeOleo())},
        };
        CSVEscritaLeitura cwr = new CSVEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }
}
