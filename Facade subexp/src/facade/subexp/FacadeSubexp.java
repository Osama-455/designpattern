/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade.subexp;

/**
 *
 * @author fa20-bse-149
 */
public class FacadeSubexp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      shapeMaker.drawSquare();		
   }
    }
    

