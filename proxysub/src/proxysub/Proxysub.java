/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxysub;

/**
 *
 * @author FA20-BSE-149
 */
public class Proxysub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

     
      image.display(); 
      System.out.println("");
      image.display();
    }
    
}
