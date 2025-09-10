package ClassesDoodle;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class Pessoa {
    private String nome;
    private int idade;
    private char genero;

    //Construtor
    public Pessoa(String nome, int idade, char genero) {
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
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

}
