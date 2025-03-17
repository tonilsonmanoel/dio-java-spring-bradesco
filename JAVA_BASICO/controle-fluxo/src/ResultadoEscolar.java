public class ResultadoEscolar {

    public static void main(String[] args){
        int nota = 8;

        if(nota >= 7)
            System.out.println("Aprovado");
        else if ( nota >= 5 && nota <7)
            System.out.println("Prova Recuperação");
        else
            System.out.println("Reprovado");
        
        // Condição ternária 
        int nota2 = 4;
        String resultado2 = nota2 >= 7 ? "Aprovado" : nota2 >= 5 &&  nota2 < 7? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

    }
}
