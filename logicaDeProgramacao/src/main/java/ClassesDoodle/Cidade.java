package ClassesDoodle;

import java.util.Scanner;

public class Cidade {
    private int vagaDeEmpregos;
    private int predioComercia;
    private String nome;

    //Construtor
    public Cidade(int vagaDeEmpregos, int predioComercia, String nome) {
        this.vagaDeEmpregos = vagaDeEmpregos;
        this.predioComercia = predioComercia;
        this.nome = nome;
    }
    public Cidade(){}

    //Getters e Setters
    public int getVagaDeEmpregos() {
        return vagaDeEmpregos;
    }

    public void setVagaDeEmpregos(int vagaDeEmpregos) {
        this.vagaDeEmpregos = vagaDeEmpregos;
    }

    public int getPredioComercia() {
        return predioComercia;
    }

    public void setPredioComercia(int predioComercia) {
        this.predioComercia = predioComercia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metodos
    public void empregarPessoa(Pessoa pessoa) {
        if(getVagaDeEmpregos()!= 0 ){
            System.out.println("Cidade sem vagas de empregos!");
        }
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nomePessoa =  sc.nextLine();
            setNome(sc.nextLine());
            System.out.println("Digite sua idade: ");
            int idadePessoa = sc.nextInt();
            System.out.println("Digite sua genero: ");
            char generoPessoa = sc.nextLine().charAt(0);
            Pessoa person = new Pessoa(nomePessoa, idadePessoa, generoPessoa);

            System.out.printf("%s é o novo funcionario na cidade %s, bem vindo!", pessoa.toString(), getNome());
        }
    }

    public void acomodarAnimal() {
        Animal animal= new Animal();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a especie do animal: ");
        String  especie = sc.nextLine();
        System.out.println("Digite o nome do animal: ");
        String idade = sc.nextLine();
        System.out.printf("Digite a periculosidade do animal %s: ",  especie);
        int nivelPericulosidade = sc.nextInt();
        System.out.printf("Animal acomodado na cidade %s", getNome());
    }
    public void realizarEvento(){
        System.out.printf("Evento sendo realizado na cidade %s", getNome());
    }

}
