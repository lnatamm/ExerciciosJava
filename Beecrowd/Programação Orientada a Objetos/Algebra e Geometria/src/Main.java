import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Inicializando o Scanner

        Scanner dado = new Scanner(System.in);

        //Inicializando a Classe LinearAlgebra

        LinearAlgebra operador = new LinearAlgebra();

        //Inicializando as Matrizes

        Matrix m1, m2;

        //Inicializando os Vetores

        Vector v1, v2;

        //Inicializando o escalar

        double escalar;

        //Definindo a Matriz 1

        System.out.print("Digite o número de linhas da Matriz 1: ");

        int linhas1 = dado.nextInt();

        System.out.print("Digite o número de colunas da Matriz 1: ");

        int colunas1 = dado.nextInt();

        System.out.println("Insira os elementos da Matriz 1: ");

        double elementos1[][] = new double[linhas1][colunas1];

        for(int i = 0; i < linhas1; i++){

            for(int j = 0; j < colunas1; j++){

                elementos1[i][j] = dado.nextDouble();

            }

        }

        m1 = new Matrix(linhas1, colunas1, elementos1);

        //Mostrando a Matriz 1

        System.out.println("Matriz 1: ");

        System.out.println();

        m1.showMatrix();

        System.out.println();

        //Definindo a Matriz 2

        System.out.print("Digite o número de linhas da Matriz 2: ");

        int linhas2 = dado.nextInt();

        System.out.print("Digite o número de colunas da Matriz 2: ");

        int colunas2 = dado.nextInt();

        System.out.println("Insira os elementos da Matriz 2: ");

        double elementos2[][] = new double[linhas2][colunas2];

        for(int i = 0; i < linhas2; i++){

            for(int j = 0; j < colunas2; j++){

                elementos2[i][j] = dado.nextDouble();

            }

        }

        m2 = new Matrix(linhas2, colunas2, elementos2);

        //Mostrando a Matriz 2

        System.out.println("Matriz 2: ");

        System.out.println();

        m2.showMatrix();

        System.out.println();

        //Definindo o Vetor 1

        System.out.print("Insira a dimensão do vetor 1: ");

        int dim1 = dado.nextInt();

        System.out.println("Insira os elementos do vetor 1: ");

        double[]elementosv1 = new double[dim1];

        for(int i = 0; i < dim1; i++) {

            elementosv1[i] = dado.nextDouble();

        }

        v1 = new Vector(dim1, elementosv1);

        //Mostrando o Vetor 1

        System.out.println("Vetor 1: ");

        System.out.println();

        v1.showVector();

        System.out.println();

        //Definindo o Vetor 2

        System.out.print("Insira a dimensão do vetor 2: ");

        int dim2 = dado.nextInt();

        System.out.println("Insira os elementos do vetor 2: ");

        double[]elementosv2 = new double[dim2];

        for(int i = 0; i < dim2; i++) {

            elementosv2[i] = dado.nextDouble();

        }

        v2 = new Vector(dim2, elementosv2);

        //Mostrando o Vetor 2

        System.out.println("Vetor 2: ");

        System.out.println();

        v2.showVector();

        System.out.println();

        //Definindo o Escalar

        System.out.print("Insira o escalar: ");

        escalar = dado.nextDouble();

        System.out.println();

        //Mostrando o Escalar

        System.out.println("Escalar: " + escalar);

        System.out.println();

        ListaObjetos lista = new ListaObjetos(m1, m2, v1, v2, escalar);

        Operacao op;

        String elemento1, tipo, elemento2;

        int controle = 1;

        while(controle != 0){

            System.out.println("Digite o primeiro elemento: ");

            elemento1 = dado.nextLine();

            System.out.println("Digite a operação: " + elemento1);

            tipo = dado.nextLine();

            System.out.println("Digite o segundo elemento: ");

            elemento2 = dado.nextLine();

            op = new Operacao(lista, elemento1, tipo, elemento2);

        }

    }

}