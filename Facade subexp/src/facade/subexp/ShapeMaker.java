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
public class ShapeMaker {
    private Shape circle;
   private Shape rectangle;
   private Shape square;
   private Shape triangle;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
      triangle = new Triangle();
   }

   public void drawCircle() {
      circle.draw();
   }

   public void drawRectangle() {
      rectangle.draw();
   }

   public void drawSquare() {
      square.draw();
   }

   public void drawTriangle() {
      triangle.draw();
   }
}
