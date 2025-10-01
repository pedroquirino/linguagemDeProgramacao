package ClassesDoodle;

import ClasseEscritaLeitura.CSVEscritaLeitura;

import java.io.File;

public class Animal {
    private String especie;
    private String nome;
    private int nivelPericulosidade;

    //Construtor


    public Animal(String especie, String nome, int nivelPericulosidade) {
        this.especie = especie;
        this.nome = nome;
        this.nivelPericulosidade = nivelPericulosidade;
    }

    public Animal() {
    }

    //Getters e Setters

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelPericulosidade() {
        return nivelPericulosidade;
    }

    public void setNivelPericulosidade(int nivelPericulosidade) {
        this.nivelPericulosidade = nivelPericulosidade;
    }

    public void atacar() {
        System.out.printf("O animal %s vai atacar! Corra!", getEspecie());

    }

    public void fugir() {
        System.out.printf("Você está assutando o %s! Ele(a) está fugindo!", getEspecie());
    }

    public void comer() {
        if (nivelPericulosidade > 3 && this.nivelPericulosidade < 7) {
            System.out.printf("O animal %s está caminhando em sua direção para receber o alimento.", getEspecie());
        } else if (this.nivelPericulosidade < 3) {
            fugir();
        } else if (this.nivelPericulosidade < 7) {
            atacar();
        }
    }

    public void salvarAnimal() {
        String caminho = "doodleAnimal.csv";
        File arquivo = new File(caminho);
        String[] cabecalho;
        if (arquivo.exists()) cabecalho=null;
        else cabecalho = new String[]{"Espécie", " Nome", " Periculosidade"};
        String[][] dados = {
                {getEspecie(), getNome(), String.valueOf(getNivelPericulosidade())},
        };
        CSVEscritaLeitura cwr = new CSVEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }
}
