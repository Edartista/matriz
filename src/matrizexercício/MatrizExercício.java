package matrizexercício;

import java.util.Scanner;

public class MatrizExercício {

    public static void main(String[] args) {
        //Entrada de dados//
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas linhas deseja na matriz?");
        int m = teclado.nextInt();
        System.out.println("Quantas colunas deseja na matriz?");
        int n = teclado.nextInt();
        //Criando a matriz
        int[][] matriz = new int[m][n];
        //Lendo os valores da matirz
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                matriz[i][j] = teclado.nextInt();
            }
        }
        //Lendo um número X
        System.out.print("Digite um número específico da matriz: ");;
        int x = teclado.nextInt();
        
        //Verificando os numeros próximos de X
        for(int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (matriz[i][j] == x){
                    System.out.printf("Posição %d, %d:%n", i, j);
                    if (j>0){
                        System.out.println("À esquerda: " + matriz[i][j-1]);
                    } if (i>0){
                        System.out.println("Acima: " + matriz[i-1][j]);
                    } if (j<matriz[i].length-1){
                        System.out.println("À direita: " + matriz[i][j+1]);
                    } if (i<matriz.length-1){
                        System.out.println("Abaixo: " + matriz[i+1][j] + "\n");
                    }
                }
                
            }
        
        }
        teclado.close();
    }
}
