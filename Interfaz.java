package edm;
import java.awt.EventQueue; 

import javax.swing.JFrame; 
import javax.swing.JLabel; 
import java.awt.Font; 
import java.util.ArrayList; 
 
import javax.swing.JComboBox; 
import javax.swing.JTextField; 
import javax.swing.JButton; 
import java.awt.event.ItemListener; 
import java.awt.event.ItemEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
 
public class Interfaz { 
  
 static ArrayList<Mago> listaMagos = new ArrayList<Mago>(); 
  
 Mago editorMago = new Mago(); 
  
 private JFrame frame; 
 private JTextField txtNombre; 
 private JTextField txtVida; 
 private JTextField txtRango; 
 private JTextField txtFuerza; 
 private JTextField txtNivel; 
 private JTextField txtMana; 
 private JTextField txtElemento; 
 
 /** 
  * Launch the application. 
  */ 
 public static void main(String[] args) { 
  EventQueue.invokeLater(new Runnable() { 
   public void run() { 
    try { 
     Interfaz window = new Interfaz(); 
     window.frame.setVisible(true); 
    } catch (Exception e) { 
     e.printStackTrace(); 
    } 
   } 
  }); 
 } 
 
 /** 
  * Create the application. 
  */ 
 public Interfaz() { 
  initialize(); 
 } 
 
 /** 
  * Initialize the contents of the frame. 
  */ 
 private void initialize() { 
  Jugador.init();
  Jugador.Leercsv(listaMagos); 
  frame = new JFrame(); 
  frame.setBounds(100, 100, 450, 300); 
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  frame.getContentPane().setLayout(null); 
   
  JLabel lblTitulo = new JLabel("Editor de magos"); 
  lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 17)); 
  lblTitulo.setBounds(147, 11, 161, 21); 
  frame.getContentPane().add(lblTitulo); 
   
  JLabel lblNewLabel = new JLabel("Cesar_dev"); 
  lblNewLabel.setBounds(126, 35, 250, 14); 
  frame.getContentPane().add(lblNewLabel); 
   
  JLabel lblMago = new JLabel("Mago"); 
  lblMago.setBounds(36, 59, 62, 14); 
  frame.getContentPane().add(lblMago); 
   
  JLabel lblNombre = new JLabel("Nombre"); 
  lblNombre.setBounds(36, 84, 62, 14); 
  frame.getContentPane().add(lblNombre); 
   
  JLabel lblVida = new JLabel("Vida"); 
  lblVida.setBounds(36, 109, 62, 14); 
  frame.getContentPane().add(lblVida); 
   
  JLabel lblNewLabel_1 = new JLabel("Rango"); 
  lblNewLabel_1.setBounds(36, 134, 62, 14); 
  frame.getContentPane().add(lblNewLabel_1); 
   
  JLabel lblFuerza = new JLabel("Fuerza"); 
  lblFuerza.setBounds(225, 59, 53, 14); 
  frame.getContentPane().add(lblFuerza); 
   
  JLabel lblNivel = new JLabel("Nivel"); 
  lblNivel.setBounds(225, 84, 46, 14); 
  frame.getContentPane().add(lblNivel); 
   
  JLabel lblMana = new JLabel("Mana"); 
  lblMana.setBounds(225, 109, 53, 14); 
  frame.getContentPane().add(lblMana); 
   
  JLabel lblElemento = new JLabel("Elemento"); 
  lblElemento.setBounds(225, 134, 64, 14); 
  frame.getContentPane().add(lblElemento); 
   
  txtNombre = new JTextField(); 
  txtNombre.setBounds(101, 81, 86, 20); 
  frame.getContentPane().add(txtNombre); 
  txtNombre.setColumns(10); 
   
  txtVida = new JTextField(); 
  txtVida.setBounds(96, 106, 86, 20); 
  frame.getContentPane().add(txtVida); 
  txtVida.setColumns(10); 
   
  txtRango = new JTextField(); 
  txtRango.setBounds(96, 131, 86, 20); 
  frame.getContentPane().add(txtRango); 
  txtRango.setColumns(10); 
   
  txtFuerza = new JTextField(); 
  txtFuerza.setBounds(288, 56, 86, 20); 
  frame.getContentPane().add(txtFuerza); 
  txtFuerza.setColumns(10); 
   
  txtNivel = new JTextField(); 
  txtNivel.setBounds(277, 81, 86, 20); 
  frame.getContentPane().add(txtNivel); 
  txtNivel.setColumns(10); 
   
  txtMana = new JTextField(); 
  txtMana.setBounds(277, 106, 86, 20); 
  frame.getContentPane().add(txtMana); 
  txtMana.setColumns(10); 
   
  txtElemento = new JTextField(); 
  txtElemento.setBounds(299, 131, 86, 20); 
  frame.getContentPane().add(txtElemento); 
  txtElemento.setColumns(10); 
   
  JComboBox cboMago = new JComboBox(); 
  cboMago.addItemListener(new ItemListener() { 
   public void itemStateChanged(ItemEvent e) { 
    try { 
     String index = 
(String.valueOf(cboMago.getSelectedIndex())); 
     editorMago = 
listaMagos.get(Integer.parseInt(index)); 
     txtNombre.setText(editorMago.getNombre()); 
    
 txtVida.setText(String.valueOf(editorMago.getVida())); 
    
 txtRango.setText(String.valueOf(editorMago.getRango())); 
    
 txtFuerza.setText(String.valueOf(editorMago.getFuerza())); 
    
 txtNivel.setText(String.valueOf(editorMago.getNivel())); 
    
 txtMana.setText(String.valueOf(editorMago.getMana())); 
     txtElemento.setText(editorMago.getElemento()); 
    } catch (Exception e2) { 
     txtNombre.setText(""); 
     txtVida.setText(""); 
     txtRango.setText(""); 
     txtFuerza.setText(""); 
     txtNivel.setText(""); 
     txtMana.setText(""); 
     txtElemento.setText(""); 
    } 
   } 
    
  }); 
  cboMago.setBounds(96, 55, 71, 22); 
  frame.getContentPane().add(cboMago); 
  for(int i = 0; i < listaMagos.size(); i++) { 
   cboMago.addItem(String.valueOf(i)); 
  } 
  cboMago.addItem("Nuevo"); 
   
   
  JButton btnEditarMago = new JButton("Editar mago"); 
  btnEditarMago.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
    int index = cboMago.getSelectedIndex(); 
    String Nombre = String.valueOf(txtNombre.getText()); 
    int Vida = Integer.valueOf(txtVida.getText()); 
    int Rango = Integer.valueOf(txtRango.getText()); 
    int Fuerza = Integer.valueOf(txtFuerza.getText()); 
    int Nivel = Integer.valueOf(txtNivel.getText()); 
    int Mana = Integer.valueOf(txtMana.getText()); 
    String Elemento = 
String.valueOf(txtElemento.getText()); 
    Mago nuevoMago = new Mago(Nombre, Vida, Rango, Fuerza, 
Nivel, Mana, Elemento); 
 
     
    Jugador.Modificarcsv(listaMagos, index, nuevoMago); 
    System.out.println("El mago ha sido modificado exitosamente"); 
   } 
  }); 
  btnEditarMago.setBounds(36, 159, 161, 64); 
  frame.getContentPane().add(btnEditarMago); 
   
  JButton btnNuevoMago = new JButton("Nuevo mago"); 
  btnNuevoMago.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent e) { 
    //Crear nuevo mago 
    String Nombre = String.valueOf(txtNombre.getText()); 
    int Vida = Integer.valueOf(txtVida.getText()); 
    int Rango = Integer.valueOf(txtRango.getText()); 
    int Fuerza = Integer.valueOf(txtFuerza.getText()); 
    int Nivel = Integer.valueOf(txtNivel.getText()); 
    int Mana = Integer.valueOf(txtMana.getText()); 
    String Elemento = 
String.valueOf(txtElemento.getText()); 
     
    Mago nuevoMago = new Mago(Nombre, Vida, Rango, Fuerza, 
Nivel, Mana, Elemento); 
    listaMagos.add(nuevoMago); 
    System.out.println("El mago ha sido añadido exitosamente. Datos del mago: "); 
    nuevoMago.VerPersonaje(); 
    Jugador.Escribircsv(listaMagos); 
     
    cboMago.setSelectedItem("Nuevo"); 
    txtNombre.setText(""); 
    txtVida.setText(""); 
    txtRango.setText(""); 
    txtFuerza.setText(""); 
    txtNivel.setText(""); 
    txtMana.setText(""); 
    txtElemento.setText(""); 
    editorMago = new Mago(); 
    cboMago.removeAllItems(); 
    for(int i = 0; i < listaMagos.size(); i++) { 
     cboMago.addItem(String.valueOf(i)); 
    } 
    cboMago.addItem("Nuevo");   
    cboMago.setSelectedItem("Nuevo"); 
   } 
  }); 
  btnNuevoMago.setBounds(218, 159, 168, 64); 
  frame.getContentPane().add(btnNuevoMago); 
 } 
} 
 