public class Matrix {

    private int linhas;

    private int colunas;

    private double[][] elementos;

    public Matrix(int linhas, int colunas, double[][] elementos){

        this.linhas = linhas;

        this.colunas = colunas;

        this.elementos = new double[this.linhas][this.colunas];

        for(int i = 0; i < this.linhas; i++){

            for(int j = 0; j < this.colunas; j++){

                this.elementos[i][j] = elementos[i][j];

            }

        }

    }

    public void setLinhas(int linhas) {

        this.linhas = linhas;

    }

    public void setColunas(int colunas) {

        this.colunas = colunas;

    }

    public void setElemento(int linha, int coluna, double elemento) {

        this.elementos[linha][coluna] = elemento;

    }

    public int getLinhas() {

        return this.linhas;

    }

    public int getColunas() {

        return this.colunas;

    }

    public double[][] getElementos(){

        return this.elementos;

    }

    public double getElemento(int linha, int coluna) {

        return this.elementos[linha][coluna];

    }

    public void showMatrix(){

        int i, j;

        for(i = 0; i < this.linhas; i++){

            System.out.print("[");

            for(j = 0; j < this.colunas - 1; j++){

                System.out.printf("%.1f ", this.elementos[i][j]);

            }

            System.out.printf("%.1f]\n", this.elementos[i][j]);

        }

    }

}