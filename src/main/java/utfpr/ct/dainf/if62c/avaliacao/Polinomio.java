package utfpr.ct.dainf.if62c.avaliacao;

/**
  * @author Guilherme Jacichen <gui_jaci@yaoo.com.br>
 */
public abstract class Polinomio <T extends Number>{
    protected T coef[];
    
    protected Polinomio(){}
    
    public Polinomio(T[] coef) throws IllegalArgumentException{
        double soma = 0;
        if(coef.length == 0)
            throw new IllegalArgumentException("Polinômio inválido");
        for(Number n:coef)
            soma += Math.abs(n.doubleValue());
        if(soma == 0)
            throw new IllegalArgumentException("Polinômio inválido");          
        this.coef = coef;
    }
    
    public int getGrau(){
        int grau = 0;
        for(int i = coef.length; i>=0; i--)
            if(coef[coef.length-i].doubleValue() != 0)
                return i;
        return -1;
    }
    
    public double poli(double x){
        double soma = 0;
        
        for(int i = 1; i <= coef.length; i++)
            soma += coef[coef.length-i].doubleValue()*Math.pow(x,i);
        
        return soma;
    }
    
    public abstract double[] getRaizes() throws RaizException;
    
    @Override
    public String toString(){
        String poli = " ";
        for(int i = coef.length; i>0; i--)
            poli = poli+(coef[coef.length-i].doubleValue()>0?"+":"")+coef[coef.length-i].doubleValue()+"x^"+i+" ";
                    
        return poli.trim();
    }
}
