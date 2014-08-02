package utfpr.ct.dainf.if62c.avaliacao;

/**
  * @author Guilherme Jacichen <gui_jaci@yaoo.com.br>
 */
public class PoliLinear extends Polinomio{
    
    public PoliLinear(Number a, Number b){
        super(new Number[]{a,b});
    }

    @Override
    public double[] getRaizes() throws RaizException{
        if(coef[0].doubleValue() == 0)
            throw new RaizException(this);
        return new double[]{-coef[1].doubleValue()/coef[0].doubleValue()};
    }
    
}
