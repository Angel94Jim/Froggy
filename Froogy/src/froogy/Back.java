// crear rana
package froogy;

import java.awt.Image; // carga imagenes
import javax.swing.ImageIcon;

public class Back {
    //atributos
    private String back; // ---> ayuda hacer el movimiento imagen = string campobits
   
    private int x; //posicionar objeto en x
    private int y; // posicionar objeto en y
    private Image imagen; //tipo de dato image(guarda mapa de bits)
    
    //constructores
    
    public Back(){
        
        x=0; //posicion inicial
        y=-20; //posicion inicial //valores positivos son hacia abajo
        back="main1.png"; //crga imagen del sapo que se encuentra dentro del paquete
        
        
        ImageIcon img = new ImageIcon(this.getClass().getResource(back));//recurso a utilizar, y traer recurso el que esta en frog
        imagen=img.getImage();// busca imagen y se guarda en el atributo;
      
    }
    
    //Metodo para conocer posicion actual Retornar valores de pos
    public int tenerX(){
        return x; //Retorna pos x
    }
    
    public int tenerY(){
        return y; // Retorn pos y
    }
    //contenido de x&&y
    public Image tenerImagen(){
        return imagen;
    }
}
