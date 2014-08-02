package utfpr.ct.dainf.if62c.avaliacao;

/**
  * @author Guilherme Jacichen <gui_jaci@yaoo.com.br>
 */
public class PoliQuad extends Polinomio{

    public PoliQuad(Number a, Number b, Number c){
        super(new Number[]{a,b,c});
    }
    
    @Override
    public double[] getRaizes() throws RaizException {

        if(getDelta()< 0 || coef[0].doubleValue() == 0)
            throw new RaizException(this);
        
        if(getDelta() == 0)
            return new double[]{-coef[1].doubleValue()/2*coef[0].doubleValue()};
        
        return new double[]{
            (-coef[1].doubleValue()+Math.sqrt(getDelta()))/(2*coef[0].doubleValue()),
            (-coef[1].doubleValue()-Math.sqrt(getDelta()))/(2*coef[0].doubleValue())
        };
    }

    public double getDelta() {
        return Math.pow(coef[1].doubleValue(),2) - 4*coef[0].doubleValue()*coef[2].doubleValue();
    }
    
}
