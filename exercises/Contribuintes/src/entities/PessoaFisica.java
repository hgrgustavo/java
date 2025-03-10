package entities;

public class PessoaFisica extends Contribuintes{
    private double pf_gasto;


    public double getPf_gasto() {
        return pf_gasto;
    }
    public void setPf_gasto(double pf_gasto) {
        this.pf_gasto = pf_gasto;
    }



    public PessoaFisica(String nome, Double renda, Double gasto) {
        super(nome, renda);
        imposto(gasto);
    }


    public double imposto(Double gasto) {
        double imposto_valor = 0;
        if(getRenda() > 20000.00) {
            imposto_valor = getRenda() * 0.15;
            if(getPf_gasto() < 1) {
                 gasto -= (imposto_valor * 0.5);
            }
        }
        setPf_gasto(gasto);
        return imposto_valor;
    }



}
