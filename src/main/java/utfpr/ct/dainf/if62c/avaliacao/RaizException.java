package utfpr.ct.dainf.if62c.avaliacao;
/**
  * @author Guilherme Jacichen <gui_jaci@yaoo.com.br>
 */

public class RaizException extends RuntimeException{
    private final Polinomio poli;
    
    public RaizException(Polinomio poli){
        super(String.format("Polinômio '%s' não tem raízes",poli));
        this.poli = poli;
    }
    
    public Polinomio getPoli(){
        return poli;
    }
}
