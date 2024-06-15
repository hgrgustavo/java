package entities;

public class Contribuintes {
    private String nome;
    private Double renda;



    public Object getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda() {
        return renda;
    }
    public void setRenda(Double renda) {
        this.renda = renda;
    }


    public Contribuintes(String nome, Double renda) {
        setNome(nome);
        setRenda(renda);
    }
}
