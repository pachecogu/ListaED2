package ex03;

import java.util.ArrayList;

public class Busca {

    public static int NumeroDeComparacoesBuscaBinaria(ArrayList<Produto> X, int np) {
        // Buscando o número digitado no vetor
        int achou = 0;
        int inicio = 0;
        int fim = 11;
        int comp = 0;
        int meio = (inicio + fim) / 2;
        while (inicio <= fim && achou == 0) {
            comp++; // número de comparações
            if (X.get(meio).getCod() == np) {
                achou = 1;
            } else {
                if (np < X.get(meio).getCod()) {
                    fim = meio - 1;
                    meio = (inicio + fim) / 2; //Falta esta linha no código do livro
                } else {
                    inicio = meio + 1;
                    meio = (inicio + fim) / 2;
                }
            }
        }
        if (achou == 1) {
            return comp;
        }
        return -1;
    }

    public static int NumeroDeComparacoesBuscaSequencial(ArrayList<Produto> X, int np) {
        // Buscando o número digitado no vetor
        int achou = 0;
        int i = 0;
        int count = 0;

        while (i <= X.size() && achou == 0) {
            count++;
            if (X.get(i).getCod() == np) {
                achou = 1;
            } else {
                i++;
            }
            if (achou == 1) {
                return count;
            } 
        }
        return -1;
    }

//
//    public static int BuscaMenorNumero(int X[]) {
//        int menor;
//        menor = 999999999;
//        
//        for (int i = 0; i < X.length; i++) {
//            if (X[i] < menor) {
//                menor = X[i];
//            }
//        }
//        return menor;
//    }
//
//    public static int BuscaMaiorNumero(int X[]) {
//        int maior;
//        maior = 0;
//        
//        for (int i = 0; i < X.length; i++) {
//            if (X[i] > maior) {
//                maior = X[i];
//            }
//        }
//        return maior;
//    }
//    
//        public static int BuscaNumeroRepeticoes(int X[], int num) {
//        int count = 0;
//        
//        for (int i = 0; i < X.length; i++) {
//            if (X[i] == num) {
//                count++;
//            }
//        }
//        return count;
//    }
}
