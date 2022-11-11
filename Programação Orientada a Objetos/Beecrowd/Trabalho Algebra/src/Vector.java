public class Vector extends Matrix{

    private int dim;

    public Vector(int dim, double[][] elementos){

        super(dim, 1, elementos);

        this.dim = dim;

    }

    public int getDim(){

        return this.dim;

    }

    public void setDim(int dim){

        this.dim = dim;

    }

    public double get(int i){

        return this.get(i, 0);

    }

    public void set(int i, double elemento){

        this.set(i, 0, elemento);

    }

}