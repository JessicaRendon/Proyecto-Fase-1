/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajr;

/**
 *
 * @author Labing I5
 */
public class Jugador extends Casilla {
    
    public Jugador(int a,int p){
        if(p==1){
        this.setCasilla("W");
        }else{
        this.setCasilla(a+"");
        }
    }
 
    @Override
    public void setCasilla(String a) {
       super.valorImpresion=a; 
    }

    @Override
    public String getCasilla() {
     return super.valorImpresion;   
    }
         @Override
    public boolean isVacio() {
     return false;
    }
}
