import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Operador op;

        ArrayList<Matrix> matrizes = new ArrayList<Matrix>();

        ArrayList<Vector> vetores = new ArrayList<Vector>();

        double escalar;

        System.out.println("Quantas matrizes deseja criar?");

        int n = Integer.parseInt(sc.next());

        for(int i = 0; i < n; i++){

            System.out.print("Insira o número de linhas da matriz: ");

            int linhas = Integer.parseInt(sc.next());

            System.out.print("Insira o número de colunas da matriz: ");

            int colunas = Integer.parseInt(sc.next());

            System.out.println("Insira os elementos da matriz: ");

            double[][] elementos = new double[linhas][colunas];

            for(int ii = 0; ii < linhas; ii++){

                for(int j = 0; j < colunas; j++){

                    elementos[ii][j] = Double.parseDouble(sc.next());

                }

            }

            Matrix matrix = new Matrix(linhas, colunas, elementos);

            matrizes.add(matrix);

        }

        System.out.println("Quantos vetores deseja criar?");

        n = Integer.parseInt(sc.next());

        for(int i = 0; i < n; i++){

            System.out.print("Insira a dimensão do vetor: ");

            int dim = Integer.parseInt(sc.next());

            System.out.println("Insira os elementos do vetor: ");

            double[][] elementos = new double[dim][1];

            for(int ii = 0; ii < dim; ii++){

                for(int j = 0; j < 1; j++){

                    elementos[ii][j] = Double.parseDouble(sc.next());

                }

            }

            Vector vector = new Vector(dim, elementos);

            vetores.add(vector);

        }

        System.out.println("Insira o escalar: ");

        escalar = Double.parseDouble(sc.next());

        System.out.println("Operações:");

        System.out.println();

        System.out.println("Operações de Matrizes e Vetores:");

        System.out.println();

        System.out.println("Transpose: Transpõe uma Matriz ou Vetor");

        System.out.println("Sum: Soma de uma Matriz ou Vetor com outra Matriz ou Vetor");

        System.out.println("Times: Multiplicação(elemento a elemento) de uma Matriz, Vetor ou Escalar por uma Matriz ou Vetor");

        System.out.println("Dot: Multiplicação de uma Matriz ou Vetor por uma Matriz ou Vetor");

        System.out.println("Gauss: Redução Gaussiana de uma Matriz");

        System.out.println("Solve: Solução de uma Matriz");

        System.out.println();

        System.out.println("Transformações Lineares:");

        System.out.println();

        System.out.println("Translate2D : Translação de um vetor (IR²) em (x, y)");

        System.out.println("Translate3D : Translação de um vetor (IR³) em (x, y, z)");

        System.out.println("Rotate2D : Rotação de um vetor (IR²) em x°(graus) em torno do eixo Z");

        System.out.println("Rotate3DX : Rotação de um vetor (IR³) em x°(graus) em torno do eixo X");

        System.out.println("Rotate3DY : Rotação de um vetor (IR³) em x°(graus) em torno do eixo Y");

        System.out.println("Rotate3DZ : Rotação de um vetor (IR³) em x°(graus) em torno do eixo Z");

        System.out.println("Reflect2DX : Reflexão de um vetor (IR²) em torno do eixo X");

        System.out.println("Reflect2DY : Reflexão de um vetor (IR²) em torno do eixo Y");

        System.out.println("Reflect3DX : Reflexão de um vetor (IR³) em torno do eixo X");

        System.out.println("Reflect3DY : Reflexão de um vetor (IR³) em torno do eixo Y");

        System.out.println("Reflect3DZ : Reflexão de um vetor (IR³) em torno do eixo Z");

        System.out.println("Project2DX : Projeção de um vetor (IR²) no eixo X");

        System.out.println("Project2DY : Projeção de um vetor (IR²) no eixo Y");

        System.out.println("Project3DX : Projeção de um vetor (IR³) no eixo X");

        System.out.println("Project3DY : Projeção de um vetor (IR³) no eixo Y");

        System.out.println("Project3DZ : Projeção de um vetor (IR³) no eixo Z");

        System.out.println("Shear: Cisalhamento de um vetor (IR²) em x vezes Y(X) e y vezes X(Y)");

        System.out.println();

        System.out.println("Matrizes:");

        System.out.println();

        for(int i = 0; i < matrizes.size(); i++){

            System.out.println("Matriz" + (i + 1) + ": ");

            matrizes.get(i).show();

            System.out.println();

        }

        System.out.println("Vetores:");

        System.out.println();

        for(int i = 0; i < vetores.size(); i++){

            System.out.println("Vetor" + (i + 1) + ": ");

            vetores.get(i).show();

            System.out.println();

        }

        int controle = 1;

        while(controle == 1){

            op = new Operador(matrizes, vetores, escalar);

            System.out.println("O que deseja fazer?");

            op.pedido(sc.next());

            System.out.println("Deseja continuar? Sim(1) Não(!1)");

            controle = Integer.parseInt(sc.next());

        }

    }

}