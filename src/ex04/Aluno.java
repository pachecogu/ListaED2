package ex04;


public class Aluno {

    private final String nome;
    private final float nota1;
    private final float nota2;
    private final float media;
    private final Boolean status;
    
    public Aluno(int cod, String nome, float nota1, float nota2) {

        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = 0;
        this.status = false;        
    }

    public String getNome() {
        return nome;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getMedia() {
        return media;
    }

    public Boolean getStatus() {
        return status;
    }




    @Override
    public String toString() {
        return " Nome= "+ this.nome + "   " + this.nota1 + "   " + this.nota2 + "   " + this.media;
    }

}
