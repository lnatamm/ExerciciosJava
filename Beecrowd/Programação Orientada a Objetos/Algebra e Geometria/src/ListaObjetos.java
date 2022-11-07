
public class ListaObjetos {

    private Matrix m1;

    private Matrix m2;

    private Vector v1;

    private Vector v2;

    private double e;

    private Matrix matrizes[] = new Matrix[2];

    private Vector vectors[] = new Vector[2];

    private double escalar[] = new double[1];

    public ListaObjetos(Matrix m1, Matrix m2, Vector v1, Vector v2, double e) {

        this.m1 = new Matrix(m1.getLinhas(), m1.getColunas(), m1.getElementos());

        this.m2 = new Matrix(m1.getLinhas(), m1.getColunas(), m1.getElementos());

        this.v1 = new Vector(v1.getDim(), v1.getElementos());

        this.v2 = new Vector(v2.getDim(), v2.getElementos());

        this.e = e;

        this.matrizes[0] = this.m1;

        this.matrizes[1] = this.m2;

        this.vectors[0] = this.v1;

        this.vectors[1] = this.v2;

        this.escalar[0] = this.e;

    }

    public Matrix getMatriz(int i) {

        return this.matrizes[i];

    }

    public Vector getVector(int i) {

        return this.vectors[i];

    }

    public double getEscalar() {

        return this.escalar[0];

    }

    public void setMatriz(int i, Matrix m) {

        this.matrizes[i] = m;

    }

    public void setVector(int i, Vector v) {

        this.vectors[i] = v;

    }

    public void setEscalar(double e) {

        this.escalar[0] = e;

    }

}
