package ClassesVideo;

public class Pessoa {
    private String nome;
    private char genero;
    private String interesseAmoroso;

    public Pessoa(String nome, char genero, String interesseAmoroso) {
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
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
}
