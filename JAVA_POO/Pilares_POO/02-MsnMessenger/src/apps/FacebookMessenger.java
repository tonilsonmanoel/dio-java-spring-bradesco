package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo FacebookMessenger");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo FacebookMessenger");
        
    }
    @Override
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando Historico mensagem no FacebookMessenger");
    }
   
}