public class Transformations {

    private LinearAlgebra op = new LinearAlgebra();

    private Matrix transformationMatix;

    public void translate2D(Vector vector, double dx, double dy){

        defineTranslation2DMatrix(dx, dy);

        vector = defineHomogeneousCoordinates(vector);

        System.out.println("Vetor Transladado(ponto de origem: (" + dx +", " + dy + "):");

        op.dot(this.transformationMatix, vector);

    }

    public void translate3D(Vector vector, double dx, double dy, double dz){

        defineTranslation3DMatrix(dx, dy, dz);

        vector = defineHomogeneousCoordinates(vector);

        System.out.println("Vetor Transladado(ponto de origem: (" + dx +", " + dy + "," + dz + "):");

        op.dot(this.transformationMatix, vector);

    }

    public void rotation2D(Vector vector, double angle){

        defineRotation2DMatrix(angle);

        System.out.println("Vetor Rotacionado em " + angle + "°:");

        transformation(vector);

    }

    public void rotation3DX(Vector vector, double angle){

        defineRotation3DXMatrix(angle);

        System.out.println("Vetor Rotacionado em torno do eixo X em " + angle + "°:");

        transformation(vector);

    }

    public void rotation3DY(Vector vector, double angle){

        defineRotation3DYMatrix(angle);

        System.out.println("Vetor Rotacionado em torno do eixo Y em " + angle + "°:");

        transformation(vector);

    }

    public void rotation3DZ(Vector vector, double angle){

        defineRotation3DZMatrix(angle);

        System.out.println("Vetor Rotacionado em torno do eixo Z em " + angle + "°:");

        transformation(vector);

    }

    public void reflection2DX(Vector vector){

        defineReflection2DXMatrix();

        System.out.println("Vetor Refletido no eixo X:");

        transformation(vector);

    }

    public void reflection2DY(Vector vector){

        defineReflection2DYMatrix();

        System.out.println("Vetor Refletido no eixo Y:");

        transformation(vector);

    }

    public void reflection3DX(Vector vector){

        defineReflection3DXMatrix();

        System.out.println("Vetor Refletido no eixo X:");

        transformation(vector);

    }

    public void reflection3DY(Vector vector){

        defineReflection3DYMatrix();

        System.out.println("Vetor Refletido no eixo Y:");

        transformation(vector);

    }

    public void reflection3DZ(Vector vector){

        defineReflection3DZMatrix();

        System.out.println("Vetor Refletido no eixo Z:");

        transformation(vector);

    }

    public void projection2DX(Vector vector){

        defineProjection2DXMatrix();

        System.out.println("Vetor Projetado no eixo X:");

        transformation(vector);

    }

    public void projection2DY(Vector vector){

        defineProjection2DYMatrix();

        System.out.println("Vetor Refletido no eixo Y:");

        transformation(vector);

    }

    public void projection3DX(Vector vector){

        defineProjection3DXMatrix();

        System.out.println("Vetor Refletido no eixo X:");

        transformation(vector);

    }

    public void projection3DY(Vector vector){

        defineProjection3DYMatrix();

        System.out.println("Vetor Refletido no eixo Y:");

        transformation(vector);

    }

    public void projection3DZ(Vector vector){

        defineProjection3DZMatrix();

        System.out.println("Vetor Refletido no eixo Z:");

        transformation(vector);

    }

    public void shearing(Vector vector, double kx, double ky){

        defineShearMatrix(kx, ky);

        System.out.println("Vetor Cisalhado em (" + kx + "*Y, " + ky +"*X):");

        transformation(vector);

    }

    private void defineTranslation2DMatrix(double dx, double dy){

        double[][] elementos = new double[3][3];

        elementos[0][0] = 1;

        elementos[0][1] = 0;

        elementos[0][2] = dx;

        elementos[1][0] = 0;

        elementos[1][1] = 1;

        elementos[1][2] = dy;

        elementos[2][0] = 0;

        elementos[2][1] = 0;

        elementos[2][2] = 1;

        this.transformationMatix = new Matrix(3, 3, elementos);

    }

    private void defineTranslation3DMatrix(double dx, double dy, double dz){

        double[][] elementos = new double[4][4];

        elementos[0][0] = 1;

        elementos[0][1] = 0;

        elementos[0][2] = 0;

        elementos[0][3] = dx;

        elementos[1][0] = 0;

        elementos[1][1] = 1;

        elementos[1][2] = 0;

        elementos[1][3] = dy;

        elementos[2][0] = 0;

        elementos[2][1] = 0;

        elementos[2][2] = 1;

        elementos[2][3] = dz;

        elementos[3][0] = 0;

        elementos[3][1] = 0;

        elementos[3][2] = 0;

        elementos[3][3] = 1;

        this.transformationMatix = new Matrix(4, 4, elementos);

    }

    private void defineRotation2DMatrix(double angle){

        double[][] elementos = new double[2][2];

        angle = Math.toRadians(angle);

        elementos[0][0] = Math.cos(angle);

        elementos[0][1] = -Math.sin(angle);

        elementos[1][0] = Math.sin(angle);

        elementos[1][1] = Math.cos(angle);

        this.transformationMatix = new Matrix(2, 2, elementos);

    }

    private void defineRotation3DXMatrix(double angle){

        double[][] elementos = new double[3][3];

        angle = Math.toRadians(angle);

        elementos[0][0] = 1;

        elementos[0][1] = 0;

        elementos[0][2] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = Math.cos(angle);

        elementos[1][2] = Math.sin(angle);

        elementos[2][0] = 0;

        elementos[2][1] = -Math.sin(angle);

        elementos[2][2] = Math.cos(angle);

        this.transformationMatix = new Matrix(3, 3, elementos);

    }

    private void defineRotation3DYMatrix(double angle){

        double[][] elementos = new double[3][3];

        angle = Math.toRadians(angle);

        elementos[0][0] = Math.cos(angle);

        elementos[0][1] = 0;

        elementos[0][2] = -Math.sin(angle);

        elementos[1][0] = 0;

        elementos[1][1] = 1;

        elementos[1][2] = 0;

        elementos[2][0] = Math.sin(angle);

        elementos[2][1] = 0;

        elementos[2][2] = Math.cos(angle);

        this.transformationMatix = new Matrix(3, 3, elementos);

    }

    private void defineRotation3DZMatrix(double angle){

        double[][] elementos = new double[3][3];

        angle = Math.toRadians(angle);

        elementos[0][0] = Math.cos(angle);

        elementos[0][1] = -Math.sin(angle);

        elementos[0][2] = 0;

        elementos[1][0] = Math.sin(angle);

        elementos[1][1] = Math.cos(angle);

        elementos[1][2] = 0;

        elementos[2][0] = 0;

        elementos[2][1] = 0;

        elementos[2][2] = 1;

        this.transformationMatix = new Matrix(3, 3, elementos);

    }

    private void defineReflection2DXMatrix(){

        double[][] elementos = new double[2][2];

        elementos[0][0] = 1;

        elementos[0][1] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = -1;

        this.transformationMatix = new Matrix(2, 2, elementos);

    }

    private void defineReflection2DYMatrix(){

        double[][] elementos = new double[2][2];

        elementos[0][0] = -1;

        elementos[0][1] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = 1;

        this.transformationMatix = new Matrix(2, 2, elementos);

    }

    private void defineReflection3DXMatrix(){

        double[][] elementos = new double[3][3];

        elementos[0][0] = 1;

        elementos[0][1] = 0;

        elementos[0][2] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = 1;

        elementos[1][2] = 0;

        elementos[2][0] = 0;

        elementos[2][1] = 0;

        elementos[2][2] = -1;

        this.transformationMatix = new Matrix(3, 3, elementos);

    }

    private void defineReflection3DYMatrix(){

        double[][] elementos = new double[3][3];

        elementos[0][0] = -1;

        elementos[0][1] = 0;

        elementos[0][2] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = 1;

        elementos[1][2] = 0;

        elementos[2][0] = 0;

        elementos[2][1] = 0;

        elementos[2][2] = 1;

        this.transformationMatix = new Matrix(3, 3, elementos);

    }

    private void defineReflection3DZMatrix(){

        double[][] elementos = new double[3][3];

        elementos[0][0] = 1;

        elementos[0][1] = 0;

        elementos[0][2] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = -1;

        elementos[1][2] = 0;

        elementos[2][0] = 0;

        elementos[2][1] = 0;

        elementos[2][2] = 1;

        this.transformationMatix = new Matrix(3, 3, elementos);

    }

    private void defineProjection2DXMatrix(){

        double[][] elementos = new double[2][2];

        elementos[0][0] = 1;

        elementos[0][1] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = 0;

        this.transformationMatix = new Matrix(2, 2, elementos);

    }

    private void defineProjection2DYMatrix(){

        double[][] elementos = new double[2][2];

        elementos[0][0] = 0;

        elementos[0][1] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = 1;

        this.transformationMatix = new Matrix(2, 2, elementos);

    }

    private void defineProjection3DXMatrix(){

        double[][] elementos = new double[3][3];

        elementos[0][0] = 1;

        elementos[0][1] = 0;

        elementos[0][2] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = 0;

        elementos[1][2] = 0;

        elementos[2][0] = 0;

        elementos[2][1] = 0;

        elementos[2][2] = 0;

        this.transformationMatix = new Matrix(3, 3, elementos);

    }

    private void defineProjection3DYMatrix(){

        double[][] elementos = new double[3][3];

        elementos[0][0] = 0;

        elementos[0][1] = 0;

        elementos[0][2] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = 1;

        elementos[1][2] = 0;

        elementos[2][0] = 0;

        elementos[2][1] = 0;

        elementos[2][2] = 0;

        this.transformationMatix = new Matrix(3, 3, elementos);

    }

    private void defineProjection3DZMatrix(){

        double[][] elementos = new double[3][3];

        elementos[0][0] = 0;

        elementos[0][1] = 0;

        elementos[0][2] = 0;

        elementos[1][0] = 0;

        elementos[1][1] = 0;

        elementos[1][2] = 0;

        elementos[2][0] = 0;

        elementos[2][1] = 0;

        elementos[2][2] = 1;

        this.transformationMatix = new Matrix(3, 3, elementos);

    }

    private void defineShearMatrix(double kx, double ky){

        double[][] elementos = new double[2][2];

        elementos[0][0] = 1;

        elementos[0][1] = kx;

        elementos[1][0] = ky;

        elementos[1][1] = 1;

        this.transformationMatix = new Matrix(2, 2, elementos);

    }

    public Matrix defineHomogeneousCoordinates(Matrix matrix){

        int linhas = matrix.getLinhas() + 1;

        int colunas = matrix.getColunas() + 1;

        double[][] elementos = new double[linhas][colunas];

        for(int i = 0; i < linhas; i++){

            for(int j = 0; j < colunas; j++){

                elementos[i][j] = 0;

            }

        }

        for(int i = 0; i < matrix.getLinhas(); i++){

            for(int j = 0; j < matrix.getColunas(); j++){

                elementos[i][j] = matrix.get(i, j);

            }

        }

        elementos[matrix.getLinhas()][matrix.getColunas()] = 1;

        Matrix homogeneousMatrix = new Matrix(linhas, colunas, elementos);

        return homogeneousMatrix;

    }

    private Vector defineHomogeneousCoordinates(Vector vector){

        int dim = vector.getDim() + 1;

        double[][] elementos = new double[dim][1];

        for(int i = 0; i < vector.getDim(); i++){

            elementos[i][0] = vector.get(i);

        }

        elementos[vector.getDim()][0] = 1;

        Vector homogeneousVector = new Vector(dim, elementos);

        return homogeneousVector;

    }

    private void transformation(Vector vector){

        this.transformationMatix = defineHomogeneousCoordinates(this.transformationMatix);

        vector = defineHomogeneousCoordinates(vector);

        op.dot(this.transformationMatix, vector);

    }

}