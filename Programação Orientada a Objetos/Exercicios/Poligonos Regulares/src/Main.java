import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Que tipo de objeto você quer criar?");

        String tipo = sc.nextLine();

        if(tipo.equals("poligono regular")){

            System.out.println("Qual o número de lados?");

            int numLados = Integer.parseInt(sc.next());

            System.out.println("Qual o tamanho do lado?");

            PolReg poligono = new PolReg(numLados, Double.parseDouble(sc.next()));

            System.out.println("Perímetro: " + poligono.calculoDoPerimetro());

            System.out.printf("Angulo Interno: %.2f\n", poligono.calculoDoAnguloInterno());

            System.out.printf("Área: %.2f\n", poligono.calculoDaArea());

        }

        if(tipo.equals("triangulo equilatero")){

            System.out.println("Qual o tamanho do lado?");

            PolReg triangulo = new TrianguloEq(Double.parseDouble(sc.next()));

            System.out.println("Perímetro: " + triangulo.calculoDoPerimetro());

            System.out.printf("Angulo Interno: %.2f\n", triangulo.calculoDoAnguloInterno());

            System.out.printf("Área: %.2f\n", triangulo.calculoDaArea());

        }

        if(tipo.equals("quadrado")){

            System.out.println("Qual o tamanho do lado?");

            PolReg quadrado = new Quadrado(Double.parseDouble(sc.next()));

            System.out.println("Perímetro: " + quadrado.calculoDoPerimetro());

            System.out.printf("Angulo Interno: %.2f\n", quadrado.calculoDoAnguloInterno());

            System.out.printf("Área: %.2f\n", quadrado.calculoDaArea());

        }

    }

}
