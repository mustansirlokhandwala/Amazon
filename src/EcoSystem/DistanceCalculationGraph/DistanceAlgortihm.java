/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EcoSystem.DistanceCalculationGraph;

import EcoSystem.Person.Address;
import static java.lang.StrictMath.atan2;
import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sin;
import static java.lang.StrictMath.sqrt;

/**
 *
 * @author Mustansir
 */
public class DistanceAlgortihm {
    
    public static double callocationdistance(Address city1 , Address city2){
        
     double location1lattitude = city1.getLatitude();
     double location2lattitude=city2.getLatitude();
     double location1longitude=city1.getLongitude();
     double location2longitude=city2.getLongitude();
    
    
     double distancelat = location1lattitude - location2lattitude;
    double distancelog = location1longitude - location2longitude;
    

    
     double a = pow((sin(distancelat/2)), 2) + cos(location1lattitude) * cos(location2lattitude) *  pow((sin(distancelog/2)), 2) ;
     double c = 2 * atan2(sqrt(a),sqrt(1-a));
     double d = 3691 *c;
     return d/10;
    }
    
    
    
    
}
