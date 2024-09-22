package edm;

public class Mago extends Personaje implements InterfacePersonaje { 
	 //Atributos 
	 private int mana; 
	 private String elemento; 
	 
	  
	 //Constructor 
	 public Mago(String nombre, int vida, int rango, int fuerza, int nivel, 
	int mana, String elemento) { 
	  super(nombre, vida, rango, fuerza, nivel); 
	  this.mana = mana; 
	  this.elemento = elemento; 
	 } 
	  
	 public Mago() { 
	 
	 } 
	  
	 public int getMana() { 
	  return mana; 
	 } 
	 
	 
	 
	 public void setMana(int mana) { 
	  this.mana = mana; 
	 } 
	 
	 
	 
	 public String getElemento() { 
	  return elemento; 
	 } 
	 
	 
	 
	 public void setElemento(String elemento) { 
	  this.elemento = elemento; 
	 } 
	 
	 
	 
	 //Métodos 
	 public void VerPersonaje() { 
	  super.VerPersonaje(); 
	  System.out.println("Mana: " + this.mana); 
	  System.out.println("Elemento: " + this.elemento); 
	 } 
	  
	 public int atacar() { 
	  if(this.mana <= 0) { 
	   System.out.println("No tengo maná"); 
	   return 0; 
	  } else { 
	  this.mana = this.mana - 5; 
	  System.out.println("El mago lanza un hechizo con una fuerza de: " + 
	(this.getFuerza()) + ". La cantidad de maná restante es: " + this.mana); 
	  return (this.getFuerza());} 
	 } 
	  
	 public void subirNivel() {}; 
	} 
