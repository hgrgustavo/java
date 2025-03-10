package entities;

public class PessoaJuridica extends Contribuintes {
    private int pj_numFuncionario;


    public int getPj_numFuncionario() {
        return pj_numFuncionario;
    }
    public void setPj_numFuncionario(int pj_numFuncionario) {
        this.pj_numFuncionario = pj_numFuncionario;
    }


    public PessoaJuridica(String nome, Double renda, Integer numFuncionario) {
        super(nome, renda);
        setPj_numFuncionario(numFuncionario);
    }


    public double imposto(Double renda) {
        double imposto_valor;
        if(getPj_numFuncionario() > 10) {
            imposto_valor = renda * 0.14;
        }
        else {
            imposto_valor = renda * 0.16;
        }
        return imposto_valor;
    }
}
