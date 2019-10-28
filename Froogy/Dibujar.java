// clase dibujar jpanel
package froogy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D; //graficar 2D
import java.awt.event.ActionEvent; //obtener eventos
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel; //crear jpanes y ocurra toda la accion del programa
import javax.swing.Timer; // refrescando cada 5 mili segundo (tasa de refresco)

public class Dibujar extends JPanel implements ActionListener{ // la clase Dibujar sera un jpanel 
    //actionlistener detecte cuando una telca se presione se activara
    //relacion entre rana y dibujar vamos a instanciar
    Frog rana=new Frog(); //objeto rana
    Timer timer= new Timer(5,this);//tasa de refresco del timer 5 mili seg
    
    //constructor
    public Dibujar(){
        setBackground(Color.WHITE);// selecciona el color del fondo
        setFocusable(true);// se coloque dentro el objeto y se pueda mover se activa jpanel
        addKeyListener(new teclado());//instanciar clase telcado y capture lo que son teclas
        timer.start(); //empieza el timer
    }
    
    //Metodos
    
    //Metodo pintar //coloca imagen dentro de un punto
    public void paint(Graphics grafica){ //recibe una grafica
        super.paint(grafica);
        Graphics2D g2= (Graphics2D)grafica; //va a provenir de graphics 2d
        //establecer imagen en pos
        g2.drawImage(rana.tenerImagen(),rana.tenerX(),rana.tenerY(),null);//Establece imagen en posicion(x,y);
    }
    
    public void actionPerformed(ActionEvent e){//cuando se detecte evento
        rana.mover();
        repaint();// preestablecido con graphics
    }
    
    //declarar cuando se detectaran las teclas clase teclado no intierviene con clase Dibujar
    private class teclado extends KeyAdapter{
        
        public void keyPressed(KeyEvent e){
            rana.keyPressed(e);//cuando detecte tecla presionada mande a llamar rana.tecla presionada
        }
        
        public void keyReleased(KeyEvent e){
            rana.keyReleased(e);//tecla que se dejo de presionar
        }
        
    }
    
}
