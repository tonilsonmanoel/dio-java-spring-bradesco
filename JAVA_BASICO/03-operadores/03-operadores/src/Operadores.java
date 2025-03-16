public class Operadores{

    public static void main(String [] args){
        String nomeCompleto = "LINGUAGEM"+"JAVA";

        System.out.print(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1" + (1+1+1);
        System.out.println(concatenacao);

        //Operadores Logicos
        int numero1 =1 ;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? "+ simNao);

         simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? "+ simNao);
         simNao = numero1 > numero2;

        System.out.println("numeroUm é Maior a numeroDois? "+ simNao);

        if(numero1 == numero2){//true
            System.out.println("a nossa condição é verdadeira");
        }

        //Operadores Relacioanais

        boolean condicao1 = true;
        boolean condicao2 = true;

        if( condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }

    }

}