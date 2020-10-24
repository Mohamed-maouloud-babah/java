/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecter;

/**
 *
 * @author adoud
 */
public class rectangle {
    double lenght;
    double width;
    
    rectangle(){
        
    }
    rectangle(double lenght){
        this.lenght=lenght;
         this.width=width;
    }
    
    public double getarea(){
     return   lenght*width;
    }
    
    public double getperimetre(){
        return (lenght+width)*2;
    }
    
}
