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
    car coche=new car();
    car2 cocher=new car2();
    Back back=new Back();
    log wood=new log();
    log2 woodr=new log2();
    log3 wood2=new log3();
    Leaf leaf1=new Leaf();
    Timer timer= new Timer(5,this);//tasa de refresco del timer 5 mili seg
    
    //constructor
    public Dibujar(){
        setBackground(Color.GRAY);// selecciona el color del fondo
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
        g2.drawImage(coche.tenerImagen(),coche.tenerX(),coche.tenerY(),null);
        g2.drawImage(cocher.tenerImagen(),cocher.tenerX(),cocher.tenerY(),null);
        g2.drawImage(wood.tenerImagen(),wood.tenerX(),wood.tenerY(),null);
        g2.drawImage(woodr.tenerImagen(),woodr.tenerX(),woodr.tenerY(),null);
        g2.drawImage(wood2.tenerImagen(),wood2.tenerX(),wood2.tenerY(),null);
        g2.drawImage(leaf1.tenerImagen(),leaf1.tenerX(),leaf1.tenerY(),null);
        
        
        
        
        g2.drawImage(back.tenerImagen(),back.tenerX(),back.tenerY(),null);// dibuja escenario
        
    }
    
    public void actionPerformed(ActionEvent e){//cuando se detecte evento
        rana.mover();
        coche.mover();
        cocher.mover();
        wood.mover();
        woodr.mover();
        wood2.mover();
        leaf1.mover();
        
        
        repaint();// preestablecido con graphics
    }
    
    //declarar cuando se detectaran las teclas clase teclado no intierviene con clase Dibujar
    private class teclado extends KeyAdapter{
        
        public void keyPressed(KeyEvent e){
            rana.keyPressed(e);//cuando detecte tecla presionada mande a llamar rana.tecla presionada
            coche.keyPressed(e);
            cocher.keyPressed(e);
            wood.keyPressed(e);
            woodr.keyPressed(e);
            wood2.keyPressed(e);
            leaf1.keyPressed(e);
        }
        
        public void keyReleased(KeyEvent e){
            rana.keyReleased(e);//tecla que se dejo de presionar
        }
        
    }
    
}
