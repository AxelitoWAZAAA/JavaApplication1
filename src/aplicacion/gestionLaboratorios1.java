/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplicacion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author use
 */
public class gestionLaboratorios1 extends javax.swing.JFrame {
    private int numLaboratorio;
    private String estadoLaboratorio;
    private int cantEquipos;
    private String encargadoLAB;
    private String internet;
    private String softwareInstalado; // Variable corregida y agregada al constructor
    private int horasUso;
    public gestionLaboratorios1() {
        initComponents(); // Inicializa los componentes gráficos
        cargarDatosEnInterfaz();
    }
    // Constructor personalizado
    public gestionLaboratorios1(int numLaboratorio, String estadoLaboratorio, int cantEquipos, 
                                 String encargadoLAB, String internet, String softwareInstalado, int horasUso) {
        this.numLaboratorio = numLaboratorio;
        this.estadoLaboratorio = estadoLaboratorio;
        this.cantEquipos = cantEquipos;
        this.encargadoLAB = encargadoLAB;
        this.internet = internet;
        this.softwareInstalado = softwareInstalado; // Inicialización de software instalado
        this.horasUso = horasUso;
        initComponents(); // Llama al inicializador de la interfaz gráfica
    }

    // Métodos de acceso (Getters y Setters)
    public int getNumLaboratorio() {
        return numLaboratorio;
    }

    public void setNumLaboratorio(int numLaboratorio) {
        this.numLaboratorio = numLaboratorio;
    }

    public String getEstadoLaboratorio() {
        return estadoLaboratorio;
    }

    public void setEstadoLaboratorio(String estadoLaboratorio) {
        this.estadoLaboratorio = estadoLaboratorio;
    }

    public int getCantEquipos() {
        return cantEquipos;
    }

    public void setCantEquipos(int cantEquipos) {
        this.cantEquipos = cantEquipos;
    }

    public String getEncargadoLAB() {
        return encargadoLAB;
    }

    public void setEncargadoLAB(String encargadoLAB) {
        this.encargadoLAB = encargadoLAB;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getSoftwareInstalado() { // Getter para software instalado
        return softwareInstalado;
    }

    public void setSoftwareInstalado(String softwareInstalado) { // Setter para software instalado
        this.softwareInstalado = softwareInstalado;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel92 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jLabel87 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jLabel94 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextArea23 = new javax.swing.JTextArea();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jLabel106 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jLabel107 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea26 = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextArea27 = new javax.swing.JTextArea();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextArea28 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        EstadoLaboratorio = new javax.swing.JTextArea();
        jScrollPane30 = new javax.swing.JScrollPane();
        NumLab = new javax.swing.JTextArea();
        jLabel119 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        CantEquipos = new javax.swing.JTextArea();
        jLabel120 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        ProfEncargado = new javax.swing.JTextArea();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        HorasDeUso = new javax.swing.JTextArea();
        jScrollPane34 = new javax.swing.JScrollPane();
        SoftwareVar = new javax.swing.JTextArea();
        jScrollPane35 = new javax.swing.JScrollPane();
        InternetVar = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("Regresar al menú");

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/salir.png"))); // NOI18N
        jLabel89.setText("jLabel46");

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/guardar.png"))); // NOI18N
        jLabel88.setText("jLabel46");

        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Guardar");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/laboratorio.png"))); // NOI18N
        jLabel38.setText("jLabel38");

        jRadioButton10.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("Cancelar reserva");
        jRadioButton10.setAlignmentY(2.0F);
        jRadioButton10.setBorderPainted(true);

        jRadioButton11.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jRadioButton11.setText("Reservar");
        jRadioButton11.setAlignmentY(2.0F);
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel90.setText("Reserva");

        jLabel93.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel93.setText("Información general");

        jPanel23.setBackground(new java.awt.Color(153, 153, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setBackground(new java.awt.Color(0, 0, 0));
        jLabel84.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 0, 0));
        jLabel84.setText("Encargado:");
        jPanel23.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 30));

        jLabel85.setBackground(new java.awt.Color(0, 0, 0));
        jLabel85.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 0, 0));
        jLabel85.setText("Número de laboratorio:");
        jPanel23.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 30));

        jLabel86.setBackground(new java.awt.Color(0, 0, 0));
        jLabel86.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 0, 0));
        jLabel86.setText("Estado del laboratorio:");
        jPanel23.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 30));

        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea15.setColumns(20);
        jTextArea15.setRows(5);
        jTextArea15.setText("[Disponible/ocupado]");
        jScrollPane15.setViewportView(jTextArea15);

        jPanel23.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 170, 40));

        jScrollPane17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane17.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea17.setColumns(20);
        jTextArea17.setRows(5);
        jTextArea17.setText("[Número y pabellón]");
        jScrollPane17.setViewportView(jTextArea17);

        jPanel23.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, 40));

        jLabel87.setBackground(new java.awt.Color(0, 0, 0));
        jLabel87.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(0, 0, 0));
        jLabel87.setText("Cantidad de equipos:");
        jPanel23.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 30));

        jScrollPane18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane18.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea18.setColumns(20);
        jTextArea18.setRows(5);
        jTextArea18.setText("[Cantidad de equipos/ total]");
        jScrollPane18.setViewportView(jTextArea18);

        jPanel23.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 170, 40));

        jLabel94.setBackground(new java.awt.Color(0, 0, 0));
        jLabel94.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 0, 0));
        jLabel94.setText("Internet:");
        jPanel23.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 220, 40));

        jScrollPane19.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane19.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea19.setColumns(20);
        jTextArea19.setRows(5);
        jTextArea19.setText("[Persona encargada]");
        jScrollPane19.setViewportView(jTextArea19);

        jPanel23.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 170, 40));

        jLabel95.setBackground(new java.awt.Color(0, 0, 0));
        jLabel95.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(0, 0, 0));
        jLabel95.setText("Software instalado:");
        jPanel23.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 30));

        jLabel96.setBackground(new java.awt.Color(0, 0, 0));
        jLabel96.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 0, 0));
        jLabel96.setText("Horas de uso:");
        jPanel23.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 30));

        jScrollPane21.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane21.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea21.setColumns(20);
        jTextArea21.setRows(5);
        jTextArea21.setText("[Horario de uso]");
        jScrollPane21.setViewportView(jTextArea21);

        jPanel23.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 170, 40));

        jScrollPane22.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane22.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea22.setColumns(20);
        jTextArea22.setRows(5);
        jTextArea22.setText("[Sí / No]");
        jScrollPane22.setViewportView(jTextArea22);

        jPanel23.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 170, 40));

        jScrollPane23.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane23.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea23.setColumns(20);
        jTextArea23.setRows(5);
        jTextArea23.setText("[Sí / No]");
        jScrollPane23.setViewportView(jTextArea23);

        jPanel23.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 170, 40));

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("Regresar al menú");

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/salir.png"))); // NOI18N
        jLabel98.setText("jLabel46");

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/guardar.png"))); // NOI18N
        jLabel99.setText("jLabel46");

        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("Guardar");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/laboratorio.png"))); // NOI18N
        jLabel39.setText("jLabel38");

        jRadioButton12.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setText("Cancelar reserva");
        jRadioButton12.setAlignmentY(2.0F);
        jRadioButton12.setBorderPainted(true);

        jRadioButton13.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jRadioButton13.setText("Reservar");
        jRadioButton13.setAlignmentY(2.0F);
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel101.setText("Reserva");

        jLabel102.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel102.setText("Información general");

        jPanel24.setBackground(new java.awt.Color(153, 153, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel103.setBackground(new java.awt.Color(0, 0, 0));
        jLabel103.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 0));
        jLabel103.setText("Encargado:");
        jPanel24.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 30));

        jLabel104.setBackground(new java.awt.Color(0, 0, 0));
        jLabel104.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 0));
        jLabel104.setText("Número de laboratorio:");
        jPanel24.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 30));

        jLabel105.setBackground(new java.awt.Color(0, 0, 0));
        jLabel105.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 0, 0));
        jLabel105.setText("Estado del laboratorio:");
        jPanel24.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 30));

        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea16.setColumns(20);
        jTextArea16.setRows(5);
        jTextArea16.setText("[Disponible/ocupado]");
        jScrollPane16.setViewportView(jTextArea16);

        jPanel24.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 170, 40));

        jScrollPane20.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane20.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea20.setColumns(20);
        jTextArea20.setRows(5);
        jTextArea20.setText("[Número y pabellón]");
        jScrollPane20.setViewportView(jTextArea20);

        jPanel24.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, 40));

        jLabel106.setBackground(new java.awt.Color(0, 0, 0));
        jLabel106.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(0, 0, 0));
        jLabel106.setText("Cantidad de equipos:");
        jPanel24.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 30));

        jScrollPane24.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane24.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea24.setColumns(20);
        jTextArea24.setRows(5);
        jTextArea24.setText("[Cantidad de equipos/ total]");
        jScrollPane24.setViewportView(jTextArea24);

        jPanel24.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 170, 40));

        jLabel107.setBackground(new java.awt.Color(0, 0, 0));
        jLabel107.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(0, 0, 0));
        jLabel107.setText("Internet:");
        jPanel24.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 220, 40));

        jScrollPane25.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane25.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea25.setColumns(20);
        jTextArea25.setRows(5);
        jTextArea25.setText("[Persona encargada]");
        jScrollPane25.setViewportView(jTextArea25);

        jPanel24.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 170, 40));

        jLabel108.setBackground(new java.awt.Color(0, 0, 0));
        jLabel108.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 0));
        jLabel108.setText("Software instalado:");
        jPanel24.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 30));

        jLabel109.setBackground(new java.awt.Color(0, 0, 0));
        jLabel109.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(0, 0, 0));
        jLabel109.setText("Horas de uso:");
        jPanel24.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 30));

        jScrollPane26.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane26.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea26.setColumns(20);
        jTextArea26.setRows(5);
        jTextArea26.setText("[Horario de uso]");
        jScrollPane26.setViewportView(jTextArea26);

        jPanel24.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 170, 40));

        jScrollPane27.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane27.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea27.setColumns(20);
        jTextArea27.setRows(5);
        jTextArea27.setText("[Sí / No]");
        jScrollPane27.setViewportView(jTextArea27);

        jPanel24.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 170, 40));

        jScrollPane28.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane28.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea28.setColumns(20);
        jTextArea28.setRows(5);
        jTextArea28.setText("[Sí / No]");
        jScrollPane28.setViewportView(jTextArea28);

        jPanel24.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 170, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/salir.png"))); // NOI18N
        jLabel111.setText("jLabel46");
        jPanel1.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 100, 100));

        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("Guardar");
        jPanel1.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel115.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel115.setText("Información general");
        jPanel1.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 240, 30));

        jPanel25.setBackground(new java.awt.Color(153, 153, 255));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel116.setBackground(new java.awt.Color(0, 0, 0));
        jLabel116.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 0));
        jLabel116.setText("Encargado:");
        jPanel25.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 30));

        jLabel117.setBackground(new java.awt.Color(0, 0, 0));
        jLabel117.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 0, 0));
        jLabel117.setText("Número de laboratorio:");
        jPanel25.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 30));

        jLabel118.setBackground(new java.awt.Color(0, 0, 0));
        jLabel118.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(0, 0, 0));
        jLabel118.setText("Estado del laboratorio:");
        jPanel25.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 30));

        jScrollPane29.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane29.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        EstadoLaboratorio.setColumns(20);
        EstadoLaboratorio.setRows(5);
        jScrollPane29.setViewportView(EstadoLaboratorio);

        jPanel25.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 170, 40));

        jScrollPane30.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane30.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        NumLab.setColumns(20);
        NumLab.setRows(5);
        jScrollPane30.setViewportView(NumLab);

        jPanel25.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 170, 40));

        jLabel119.setBackground(new java.awt.Color(0, 0, 0));
        jLabel119.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 0));
        jLabel119.setText("Cantidad de equipos:");
        jPanel25.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 30));

        jScrollPane31.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane31.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        CantEquipos.setColumns(20);
        CantEquipos.setRows(5);
        jScrollPane31.setViewportView(CantEquipos);

        jPanel25.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 170, 40));

        jLabel120.setBackground(new java.awt.Color(0, 0, 0));
        jLabel120.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(0, 0, 0));
        jLabel120.setText("Internet:");
        jPanel25.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 220, 40));

        jScrollPane32.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane32.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ProfEncargado.setColumns(20);
        ProfEncargado.setRows(5);
        jScrollPane32.setViewportView(ProfEncargado);

        jPanel25.add(jScrollPane32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 170, 40));

        jLabel121.setBackground(new java.awt.Color(0, 0, 0));
        jLabel121.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(0, 0, 0));
        jLabel121.setText("Software instalado:");
        jPanel25.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 30));

        jLabel122.setBackground(new java.awt.Color(0, 0, 0));
        jLabel122.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(0, 0, 0));
        jLabel122.setText("Horas de uso:");
        jPanel25.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 30));

        jScrollPane33.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane33.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        HorasDeUso.setColumns(20);
        HorasDeUso.setRows(5);
        jScrollPane33.setViewportView(HorasDeUso);

        jPanel25.add(jScrollPane33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 170, 40));

        jScrollPane34.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane34.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        SoftwareVar.setColumns(20);
        SoftwareVar.setRows(5);
        jScrollPane34.setViewportView(SoftwareVar);

        jPanel25.add(jScrollPane34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 170, 40));

        jScrollPane35.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane35.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        InternetVar.setColumns(20);
        InternetVar.setRows(5);
        jScrollPane35.setViewportView(InternetVar);

        jPanel25.add(jScrollPane35, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 170, 40));

        jPanel1.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 430, 400));

        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Regresar al menú");
        jLabel62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 150, 40));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/laboratorio.png"))); // NOI18N
        jLabel40.setText("jLabel38");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton11ActionPerformed

      public void crearArchivoLaboratorio() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("informacionLaboratorio.txt"))) {
            writer.write("Información del Laboratorio\n");
            writer.write("---------------------------\n");
            writer.write("Número del Laboratorio: " + numLaboratorio + "\n");
            writer.write("Estado del Laboratorio: " + estadoLaboratorio + "\n");
            writer.write("Cantidad de Equipos: " + cantEquipos + "\n");
            writer.write("Encargado del Laboratorio: " + encargadoLAB + "\n");
            writer.write("Conexión a Internet: " + internet + "\n");
            writer.write("Software Instalado: " + softwareInstalado + "\n");
            writer.write("Horas de Uso del Laboratorio: " + horasUso + "\n");
            writer.write("\nVerificación completa del laboratorio realizada correctamente.");
            System.out.println("El archivo 'informacionLaboratorio.txt' se ha creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }
      
    public void cargarDatosEnInterfaz(){
    try (BufferedReader reader = new BufferedReader(new FileReader("informacionLaboratorio.txt"))) {
        String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("Número del Laboratorio:")) {
                    NumLab.setText(linea.split(":")[1].trim());
                } else if (linea.startsWith("Estado del Laboratorio:")) {
                    EstadoLaboratorio.setText(linea.split(":")[1].trim());
                } else if (linea.startsWith("Cantidad de Equipos:")) {
                    CantEquipos.setText(linea.split(":")[1].trim());
                } else if (linea.startsWith("Encargado del Laboratorio:")) {
                    ProfEncargado.setText(linea.split(":")[1].trim());
                } else if (linea.startsWith("Conexión a Internet:")) {
                    InternetVar.setText(linea.split(":")[1].trim());
                }else if (linea.startsWith("Software Instalado:")) {
                    SoftwareVar.setText(linea.split(":")[1].trim());
                } else if (linea.startsWith("Horas de Uso del Laboratorio:")) {
                    HorasDeUso.setText(linea.split(":")[1].trim());
            }
        }
        }catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }  
      
}


    
    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
        MenuP men = new MenuP();
        men.setVisible(true);
        men.pack();
        men.setLocationRelativeTo(null);
        men.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); // Cerrar la ventana actual
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel62MouseClicked

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del laboratorio:");

        // Solicitar datos al usuario
        System.out.print("Número del Laboratorio: ");
        int numLaboratorio = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea pendiente

        System.out.print("Estado del Laboratorio (Disponible/No Disponible): ");
        String estadoLaboratorio = scanner.nextLine();

        System.out.print("Cantidad de Equipos: ");
        int cantEquipos = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea pendiente

        System.out.print("Encargado del Laboratorio: ");
        String encargadoLAB = scanner.nextLine();

        System.out.print("¿Tiene conexión a Internet? (true/false): ");
        String internet = scanner.next();
        scanner.nextLine(); // Consumir la línea pendiente

        System.out.print("Software Instalado (separado por comas): ");
        String softwareInstalado = scanner.nextLine();

        System.out.print("Horas de Uso del Laboratorio: ");
        int horasUso = scanner.nextInt();

        // Cerrar el scanner
        scanner.close();

        // Crear la instancia del laboratorio con los datos ingresados
        gestionLaboratorios1 laboratorio = new gestionLaboratorios1(
            numLaboratorio,
            estadoLaboratorio,
            cantEquipos,
            encargadoLAB,
            internet,
            softwareInstalado,
            horasUso
        );

        // Crear el archivo de texto con los datos del laboratorio
        laboratorio.crearArchivoLaboratorio();
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CantEquipos;
    private javax.swing.JTextArea EstadoLaboratorio;
    private javax.swing.JTextArea HorasDeUso;
    private javax.swing.JTextArea InternetVar;
    private javax.swing.JTextArea NumLab;
    private javax.swing.JTextArea ProfEncargado;
    private javax.swing.JTextArea SoftwareVar;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea23;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea26;
    private javax.swing.JTextArea jTextArea27;
    private javax.swing.JTextArea jTextArea28;
    // End of variables declaration//GEN-END:variables
}
