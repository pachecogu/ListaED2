package ex03;

import java.util.ArrayList;

public class Ordenacao {

    public static void BubbleSortCrescente(ArrayList<Produto> lista) {
        int i, j, n;
        n = lista.size();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                if (lista.get(j).getCod() > lista.get(j + 1).getCod() ) {
                    Produto aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    //vet[j] = vet[j + 1];
                    lista.set(j + 1, aux);
                    //vet[j + 1] = aux;
                }
            }
        }
    }
//
//    public static void BubbleSortDecrescente(ArrayList<Produto> lista) {
//        //Ordem decrescente de salário
//        int i, j, n;
//        n = lista.size();
//        for (i = 0; i < n; i++) {
//            for (j = 0; j < n - 1; j++) {
//                if (lista.get(j).getSalario() < lista.get(j + 1).getSalario()) {
//                    Produto aux = lista.get(j);
//                    lista.set(j, lista.get(j + 1));
//                    //vet[j] = vet[j + 1];
//                    lista.set(j + 1, aux);
//                    //vet[j + 1] = aux;
//                }
//            }
//        }
//    }

//    public static void BubbleSortNomeCrescente(ArrayList<Funcionario> lista) {
//        int i, j, n;
//        n = lista.size();
//        for (i = 0; i < n; i++) {
//            for (j = 0; j < n - 1; j++) {
//                if (Integer.parseInt(lista.get(j).getNome()) > Integer.parseInt(lista.get(j + 1).getNome()) ) {
//                    Produto aux = lista.get(j);
//                    lista.set(j, lista.get(j + 1));
//                    //vet[j] = vet[j + 1];
//                    lista.set(j + 1, aux);
//                    //vet[j + 1] = aux;
//                }
//            }
//        }
//    }
    
    public static void MergeSortNome(ArrayList<Produto> lista, int inicio, int fim) {
        int meio;
        fim = lista.size();
        
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            MergeSortNome(lista, inicio, meio);
            MergeSortNome(lista, meio + 1, fim);
            intercala(lista, inicio, fim, meio);
        }
    }

    public static void intercala(ArrayList<Produto> lista, int inicio, int fim, int meio) {
        int poslivre, inicio_vetor1, inicio_vetor2, i;
        ArrayList<Produto> aux = new ArrayList<>();
        inicio_vetor1 = inicio;
        inicio_vetor2 = meio + 1;
        poslivre = inicio;
        while (inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
//            if (lista[inicio_vetor1] <= lista[inicio_vetor2]) {
            if (Integer.parseInt(lista.get(inicio_vetor1).getNome()) <= Integer.parseInt(lista.get(inicio_vetor2).getNome())) {
//                aux[poslivre] = lista[inicio_vetor1];
                aux.set(poslivre, lista.get(inicio_vetor1));
                inicio_vetor1 = inicio_vetor1 + 1;
            } else {
//                aux[poslivre] = lista[inicio_vetor2];
                aux.set(poslivre, lista.get(inicio_vetor2));
                inicio_vetor2 = inicio_vetor2 + 1;
            }
            poslivre = poslivre + 1;
        }
        //Se ainda existem números no primeiro vetor
        //que não foram intercalados
        for (i = inicio_vetor1; i <= meio; i++) {
//            aux[poslivre] = lista[i];
            aux.set(poslivre, lista.get(i));
            poslivre = poslivre + 1;
        }

        //Se ainda existem números no segundo vetor
        //que não foram intercalados
        for (i = inicio_vetor2; i <= fim; i++) {
//            aux[poslivre] = lista[i];
            aux.set(poslivre, lista.get(i));
            poslivre = poslivre + 1;
        }
        //retorna os valores do vetor aux para o vetor X
        for (i = inicio; i <= fim; i++) {
//            lista[i] = aux[i];
            lista.set(i, aux.get(i));
        }
    }
    
    
    //###################################
        public static void MergeSortSalario(ArrayList<Produto> lista, int inicio, int fim) {
        int meio;
        fim = lista.size();
        
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            MergeSortSalario(lista, inicio, meio);
            MergeSortSalario(lista, meio + 1, fim);
            intercalaSalario(lista, inicio, fim, meio);
        }
    }

    public static void intercalaSalario(ArrayList<Produto> lista, int inicio, int fim, int meio) {
        int poslivre, inicio_vetor1, inicio_vetor2, i;
        ArrayList<Produto> aux = new ArrayList<>();
        inicio_vetor1 = inicio;
        inicio_vetor2 = meio + 1;
        poslivre = inicio;
        while (inicio_vetor1 <= meio && inicio_vetor2 <= fim) {
//            if (lista[inicio_vetor1] <= lista[inicio_vetor2]) {
            if (lista.get(inicio_vetor1).getSalario() <= lista.get(inicio_vetor2).getSalario()) {
//                aux[poslivre] = lista[inicio_vetor1];
                aux.set(poslivre, lista.get(inicio_vetor1));
                inicio_vetor1 = inicio_vetor1 + 1;
            } else {
//                aux[poslivre] = lista[inicio_vetor2];
                aux.set(poslivre, lista.get(inicio_vetor2));
                inicio_vetor2 = inicio_vetor2 + 1;
            }
            poslivre = poslivre + 1;
        }
        //Se ainda existem números no primeiro vetor
        //que não foram intercalados
        for (i = inicio_vetor1; i <= meio; i++) {
//            aux[poslivre] = lista[i];
            aux.set(poslivre, lista.get(i));
            poslivre = poslivre + 1;
        }

        //Se ainda existem números no segundo vetor
        //que não foram intercalados
        for (i = inicio_vetor2; i <= fim; i++) {
//            aux[poslivre] = lista[i];
            aux.set(poslivre, lista.get(i));
            poslivre = poslivre + 1;
        }
        //retorna os valores do vetor aux para o vetor X
        for (i = inicio; i <= fim; i++) {
//            lista[i] = aux[i];
            lista.set(i, aux.get(i));
        }
    }
}
