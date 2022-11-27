public class testeCatalogo {
    public static void main(String[]args){
        String descrição = "Camisa Foda";
        String tamanho = "G";
        double preço = 39.99;
        String descrição2 = "Camisa Feia";
        String tamanho2 = "P";
        double preço2 = 40.99;
        String descrição3 = "Camisa Mais o Menos";
        String tamanho3 = "M";
        double preço3 = 45.99;
        catalogoCamisas objCatalogo = new catalogoCamisas();
        objCatalogo.addCamisas(descrição,tamanho,preço);
        objCatalogo.addCamisas(descrição2, tamanho2, preço2);
        objCatalogo.addCamisas(descrição3, tamanho3, preço3);
        objCatalogo.remCamisas("Camisa Foda");
        objCatalogo.exibirCamisas();
        objCatalogo.consultaCamisas(descrição);

        }
}


