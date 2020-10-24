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
public class TestSquar {
    
     public static void main(String[] args) {
         squar a =new squar(5);
          squar b =new squar(5.75); 
           System.out.println("the side length is "+a.side);
           System.out.println("the side length is "+b.side);
           System.out.println("the area is "+a.getArea());
           System.out.println("the area is "+b.getperimeter());
           System.out.println("the perimetr is "+a.getperimeter());
           System.out.println("the perimeter is "+b.getperimeter());
         }
     }

