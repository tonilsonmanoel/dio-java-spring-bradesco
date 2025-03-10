package edu.tonilson.primeirasemana;
public class BoletimEstudantil {
    
    public static void main(String [] args){
        int mediaFinal = 7;
        if(mediaFinal < 6){
            System.out.print("REPROVADO");

        } else if(mediaFinal ==6){
            System.out.print("RECUPERAÇÃO");

        } else{
            System.out.print("APROVADO");
        }
    }
}
