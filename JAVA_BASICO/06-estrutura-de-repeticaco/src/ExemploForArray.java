public class ExemploForArray {
    
    public static void main(String[] args) {
        //em arrays o indice inicia em zero
        String alunos[] = {"Felipe","Jonas","Julia","Marcos"};    
    
        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x= "+ x+ " é "+ alunos[x]);
        }

        //Em forEach
        System.out.println("\nInicio ForEach");
        for(String aluno: alunos){
            System.out.println("Nome do aluno é: "+ aluno);
        }
    }
}
