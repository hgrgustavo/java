package atividade01.entities;

public class Vendedor extends Empregado {
    private float percentualComissao;

    // Getter & Setter
    public float getComissao() {
        return percentualComissao;
    }
    public void setComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    // Methods
    float calcularSalario() {
        return getSalario() + (getSalario() * getComissao());
    }

    public String toString() {
        return "\t . . . Info Vendedor . . ." +
                "\n Nome: " + getNome() +
                "\n Salário sem comissão: R$" + getSalario() +
                "\n Salário com comissão de " + getComissao() + "%: R$" + calcularSalario();
    }

    // Constructor
    public Vendedor(String nome, Float salario, Float percentualComissao) {
        super(nome, salario);
        setComissao(percentualComissao);
    }




}
