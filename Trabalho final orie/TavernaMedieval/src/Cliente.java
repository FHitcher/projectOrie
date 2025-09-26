
import java.time.LocalDateTime;

public class Cliente extends Pessoa implements func{
    private int dia_n;
    private int mes_n;
    private int ano_n;
    private float conta=0;
    private String especie;
    public Cliente(String nome, long cpf, String especie, int dia, int mes, int ano){
        super(nome, cpf);
        this.dia_n = dia;
        this.mes_n = mes;
        this.ano_n = ano;
    }
    public void setDiaNasc(int dia){
        this.dia_n = dia;
    }
    public int getDiaNasc(){
        return this.dia_n;
    }
    public void setMesNasc(int mes){
        this.mes_n = mes;
    }
    public int getMesNasc(){
        return this.mes_n;
    }
    public void setAnoNasc(int ano){
        this.mes_n = ano;
    }
    public int getAnoNasc(){
        return this.ano_n;
    }
    public void setConta(float conta){
        this.conta+= conta;
    }
    public float getConta(){
        return this.conta;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public String getEspecie(){
        return this.especie;
    }
    
    public boolean ehMaior(){
        LocalDateTime data = LocalDateTime.now();
        int diaH = data.getDayOfMonth();
        int mesH= data.getMonthValue();
        int anoH = data.getYear();
        int delta_ano = anoH - ano_n;
        int delta_mes = mesH - mes_n;
        int delta_dia = diaH - dia_n;
        if (delta_dia<0)
            delta_mes-=1;
        if (delta_mes<0)
            delta_ano-=1;
        if (delta_ano<18)
            return false;
        else
            return true;
        
    }
    @Override
    public String toString() {
        return super.toString()+ "\nNascimento: " + this.dia_n + "/" + this.mes_n + "/" + this.ano_n +"\nConta: "+conta + "\nEspecie: "+especie; 
    }
    
}
