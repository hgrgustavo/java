package atividade01.entities;

public class Gerente extends Empregado {
    private String departamento;

    // Getter & Setter
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Methods
    public String toString() {
        return  "\t. . . Info Gerente . . ."+
                "\nDepartamento: " +
                getDepartamento() +
                "\nNome: " +
                getNome() +
                "\nSalário: R$" +
                getSalario();
    }

    // Constructor
    public Gerente(String nome, Float salario, String departamento) {
        super(nome, salario);
        setDepartamento(departamento);
    }
}
