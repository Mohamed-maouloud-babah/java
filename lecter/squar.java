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
public class squar {
    double side;
squar() {
 }
  squar (double side) {
      this.side=side;
  } 
  
public double getArea(){
return side*side;
}

public double getperimeter() {
    return 4*side;
}
}
