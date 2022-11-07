public class ControleRemoto {

    public void aumentaVolume(Televisao televisao){

        televisao.setVolume(televisao.getVolume() + 1);

    }

    public void diminuiVolume(Televisao televisao){

        televisao.setVolume(televisao.getVolume() - 1);

    }

    public void aumentaCanal(Televisao televisao){

        televisao.setCanal(televisao.getCanal() + 1);

    }

    public void diminuiCanal(Televisao televisao){

        televisao.setCanal(televisao.getCanal() - 1);

    }

    public void trocaCanal(Televisao televisao, int canal){

        televisao.setCanal(canal);

    }

    public int consultaVolume(Televisao televisao){

        return televisao.getVolume();

    }

    public int consultaCanal(Televisao televisao){

        return televisao.getCanal();

    }

}
