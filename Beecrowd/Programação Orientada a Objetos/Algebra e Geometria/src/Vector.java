public class Vector {

    private int dim;

    private double[] elementos;

    public Vector(int dim, double[] elementos) {

        this.dim = dim;

        this.elementos = new double[dim];

        for(int i = 0; i < dim; i++) {

            this.elementos[i] = elementos[i];

        }

    }

    public void setDim(int dim) {

        this.dim = dim;

    }

    public void setElemento(int i, double elemento) {

        this.elementos[i] = elemento;

    }

    public int getDim() {

        return this.dim;

    }

    public double getElemento(int i) {

        return this.elementos[i];

    }

    public double[] getElementos() {

        return this.elementos;

    }

    public void showVector() {

        int i;

        System.out.print("[");

        for(i = 0; i < this.dim - 1; i++) {

            System.out.printf("%.1f ", this.elementos[i]);

        }

        System.out.printf("%.1f]\n", this.elementos[i]);

    }

}