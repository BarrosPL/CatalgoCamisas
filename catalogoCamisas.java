import java.util.ArrayList;
public class catalogoCamisas {
    private ArrayList<Camisas> ListaCamisas = new ArrayList<>();
    public void addCamisas(String descrição, String tamanho, Double preço){
        ListaCamisas.add(new Camisas(descrição,tamanho,preço));

    }
    public void remCamisas(String descrição){
        ListaCamisas.remove(descrição);
        for(Camisas j:ListaCamisas){
            if (j.getDescrição().equals(descrição)){
                ListaCamisas.remove(j);
                break;

            }
        }
    }

    public void exibirCamisas(){
        for (Camisas j:ListaCamisas){
            System.out.println(j.getDescrição());
            System.out.println(j.getPreço());
            System.out.println(j.getTamanho());
        }


    }
    public void consultaCamisas(String tamanho){
        for (Camisas j:ListaCamisas){
            if(j.getTamanho().equals(tamanho)){
                System.out.println(j.getDescrição());
                System.out.println(j.getPreço());
                System.out.println(j.getTamanho());

            }
        }

    }






}
