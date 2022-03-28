
import java.util.*;

/**
 * 
 * @author Rafael Camacho Roldán <za18012201@zapopan.tecmm.edu.mx>
 */
public class ArithmeticClass extends DataSet{
    Double result=0.0;
    
    //Sumatories values
    double sumXi(ArrayList<Double> x_array){
        result=0.0;
        for(int i=0;i<x_array.size();i++){
            result+=x_array.get(i);    
        }
        return result;
    }
    
    double sumYi(ArrayList<Double> y_array){
        result=0.0;
        for(int i=0;i<x_array.size();i++){
            result+=y_array.get(i);    
        }
        return result;
    }
    
    double sumXi2(ArrayList<Double> x_array){
        result=0.0;
        for(int i=0;i<x_array.size();i++){
            result+=Math.pow(x_array.get(i), 2);
        }
        return result;
    }
    
    double sumXiYi(ArrayList<Double> x_array, ArrayList<Double>y_array){
        result=0.0;
        for(int i=0;i<x_array.size();i++){
            result+=x_array.get(i)*y_array.get(i);
        }
        return result;
    }
    
//Calculo de Betas por medio de Crammer
        Double determinantSystem = (x_array.size()*sumXi2(x_array)) - (sumXi(x_array)*sumXi(x_array));
        Double determinantBeta0 = (sumYi(y_array)*sumXi2(x_array)) - (sumXi(x_array)*sumXiYi(x_array, y_array));
        Double determinantBeta1 = (x_array.size()*sumXiYi(x_array,y_array)) - (sumXi(x_array)*sumYi(y_array));
        
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
