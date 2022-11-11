public class Main {

    public static void main(String[] args) {

        Televisao televisao = new Televisao();

        ControleRemoto controle = new ControleRemoto();

        System.out.println("Volume: " + controle.consultaVolume(televisao));

        System.out.println("Canal: " + controle.consultaCanal(televisao));

        controle.aumentaVolume(televisao);

        System.out.println("Volume: " + controle.consultaVolume(televisao));

        System.out.println("Canal: " + controle.consultaCanal(televisao));

        controle.aumentaCanal(televisao);

        System.out.println("Volume: " + controle.consultaVolume(televisao));

        System.out.println("Canal: " + controle.consultaCanal(televisao));

        controle.diminuiVolume(televisao);

        System.out.println("Volume: " + controle.consultaVolume(televisao));

        System.out.println("Canal: " + controle.consultaCanal(televisao));

        controle.diminuiCanal(televisao);

        System.out.println("Volume: " + controle.consultaVolume(televisao));

        System.out.println("Canal: " + controle.consultaCanal(televisao));

        controle.trocaCanal(televisao, 10);

        System.out.println("Volume: " + controle.consultaVolume(televisao));

        System.out.println("Canal: " + controle.consultaCanal(televisao));

    }

}
