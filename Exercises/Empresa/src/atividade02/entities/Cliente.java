package atividade02.entities;

public class Cliente {
    private String nome;

    // Getter & Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Constructors
    Cliente() {}
    Cliente(String nome) {}

    // Methods
    public String toString() {
        return "";
    }

    // Interface
    public interface cliente_nome {
        String nome (Cliente c);
    }
}
