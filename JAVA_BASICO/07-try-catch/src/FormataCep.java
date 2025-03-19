public class FormataCep {
    public static void main(String[] args) {
        
        try {
            
            String cepFormatado = formatarCep("2376505");
            System.out.println(cepFormatado);
        } catch (Exception e) {
            System.out.println("O cep não corresponde com as regras de negocio");
            // TODO: handle exception
        }
        
    }

     static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
        return "23.765-064";
    }

    
}
