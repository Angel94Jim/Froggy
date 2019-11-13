// crear rana
package froogy;

import java.awt.Image; // carga imagenes
import java.awt.event.KeyEvent; //modifica eventos // reconca tecla en evento
import javax.swing.ImageIcon;

public class log2 {
    //atributos
    private String log; // ---> ayuda hacer el movimiento imagen = string campobits
    private int dx; //cordenada en x --> hacermovimiento
    private int dy; // cordenada en y --> hacer movimiento
    private int x; //posicionar objeto en x
    private int y; // posicionar objeto en y
    private Image imagen; //tipo de dato image(guarda mapa de bits)
    
    //constructores
    
    public log2(){
        
        x=1400; //posicion inicial
        y=229; //posicion inicial //valores positivos son hacia abajo
        log="log.png"; //crga imagen del sapo que se encuentra dentro del paquete
        
        
        ImageIcon img = new ImageIcon(this.getClass().getResource(log));//recurso a utilizar, y traer recurso el que esta en frog
        imagen=img.getImage();// busca imagen y se guarda en el atributo;
      
    }
    
    //Metodos 
    
    //Detectar teclas
   
    public void keyPressed(KeyEvent e){
        //si se utiliza este metodo individualmente el objeto seguiria moviendose
        //entonces hay necesidad de otro metodo KeyReleased
        //Evaluar tecla presionada una vez guardad
        int Key = e.getKeyCode();//codigo de tecla presionada
        
        if(Key == KeyEvent.VK_UP){
            dx=1; //movimiento derecha en eje x
        }
        
}
    
    //Metodo para mover objeto
    public void mover(){
        
        x-=dx;//acumulador en eje x para desplazarse
        if(x<0){
           x+=dx;
           x=x+1300;
        }
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
