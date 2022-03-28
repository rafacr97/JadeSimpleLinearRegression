
import java.util.*;
/**
 * 
 * @author Rafael Camacho Roldán <za18012201@zapopan.tecmm.edu.mx>
 */
public class Crammer extends DataSet{
    
        ArithmeticClass o = new ArithmeticClass();
        
        Double determinantSystem = (x_array.size()*o.sumXi2(x_array)) - (o.sumXi(x_array)*o.sumXi(x_array));
        Double determinantBeta0 = (o.sumYi(y_array)*o.sumXi2(x_array)) - (o.sumXi(x_array)*o.sumXiYi(x_array, y_array));
        Double determinantBeta1 = (x_array.size()*o.sumXi(x_array)) - (o.sumXi(x_array)*o.sumYi(y_array));
        
    Double Beta0(){
        return (determinantBeta0/determinantSystem);   
    }
    
    Double Beta1(){
        return (determinantBeta1/determinantSystem);   
    }
    
    Double predict(Double x){
        return (Beta0()+(Beta1()*x));
    }
}
