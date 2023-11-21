/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author fa20-bse-149
 */
public class Geometry {
    public void createShape(String shapeName){
        if(shapeName==null || shapeName.isEmpty()){
            System.out.println("Enter the shape you want to draw");
        }
         else if (shapeName.contains("CIRCLE")){
             new circle().draw();
         }
         else if(shapeName.contains("SQAURE")){
             new square().draw();
         }
         else if (shapeName.contains("RECTANGLE")){
             new Rectangle().draw();
         }
         else {
             System.out.println("please Enter in Capital Letters");
         }
    
    }
   
}
