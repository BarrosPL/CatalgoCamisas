public class Camisas {
    private String descrição;
    private String tamanho;
    private Double preço;

    public Camisas (String descrição, String tamanho, Double preço){
        setCamisas(descrição,tamanho,preço);
    }
    public void setCamisas(String descrição, String tamanho, Double preço){
        this.descrição = descrição;
        this.tamanho = tamanho;
        this.preço = preço;
    }
    public String getDescrição(){
        return this.descrição;

    }
    public String getTamanho(){
        return this.tamanho;
    }
    public Double getPreço(){
        return this.preço;
    }



}
