package ex03;

import static ex03.Busca.NumeroDeComparacoesBuscaBinaria;
import static ex03.Busca.NumeroDeComparacoesBuscaSequencial;
import static ex03.Ordenacao.BubbleSortCrescente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int continua = 1;
        int count = 0;

        ArrayList<Produto> lista;
        lista = new ArrayList(12);

        while (continua == 1 && count < 12) {

            int cod;
            String nome;
            float preco;
            cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o cod do produto: "));
            nome = JOptionPane.showInputDialog("Digite a descrição: ");
            preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço: "));

            Produto produto = new Produto(cod, nome, preco);

            lista.add(produto);

            continua = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar um novo produto?\n"
                    + "0 - Não\n"
                    + "1 - Sim\n"));
            count++;
        }

        BubbleSortCrescente(lista); //Ordenando pelo código do produto

        //Quantas comparações pela busca binaria
        int desejado;
        desejado = Integer.parseInt(JOptionPane.showInputDialog("Digite o cod do produto desejado: "));

        int countDesejado = NumeroDeComparacoesBuscaBinaria(lista, desejado);
        JOptionPane.showMessageDialog(null, "Realizadas " + countDesejado + " comparações para encontrar o produto pela busca binária.");
        
        //Quantas comparações pela busca sequencial
        desejado = Integer.parseInt(JOptionPane.showInputDialog("Digite o cod do produto desejado: "));
        
        countDesejado = NumeroDeComparacoesBuscaSequencial(lista, desejado);
        JOptionPane.showMessageDialog(null, "Realizadas " + countDesejado + " comparações para encontrar o produto pela busca sequencial.");

        
        int i;
        String resposta = " ";
        for (i = 0; i < lista.size(); i++) {
            resposta += i + 1 + " - " + lista.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resposta);

    }

}
