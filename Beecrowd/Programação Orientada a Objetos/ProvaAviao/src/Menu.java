import java.util.*;

public class Menu {

    private ArrayList<Aviao> avioes = new ArrayList<Aviao>();

    public Menu(){

        this.avioes.clear();

    }

    public Aviao getAviao(int i){

        return this.avioes.get(i);

    }

    public void cadastrarAviao(Aviao aviao){

        if(!contemPrefixo(aviao)){

            this.avioes.add(aviao);

        }

    }

    public void cadastrarVoo(String prefixo, Voo voo){

        if(contemPrefixo(prefixo)){

            this.avioes.get(retornaAviao(prefixo)).addVoo(voo);

        }

    }

    public void efetuaReserva(String prefixo){

        if(contemPrefixo(prefixo)){

            Scanner sc = new Scanner(System.in);

            exibirVoos(prefixo);

            int voo = Integer.parseInt(sc.nextLine());

            if(this.avioes.get(retornaAviao(prefixo)).getVoo(voo).efetuarReserva(this.avioes.get(retornaAviao(prefixo)), voo)){

                System.out.println("Reserva Confirmada");;

            }

            else System.out.println("Voo lotado");;

        }

        else System.out.println("Voo Inexistente");

    }

    public void cancelarReserva(String prefixo){

        if(contemPrefixo(prefixo)){

            Scanner sc = new Scanner(System.in);

            exibirVoos(prefixo);

            int voo = Integer.parseInt(sc.nextLine());

            if(this.avioes.get(retornaAviao(prefixo)).getVoo(voo).cancelarReserva(this.avioes.get(retornaAviao(prefixo)), voo)){

                System.out.println("Reserva Cancelada");;

            }

            else System.out.println("Voo Vazio");;

        }

        else System.out.println("Voo Inexistente");

    }

    public void exibirVoos(String prefixo){

        for (int i = 0; i < this.avioes.get(retornaAviao(prefixo)).getVoo().size(); i++) {

            System.out.printf("Destino: %s / Origem: %s\n", this.avioes.get(retornaAviao(prefixo)).getVoo(i).getDestino(), this.avioes.get(retornaAviao(prefixo)).getVoo(i).getOrigem());

        }

    }

    public void listarVoos(String prefixo){

        if(contemPrefixo(prefixo)){

            Scanner sc = new Scanner(System.in);

            System.out.println("Insira o tipo de ordenação: ");

            String tipoDeOrdenacao = sc.nextLine();

            Collections.sort(this.avioes.get(retornaAviao(prefixo)).getVoo(), new ComparaVoo(tipoDeOrdenacao));

            if(tipoDeOrdenacao.equals("Data")){

                for(int i = 0; i < this.avioes.get(retornaAviao(prefixo)).getVoo().size(); i++){

                    System.out.printf("Data: %s / Destino: %s, / Origem: %s / Numero do Voo: %s\n", this.avioes.get(retornaAviao(prefixo)).getVoo(i).getDataVoo(), this.avioes.get(retornaAviao(prefixo)).getVoo(i).getDestino(), this.avioes.get(retornaAviao(prefixo)).getVoo(i).getOrigem(), this.avioes.get(retornaAviao(prefixo)).getVoo(i).getNrVoo());

                }

            }

            if(tipoDeOrdenacao.equals("Origem")){

                for(int i = 0; i < this.avioes.get(retornaAviao(prefixo)).getVoo().size(); i++){

                    System.out.printf("Origem: %s / Destino: %s, / Data: %s / Numero do Voo: %s\n", this.avioes.get(retornaAviao(prefixo)).getVoo(i).getOrigem(), this.avioes.get(retornaAviao(prefixo)).getVoo(i).getDestino(), this.avioes.get(retornaAviao(prefixo)).getVoo(i).getDataVoo(), this.avioes.get(retornaAviao(prefixo)).getVoo(i).getNrVoo());

                }

            }

            if(tipoDeOrdenacao.equals("Numero do Voo")){

                for(int i = 0; i < this.avioes.get(retornaAviao(prefixo)).getVoo().size(); i++){

                    System.out.printf("Numero do Voo: %s / Destino: %s, / Origem: %s / Data: %s\n", this.avioes.get(retornaAviao(prefixo)).getVoo(i).getNrVoo(), this.avioes.get(retornaAviao(prefixo)).getVoo(i).getDestino(), this.avioes.get(retornaAviao(prefixo)).getVoo(i).getOrigem(), this.avioes.get(retornaAviao(prefixo)).getVoo(i).getDataVoo());

                }

            }

        }

    }

    private boolean contemPrefixo(Aviao aviao){

        for(int i = 0; i < this.avioes.size(); i++){

            if(this.avioes.get(i).getPrefixo().equals(aviao.getPrefixo())){

                return true;

            }

        }

        return false;

    }

    private boolean contemPrefixo(String prefixo){

        for(int i = 0; i < avioes.size(); i++){

            if(this.avioes.get(i).getPrefixo().equals(prefixo)){

                return true;

            }

        }

        return false;

    }

    public int retornaAviao(String prefixo){

        for(int i = 0; i< avioes.size(); i++){

            if(this.avioes.get(i).getPrefixo().equals(prefixo)){

                return i;

            }

        }

        return 100;

    }

}