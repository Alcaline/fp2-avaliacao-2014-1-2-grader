package utfpr.ct.dainf.if62c.avaliacao;

/**
  * @author Guilherme Jacichen <gui_jaci@yaoo.com.br>
 */
public abstract class Polinomio{
    protected Number coef[];
    
    protected Polinomio(){}
    
    public Polinomio(Number[] coef) throws IllegalArgumentException{
        double soma = 0;
        if(coef.length < 2)
            throw new IllegalArgumentException("Polinômio inválido");
        /*for(Number n:coef)
            soma += Math.abs(n.doubleValue());
        if(soma == 0)
            throw new IllegalArgumentException("Polinômio inválido");*/          
        this.coef = coef;
    }
    
    public int getGrau(){
        /*for(int i = 0; i < coef.length; i++)
            if(coef[i].doubleValue() != 0)*/
                return coef.length-1;//-i;
        /*return 0;*/
        
    }
    
    public double poli(double x){
        double soma = 0;
        
        for(int i = 0; i < coef.length; i++)
            soma += coef[coef.length-i-1].doubleValue()*Math.pow(x,i);
        
        return soma;
    }
    
    public abstract double[] getRaizes() throws RaizException;
    
    @Override
    public String toString(){
        String poli = " ";
        for(int i = coef.length; i>0; i--)
            poli = poli+(coef[coef.length-i].doubleValue()>0?"+":"")+coef[coef.length-i].doubleValue()+"x^"+(i-1)+" ";
                    
        return poli.trim();
    }
}
