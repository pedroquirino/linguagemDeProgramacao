package ClassesVIkMunizDois;

public class Mulher {
    private int idade;
    private String nome;
    private int forca;


    //COnstrutor
    public Mulher(int idade, String nome, int forca) {
        this.idade = idade;
        this.nome = nome;
        this.forca = forca;
    }

    //Getters e Setters
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }

    //Metodo
    public void carregarCesto(){
        Cesto cesto = new Cesto();
        if(getForca() < cesto.getPeso()){
            System.out.printf("A dona %s não suporta esse peso!\n", getNome());
        }
    }
}
