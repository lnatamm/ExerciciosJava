public class Cardapio {

    private Produto lista[] = new Produto[5];

    public Cardapio(){

        lista[0] = new Produto(1, "Cachorro Quente", 4.0);

        lista[1] = new Produto(2, "X-Salada", 4.5);

        lista[2] = new Produto(3, "X-Bacon", 5.0);

        lista[3] = new Produto(4, "Torrada Simples", 2.0);

        lista[4] = new Produto(5, "Refrigerante", 1.5);

    }

    public Produto getLista(int codigo){

        return lista[codigo - 1];

    }

}