public enum EstadoBrasileiro{
    SAO_PAULO("SP","São Paulo",10),
    RIO_JANEIRO("RJ","Rio de Janeiro", 12),
    PIAUI("PI", "Piauí",11),
    MARANHAO("MA","Maranhão",8);


    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome,int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge() {
        return ibge;
    }
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    public void setIbge(int ibge) {
        this.ibge = ibge;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getNomeMaisculo(){
        return nome.toUpperCase();
    }
    



}