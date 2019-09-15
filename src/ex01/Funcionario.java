package ex01;

public class Funcionario implements Comparable<Funcionario> {

    private final String nome;
    private final float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return " " + this.nome + ": salário=" + this.salario;
    }

    @Override
    public int compareTo(Funcionario outro) {
        int compareInt = this.nome.compareTo(outro.nome);
        if (compareInt < 0) {
            return -1;
        }
        if (compareInt > 0) {
            return 1;
        }
        return 0;    }
}
