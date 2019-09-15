package ex04;

import static ex04.Ordenacao.BubbleSortMediaCrescente;
import static ex04.Ordenacao.BubbleSortNomeCrescente;
import static ex04.Ordenacao.BubbleSortNota1Crescente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int continua = 1;
        int count = 0;

        ArrayList<Aluno> lista;
        lista = new ArrayList(8);

        while (continua == 1 && count < 12) {

            String nome;
            float nota1;
            float nota2;

            nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));

            Aluno aluno = new Aluno(nome, nota1, nota2);
            
            lista.add(aluno);
            
            lista.get(count).setMedia(nota1, nota2);  
            lista.get(count).setStatus(lista.get(count).getMedia());

            continua = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo aluno?\n"
                    + "0 - Não\n"
                    + "1 - Sim\n"));
            count++;
        }

        
        BubbleSortMediaCrescente(lista); //Ordenando alunos pela média
        //Exibindo alunos pela média ponderada
        int i;
        String resposta = " Ordenados pela média ponderada \n";
        for (i = 0; i < lista.size(); i++) {
            resposta += i + 1 + " - " + lista.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resposta);
        
        
        BubbleSortNota1Crescente(lista); //Ordenando alunos pela nota1
        //Exibindo alunos pela nota1
        
        resposta = " Ordenados pela nota1 \n";
        for (i = 0; i < lista.size(); i++) {
            resposta += i + 1 + " - " + lista.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resposta);
        
        
        BubbleSortNomeCrescente(lista); //Ordenando alunos reprovados por ordem alfabética
        //Exibindo alunos pela nota1
        
        resposta = " Reprovados em ordem alfabética \n";
        for (i = 0; i < lista.size(); i++) {
            if(lista.get(i).getStatus() == false)
            resposta += i + 1 + " - " + lista.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resposta);
        
        

//        //Quantas comparações pela busca binaria
//        int desejado;
//        desejado = Integer.parseInt(JOptionPane.showInputDialog("Digite o cod do produto desejado: "));
//
//        int countDesejado = NumeroDeComparacoesBuscaBinaria(lista, desejado);
//        JOptionPane.showMessageDialog(null, "Realizadas " + countDesejado + " comparações para encontrar o produto pela busca binária.");
//        
//        //Quantas comparações pela busca sequencial
//        desejado = Integer.parseInt(JOptionPane.showInputDialog("Digite o cod do produto desejado: "));
//        
//        countDesejado = NumeroDeComparacoesBuscaSequencial(lista, desejado);
//        JOptionPane.showMessageDialog(null, "Realizadas " + countDesejado + " comparações para encontrar o produto pela busca sequencial.");
//
//        
//        int i;
//        String resposta = " ";
//        for (i = 0; i < lista.size(); i++) {
//            resposta += i + 1 + " - " + lista.get(i).toString() + "\n";
//        }
//        JOptionPane.showMessageDialog(null, resposta);
    }

}
