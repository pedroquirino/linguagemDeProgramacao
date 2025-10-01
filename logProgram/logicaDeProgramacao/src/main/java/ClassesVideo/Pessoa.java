package ClassesVideo;

import ClasseEscritaLeitura.CSVEscritaLeitura;

import java.io.File;

public class Pessoa {
    private String nome;
    private String genero;
    private String interesseAmoroso;

    public Pessoa(String nome, String genero, String interesseAmoroso) {
        this.nome = nome;
        this.genero = genero;
        this.interesseAmoroso = interesseAmoroso;
    }
    public Pessoa() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getInteresseAmoroso() {
        return interesseAmoroso;
    }

    public void setInteresseAmoroso(String interesseAmoroso) {
        this.interesseAmoroso = interesseAmoroso;
    }

    //Metodos
public void trabalhar(){
        System.out.printf("%s está trabalhando no escritório\n", getNome());
    }
public void escolherConjuge(String nome){
        String escolhido = nome;
    System.out.printf("Interesse Romantico atual de %s é: %s\n", getInteresseAmoroso(), escolhido);

    }
public void observarRobo(){
    System.out.printf("%s está observiando o Android trabalhar.\n",getNome());
    }

    public void salvarPessoa() {
        String caminho = "videoPessoa.csv";
        File arquivo = new File(caminho);
        String[] cabecalho;
        if (arquivo.exists()) cabecalho=null;
        else cabecalho = new String[]{"Nome", " Gênero", " Interesse Amoroso"};
        String[][] dados = {
                {getNome(), getGenero(), getInteresseAmoroso()},
        };
        CSVEscritaLeitura cwr = new CSVEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }
}
