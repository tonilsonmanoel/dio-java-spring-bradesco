public class Pessoa{
    private String nome;
    private String cpf;
    private String endereco;

    //Metodo construtor com paramentro
    public Pessoa(String cpf,String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    //Metodo construtor sem paramentro
    public Pessoa(){
        
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}