public class Carro extends Veiculo{
    public void ligar(){
        //encapsulamento chamando metodos sem necessidade de chama no Objeto
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel(){
        System.out.println("conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("conferindo cambio em P");
    }
}