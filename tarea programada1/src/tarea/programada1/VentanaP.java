package tarea.programada1;

/*
*Importes de librerías necesarias para la reproducción
*y la creación de la interfaz de usuario.
*/

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.NotSupportedException;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.awt.Color; 
import java.awt.event.ActionListener;
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Level; 
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ListModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jlgui.basicplayer.*;


/*Implementación de la clase VentanaP que contiene todos los componentes del 
*reproductor.
*/
public class VentanaP extends javax.swing.JFrame {
       //Abro stream, crea el fichero si no existe

    MetaDatos1 metainformacion= new MetaDatos1();
    String[] listaDatos1={"","","","","","",""};
    Datos listaEnlazada = new Datos(listaDatos1);
    public static String listadereproduccionarcual;
    //Se comenzara a agregar apartir del indice 1
            //Principal reproductor;
        //reproductor = new Principal();
    
    
    DefaultListModel modelo = new DefaultListModel(); //Utilizado por la lista para insertar elementos a la vez y eliminarlo.
    //ReproductorM miReproductor = new ReproductorM();// Intancia del ReproductorM para controlar la ejecución.
    JFileChooser archivoSeleccionado = new JFileChooser(); // Variable tipo FileChooser que permite acceder a los datos del ordenador. 
    File archivo; // Guardara la direccion de las canciones.
    private boolean enReproduccion; // indicará si hay o no archivos en reproduccion. 
    //private String[] listaDatos1;

    /**
     * Creacion de la Ventana Principal 
     * @throws javazoom.jl.decoder.JavaLayerException
     */
    public VentanaP()throws JavaLayerException, FileNotFoundException, IOException {
        crearlistadefault("default","");

        initComponents();

        this.getContentPane().setBackground(Color.black);
    }
    public void crearlistadefault(String nombre,String informacion) throws IOException{
              
            //Escribimos en el fichero un String y un caracter 97 (a)
            try ( //Abro stream, crea el fichero si no existe
                FileWriter fw = new FileWriter(nombre+".txt")) {
                //Escribimos en el fichero un String y un caracter 97 (a)
                fw.write("Esta es una prueba del archivo default"); 
                fw.write(informacion);
                //ejemplo de escritura
            }
 }
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vol = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        volumen = new javax.swing.JSlider();
        btnPlay = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnSiguente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        reproduciendo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lista = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCanciones = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaMetaDatos = new javax.swing.JList();
        jPanel5 = new javax.swing.JPanel();
        btnSeleccionarCanción = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        playlist = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        crearListaRMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(12, 12, 12));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jPanel1.setForeground(new java.awt.Color(12, 12, 12));
        jPanel1.setToolTipText("");

        volumen.setBackground(new java.awt.Color(12, 12, 12));
        volumen.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                volumenAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        volumen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumenStateChanged(evt);
            }
        });

        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnSiguente.setText(">");
        btnSiguente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguenteActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAnterior)
                        .addGap(9, 9, 9)
                        .addComponent(btnPlay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiguente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStop)
                    .addComponent(btnPlay)
                    .addComponent(btnSiguente)
                    .addComponent(btnAnterior))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(volumen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(12, 12, 12));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));

        reproduciendo.setBackground(new java.awt.Color(12, 12, 12));
        reproduciendo.setForeground(new java.awt.Color(255, 255, 255));
        reproduciendo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 12, 12)));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Reproduccion Actual:  default                    ");

        jButton1.setText("Abrir lista de Reproduccion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lista.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reproduciendo, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(reproduciendo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap())
        );

        listaCanciones.setBackground(new java.awt.Color(12, 12, 12));
        listaCanciones.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), "Lista de Canciones", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        listaCanciones.setForeground(new java.awt.Color(255, 255, 255));
        listaCanciones.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Cancion1", "Cancion2", "Cancion3", "Cancion4", "Cancion5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaCanciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaCanciones.setToolTipText("");
        listaCanciones.setSelectionBackground(new java.awt.Color(0, 153, 153));
        listaCanciones.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(listaCanciones);

        jPanel4.setBackground(new java.awt.Color(12, 12, 12));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        listaMetaDatos.setBackground(new java.awt.Color(12, 12, 12));
        listaMetaDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), "Datos de la Cancíon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        listaMetaDatos.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(listaMetaDatos);

        jPanel5.setBackground(new java.awt.Color(12, 12, 12));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));

        btnSeleccionarCanción.setText("Seleccionar Canción ");
        btnSeleccionarCanción.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarCanciónActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Canción");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar cancion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnSeleccionarCanción)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionarCanción)
                    .addComponent(btnEliminar)
                    .addComponent(jButton2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        playlist.setBackground(new java.awt.Color(12, 12, 12));
        playlist.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true), "Lista de Canciones", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        playlist.setForeground(new java.awt.Color(255, 255, 255));
        playlist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        playlist.setToolTipText("");
        playlist.setSelectionBackground(new java.awt.Color(0, 153, 153));
        playlist.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(playlist);
        playlist.getAccessibleContext().setAccessibleName("Lista de reproduccion");

        jMenuBar1.setBackground(new java.awt.Color(125, 125, 125));

        jMenu1.setText("Listas de Reproducción ");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Pública");
        jMenu1.add(jMenuItem1);

        crearListaRMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        crearListaRMenu.setText("Crear Lista de reproducción");
        crearListaRMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearListaRMenuActionPerformed(evt);
            }
        });
        jMenu1.add(crearListaRMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(vol))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(642, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(vol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jScrollPane3)
                    .addGap(165, 165, 165)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     /**
     * Método que contiene el evento del botón Play, el cual al pulsarlo 
     * reproduce la musica y cambia a Pause automáticamente. 
     */
    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        switch (btnPlay.getText()) { //Toma el texto escrito en el botón y lo examina en dos casos
            
            case "Play": 
                /*Object selecc = listaCanciones.getSelectedValue();
                Object componentes =listaCanciones.getComponents();
                ListModel modelol;
                modelol= listaCanciones.getModel();
                DefaultListModel modelodefecto;
                
        modelodefecto = new DefaultListModel();

                for(int i=0;modelol.getSize()!=i;i++){
                    modelodefecto.addElement(modelol.getElementAt(i));
                    System.out.println(modelol.getElementAt(i));
                    
                }
                
                //int prueba = listaCanciones.getSelectedIndex();
                 //= new DefaultListModel();
                
                modelodefecto.addElement("fddfghjhgfdfghjhgfdfghjsf");
                listaCanciones.setModel(modelodefecto);
              //  System.out.println("La cancion seleccionada tiene el indice "+ prueba);
                
                System.out.println("Para reproducir cacncion seleccionada del playlist"+selecc+"Linea 354");*/
                                        reproduciendo.setText("Reproduciendo: "+listaCanciones.getSelectedValue().toString());


                if (!enReproduccion&&archivo!=null) { // Verifica si hay algun archovo en reproduccion y alguna direccion
                    
                    try { 

                        //reproductor.play();
                        //miReproductor.control.play(); //Reproduce el archivo
                        System.out.println("Hola mundo");
                        btnPlay.setText("Pausa"); // Cambia el texto del botón
                        enReproduccion = true; // Cambia el estado de la variable a true puesto que si esta en reproducción.
                        reproduciendo.setText("Reproduciendo: "+listaCanciones.getSelectedValue().toString());
                    } catch (Exception ex) { 
                    } 
                } 
                 if (enReproduccion) { 
            try { 
                //miReproductor.control.resume(); // Reanuda la canción
                btnPlay.setText("Pausa"); // Cambia el texto del botón
            } catch (Exception ex) { 
            } 
                        } 
                break; 
            case "Pausa": 
                try { 
                    //miReproductor.control.pause(); // Pone pausa a la canción
                } catch (Exception ex) { 
                } 
                btnPlay.setText("Play"); 
                break; 

        }
    }//GEN-LAST:event_btnPlayActionPerformed
     /**
     * Método que contiene el evento del botón Stop, que detiene la canción por completo
     * al pulsarlo el botón que en el momento esta en estado de Pause automáticamente a Play. 
     */
    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        try { 
            //miReproductor.control.stop();
        } catch (Exception ex) {
        }
        enReproduccion = false; // Cambia el estado de la variable puesto que no hay nada reproduciendose
        btnPlay.setText("Play"); // Cambia el texto del botón.
                            
    }//GEN-LAST:event_btnStopActionPerformed

    private void volumenAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_volumenAncestorAdded

    }//GEN-LAST:event_volumenAncestorAdded
    
    
    /**
     * Método que regula el volumen de la canción. 
     */
    private void volumenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumenStateChanged
            try { 
            //miReproductor.control.setGain((double)volumen.getValue()/100);//Se asigna un volumen de 100
            
        } catch (Exception ex) {
        }    
            
    }//GEN-LAST:event_volumenStateChanged
     /**
     * Contiene el evento del botón Seleccionar Canción el cual abre el JFileChooser para escoger
     * las canciones. 
     */
    private void btnSeleccionarCanciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCanciónActionPerformed
       // Crea un filtro para obtener solo archivos con es formato "mp3","ogg","wav"
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Música", "mp3","ogg","wav"); 
        archivoSeleccionado.setFileFilter(filtro); // Selección del archivo filtrado
        //System.out.println(archivoSeleccionado.getName());
        //System.out.println(seleccion.);

        int seleccion = archivoSeleccionado.showOpenDialog(this); 

        

        if (seleccion == JFileChooser.APPROVE_OPTION) {
                Object selecc = listaCanciones.getSelectedValue();
                Object componentes =listaCanciones.getComponents();
                ListModel modelol;
                modelol= listaCanciones.getModel();
                DefaultListModel modelodefecto;
                
                modelodefecto = new DefaultListModel();

                for(int i=0;modelol.getSize()!=i;i++){
                    modelodefecto.addElement(modelol.getElementAt(i));
                    System.out.println(modelol.getElementAt(i));
                    
                }
                
                //int prueba = listaCanciones.getSelectedIndex();
                 //= new DefaultListModel();
                archivo = archivoSeleccionado.getSelectedFile();
                
                modelodefecto.addElement(archivo);
                listaCanciones.setModel(modelodefecto);
              //  System.out.println("La cancion seleccionada tiene el indice "+ prueba);
                
                System.out.println("Para reproducir cacncion seleccionada del playlist"+selecc+"Linea 354");

            
            
            
             //String[] listaDatos1 = {"R","N","Afsdfsafasf","G","play1","play2","play3"};
                
            //listaEnlazada.añadirDatos(listaDatos1);//Solo continuara si se selecciona un archivo del formato establecido.
            
            try {
                metainformacion.agregarc(archivo.toString());
            } catch (IOException | UnsupportedTagException | InvalidDataException ex) {
                Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
            }
            String album= metainformacion.gettitulo();
            String genero= metainformacion.getgenero();
            String artista = metainformacion.getartista();
            String titulo= metainformacion.getartista();
            try {
                metainformacion.getImage();
            } catch (UnsupportedTagException | InvalidDataException | IOException | NotSupportedException ex) {
                Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
            }
                    ImageIcon icono = new ImageIcon("cover");
                                
        jLabel2.setIcon(icono);
            String[] listaDatos3= {archivo.toString(),"sdfghjkkjhgfdfghjk",album,metainformacion.getgenero(),metainformacion.gettitulo()
            ,metainformacion.gettrack(),metainformacion.getyear()};
            // Se esta guardando el directorio y un espacio en blanco por si acaso
            listaEnlazada.añadirDatos(listaDatos3);
            System.out.println(archivo+"fdsfsdafsd"+"Esta es la direccion del archivo");
            String variable = archivo.toString();
            System.out.println(variable);
            modelo.addElement(archivo.getName());//Agrega la canción seleccionada a la lista.
            
            //lista.añadirDatos(arreglo)
            System.out.println(listaEnlazada.obtenerDatos(1)[4]+"Estos hhhhhhhhhhhhhhson los datos en la lista");
            System.out.println(listaEnlazada.obtenerDatos(1)[6]+"Estosggggggggggggg son los datos en la lista");

            
            try { 
               // miReproductor.control.open(archivo);//Se llama al Control creado en ReproductoM para que abra el archivo 
                
            } catch (Exception ex) { 
            } 
        } 
        //listaCanciones.setModel(modelo);//Aplica el modelo a la lista 
    }//GEN-LAST:event_btnSeleccionarCanciónActionPerformed
    
    /*
    * Contiene el evento del botón elminar. 
    */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        modelo.removeElement(listaCanciones.getSelectedValue()); // Elimminar la el elmento seleccionado de la lista
    }//GEN-LAST:event_btnEliminarActionPerformed

    /*
    *Contiene el evento para generar una nueva lista de reproduccion 
    */
    private void crearListaRMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearListaRMenuActionPerformed
       VtnListaReproduccion vPlayList = new VtnListaReproduccion(this,true);
       vPlayList.setVisible(true);
       modelo.addElement(volumen);
    }//GEN-LAST:event_crearListaRMenuActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btnSiguenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguenteActionPerformed
        
    }//GEN-LAST:event_btnSiguenteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//cargarlistas ventanaaux = new cargarlistas(this,true);
//ventanaaux.setVisible(true);
        
        Parser par = new Parser();
        Datos listaActual;
        MetaDatos1 meta=new MetaDatos1();
        
        String lstaCanciones=lista.getText();
        try {
            listaActual=par.parserD(lstaCanciones+".txt");
            meta.agregarc(listaActual.obtenerDatos(1)[0]);
            System.out.println("Primer pueba de lista Actual;"+listaActual.obtenerDatos(0)[1]);
            System.out.println("Primer pueba de lista Actual;"+listaActual.obtenerDatos(1)[2]);
            //System.out.println("Primer pueba de lista Actual;"+listaActual.obtenerDatos(2)[0]);

        } catch (FileNotFoundException ex) {
            System.out.println("Lista de reproduccion no encontrada");
            Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | UnsupportedTagException | InvalidDataException ex) {
            Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                //Object selecc = listaCanciones.getSelectedValue();
                Object componentes =listaCanciones.getComponents();
                ListModel modelol;
                modelol= playlist.getModel();
                DefaultListModel modelodefecto1;
                
                modelodefecto1 = new DefaultListModel();

                for(int i=0;modelol.getSize()!=i;i++){
                    modelodefecto1.addElement(modelol.getElementAt(i));
                    System.out.println(modelol.getElementAt(i));
                    
                }
                
                //int prueba = listaCanciones.getSelectedIndex();
                 //= new DefaultListModel();
                archivo = archivoSeleccionado.getSelectedFile();
                Object pasando = listaCanciones.getSelectedValue();
                modelodefecto1.addElement(pasando.toString());
                playlist.setModel(modelodefecto1);
              //  System.out.println("La cancion seleccionada tiene el indice "+ prueba);
                
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    new VentanaP().setVisible(true);
                } catch (JavaLayerException | FileNotFoundException ex) {
                    Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnPlay;
    private javax.swing.JButton btnSeleccionarCanción;
    private javax.swing.JButton btnSiguente;
    public javax.swing.JButton btnStop;
    private javax.swing.JMenuItem crearListaRMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lista;
    private javax.swing.JList listaCanciones;
    private javax.swing.JList listaMetaDatos;
    public javax.swing.JList playlist;
    public javax.swing.JLabel reproduciendo;
    public javax.swing.JLabel vol;
    public javax.swing.JSlider volumen;
    // End of variables declaration//GEN-END:variables

}