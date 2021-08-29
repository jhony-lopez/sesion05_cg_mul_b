package main;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
                int xi,yi,xf,yf,lado;              
                
                Circunferencia cir = new Circunferencia();
                Scanner l = new Scanner(System.in);
                System.out.println("Ingrese coordenada inicial");
                System.out.print("Ingrese x: ");
                xi = l.nextInt();
                System.out.print("Ingrese y: ");
                yi = l.nextInt();
                System.out.println("Ingrese el vector de traslacion");
                System.out.print("Ingrese x: ");
                xf = l.nextInt();
                System.out.print("Ingrese y: ");
                yf = l.nextInt(); 
                System.out.println("Ingrese el lado del cuadrado");
                lado = l.nextInt();
                Coord coini = new Coord(xi,yi);
                Coord vect = new Coord(xf,yf);
                Cuadrado cuad = new Cuadrado(coini,lado);               
                cuad.Traslacion(vect);
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
    public void imprimir1(){
        System.out.println("La cordenada inicial del primer vertice es: " + x +","+ y);
    }
    public void imprimir2(){
        System.out.println("La cordenada final del primer vertice es: " + x +","+ y);
    }
}

class Cuadrado {
    private Coord c;
    private int lado;

    public Cuadrado(Coord c, int lado) {
        this.c = c;
        this.lado = lado;
    }
    public void Traslacion(Coord t) {  // Complete los parámetros requeridos
        c.imprimir1();
        c.setX(t.getX()+c.getX());
        c.setY(t.getY()+c.getY());
        c.imprimir2();
    }
    public void Escalado(int s) {  // Complete los parámetros requeridos
        lado = (int)(lado*(1+s/100.0f));
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


