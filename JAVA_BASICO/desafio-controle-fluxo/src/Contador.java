import java.util.Locale;
import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parâmetro");
        int paramentroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int paramentroDois = terminal.nextInt();

        try {

            //chamando o método contendo a lógica de contagem
            contar(paramentroUm, paramentroDois);
            
        } catch (ParamentrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        
    }

    static void contar(int paramentroUm, int paramentroDois) throws ParamentrosInvalidosException{
       		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(paramentroUm > paramentroDois){
            throw new ParamentrosInvalidosException();  
        }

        int contagem = paramentroDois - paramentroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 1 ; i <= contagem ; i++){
            System.out.println("Imprimindo o número "+i);
        }

    }
}