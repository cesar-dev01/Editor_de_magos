package edm;
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.util.ArrayList; 
import java.io.File;
 
public class Jugador { 

	public static void init() {
	File Archivo = new File("./Magos.csv");
	  try {
		  if (Archivo.exists()) {
			  Archivo.createNewFile();
		  }
	  } catch (IOException e){
		  e.printStackTrace();
	  }
	}
	
 public static ArrayList<Mago> Leercsv(ArrayList<Mago> listaMagos){ 
  String linea = ""; 
  String splitBy = ","; 
  try { 
   BufferedReader br = new BufferedReader(new FileReader("./Magos.csv")); 
   while((linea = br.readLine()) != null) 
   { 
    String[] mago = linea.split(splitBy); 
    Mago m1 = new Mago(mago[0], Integer.parseInt(mago[1]), 
Integer.parseInt(mago[2]), Integer.parseInt(mago[3]), Integer.parseInt(mago[4]), 
Integer.parseInt(mago[5]), mago[6]);     
    listaMagos.add(m1); 
   } 
  } catch (IOException e) { 
   e.printStackTrace(); 
  } 
  return listaMagos; 
 } 
  
 public static ArrayList<Mago> Escribircsv(ArrayList<Mago> listaMagos){ 
  try { 
   BufferedWriter bfw = new BufferedWriter(new 
FileWriter("./Magos.csv")); 
   Mago mago; 
   for (int i = 0; i < listaMagos.size(); i++) { 
    mago = listaMagos.get(i); 
    String[] magolinea = 
{String.valueOf(mago.getNombre()), String.valueOf(mago.getVida()), 
String.valueOf(mago.getRango()), String.valueOf(mago.getFuerza()), 
String.valueOf(mago.getNivel()), String.valueOf(mago.getMana()), 
String.valueOf(mago.getElemento())}; 
     
    for(int j = 0; j < magolinea.length; j++) { 
     bfw.append(magolinea[j]); 
     if (j < magolinea.length) { 
      bfw.append(","); 
     } 
    }; 
    bfw.newLine(); 
   } 
   bfw.flush(); 
   bfw.close(); 
  } catch(IOException e) { 
   e.printStackTrace(); 
  } 
  return listaMagos; 
 } 
  
 public static ArrayList<Mago> Modificarcsv(ArrayList<Mago> listaMagos, 
int index, Mago nuevoMago){ 
  try { 
   listaMagos.clear(); 
   String linea = ""; 
   String splitBy = ","; 
   BufferedReader br = new BufferedReader(new 
FileReader("./Magos.csv")); 
   while((linea = br.readLine()) != null) 
   { 
    String[] mago = linea.split(splitBy); 
    Mago m1 = new Mago(mago[0], Integer.parseInt(mago[1]), 
Integer.parseInt(mago[2]), Integer.parseInt(mago[3]), Integer.parseInt(mago[4]), 
Integer.parseInt(mago[5]), mago[6]);     
    listaMagos.add(m1); 
   } 
   listaMagos.set(index, nuevoMago); 
   Jugador.Escribircsv(listaMagos); 
  } catch (IOException e) { 
   e.printStackTrace(); 
  } 
  return listaMagos; 
} 
} 