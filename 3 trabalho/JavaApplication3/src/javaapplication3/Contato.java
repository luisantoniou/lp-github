package javaapplication3;
public class Contato {
    private int codigo;
    private String nome;
    private int numerotelefone;
    private String endereço;

    public Contato(int codigo, String nome, int numerotelefone, String endereço) {
        this.codigo = codigo;
        this.nome = nome;
        this.numerotelefone = numerotelefone;
        this.endereço = endereço;
        
    }
    public Contato() { // este é o método construtor, mas pq eu preciso disso?
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumerotelefone() {
        return numerotelefone;
    }
    public void setNumerotelefone(int numerotelefone) {
        this.numerotelefone = numerotelefone;
    }
    public String getendereço() {
        return endereço;
    }
    public void setendereço(String endereço) {
        this.endereço = endereço;
    }
}