import jade.core.*;
import jade.core.behaviours.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author Rafael Camacho Roldán <za18012201@zapopan.tecmm.edu.mx>
 * Cambiar el comportamiento a generico 
 */
public class SlrAgent extends Agent{ 

    protected void setup() {
    System.out.println("Agent "+getLocalName()+" started.");
    // Add geeneric behaviour
    addBehaviour(new SlrBehaviour());
  } 
    
    
    private class SlrBehaviour extends Behaviour{
        boolean end=false;
        
        public void action(){
            ArithmeticClass obj = new ArithmeticClass();
            DecimalFormat df = new DecimalFormat("#.00");
            Double predict;

            System.out.println("Regression equation: y^ = B0 + B1x");
            System.out.println("y^ = "+df.format(obj.Beta0()) +" + "+df.format(obj.Beta1()) + "*(X)");

            predict=Double.parseDouble(JOptionPane.showInputDialog("X: "));
            System.out.println("\nY^ = "+  df.format(obj.predict(predict)));
            end=true;
        }

       public boolean done(){
           if(end==true){
                return true;
           }else{
                return false;
           }
       }
       
        public int onEnd() {
            myAgent.doDelete();
        return super.onEnd();
        } 
    } 
    
}
