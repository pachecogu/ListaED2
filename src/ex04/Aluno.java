package ex04;

public class Aluno {

    private final String nome;
    private float nota1;
    private float nota2;
    private float media;
    private Boolean status;

    public Aluno(String nome, float nota1, float nota2) {

        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
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
    
    public void setMedia(float nota1, float nota2) {
        media = ((nota1 * 2) + (nota2 * 3)) / 5;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(float media ) {
        if(media >= 7)
            this.status = true;
    }
    

    @Override
    public String toString() {
        return " Nome= " + this.nome + "   " + this.nota1 + "   " + this.nota2 + "   " + this.media;
    }

}
