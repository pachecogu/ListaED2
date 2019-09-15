package ex03;

public class Produto {

    private final int cod;
    private final String nome;
    private final float preco;

    public Produto(int cod, String nome, float salario) {
        this.cod = cod;
        this.nome = nome;
        this.preco = salario;
    }

    Produto(String nome, float preco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return preco;
    }

    @Override
    public String toString() {
        return " Cód= " + this.cod + " - " + this.nome + "   " + this.preco;
    }

}
