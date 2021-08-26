package main;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
                Cuadrado cuad = new Cuadrado();
                Circunferencia cir = new Circunferencia();
                Scanner l = new Scanner(System.in);
                System.out.println("Ingrese coordenada inicial");
                System.out.println("Ingrese x");
                int xi = l.nextInt();
                System.out.println("Ingrese y");
                int yi = l.nextInt();
                System.out.println("Ingrese coordenada final");
                System.out.println("Ingrese x");
                int xf = l.nextInt();
                System.out.println("Ingrese y");
                int yf = l.nextInt(); 
                System.out.println("Ingrese el lado del cuadrado");
                int lado = l.nextInt();
	}
}
 
class Coord {
    private int x, y;
 
    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}

class Cuadrado {
    private Coord c;
    private int lado;
    public Cuadrado(){
    }
    public Cuadrado(Coord c, int lado) {
        this.c = c;
        this.lado = lado;
    }
    public void Traslacion(Coord t) {  // Complete los parámetros requeridos
        c.setX(t.getX()+c.getX());
        c.setY(t.getY()+c.getY());      
    }
    public void Escalado() {  // Complete los parámetros requeridos
        
    }
    public void Rotacion() {  // Complete los parámetros requeridos
        
    }
}

class Circunferencia {
    Coord c;
    float radio;
    // Implementar los métodos Traslacion, Escalado y Rotacion para ésta clase
    
    public Circunferencia(){
     }
    public Circunferencia(Coord c, float radio) {
        this.c = c;
        this.radio = radio;
    }
    
    public void Traslacion() { 
        
    }
    public void Escalado() {  
        
    }
    public void Rotacion() { 
        
    }
}


