import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                Complexo numero;

                System.out.println("Deseja criar um número complexo ou real?");

                String tipo = sc.next();

                if(tipo.equals("complexo")){

                        System.out.println("Qual o real?");

                        float real = Float.parseFloat(sc.next());

                        System.out.println("Qual o imaginário?");

                        numero = new Complexo(real, Float.parseFloat(sc.next()));

                        System.out.printf("Módulo: %.2f\n", numero.Modulo());

                        System.out.printf("Ângulo: %.2f\n", numero.Angulo());

                }

                if(tipo.equals("real")){

                        System.out.println("Qual o número?");

                        numero = new Real(Float.parseFloat(sc.next()));

                        System.out.println("Sinal: " + numero.Sinal());

                }

        }

}
