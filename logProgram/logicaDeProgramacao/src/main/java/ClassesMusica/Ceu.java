package ClassesMusica;

import ClasseEscritaLeitura.CSVEscritaLeitura;

import java.io.File;

public class Ceu {
    //atributos
    private String cor;
    private String visibilidade;
    private String condicaoClimatica;

    //Construtor
    public Ceu(String cor, String visibilidade, String condicaoClimatica) {
        this.cor = cor;
        this.visibilidade = visibilidade;
        this.condicaoClimatica = condicaoClimatica;
    }

    //Getter e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(String visibilidade) {
        this.visibilidade = visibilidade;
    }

    public String getCondicaoClimatica() {
        return condicaoClimatica;
    }

    public void setCondicaoClimatica(String condicaoClimatica) {
        this.condicaoClimatica = condicaoClimatica;
    }

    //Metodo
    public void mudarCLima(String clima){

        setCondicaoClimatica(clima);
        System.out.println("Clima atual: " + clima);
    }

    public void salvarCeu() {
        String caminho = "musicaCeu.csv";
        File arquivo = new File(caminho);
        String[] cabecalho;
        if (arquivo.exists()) cabecalho=null;
        else cabecalho = new String[]{"Cor", " Visibilidade", " Condição Climática"};
        String[][] dados = {
                {getCor(), getVisibilidade(), getCondicaoClimatica()},
        };
        CSVEscritaLeitura cwr = new CSVEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }
}
