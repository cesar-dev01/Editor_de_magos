package edm;

public class Personaje {
	 //Atributos 
	 private String nombre; 
	 private int vida; 
	 private int rango; 
	 private int fuerza; 
	 private int nivel; 
	 
	  
	 //Constructor 
	 public Personaje(String nombre, int vida, int rango, int fuerza, int 
	nivel) { 
	  this.nombre = nombre; 
	  this.vida = vida; 
	  this.rango = rango; 
	  this.fuerza = fuerza; 
	  this.nivel = nivel; 
	 } 
	  
	 public Personaje() { 
	   
	 } 
	  
	 //Métodos 
	 public void VerPersonaje() { 
	  System.out.println("--------------"); 
	  System.out.println("Ver Personaje"); 
	  System.out.println("Nombre: " + this.nombre); 
	  System.out.println("Vida: " + this.vida); 
	  System.out.println("Rango: " + this.rango); 
	  System.out.println("Fuerza: " + this.fuerza); 
	  System.out.println("Nivel: " + this.nivel); 
	 } 
	 
	 public String getNombre() { 
	  return nombre; 
	 } 
	 
	 public int getVida() { 
	  return vida; 
	 } 
	 
	 public int getRango() { 
	  return rango; 
	 } 
	 
	 public int getFuerza() { 
	  return fuerza; 
	 } 
	 
	 public int getNivel() { 
	  return nivel; 
	 } 
	 
	 public void setNombre(String nombre) { 
	  this.nombre = nombre; 
	 } 
	 
	 public void setVida(int vida) { 
	  this.vida = vida; 
	 } 
	 
	 public void setRango(int rango) { 
	  this.rango = rango; 
	 } 
	 
	 public void setFuerza(int fuerza) { 
	  this.fuerza = fuerza; 
	 } 
	 
	 public void setNivel(int nivel) { 
	  this.nivel = nivel; 
	 } 
	  
	 public int atacar() { 
	  System.out.println("El personaje ataca con una fuerza de: " + 
	this.fuerza); 
	  return this.fuerza; 
	 } 
}
