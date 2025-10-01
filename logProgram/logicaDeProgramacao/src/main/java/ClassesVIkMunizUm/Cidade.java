package ClassesVIkMunizUm;

import ClasseEscritaLeitura.CSVEscritaLeitura;

import java.io.File;

public class Cidade {
    private String nome;
    private int totalDeBarcos;
    private int disponivelAtracar;

    //Consturtor
    public Cidade(String nome, int totalDeBarcos, int disponivelAtracar) {
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
    public int getDisponivelAtracar() {
        return disponivelAtracar;
    }
    public void setDisponivelAtracar(int disponivelAtracar) {
        this.disponivelAtracar = disponivelAtracar;
    }


    //Metodo
    public void abastecerBarco(int combustivel){

            Barco barco = new Barco();
            int combustivelAtual = barco.getCombustivel();
            barco.setCombustivel(combustivel);
            System.out.printf("Abastecendo barco modelo %s. Combustivel anterior: %d. Combustivel atual:%d\n", barco.getModelo(), combustivelAtual, barco.getCombustivel());

    }
    public void salvarCidade(){
        String caminho = "Cidade.csv";
        File arquivo = new File(caminho);
        String[] cabecalho;
        if (arquivo.exists()) cabecalho=null;
        else cabecalho = new String[]{"Nome da Cidade", " Total de Barcos Atracados", " Vagas disponiveis para barcos Atracarem"};
        String[][] dados = {{getNome(), String.valueOf(getTotalDeBarcos()), String.valueOf(getDisponivelAtracar())},
        };
        CSVEscritaLeitura cwr = new CSVEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }
}
