import java.util.Random;

public class ExemploDoWhile {
   
    public static void main(String[] args) {
        System.out.println("Discando...");

        do{
            //Executando repetidas vezes até alguem atender
            System.out.println("Telefone Tocando");
        } while (tocando());

        System.out.println("Aló !!!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        //negando o ato de continuar tocando
        return ! atendeu;
    }
}
