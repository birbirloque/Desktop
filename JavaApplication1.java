package javaapplication1;
import javax.swing.JOptionPane;

public class JavaApplication1 {

    public static void main(String[] args) {       

        int op = JOptionPane.showOptionDialog(null,"Seleccione","Figuras Geometricas",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Cuadrado","Triangulo"},"");
        
        if(op == 0){
            Cuadrado obj1 = new Cuadrado();
            float v1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la base del cuadrado"));
            obj1.setBase(v1);
            JOptionPane.showMessageDialog(null,"El área del cuadrado es: " + obj1.Area(), "Figuras", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"El perimetro del cuadrado es: " + obj1.Perimetro(), "Figuras", JOptionPane.INFORMATION_MESSAGE);
        }else if(op == 1){
            Triangulo obj2 = new Triangulo();
            float v2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la base del triangulo"));
            obj2.setBase(v2);
            float v3 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la altura del triangulo"));
            obj2.setAltura(v3);
            float v4 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el lado del triangulo"));
            obj2.setLado(v4);
            JOptionPane.showMessageDialog(null,"El área del triangulo es: " + obj2.Area(), "Figuras", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"El perimetro del triangulo es: " + obj2.Perimetro(), "Figuras", JOptionPane.INFORMATION_MESSAGE);
        } 
        
    }
    
}
