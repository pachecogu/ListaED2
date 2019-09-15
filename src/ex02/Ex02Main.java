package ex02;

import static ex02.Busca.BuscaBinaria;
import static ex02.Busca.BuscaMaiorNumero;
import static ex02.Busca.BuscaMenorNumero;
import static ex02.Busca.BuscaNumeroRepeticoes;
import static ex02.Ordenacao.BubbleSortCrescenteVetor;

import java.util.Scanner;

public class Ex02Main {

    public static void main(String[] args) {
        // TODO code application logic here

        int n = 10;
        int vet[] = new int[n];
        int aux, i, j, menor, maior;

        //leitura dos números para guardar no vet
        try (Scanner scanner = new Scanner(System.in)) {
            for (i = 0; i < n; i++) {
                System.out.println("Digite o " + (i + 1) + " º número: ");
                vet[i] = scanner.nextInt();
            }

            //IMPLEMENTAR A BUSCA PELO MENOR NUMERO
            menor = BuscaMenorNumero(vet);
            maior = BuscaMaiorNumero(vet);

            //ordenando
            BubbleSortCrescenteVetor(vet);

            int localmenor;
            localmenor = BuscaBinaria(vet, menor);

            //mostrando vetor
            System.out.println("\n-----------------\nVetor odernado");

            for (i = 0; i < n; i++) {
                System.out.println((i + 1) + " º número: " + vet[i]);
            }
            System.out.println("O menor número se encontra na posição: " + (localmenor + 1));

            int menorRepete;
            menorRepete = BuscaNumeroRepeticoes(vet, menor);
            System.out.println("O menor número aparece: " + menorRepete + " vezes no vetor");
           
            int maiorRepete;
            maiorRepete = BuscaNumeroRepeticoes(vet, maior);
            
            System.out.println("O maior número aparece: " + maiorRepete + " vezes no vetor");
            
        }
    }
}
