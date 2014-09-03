package tarea.programada1;

/*
*Importes de librerías necesarias para la reproducción
*y la creación de la interfaz de usuario.
*/

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.NotSupportedException;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.awt.Color; 
import java.io.File; 
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level; 
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.ListModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jlgui.basicplayer.BasicPlayerException;


/*Implementación de la clase VentanaP que contiene todos los componentes del 
*reproductor.
*/
public class VentanaP extends javax.swing.JFrame {
    ReproductorM miReproductor = new ReproductorM();
    String listadereproduccionactual;
    DefaultListModel modelodefecto2 ;
    DefaultListModel modelodefecto;
    Datos listaActual;
    String cancionactual;
       //Abro stream, crea el fichero si no existe

    MetaDatos1 metainformacion= new MetaDatos1();
    public static String listaA;
    String[] listaDatos1={"","","","","","",""};
    Datos listaEnlazada = new Datos(listaDatos1);
    public static String listadereproduccionarcual;

    DefaultListModel modelo = new DefaultListModel(); //Utilizado por la lista para insertar elementos a la vez y eliminarlo.
    JFileChooser archivoSeleccionado = new JFileChooser(); // Variable tipo FileChooser que permite acceder a los datos del ordenador. 
    public static File archivo; // Guardara la direccion de las canciones.
    public static File archivo1; // Guardara la direccion de las canciones.

    private boolean enReproduccion; // indicará si hay o no archivos en reproduccion. 
    //private String[] listaDatos1;

    /**
     * Creacion de la Ventana Principal 
     * @throws javazoom.jl.decoder.JavaLayerException
     * @throws java.io.FileNotFoundException
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

        jComboBox1 = new javax.swing.JComboBox();
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
        abrirplay = new javax.swing.JButton();
        lista = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCanciones = new javax.swing.JList();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSeleccionarCanción = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        playlist = new javax.swing.JList();
        ltiempo = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        album = new javax.swing.JTextField();
        artista = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        guardarCancion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        crearListaRMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
        jLabel1.setText("Lista de Reproduccion Actual:                   ");

        abrirplay.setText("Abrir lista de Reproduccion");
        abrirplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirplayActionPerformed(evt);
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
                .addComponent(reproduciendo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abrirplay)
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
                            .addComponent(abrirplay))))
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

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar)
                .addGap(110, 110, 110))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionarCanción)
                    .addComponent(btnEliminar)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardar))
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

        ltiempo.setText("Tiempo: ");

        titulo.setText("Titulo");

        album.setText("jTextField1");

        artista.setText("Artista");

        año.setText("Año");

        genero.setText("Genero");

        guardarCancion.setText("Guardar Cambios");
        guardarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCancionActionPerformed(evt);
            }
        });

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
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ltiempo)
                                    .addComponent(artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(guardarCancion)))
                        .addGap(97, 97, 97)
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
                    .addContainerGap(728, Short.MAX_VALUE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(ltiempo)
                        .addGap(31, 31, 31)
                        .addComponent(guardarCancion)
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
        //C:\Users\ricardo\Desktop\iiiii.mp3

        System.out.println(listaCanciones.getSelectedValue().toString());
        Archivos x = new Archivos();
        String c=x.obtenerDireccion("FilesMusic");

        System.out.println("Cancion seleccionada: "+c+listaCanciones.getSelectedValue().toString());
        cancionactual=c+listaCanciones.getSelectedValue().toString();
        
        MetaDatos1 metainformacion1 = new MetaDatos1();
        try {
            metainformacion1.agregarc(c+listaCanciones.getSelectedValue().toString());
        } catch (IOException | UnsupportedTagException | InvalidDataException ex) {
            Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
        }

        File a = new File("cover.jpg");
        a.delete();
                try {
            metainformacion1.getImage();
        } catch (UnsupportedTagException | InvalidDataException | IOException | NotSupportedException ex) {
            System.out.println("no se ha podido obtener la imagen");
        }
                Imagen ima = new Imagen ("cover.jpg");
               ImageIcon imaa=ima.redimensionarImagen(340, 680);
       // ImageIcon icono = new ImageIcon("cover.jpg");
                
        jLabel2.setIcon(imaa);
        titulo.setText(metainformacion1.gettitulo());
        año.setText("Año: "+metainformacion1.getyear());
        artista.setText("Artista:"+metainformacion1.getartista());
        album.setText("Album: "+ metainformacion1.getalbum());
        ltiempo.setText("Tiempo: "+metainformacion1.gettiempo());
        
        //********************************// Se verifica si arch es el que tiene el control de archivos
        File arch= new File(c+listaCanciones.getSelectedValue().toString());
//                File arch= new File("C:\\Users\\ricardo\\Desktop\\reptide.mp3");

                switch (btnPlay.getText()) { //Toma el texto escrito en el botón y lo examina en dos casos
            
            case "Play":  
 
                if (!enReproduccion) { // Verifica si hay algun archovo en reproduccion y alguna direccion
        try {
            miReproductor.control.open(arch);
        } catch (BasicPlayerException ex) {
            System.out.println("ha salido de alguna forma");
        }
                    
                    try { 
                        miReproductor.control.play(); //Reproduce el archivo
                        btnPlay.setText("Pausa"); // Cambia el texto del botón
                        enReproduccion = true; // Cambia el estado de la variable a true puesto que si esta en reproducción.
                        reproduciendo.setText("Reproduciendo: "+archivo.getName());
                    } catch (BasicPlayerException ex) { 
                        Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex); 
                    } 
                } 
                 if (enReproduccion) { 
            try { 
                miReproductor.control.resume(); // Reanuda la canción
                btnPlay.setText("Pausa"); // Cambia el texto del botón
            } catch (BasicPlayerException ex) { 
                Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex); 
            } 
                        } 
                break; 
            case "Pausa": 
                
                try { 
                    miReproductor.control.pause(); // Pone pausa a la canción
                } catch (BasicPlayerException ex) { 
                    Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex); 
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
            miReproductor.control.stop(); //Detiene el proceso de reproducción
        } catch (BasicPlayerException ex) { 
            Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex); 
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
            miReproductor.control.setGain((double)volumen.getValue()/100);//Se asigna un volumen de 100
            
        } catch (BasicPlayerException ex) {
            Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
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


        int seleccion = archivoSeleccionado.showOpenDialog(this); 
        if (seleccion == JFileChooser.APPROVE_OPTION) {
                Object selecc = listaCanciones.getSelectedValue();
                //System.out.println("")
                Object componentes =listaCanciones.getComponents();
                ListModel modelol;
                modelol= listaCanciones.getModel();
                //DefaultListModel modelodefecto;
                
                modelodefecto = new DefaultListModel();

                for(int i=0;modelol.getSize()!=i;i++){
                    modelodefecto.addElement(modelol.getElementAt(i));
                    System.out.println(modelol.getElementAt(i));
                    
                }
 
                archivo = archivoSeleccionado.getSelectedFile();
                System.out.println("El nombre del archivo a direccionar es: "+archivo);
                Archivos direc = new Archivos();
                direc.redireccionarFichero(archivo.toString(),null );
                
                modelodefecto.addElement(archivo.getName());
                listaCanciones.setModel(modelodefecto);

            
            try {

                Archivos x = new Archivos();
                String c=x.obtenerDireccion("FilesMusic");
                File arch= new File(c+listaCanciones.getSelectedValue().toString());
                System.out.println(c+listaCanciones.getSelectedValue().toString());
                
                File archivo2 = new File("FilesMusic" + File.separator+listaCanciones.getSelectedValue().toString());
                System.out.println("FilesMusic" + File.separator+listaCanciones.getSelectedValue().toString());
                miReproductor.control.open(arch);
            } catch (BasicPlayerException ex) {
                Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
            }

        } 
    }//GEN-LAST:event_btnSeleccionarCanciónActionPerformed
    
    /*
    * Contiene el evento del botón elminar. 
    */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(listaCanciones.getSelectedValue()!=null)
           modelodefecto.removeElement(listaCanciones.getSelectedValue());
        if(playlist.getSelectedValue()!=null)
            modelodefecto2.removeElement(playlist.getSelectedValue());// Elimminar la el elmento seleccionado de la lista
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

    private void abrirplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirplayActionPerformed
        Parser par = new Parser();
        String lstaCanciones=lista.getText();
        
        try {
            listaActual=par.parserD(lista.getText()+".txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
        }
            modelodefecto2 = new DefaultListModel();
            //modelodefecto2.addElement("hola");
            listadereproduccionactual=lista.getText();
            
            //listaActual.
          //  meta.agregarc(listaActual.obtenerDatos(0)[0]);
            for(int i=0;listaActual.getTamaño()>i;i++){
                modelodefecto2.addElement(listaActual.obtenerDatos(i)[0]);
                
            }
            playlist.setModel(modelodefecto2);

         

        
        
    }//GEN-LAST:event_abrirplayActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                //Object selecc = listaCanciones.getSelectedValue();
                modelodefecto2 = new DefaultListModel();

                Object componentes =listaCanciones.getComponents();
                ListModel modelol;
                modelol= playlist.getModel();
                DefaultListModel modelodefecto1;
                
                modelodefecto1 = new DefaultListModel();

                for(int i=0;modelol.getSize()!=i;i++){
                    modelodefecto1.addElement(modelol.getElementAt(i));
                    System.out.println(modelol.getElementAt(i));
                    
                }
                archivo = archivoSeleccionado.getSelectedFile();
                Object pasando = listaCanciones.getSelectedValue();
                modelodefecto1.addElement(pasando.toString());
                playlist.setModel(modelodefecto1);
              //  System.out.println("La cancion seleccionada tiene el indice "+ prueba);
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

       //ListModel s; 
        String supers="";
        ListModel a = playlist.getModel();
        for(int i=0;a.getSize()>i;i++){
            
            supers=supers+a.getElementAt(i).toString();
            supers=supers+"@";
            
        }
        System.out.println(supers);
        Parser par = new Parser();
        try {
            par.agregar(supers, listadereproduccionactual);
            System.out.println("Se ha guardado tu lista con exito");
        } catch (IOException ex) {
            Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_guardarActionPerformed

    private void guardarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCancionActionPerformed
        try {                                               
            Archivos x = new Archivos();
            String c=x.obtenerDireccion("FilesMusic");
            MetaDatos1 modificar= new MetaDatos1();
            try {
                modificar.agregarc(cancionactual);
            } catch (IOException | UnsupportedTagException | InvalidDataException ex) {
                Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
            }
            modificar.setAlbum(album.getText());
            modificar.setArtist(artista.getText());
            try {
                modificar.settitulo(titulo.getText());
            } catch (UnsupportedTagException | InvalidDataException | IOException | NotSupportedException ex) {
                Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
            }
            modificar.setyear(año.getText());
            modificar.mp3file.save(listaCanciones.getSelectedValue().toString());

        } catch (IOException ex) {
            Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotSupportedException ex) {
            Logger.getLogger(VentanaP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_guardarCancionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirplay;
    private javax.swing.JTextField album;
    private javax.swing.JTextField artista;
    private javax.swing.JTextField año;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnPlay;
    private javax.swing.JButton btnSeleccionarCanción;
    private javax.swing.JButton btnSiguente;
    public javax.swing.JButton btnStop;
    private javax.swing.JMenuItem crearListaRMenu;
    private javax.swing.JTextField genero;
    private javax.swing.JButton guardar;
    private javax.swing.JButton guardarCancion;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lista;
    private javax.swing.JList listaCanciones;
    private javax.swing.JLabel ltiempo;
    public javax.swing.JList playlist;
    public javax.swing.JLabel reproduciendo;
    private javax.swing.JTextField titulo;
    public javax.swing.JLabel vol;
    public javax.swing.JSlider volumen;
    // End of variables declaration//GEN-END:variables

}