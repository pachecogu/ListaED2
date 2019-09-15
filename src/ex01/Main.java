package ex01;

import static ex01.Ordenacao.BubbleSortCrescente;
import static ex01.Ordenacao.BubbleSortDecrescente;
import static ex01.Ordenacao.MergeSortNome;
import static ex01.Ordenacao.MergeSortSalarioCrescente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int continua = 1;
        int count = 0;
        String resposta;

        ArrayList<Funcionario> lista;
        lista = new ArrayList(5);

        while (continua == 1 && count < 5) {

            String nome;
            float salario;
            
            continua = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo funcionário?\n"
                    + "0 - Não\n"
                    + "1 - Sim\n"));
            
            nome = JOptionPane.showInputDialog("Digite o nome: ");
            salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario: "));

            Funcionario funcionario = new Funcionario(nome, salario);

            lista.add(funcionario);


            count++;
        }

        BubbleSortCrescente(lista); //Método de ordenação crescente
        resposta = "Ordenado em ordem crescente de salario pelo BubbleSort\n";
        int i;
        for (i = 0; i < lista.size(); i++) {
            resposta += i + 1 + " - " + lista.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resposta);

        BubbleSortDecrescente(lista); //Método de ordenação decrescenta
        resposta = "Ordenado em ordem decrescente de salario pelo BubbleSort\n";
        for (i = 0; i < lista.size(); i++) {
            resposta += i + 1 + " - " + lista.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resposta);

        Ordenacao.BubbleSortNomeCrescente(lista); //Método de ordenação de Nome crescente
        resposta = "Ordenado em ordem alfabética pelo BubbleSort\n";
        for (i = 0; i < lista.size(); i++) {
            resposta += i + 1 + " - " + lista.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resposta);
        
        //APRESENTANDO ERRO NO MERGESORT DO SALARIO
        MergeSortSalarioCrescente(lista, 0, lista.size()); //Método de ordenação MergeSortNome
        resposta = "Ordenado em ordem crescente de salario pelo Merge Sort\n";
        for (i = 0; i < lista.size(); i++) {
            resposta += i + 1 + " - " + lista.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resposta);
        
        
        //APRESENTANDO ERRO NO MERGESORT DO NOME
        MergeSortNome(lista, 0, lista.size()); //Método de ordenação MergeSortNome
        resposta = "";
        for (i = 0; i < lista.size(); i++) {
            resposta += i + 1 + " - " + lista.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resposta);      
        

    }

}
