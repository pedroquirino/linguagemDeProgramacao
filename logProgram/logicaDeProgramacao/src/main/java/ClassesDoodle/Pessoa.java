package ClassesDoodle;

import ClasseEscritaLeitura.CSVEscritaLeitura;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.io.File;

public class Pessoa {
    private String nome;
    private int idade;
    private String genero;

    //Construtor
    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString() {
        return String.format("Nome: %s,\n" +
                        "Idade: %d,\n" +
                        "Genero: %s.\n",
                this.nome, this.idade, this.genero);
    }

    //Metodos

    public void verAnimal(){
        Animal animal= new Animal();
        System.out.printf("%s está vendo o(a) %s",getNome(),animal.getNome());

    }
    public void alimentarAnimal(){
        Animal animal= new Animal();
        System.out.printf("%s está alimentando o(a) %s",getNome(),animal.getNome());

    }
    public void trabalhar(){
        Cidade  cidade= new Cidade();
        System.out.printf("%s está trabalhando em %s",getNome(),cidade.getNome());
    }

    public void salvarPessoa() {
        String caminho = "doodlePessoa.csv";
        File arquivo = new File(caminho);
        String[] cabecalho;
        if (arquivo.exists()) cabecalho=null;
        else cabecalho = new String[]{"Nome", " Idade", " Gênero"};
        String[][] dados = {
                {getNome(), String.valueOf(getIdade()), getGenero()},
        };
        CSVEscritaLeitura cwr = new CSVEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }
}
