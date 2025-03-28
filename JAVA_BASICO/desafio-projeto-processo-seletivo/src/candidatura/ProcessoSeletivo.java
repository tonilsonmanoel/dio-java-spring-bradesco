package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
      //  selecaoCandidatos();
       // imprimirSelecionados();
       String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA",}; 
       System.out.println("Ligando para candidato");
       for(String candidato : candidatos){
               
        entrandoEmContato(candidato);
       }
    }

   

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTentando = true;
        boolean atendeu= false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas <3);
    
        if(atendeu)
            System.out.println("CONSEGUI CONTATO COM " + candidato+ " NA " + tentativasRealizadas + " Tentativa");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM "+candidato + ", NÚMERO MAXIMO DE TENTATIVAS");

    }
    
    

    static boolean atender(){
       return new Random().nextInt(3)==1;
   
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA",}; 
    
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice =0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº "+ (indice+1)+" é o "+ candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for  each");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi "+ candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","MONICA","FABRICIO", "MIRELA","DANIELA"};
        int candidatosSelecionados = 0;
        int candidatoAtual =0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou  este valor de salário "+ salarioPretendido);

            if(salarioBase >= salarioPretendido){
                candidatosSelecionados++;
                System.out.println("O candidato "+ candidato +" foi selecionado para a vaga" );

            }
            candidatoAtual++;
        }

    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}