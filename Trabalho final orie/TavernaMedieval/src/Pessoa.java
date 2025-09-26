public class Pessoa {
    private String nome;
    private long cpf;
    
    public Pessoa(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCpf(long cpf){
        this.cpf = cpf;
    }

    public long getCpf(){
        return this.cpf;
    }

    
    @Override
    public String toString() {
        return "Nome: "+ nome +"\tCpf: "+ cpf;
    }
    
}

