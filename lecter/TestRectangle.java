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
public class TestRectangle {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        
          
        System.out.println("the side of leght is"+rec.lenght);
        System.out.println("the side of width is"+rec.width);
        System.out.println("the area is"+rec.getarea());
        System.out.println("the perimetre"+rec.getperimetre());
        
    }
    
}
