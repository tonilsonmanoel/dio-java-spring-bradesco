public class MetodosSmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;

    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumenta volume Para: "+ volume);

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir volume Para: "+ volume);
    }

    public void aumentaCanal(){
        canal++;
    }
    public void diminurCanal(){
        canal--;

    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
