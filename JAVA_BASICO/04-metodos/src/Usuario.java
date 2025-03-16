public class Usuario {
    

    public static void main(String []args){

        MetodosSmartTv metodosSmartTv = new MetodosSmartTv();

        metodosSmartTv.diminuirVolume();
        metodosSmartTv.diminuirVolume();
        metodosSmartTv.diminuirVolume();
        metodosSmartTv.aumentarVolume();


        
        System.out.println("Tv Ligada? " + metodosSmartTv.ligada);
        System.out.println("Canal Atual: "+ metodosSmartTv.canal);
        System.out.println("Volume Atual: "+ metodosSmartTv.volume);

        metodosSmartTv.ligar();
        System.out.println("Estado atual da Tv? "+ metodosSmartTv.ligada);

        metodosSmartTv.mudarCanal(13);
        System.out.println("Canal Atual: "+ metodosSmartTv.canal);

    }
}
