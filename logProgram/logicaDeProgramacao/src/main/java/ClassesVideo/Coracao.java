package ClassesVideo;

import ClasseEscritaLeitura.CSVEscritaLeitura;

import java.io.File;

public class Coracao {
    private int batimentoPorMinuto;
    private String sentimento;
    private String horario;

    //Construtor

    public Coracao(int batimentoPorMinuto, String sentimento, String horario) {
        this.batimentoPorMinuto = batimentoPorMinuto;
        this.sentimento = sentimento;
        this.horario = horario;
    }
    public Coracao() {}

    //Getters e Setters

    public int getBatimentoPorMinuto() {
        return batimentoPorMinuto;
    }

    public void setBatimentoPorMinuto(int batimentoPorMinuto) {
        this.batimentoPorMinuto = batimentoPorMinuto;
    }

    public String getSentimento() {
        return sentimento;
    }

    public void setSentimento(String sentimento) {
        this.sentimento = sentimento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    //Metodos
    public int pulsar(int bpm) {
        setBatimentoPorMinuto(bpm);
        return getBatimentoPorMinuto();
    }

    public void alterarSentimento() {
        if (getBatimentoPorMinuto() == 0) {
            System.out.println("Coracao parou. Android parou de funcionar.");
        } else if (getBatimentoPorMinuto() < 40 && getBatimentoPorMinuto() > 0) {
            System.out.println("Coracao com bradicardia. Android possivelmente com bateria baixa");
        } else if (getBatimentoPorMinuto() < 120 && getBatimentoPorMinuto() > 40) {
            System.out.println("Coracao oleodinamicamente estavel. Android possivelmente Normal ou Feliz");
        } else if (getBatimentoPorMinuto() > 120) {
            System.out.println("Coracao com tarquicardia. Android entrando em colapso. Necessario atencao.");
        } else {
            System.out.println("Batimento não indentificado");
        }

    }
    public void atualizarHorario(String horario){
        setHorario(horario);
    }

    public void salvarCoracao() {
        String caminho = "videoCoracao.csv";
        File arquivo = new File(caminho);
        String[] cabecalho;
        if (arquivo.exists()) cabecalho=null;
        else cabecalho = new String[]{"Batimento Por Minuto", " Sentimento", " Horário"};
        String[][] dados = {
                {String.valueOf(getBatimentoPorMinuto()), String.valueOf(getSentimento()), getHorario()},
        };
        CSVEscritaLeitura cwr = new CSVEscritaLeitura();
        cwr.escreverCSV(caminho, cabecalho, dados);
    }
}
