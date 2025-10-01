package ClassesVIkMunizDois;

import ClasseEscritaLeitura.CSVEscritaLeitura;

import java.io.File;

public class Cesto {
    private int tamanho;
    private String material;
    private Double peso;

    //Construtor
    public Cesto(int tamanho, String material, Double peso) {
        this.tamanho = tamanho;
        this.material = material;
        this.peso = peso;
    }

    public Cesto() {}

    //Getters e Setters
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    //Metodo
    public void reciclar(){
        System.out.printf("Reciclar %s. Quantidade: %f em kg.\n ", getMaterial(), getPeso());
    }

    public void salvarCesto() {
        String caminho = "Cesto.csv";
        File arquivo = new File(caminho);
        String[] cabecalho;
        if (arquivo.exists()) cabecalho=null;
        else cabecalho = new String[]{"Tamanho Cesto (cm)", " Material do Cesto", " Peso máximo que o Cesto carrega"};
        String[][] dados = {
                {String.valueOf(getTamanho()), getMaterial(), String.valueOf(getPeso())},
        };
        CSVEscritaLeitura cwr = new CSVEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }}
