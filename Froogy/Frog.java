// crear rana
package froogy;

import java.awt.Image; // carga imagenes
import java.awt.event.KeyEvent; //modifica eventos // reconca tecla en evento
import javax.swing.ImageIcon;

public class Frog {
    //atributos
    private String frog; // ---> ayuda hacer el movimiento imagen = string campobits
    private int dx; //cordenada en x --> hacermovimiento
    private int dy; // cordenada en y --> hacer movimiento
    private int x; //posicionar objeto en x
    private int y; // posicionar objeto en y
    private Image imagen; //tipo de dato image(guarda mapa de bits)
    
    //constructores
    
    public Frog(){
        
        x=380; //posicion inicial
        y=400; //posicion inicial //valores positivos son hacia abajo
        frog="frog.png"; //crga imagen del sapo que se encuentra dentro del paquete
        
        ImageIcon img = new ImageIcon(this.getClass().getResource(frog));//recurso a utilizar, y traer recurso el que esta en frog
        imagen=img.getImage();// busca imagen y se guarda en el atributo;
      
    }
    
    //Metodos 
    
    //Detectar teclas
    public void keyPressed(KeyEvent e){
        //si se utiliza este metodo individualmente el objeto seguiria moviendose
        //entonces hay necesidad de otro metodo KeyReleased
        //Evaluar tecla presionada una vez guardad
        int Key = e.getKeyCode();//codigo de tecla presionada
        
        if(Key == KeyEvent.VK_LEFT){//Tecla izquierda presionada
            dx=-1; //reduce un espacio en el eje de las x
        }
        
        if(Key == KeyEvent.VK_RIGHT){
            dx=1; //movimiento derecha en eje x
        }
        
        if(Key == KeyEvent.VK_UP){
            dy=-1; //movimiento Arriba en eje y
        }
        
         if(Key == KeyEvent.VK_DOWN){
            dy=1; //movimiento Abajo en eje y
         }
}
    
    public void keyReleased(KeyEvent e){
        
        //Evaluar tecla presionada una vez guardada
        int Key = e.getKeyCode();//codigo de tecla presionada
        
        if(Key == KeyEvent.VK_LEFT){//Tecla izquierda presionada
            dx=0; //=0 Evita que siga moviendose en el eje x
        }
        
        if(Key == KeyEvent.VK_RIGHT){
            dx=0; //=0 Evita que siga moviendose en el eje x
        }
        
        if(Key == KeyEvent.VK_UP){
            dy=0; //=0 Evita que siga moviendose en el eje y
        }
        
         if(Key == KeyEvent.VK_DOWN){
            dy=0; //=0 Evita que siga moviendose en el eje y
         }
}
    
    //Metodo para mover objeto
    public void mover(){
        x+=dx; //acumulador en eje x para desplazarse
        y+=dy; //acumulador en eye y para ir desplazandose
        
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
