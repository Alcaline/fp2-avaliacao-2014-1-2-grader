/**
  * @author Guilherme Jacichen <gui_jaci@yaoo.com.br>
 */
import utfpr.ct.dainf.if62c.avaliacao.*;

public class Avaliacao2 {
    public static void main(String[] args) {
        try{
            PoliLinear poli1 = new PoliLinear(new Double(3),new Double(2));
            PoliQuad poli2 = new PoliQuad(new Integer(-3),new Integer(-2), new Integer(-1));
            double raizes1 [] = poli1.getRaizes();
            double raizes2 [] = poli2.getRaizes();
            
            System.out.println(
                    poli1+" = 0; x = "+raizes1[0]+"; y = "+poli1.poli(raizes1[0])+"\n"+
                    poli2+" = 0; x1= "+raizes2[0]+"; x2= "+raizes2[1]+
                    "; y1 = "+poli2.poli(raizes2[0])+"; y2 = "+poli2.poli(raizes2[1]));
        }catch(RaizException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
