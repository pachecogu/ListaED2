package ex04;

import static ex04.Ordenacao.BubbleSortCrescente;
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

            continua = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo aluno?\n"
                    + "0 - Não\n"
                    + "1 - Sim\n"));
            count++;
        }

        BubbleSortCrescente(lista); //Ordenando alunos pela média

        //Exibindo alunos pela média ponderada
        int i;
        String resposta = " ";
        for (i = 0; i < lista.size(); i++) {
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
