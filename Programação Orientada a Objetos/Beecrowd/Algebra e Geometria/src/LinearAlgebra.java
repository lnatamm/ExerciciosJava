public class LinearAlgebra {

    public void transpose(Matrix m) {

        double[][] elementos = new double[m.getColunas()][m.getLinhas()];

        for(int i = 0; i < m.getColunas(); i++){

            for(int j = 0; j < m.getLinhas(); j++){

                elementos[i][j] = m.getElemento(j, i);

            }

        }

        Matrix mt = new Matrix(m.getColunas(), m.getLinhas(), elementos);

        mt.showMatrix();

    }

    public void transpose(Vector v){

        double[][] elementos = new double[v.getDim()][1];

        for(int i = 0; i < v.getDim(); i++){

            elementos[i][0] = v.getElemento(i);

        }

        Matrix m = new Matrix(v.getDim(), 1, elementos);

        m.showMatrix();

    }

    public void sum(Matrix m1, Matrix m2) {

        if(m1.getLinhas() != m2.getLinhas() || m1.getColunas() != m2.getColunas()) System.out.println("Soma Impossível");

        else {

            int linhas = m1.getLinhas();

            int colunas = m1.getColunas();

            double[][] elementos = new double[m1.getLinhas()][m1.getColunas()];

            for(int i = 0; i < m1.getLinhas(); i++){

                for(int j = 0; j < m1.getColunas(); j++){

                    elementos[i][j] = m1.getElemento(i, j) + m2.getElemento(i, j);

                }

            }

            Matrix r = new Matrix(m1.getLinhas(), m1.getColunas(), elementos);

            r.showMatrix();

        }

    }

    public void sum(Vector v, Matrix m) {

        if(v.getDim() != m.getColunas() || m.getLinhas() > 1) System.out.println("Soma Impossível");

        else {

            int linhas = 1;

            int colunas = v.getDim();

            double[][] elementos = new double[linhas][colunas];

            for(int j = 0; j < colunas; j++){

                elementos[0][j] = v.getElemento(j) + m.getElemento(0, j);

            }

            Matrix r = new Matrix(linhas, colunas, elementos);

            r.showMatrix();

        }

    }

    public void sum(Matrix m, Vector v) {

        if(v.getDim() != m.getColunas() || m.getLinhas() > 1) System.out.println("Soma Impossível");

        else {

            int linhas = 1;

            int colunas = v.getDim();

            double[][] elementos = new double[linhas][colunas];

            for(int j = 0; j < colunas; j++){

                elementos[0][j] = v.getElemento(j) + m.getElemento(0, j);

            }

            Matrix r = new Matrix(linhas, colunas, elementos);

            r.showMatrix();

        }

    }

    public void sum(Vector v1, Vector v2){

        int dim = v1.getDim();

        double[] elementos = new double[dim];

        for(int i = 0; i < dim; i++){

            elementos[i] = v1.getElemento(1) + v2.getElemento(1);

        }

        Vector v = new Vector(dim, elementos);

        v.showVector();

    }


    public void times(double n, Matrix m) {

        double[][] elementos = new double[m.getLinhas()][m.getColunas()];

        for(int i = 0; i < m.getLinhas(); i++){

            for(int j = 0; j < m.getColunas(); j++){

                elementos[i][j] = m.getElemento(i, j) * n;

            }

        }

        Matrix r = new Matrix(m.getLinhas(), m.getColunas(), elementos);

        r.showMatrix();

    }

    public void times(Matrix m, double n) {

        double[][] elementos = new double[m.getLinhas()][m.getColunas()];

        for(int i = 0; i < m.getLinhas(); i++){

            for(int j = 0; j < m.getColunas(); j++){

                elementos[i][j] = m.getElemento(i, j) * n;

            }

        }

        Matrix r = new Matrix(m.getLinhas(), m.getColunas(), elementos);

        r.showMatrix();

    }

    public void times(double n, Vector v) {

        double[] elementos = new double[v.getDim()];

        for(int i = 0; i < v.getDim(); i++) {

            elementos[i] = v.getElemento(i) * n;

        }

        Vector r = new Vector(v.getDim(), elementos);

        r.showVector();

    }

    public void times(Vector v, double n) {

        double[] elementos = new double[v.getDim()];

        for(int i = 0; i < v.getDim(); i++) {

            elementos[i] = v.getElemento(i) * n;

        }

        Vector r = new Vector(v.getDim(), elementos);

        r.showVector();

    }

    public void times(Matrix m1, Matrix m2) {

        if(m1.getLinhas() != m2.getLinhas() || m1.getColunas() != m2.getColunas()) System.out.println("Multiplicação Impossível");

        else {

            int linhas = m1.getLinhas();

            int colunas = m1.getColunas();

            double[][] elementos = new double[linhas][colunas];

            for(int i = 0; i < linhas; i++){

                for(int j = 0; j < colunas; j++){

                    elementos[i][j] = m1.getElemento(i, j) * m2.getElemento(i, j);

                }

            }

            Matrix r = new Matrix(linhas, colunas, elementos);

            r.showMatrix();

        }

    }

    public void times(Matrix m, Vector v) {

        if(m.getColunas() != v.getDim() || m.getLinhas() > 1) System.out.println("Multiplicação Impossível");

        else {

            int dim = v.getDim();

            double[] elementos = new double[dim];

            for(int i = 0; i < dim; i++){

                elementos[i]= m.getElemento(0, i) * v.getElemento(i);

            }

            Vector r = new Vector(dim, elementos);

            r.showVector();

        }

    }

    public void times(Vector v, Matrix m) {

        if(m.getColunas() != v.getDim() || m.getLinhas() > 1) System.out.println("Multiplicação Impossível");

        else {

            int dim = v.getDim();

            double[] elementos = new double[dim];

            for(int i = 0; i < dim; i++) {

                elementos[i] = v.getElemento(i) * m.getElemento(0, i);

            }

            Vector r = new Vector(dim, elementos);

            r.showVector();

        }

    }

    public void times(Vector v1, Vector v2) {

        if(v1.getDim() != v2.getDim()) System.out.println("Multiplicação Impossível");

        else{

            int dim = v1.getDim();

            double[] elementos = new double[dim];

            for(int i = 0; i < dim; i++) {

                elementos[i] = v1.getElemento(i) * v2.getElemento(i);

            }

            Vector r = new Vector(dim, elementos);

            r.showVector();

        }

    }

    public void dot(Matrix m1, Matrix m2) {

        if(m1.getColunas() != m2.getLinhas()) System.out.print("Multiplicação Impossível");

        else {

            int linhas = m1.getLinhas();

            int colunas = m2.getColunas();

            double[][] elementos = new double[linhas][colunas];

            double soma;

            for(int i = 0; i < linhas; i++) {

                for(int j = 0; j < linhas; j++) {

                    soma = 0;

                    for(int jj = 0; jj < m1.getColunas(); jj++) {

                        soma += m1.getElemento(i, jj) * m2.getElemento(jj, j);

                    }

                    elementos[i][j] = soma;

                }

            }

            Matrix r = new Matrix(linhas, colunas, elementos);

            r.showMatrix();

        }

    }

    public void dot(Matrix m, Vector v) {

        if(m.getColunas() > 1) System.out.println("Multiplicação Impossível");

        else {

            int linhas = m.getLinhas();

            int colunas = v.getDim();

            double[][] elementos = new double[linhas][colunas];

            for(int i = 0; i < linhas; i++) {

                for(int j = 0; j < colunas; j++) {

                    elementos[i][j] = m.getElemento(i, 0) * v.getElemento(j);

                }

            }

            Matrix r = new Matrix(linhas, colunas, elementos);

            r.showMatrix();

        }

    }

    public void dot(Vector v, Matrix m) {

        if(v.getDim()!= m.getLinhas()) System.out.println("Multiplicação Impossível");

        else {

			/*
						[1]
			[1 2 3 4] 	[2]     [A[0][0] * B[0][0] + A[0][1] * B[1][0] + A[0][2] * B[2][0]]
						[3]

			*/

            int linhas = 1;

            int colunas = m.getColunas();

            double[][] elementos = new double[linhas][colunas];

            double soma;

            for(int j = 0; j < colunas; j++) {

                soma = 0;

                for(int jj = 0; jj < v.getDim(); jj++) {

                    soma += v.getElemento(jj) * m.getElemento(jj, j);

                }

                elementos[0][j] = soma;

            }

            Matrix r = new Matrix(linhas, colunas, elementos);

            r.showMatrix();

        }

    }

    public void gauss(Matrix m) {

        double gaussReducedMatrix[][] = new double[m.getLinhas()][m.getColunas()];

        double div;

        double mul = 1;

        int linhaI = 0;

        for (int i = 0; i < m.getLinhas(); i++) {

            for (int j = 0; j < m.getColunas(); j++) {

                if(i == j && m.getElemento(i, j) != 1) {

                    if(i == 0) {

                        div = m.getElemento(i, j);

                        for(int jj = j; jj < m.getColunas(); jj++) {

                            gaussReducedMatrix[i][jj] = m.getElemento(i, jj) / div;
                        }

                    }
                    else {

                        div = gaussReducedMatrix[i][j];

                        for(int jj = j; jj < m.getColunas(); jj++) {

                            gaussReducedMatrix[i][jj] = gaussReducedMatrix[i][jj] / div;

                        }

                    }

                    j = m.getColunas() - 1;

                }

                else if(i > j && m.getElemento(i, j) != 0) {

                    if(j == 0) {

                        mul = m.getElemento(i, j);

                        for(int linha = i - 1; linha >= 0; linha--) {

                            if(gaussReducedMatrix[linha][j] == 1) {

                                linhaI = linha;

                                break;

                            }

                        }

                        for(int jj = j; jj < m.getColunas(); jj++) {

                            gaussReducedMatrix[i][jj] = m.getElemento(i, jj) - (mul * gaussReducedMatrix[linhaI][jj]);

                        }

                    }
                    else {

                        mul = gaussReducedMatrix[i][j];

                        for(int row = i - 1; row >= 0; row--) {

                            if(gaussReducedMatrix[row][j] == 1) {

                                linhaI = row;

                                break;

                            }

                        }

                        for(int jj = j; jj < m.getColunas(); jj++) {

                            gaussReducedMatrix[i][jj] = gaussReducedMatrix[i][jj] - (mul * gaussReducedMatrix[linhaI][jj]);

                        }

                    }

                }

                else {

                    gaussReducedMatrix[i][j] = m.getElemento(i, j);

                }

            }

        }

        Matrix mg = new Matrix(m.getLinhas(), m.getColunas(), gaussReducedMatrix);

        mg.showMatrix();

    }

    public void solve(Matrix m) {

        int rowIndex = 0;

        double multiplicador = 1;

        double divisor;

        double ampliedArray[][] = new double[m.getLinhas()][m.getColunas()];

        for (int i = 0; i < m.getLinhas(); i++) {

            for (int j = 0; j < m.getColunas() - 1; j++) {

                if(i == j && m.getElemento(i, j) != 1) {

                    if(i == 0) {

                        divisor = m.getElemento(i, j);

                        for(int k = j; k < m.getColunas(); k++) {

                            ampliedArray[i][k] = m.getElemento(i, k) / divisor;

                        }

                    }
                    else {

                        divisor = ampliedArray[i][j];

                        for(int k = j; k < m.getColunas(); k++) {

                            ampliedArray[i][k] = ampliedArray[i][k] / divisor;

                        }

                    }

                    j = m.getColunas() - 1;

                }

                else if(i > j && m.getElemento(i, j) != 0) {

                    if(j == 0) {

                        multiplicador = m.getElemento(i, j);

                        for(int row = i - 1; row >= 0; row--) {

                            if(ampliedArray[row][j] == 1) {

                                rowIndex = row;

                                break;

                            }

                        }

                        for(int k = j; k < m.getColunas(); k++) {

                            ampliedArray[i][k] = m.getElemento(i, k) - (multiplicador * ampliedArray[rowIndex][k]);

                        }

                    }
                    else {

                        multiplicador = ampliedArray[i][j];

                        for(int row = i - 1; row >= 0; row--) {

                            if(ampliedArray[row][j] == 1) {

                                rowIndex = row;

                                break;

                            }

                        }

                        for(int k = j; k < m.getColunas(); k++)

                            ampliedArray[i][k] = ampliedArray[i][k] - (multiplicador * ampliedArray[rowIndex][k]);

                    }

                }

                else {

                    ampliedArray[i][j] = m.getElemento(i, j);

                }

            }

        }

        for(int i = m.getLinhas() - 1; i >= 0; i--) {

            for(int j = m.getColunas() - 2; j >= 0; j--) {

                if(j > i && m.getElemento(i, j) != 0) {

                    multiplicador = ampliedArray[i][j];

                    for(int row = i + 1; row < m.getLinhas(); row++) {

                        if(ampliedArray[row][j] == 1) {

                            rowIndex = row;

                            break;

                        }

                    }

                    for(int k = m.getColunas() - 1; k >= 0; k--) {

                        ampliedArray[i][k] = ampliedArray[i][k] - (multiplicador * ampliedArray[rowIndex][k]);

                    }

                }

            }

        }

        Matrix ms = new Matrix(m.getLinhas(), m.getColunas(), ampliedArray);

        ms.showMatrix();

    }

}