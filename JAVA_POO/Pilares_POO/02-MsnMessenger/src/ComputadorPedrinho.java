import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        

        /* 
        METODOS SEM ENCAPSULAMENTO
        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();
        
        msn.receberMensagem();

        // METODOS COM ABSTRAÇÃO E ENCAPSULAMENTO
        
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("FACEBOOK");
        FacebookMessenger fcb = new FacebookMessenger();
        fcb.enviarMensagem();
        fcb.receberMensagem();
        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
        */

         ServicoMensagemInstantanea smi = null;

        /* 
            NAO SE SABE QUAL APP
            MAS QUALQUER  UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */

         String appEscolhido = "msn";

         if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
         } else if(appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
         } else if (appEscolhido.equals("tlg")){
            smi = new Telegram();
         }

         smi.enviarMensagem();
         smi.receberMensagem();

    }
}
