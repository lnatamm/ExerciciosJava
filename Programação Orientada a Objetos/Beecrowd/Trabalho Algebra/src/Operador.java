import java.util.*;
public class Operador {

    private LinearAlgebra op = new LinearAlgebra();

    private Transformations t = new Transformations();

    private ArrayList<Matrix> matrizes;

    private ArrayList<Vector> vetores;

    private double escalar;

    private String operacao;

    public Operador(ArrayList<Matrix> matrizes, ArrayList<Vector> vetores, double escalar){

        this.matrizes = matrizes;

        this.vetores = vetores;

        this.escalar = escalar;

        this.operacao = "";

    }

    public String getOperacao(){

        return this.operacao;

    }

    public void setOperacao(String operacao){

        this.operacao = operacao;

    }

    public void pedido(String operacao){

        this.operacao = operacao;

        Scanner sc = new Scanner(System.in);

        if(this.operacao.equals("transpose") || this.operacao.equals("Transpose")){

            System.out.println("Qual matriz/vetor deseja transpor?");

            String tipo = sc.next();

            int numero = Integer.parseInt(sc.next());

            if(tipo.equals("Matriz") || tipo.equals("matriz")){

                operacao(this.operacao, this.matrizes.get(numero - 1));

            }

            if(tipo.equals("Vetor") || tipo.equals("vetor")){

                operacao(this.operacao, this.vetores.get(numero - 1));

            }

        }

        if(this.operacao.equals("sum") || this.operacao.equals("Sum")){

            System.out.println("Qual o primeiro elemento?");

            String tipo1 = sc.next();

            int numero1 = Integer.parseInt(sc.next());

            System.out.println("Qual o segundo elemento?");

            String tipo2 = sc.next();

            int numero2 = Integer.parseInt(sc.next());

            if(tipo1.equals("Matriz") || tipo1.equals("matriz")){

                if(tipo2.equals("Matriz") || tipo2.equals("matriz")){

                    operacao(this.matrizes.get(numero1 - 1), this.operacao, this.matrizes.get(numero2 - 1));

                }

                if(tipo2.equals("Vetor") || tipo2.equals("vetor")){

                    operacao(matrizes.get(numero1 - 1), this.operacao, this.vetores.get(numero2 - 1));

                }

            }

            if(tipo1.equals("Vetor") || tipo1.equals("vetor")){

                if(tipo2.equals("Matriz") || tipo2.equals("matriz")){

                    operacao(this.vetores.get(numero1 - 1), this.operacao, this.matrizes.get(numero2 - 1));

                }

                if(tipo2.equals("Vetor") || tipo2.equals("vetor")){

                    operacao(this.vetores.get(numero1 - 1), this.operacao, this.vetores.get(numero2 - 1));

                }

            }

        }

        if(this.operacao.equals("times") || this.operacao.equals("Times")){

            System.out.println("Qual o primeiro elemento?");

            String tipo1 = sc.next();

            if(tipo1.equals("Escalar") || tipo1.equals("escalar")){

                System.out.println("Qual o segundo elemento?");

                String tipo2 = sc.next();

                int numero2 = Integer.parseInt(sc.next());

                if(tipo2.equals("Matriz") || tipo2.equals("matriz")){

                    operacao(this.escalar, this.operacao, this.matrizes.get(numero2 - 1));

                }

                if(tipo2.equals("Vetor") || tipo2.equals("vetor")){

                    operacao(this.escalar, this.operacao, this.vetores.get(numero2 - 1));

                }

            }

            else {

                int numero1 = Integer.parseInt(sc.next());

                System.out.println("Qual o segundo elemento?");

                String tipo2 = sc.next();

                int numero2 = Integer.parseInt(sc.next());


                if (tipo1.equals("Matriz") || tipo1.equals("matriz")) {

                    if (tipo2.equals("Matriz") || tipo2.equals("matriz")) {

                        operacao(this.matrizes.get(numero1 - 1), this.operacao, this.matrizes.get(numero2 - 1));

                    }

                    if (tipo2.equals("Vetor") || tipo2.equals("vetor")) {

                        operacao(this.matrizes.get(numero1 - 1), this.operacao, this.vetores.get(numero2 - 1));

                    }

                    if (tipo2.equals("Escalar") || tipo2.equals("escalar")) {

                        System.out.println("Operação Inválida");

                    }

                }

                if (tipo1.equals("Vetor") || tipo1.equals("vetor")) {

                    if (tipo2.equals("Matriz") || tipo2.equals("matriz")) {

                        operacao(this.vetores.get(numero1 - 1), this.operacao, this.matrizes.get(numero2 - 1));

                    }

                    if (tipo2.equals("Vetor") || tipo2.equals("vetor")) {

                        operacao(this.vetores.get(numero1 - 1), this.operacao, this.vetores.get(numero2 - 1));

                    }

                    if (tipo2.equals("Escalar") || tipo2.equals("escalar")) {

                        System.out.println("Operação Inválida");

                    }

                }

            }

        }

        if(this.operacao.equals("dot") || this.operacao.equals("Dot")){

            System.out.println("Qual o primeiro elemento?");

            String tipo1 = sc.next();

            int numero1 = Integer.parseInt(sc.next());

            System.out.println("Qual o segundo elemento?");

            String tipo2 = sc.next();

            int numero2 = Integer.parseInt(sc.next());

            if(tipo1.equals("Matriz") || tipo1.equals("matriz")){

                if(tipo2.equals("Matriz") || tipo2.equals("matriz")){

                    operacao(this.matrizes.get(numero1 - 1), this.operacao, this.matrizes.get(numero2 - 1));

                }

                if(tipo2.equals("Vetor") || tipo2.equals("vetor")){

                    operacao(this.matrizes.get(numero1 - 1), this.operacao, this.vetores.get(numero2 - 1));

                }

            }

            if(tipo1.equals("Vetor") || tipo1.equals("vetor")){

                if(tipo2.equals("Matriz") || tipo2.equals("matriz")){

                    operacao(this.vetores.get(numero1 - 1), this.operacao, this.matrizes.get(numero2 - 1));

                }

                if(tipo2.equals("Vetor") || tipo2.equals("vetor")){

                    operacao(this.vetores.get(numero1 - 1), this.operacao, this.vetores.get(numero2 - 1));

                }

            }

        }

        if(this.operacao.equals("gauss") || this.operacao.equals("Gauss")){

            System.out.println("Qual matriz?");

            String tipo = sc.next();

            int numero = Integer.parseInt(sc.next());

            if(tipo.equals("Matriz") || tipo.equals("matriz")){

                operacao(this.operacao, this.matrizes.get(numero - 1));

            }

            else{

                System.out.println("Operacao Inválida");

            }

        }

        if(this.operacao.equals("solve") || this.operacao.equals("Solve")){

            System.out.println("Qual matriz?");

            String tipo = sc.next();

            int numero = Integer.parseInt(sc.next());

            if(tipo.equals("Matriz") || tipo.equals("matriz")){

                operacao(this.operacao, this.matrizes.get(numero - 1));

            }

            else{

                System.out.println("Operacao Inválida");

            }

        }

        if(this.operacao.equals("translate2D") || this.operacao.equals("Translate2D")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            System.out.println("Em quantas unidades em X?");

            double dx = Double.parseDouble(sc.next());

            System.out.println("Em quantas unidades em Y?");

            double dy = Double.parseDouble(sc.next());

            operacao(this.operacao, this.vetores.get(numero - 1), dx, dy);

        }

        if(this.operacao.equals("translate3D") || this.operacao.equals("Translate3D")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            System.out.println("Em quantas unidades em X?");

            double dx = Double.parseDouble(sc.next());

            System.out.println("Em quantas unidades em Y?");

            double dy = Double.parseDouble(sc.next());

            System.out.println("Em quantas unidade em Z?");

            double dz = Double.parseDouble(sc.next());

            operacao(this.operacao, this.vetores.get(numero - 1), dx, dy, dz);

        }

        if(this.operacao.equals("rotate2D") || this.operacao.equals("Rotate2D")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            System.out.println("Em quantos graus?");

            double angle = Double.parseDouble(sc.next());

            operacao(this.operacao, this.vetores.get(numero - 1), angle);

        }

        if(this.operacao.equals("rotate3DX") || this.operacao.equals("Rotate3DX")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            System.out.println("Em quantos graus?");

            double angle = Double.parseDouble(sc.next());

            operacao(this.operacao, this.vetores.get(numero - 1), angle);

        }

        if(this.operacao.equals("rotate3DY") || this.operacao.equals("Rotate3DY")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            System.out.println("Em quantos graus?");

            double angle = Double.parseDouble(sc.next());

            operacao(this.operacao, this.vetores.get(numero - 1), angle);

        }

        if(this.operacao.equals("rotate3DZ") || this.operacao.equals("Rotate3DZ")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            System.out.println("Em quantos graus?");

            double angle = Double.parseDouble(sc.next());

            operacao(this.operacao, this.vetores.get(numero - 1), angle);

        }

        if(this.operacao.equals("reflect2DX") || this.operacao.equals("Reflect2DX")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1));

        }

        if(this.operacao.equals("reflect2DY") || this.operacao.equals("Reflect2DY")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1));

        }

        if(this.operacao.equals("reflect3DX") || this.operacao.equals("Reflect3DX")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1));

        }

        if(this.operacao.equals("reflect3DY") || this.operacao.equals("Reflect3DY")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1));

        }

        if(this.operacao.equals("reflect3DZ") || this.operacao.equals("Reflect3DZ")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1));

        }

        if(this.operacao.equals("project2DX") || this.operacao.equals("Project2DX")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1));

        }

        if(this.operacao.equals("project2DY") || this.operacao.equals("Project2DY")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1));

        }

        if(this.operacao.equals("project3DX") || this.operacao.equals("Project3DX")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1));

        }

        if(this.operacao.equals("project3DY") || this.operacao.equals("Project3DY")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1));

        }

        if(this.operacao.equals("project3DZ") || this.operacao.equals("Project3DZ")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1));

        }

        if(this.operacao.equals("shear") || this.operacao.equals("Shear")){

            System.out.println("Qual vetor?");

            int numero = Integer.parseInt(sc.next());

            System.out.println("Em quantas vezes Y(X)?");

            double kx = Double.parseDouble(sc.next());

            System.out.println("Em quantas vezes X(Y)?");

            double ky = Double.parseDouble(sc.next());

            operacao(this.operacao, this.vetores.get(numero  - 1), kx, ky);

        }

    }

    private void operacao(String operacao, Matrix matrix){

        this.operacao = operacao;

        if(this.operacao.equals("transpose") || this.operacao.equals("Transpose")){

            this.op.transpose(matrix);

        }

        if(this.operacao.equals("gauss") || this.operacao.equals("Gauss")){

            this.op.gauss(matrix);

        }

        if(this.operacao.equals("solve") || this.operacao.equals("Solve")){

            this.op.solve(matrix);

        }

    }

    private void operacao(String operacao, Vector vector, double angle){

        if(this.operacao.equals("rotate2D") || this.operacao.equals("Rotate2D")){

            this.t.rotation2D(vector, angle);

        }

        if(this.operacao.equals("rotate3DX") || this.operacao.equals("Rotate3DX")){

            this.t.rotation3DX(vector, angle);

        }

        if(this.operacao.equals("rotate3DY") || this.operacao.equals("Rotate3DY")){

            this.t.rotation3DY(vector, angle);

        }

        if(this.operacao.equals("rotate3DZ") || this.operacao.equals("Rotate3DZ")){

            this.t.rotation3DZ(vector, angle);

        }

    }

    private void operacao(String operacao, Vector vector, double dx, double dy){

        if(this.operacao.equals("translate2D") || this.operacao.equals("Translate2D")){

            this.t.translate2D(vector, dx, dy);

        }

        if(this.operacao.equals("shear") || this.operacao.equals("Shear")){

            this.t.shearing(vector, dx, dy);

        }

    }

    private void operacao(String operacao, Vector vector, double dx, double dy, double dz){

        if(this.operacao.equals("translate3D") || this.operacao.equals("Translate3D")){

            this.t.translate3D(vector, dx, dy, dz);

        }

    }

    private void operacao(String operacao, Vector vector){

        this.operacao = operacao;

        if(this.operacao.equals("transpose") || this.operacao.equals("Transpose")){

            this.op.transpose(vector);

        }

        if(this.operacao.equals("reflect2DX") || this.operacao.equals("Reflect2DX")){

            this.t.reflection2DX(vector);

        }

        if(this.operacao.equals("reflect2DY") || this.operacao.equals("Reflect2DY")){

            this.t.reflection2DY(vector);

        }

        if(this.operacao.equals("reflect3DX") || this.operacao.equals("Reflect3DX")){

            this.t.reflection3DX(vector);

        }

        if(this.operacao.equals("reflect3DY") || this.operacao.equals("Reflect3DY")){

            this.t.reflection3DY(vector);

        }

        if(this.operacao.equals("reflect3DZ") || this.operacao.equals("Reflect3DZ")){

            this.t.reflection3DZ(vector);

        }

        if(this.operacao.equals("project2DX") || this.operacao.equals("Project2DX")){

            this.t.projection2DX(vector);

        }

        if(this.operacao.equals("project2DY") || this.operacao.equals("Project2DY")){

            this.t.projection2DY(vector);

        }

        if(this.operacao.equals("project3DX") || this.operacao.equals("Project3DX")){

            this.t.projection3DX(vector);

        }

        if(this.operacao.equals("project3DY") || this.operacao.equals("Project3DY")){

            this.t.projection3DY(vector);

        }

        if(this.operacao.equals("project3DZ") || this.operacao.equals("Project3DZ")){

            this.t.projection3DZ(vector);

        }

    }

    private void operacao(Matrix m1, String operacao, Matrix m2){

        this.operacao = operacao;

        if(this.operacao.equals("sum") || this.operacao.equals("Sum")){

            this.op.sum(m1, m2);

        }

        if(this.operacao.equals("times") || this.operacao.equals("Times")){

            this.op.times(m1, m2);

        }

        if(this.operacao.equals("dot") || this.operacao.equals("Dot")){

            this.op.dot(m1, m2);

        }

    }

    private void operacao(double escalar, String operacao, Matrix matrix){

        this.operacao = operacao;

        if(this.operacao.equals("times") || this.operacao.equals("Times")){

            this.op.times(escalar, matrix);

        }

    }

}