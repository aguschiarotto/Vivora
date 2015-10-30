/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author tati
 */
public class Teclado implements KeyListener{

    private final static int numeroTeclas=120;
    private final boolean[] teclas = new boolean[numeroTeclas];
    
    public boolean arriba;
    public boolean abajo;
    public boolean izquierda;
    public boolean derecha;
    
    
    public void actualizar(){
        arriba=teclas[KeyEvent.VK_W]; //Obtiene que valor booleano tiene la pos de la W
        abajo=teclas[KeyEvent.VK_S];
        izquierda=teclas[KeyEvent.VK_A];
        derecha=teclas[KeyEvent.VK_D];
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
   //             System.out.println("keyPressed=" + KeyEvent.getKeyText(e.getKeyCode()));
 //     teclas[e.getKeyCode()]=true; //Obtiene el codigo de la tecla presionada y lo convierte en true en el arreglo.
    }

    @Override
    public void keyPressed(KeyEvent e) {
      teclas[e.getKeyCode()]=true; //Cuando suelta la tecla se pone false
    }

    @Override
    public void keyReleased(KeyEvent e) {
        teclas[e.getKeyCode()] = false;
        
    }
    
}
