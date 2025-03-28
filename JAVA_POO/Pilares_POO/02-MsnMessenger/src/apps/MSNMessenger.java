package apps;
public class MSNMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSNMessenger");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSNMessenger");
        
    }
    @Override
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando Historico mensagem no MSN");
    }
   
}