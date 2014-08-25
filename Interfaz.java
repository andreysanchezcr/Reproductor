import javax.swing.*;
import java.awt.event.*;
import java.io.File; 
import java.util.logging.Level; 
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jlgui.basicplayer.BasicPlayerException;




public class Interfaz extends JFrame// implements ActionListener// implements java.awt.ActionListener
{

	String estadoM;
	JButton BtnPlay;//Boton para reproducir musica
	JButton BtnStop;
	
	JButton BtnAbrir;
	//JTextField text;
	JLabel l1;
	JSlider volumen;
	JFileChooser archivo;
	public Interfaz(){
		super("Reproductor");
		this.setBounds(25,56,200,300);//Dimensiones
		this.setVisible(true);//Hace visible la Interfaz
		this.setLayout(null);//Quita el Layout
		this.setSize(900,900);// Dimensiones de la Interfaz
		this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		cargar();



	}
	public void filtros(){

		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archiv"+ "o MP3", "mp3", "mp3"); 
		archivo.setFileFilter(filtro); 

        int seleccion = archivo.showOpenDialog(this); 
        if (seleccion == JFileChooser.APPROVE_OPTION) { 
            String archivoS = archivo.getSelectedFile().toString(); 
            System.out.println(archivoS);
        }
        //try { 
        //    miReproductor.control.open(archivoS);//Le decimos al control del player que abra el archivo 
        //    } catch (BasicPlayerException ex) { 
        //        System.out.println("Sucedio un error"); 
        //    } 
         

	}

	public void cargar(){
		//eventoPlay evento = new eventoPlay();
		archivo = new JFileChooser();
		BtnStop=new JButton("Pausar");
		BtnAbrir=new JButton("Abrir");
		BtnPlay = new JButton("Reproducir");
		volumen = new javax.swing.JSlider();
		BtnPlay.setBounds(400,50,150,50);//setBounds(x,y,ancho,largo)**Sirve para dar Atributos al boton
		BtnStop.setBounds(200,50,150,50);//setBounds(x,y,ancho,largo)**Sirve para dar Atributos al boton
		BtnAbrir.setBounds(400,100,150,50);//setBounds(x,y,ancho,largo)**Sirve para dar Atributos al boton
		volumen.setBounds(200,100,170,100);
		/*BtnPlay.addActionListener(new java.awt.event.ActionListener()){
			@Override
			public void actionPerformed(ActionEvent ae){
				System.out.println("fsadfaf");
			}
		});*/
		//BtnPlay.setActionCommand("BtnPlay");//Sirve para devolver un valor al listener
		Evento evento= new Evento();
		BtnPlay.addActionListener(evento);
		BtnStop.addActionListener(evento);
		BtnAbrir.addActionListener(evento);


		this.add(BtnPlay);
		this.add(BtnStop);
		this.add(BtnAbrir);
		this.add(volumen);

		//text=new JTextField();
		//text.setBounds(100,100,100,100);
		//this.add(text);
		l1=new JLabel("Volumen");
		l1.setBounds(400,0,200,25);
		this.add(l1);

	}

		
			



       //Main de prueba

     
	public static void main(String[] args) {
		//System.out.println("fsaffa");
		Interfaz Interfaz1 = new Interfaz();
		//Interfaz1.setSize(200,200);
	}

    

			


		
	public class Evento implements ActionListener{



		public void  actionPerformed(ActionEvent event){
			String string ="";

			if(event.getSource()==BtnPlay){

				System.out.println("Estas dentro del boton 1");
			}
			if(event.getSource()==BtnStop){

				System.out.println("Boton pausa");// Sustituir este campo con las funciones correspondientes
			}
			if(event.getSource()==BtnAbrir){
				filtros();

				System.out.println("Boton abrir");
				}	
			//else if(even.getSource()==BtnPlay)
			


		}



		


	}
}

