
public class Operacao {

    private LinearAlgebra op = new LinearAlgebra();

    private String elemento1;

    private String tipo;

    private String elemento2;

    public Operacao(ListaObjetos l, String elemento1, String tipo, String elemento2) {

        this.elemento1 = elemento1;

        this.elemento2 = elemento2;

        this.tipo = tipo;

        int matrizI, vetorI, matrizJ, vetorJ;

        if(this.elemento1.substring(0).equals("Matriz")) {

            System.out.println("Iniciou");

            matrizI = Integer.parseInt(elemento1.substring(1)) - 1;

            if(this.elemento2.substring(0).equals("Matriz")) {

                matrizJ = Integer.parseInt(this.elemento2.substring(1)) - 1;

                if(this.tipo.equals("sum")) op.sum(l.getMatriz(matrizI), l.getMatriz(matrizJ));

                if(this.tipo.equals("times")) op.times(l.getMatriz(matrizI), l.getMatriz(matrizJ));

                if(this.tipo.equals("dot")) {
                    System.out.println("Entrou");
                    op.dot(l.getMatriz(matrizI), l.getMatriz(matrizJ));
                }

            }

            else if(this.elemento2.substring(0).equals("Vetor")){

                vetorJ = Integer.parseInt(this.elemento2.substring(1)) - 1;

                if(this.tipo.equals("sum")) op.sum(l.getMatriz(matrizI), l.getVector(vetorJ));

                if(this.tipo.equals("times")) op.times(l.getMatriz(matrizI), l.getVector(vetorJ));

                if(this.tipo.equals("dot")) op.dot(l.getMatriz(matrizI), l.getVector(vetorJ));

            }

            else if(this.elemento2.isBlank()) {

                if(this.tipo.equals("transpose")) op.transpose(l.getMatriz(matrizI));

                if(this.tipo.equals("gauss")) op.gauss(l.getMatriz(matrizI));

                if(this.tipo.equals("solve")) op.solve(l.getMatriz(matrizI));

            }

            else {

                op.times(l.getVector(matrizI), l.getEscalar());

            }

        }

        if(elemento1.substring(0).equals("Vetor")) {

            vetorI = Integer.parseInt(elemento1.substring(1)) - 1;

            if(this.elemento2.substring(0).equals("Matriz")) {

                matrizJ = Integer.parseInt(this.elemento2.substring(1)) - 1;

                if(this.tipo.equals("sum")) op.sum(l.getVector(vetorI), l.getMatriz(matrizJ));

                if(this.tipo.equals("times")) op.times(l.getVector(vetorI), l.getMatriz(matrizJ));

                if(this.tipo.equals("dot")) op.dot(l.getVector(vetorI), l.getMatriz(matrizJ));

            }

            else if(this.elemento2.substring(0).equals("Vetor")){

                vetorJ = Integer.parseInt(this.elemento2.substring(1)) - 1;

                if(this.tipo.equals("sum")) op.sum(l.getVector(vetorI), l.getVector(vetorJ));

                if(this.tipo.equals("times")) op.times(l.getVector(vetorI), l.getVector(vetorJ));

            }

            else if(this.elemento2.isBlank()){

                if(this.tipo.equals("transpose")) op.transpose(l.getVector(vetorI));

            }

            else {

                op.times(l.getVector(vetorI), l.getEscalar());

            }

        }

        if(elemento1.equals("escalar")) {

            if(elemento2.substring(0).equals("Matriz")) {

                matrizJ = Integer.parseInt(elemento2.substring(1)) - 1;

                op.times(l.getEscalar(), l.getMatriz(matrizJ));

            }

            if(elemento2.substring(0).equals("Vetor")) {

                vetorJ = Integer.parseInt(elemento2.substring(1)) - 1;

                op.times(l.getEscalar(), l.getVector(vetorJ));

            }

        }

        System.out.println("Saiu");

    }
	/*
	public Operacao(ListaObjetos l, String elemento1, String tipo) {

		this.elemento1 = elemento1;

		this.tipo = tipo;

		int matriz, vetor;

		if(this.elemento1.substring(0).equals("Matriz")) {

			matriz = Integer.parseInt(this.elemento1.substring(1));

			if(this.tipo.equals("transpose")) op.transpose(l.getMatriz(matriz));

			if(this.tipo.equals("gauss")) op.gauss(l.getMatriz(matriz));

			if(this.tipo.equals("solve")) op.solve(l.getMatriz(matriz));

		}

		if(this.elemento1.substring(0).equals("Vetor")) {

			vetor = Integer.parseInt(this.elemento1.substring(1));

			if(this.tipo.equals("transpose")) op.transpose(l.getVector(vetor));

		}

	}
	*/

	/*
	public Operacao(Matrix m, String tipo, Vector v) {

		this.tipo = tipo;

		if(this.tipo.equals("sum")) op.sum(m, v);

		if(this.tipo.equals("times")) op.times(m, v);

		if(this.tipo.equals("dot")); op.dot(m, v);

	}

	public Operacao(Vector v1, String tipo, Vector v2) {

		this.tipo = tipo;

		if(this.tipo.equals("sum")) op.sum(v1, v2);

		if(this.tipo.equals("times")) op.times(v1, v2);

	}

	public Operacao(Vector v, String tipo, Matrix m) {

		this.tipo = tipo;

		if(this.tipo.equals("sum")) op.sum(v, m);

		if(this.tipo.equals("times")) op.times(v, m);

		if(this.tipo.equals("dot")); op.dot(v, m);

	}

	public Operacao(double e, Matrix m) {

		op.times(e, m);

	}

	public Operacao(double e, Vector v) {

		op.times(e, v);

	}

	public Operacao(Matrix m, double e) {

		op.times(m, e);

	}

	public Operacao(Vector v, double e) {

		op.times(v, e);

	}

	public Operacao(Matrix m, String tipo) {

		this.tipo = tipo;

		if(this.tipo.equals("transpose")) op.transpose(m);

		if(this.tipo.equals("gauss")) op.gauss(m);

		if(this.tipo.equals("solve")) op.solve(m);

	}

	public Operacao(Vector v, String tipo) {

		this.tipo = tipo;

		if(this.tipo.equals("transpose")) op.transpose(v);

	}
	*/
}
