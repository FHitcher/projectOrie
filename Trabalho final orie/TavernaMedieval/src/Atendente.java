/**
 *
 * @author flima
 */
public class Atendente extends Pessoa {
    private float taxa;
    
    
    public Atendente(String nome, long cpf, float taxa){
    super(nome, cpf);
    this.taxa = taxa;
}
    public void setTaxa(float taxa){
        this.taxa = taxa;
    }
    public float getTaxa(){
        return this.taxa;
    }
}
