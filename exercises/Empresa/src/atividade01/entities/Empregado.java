package atividade01.entities;

public class Empregado {
    private String nome;
    protected float salario;

    // Getter & Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    // Constructor
    public Empregado(String nome, Float salario) {
        setNome(nome);
        setSalario(salario);
    }

    // Methods
    public String toString() {
        return ". . . Info Empregado . . ." +
                "\n Nome: " + getNome() +
                "\n Salário: R$" + getSalario();
    }
}
