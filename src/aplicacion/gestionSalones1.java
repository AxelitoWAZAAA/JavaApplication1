package aplicacion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class gestionSalones1 extends javax.swing.JFrame {
    
    boolean internet;
    int numAlumnos;
    String nomProfesor;
    int numCarpetas;
    int numSalon;
    String estadoSalon;
        public gestionSalones1(boolean internet, int numAlumnos, int numSalon, String estadoSalon, String nomProfesor, int numCarpetas) {
        this.internet = internet;

        this.numAlumnos = numAlumnos;
        this.numSalon = numSalon;
        this.estadoSalon = estadoSalon;
        this.nomProfesor = nomProfesor;
        this.numCarpetas = numCarpetas;
    }
    // Métodos setters y getters
    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public String getNomProfesor() {
        return nomProfesor;
    }

    public void setNomProfesor(String nomProfesor) {
        this.nomProfesor = nomProfesor;
    }

    public int getNumCarpetas() {
        return numCarpetas;
    }

    public void setNumCarpetas(int numCarpetas) {
        this.numCarpetas = numCarpetas;
    }

    public int getNumeroSalon() {
        return numSalon;
    }

    public void setNumeroSalon(int numeroSalon) {
        this.numSalon = numeroSalon;
    }

    public String getEstadoSalon() {
        return estadoSalon;
    }

    public void setEstadoSalon(String estadoSalon) {
        this.estadoSalon = estadoSalon;
    }

    // Métodos funcionales
    public void verificarConexion() {
        if (internet) {
            System.out.println("Hay conexión a Internet.");
        } else {
            mandarAlerta("No hay conexión a Internet.");
        }
    }

    public void verificarEquipos() {
        verificarConexion();
    }

    public String mandarAlerta(String mensaje) {
        System.out.println("ALERTA! " + mensaje);
        return mensaje;
    }

    public void verificarCarpetas(int carpetas) {
        if (numCarpetas >= carpetas) {
            System.out.println("Hay suficientes carpetas para los alumnos.");
        } else {
            mandarAlerta("Faltan carpetas para los alumnos.");
        }
    }

    public void verificarSalon() {
        System.out.println("Número de salón: " + numSalon);
        System.out.println("Estado del salón: " + estadoSalon);
        System.out.println("Profesor asignado: " + nomProfesor);
    }

    public void verificarEstadoSalon() {
        if ("En buen estado".equalsIgnoreCase(estadoSalon)) {
            System.out.println("El salón está en buen estado.");
        } else {
            mandarAlerta("El estado del salón necesita atención.");
        }
    }


    public void crearArchivoSalon() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("informacionSalon.txt"))) {
            writer.write("Información del Salón\n");
            writer.write("----------------------\n");
            writer.write("Número de Salón: " + numSalon + "\n");
            writer.write("Estado del Salón: " + estadoSalon + "\n");
            writer.write("Número de Equipos disponibles: " + numCarpetas + "\n");
            writer.write("Profesor Asignado: " + nomProfesor + "\n");
            writer.write("Conexión a Internet: " + (internet ? "Disponible" : "No disponible") + "\n");
            writer.write("Número de Alumnos: " + numAlumnos + "\n");
            writer.write("\nVerificación completa del salón realizada correctamente.");
            System.out.println("El archivo 'informacionSalon.txt' se ha creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }
    
    public void cargarDatosEnInterfaz() {
    try (BufferedReader reader = new BufferedReader(new FileReader("informacionSalon.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            if (linea.startsWith("Número de Salón:")) {
                NumSalon.setText(linea.split(":")[1].trim());
            } else if (linea.startsWith("Estado del Salón:")) {
                EstadoSalon.setText(linea.split(":")[1].trim());
            } else if (linea.startsWith("Número de Equipos disponibles:")) {
                CantEquipos.setText(linea.split(":")[1].trim());
            } else if (linea.startsWith("Profesor Asignado:")) {
                ProfEncargado.setText(linea.split(":")[1].trim());
            } else if (linea.startsWith("Número de Alumnos:")) {
                CantAlumnos.setText(linea.split(":")[1].trim());
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void volverMenu() {
        System.out.println("Volviendo a la 3era pantalla.");
    }
    

    public gestionSalones1() {
        initComponents();
        cargarDatosEnInterfaz();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel97 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jLabel101 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea26 = new javax.swing.JTextArea();
        jLabel103 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextArea28 = new javax.swing.JTextArea();
        jLabel105 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jLabel106 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        EstadoSalon = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        NumSalon = new javax.swing.JTextArea();
        jLabel112 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        CantEquipos = new javax.swing.JTextArea();
        jScrollPane30 = new javax.swing.JScrollPane();
        ProfEncargado = new javax.swing.JTextArea();
        jLabel113 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        CantAlumnos = new javax.swing.JTextArea();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();

        jLabel97.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel97.setText("Información general");

        jPanel26.setBackground(new java.awt.Color(153, 153, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel98.setBackground(new java.awt.Color(0, 0, 0));
        jLabel98.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 0, 0));
        jLabel98.setText("Profesor encargado:");
        jPanel26.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, 30));

        jLabel99.setBackground(new java.awt.Color(0, 0, 0));
        jLabel99.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(0, 0, 0));
        jLabel99.setText("Número de salón:");
        jPanel26.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 30));

        jLabel100.setBackground(new java.awt.Color(0, 0, 0));
        jLabel100.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setText("Estado del salón:");
        jPanel26.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 30));

        jScrollPane20.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane20.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea20.setColumns(20);
        jTextArea20.setRows(5);
        jTextArea20.setText("[Disponible/ocupado]");
        jScrollPane20.setViewportView(jTextArea20);

        jPanel26.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 170, 40));

        jScrollPane24.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane24.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea24.setColumns(20);
        jTextArea24.setRows(5);
        jTextArea24.setText("[Número y pabellón]");
        jScrollPane24.setViewportView(jTextArea24);

        jPanel26.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 170, 40));

        jLabel101.setBackground(new java.awt.Color(0, 0, 0));
        jLabel101.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(0, 0, 0));
        jLabel101.setText("Equipos:");
        jPanel26.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 30));

        jScrollPane25.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane25.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea25.setColumns(20);
        jTextArea25.setRows(5);
        jTextArea25.setText("[Cantidad de equipos/ total]");
        jScrollPane25.setViewportView(jTextArea25);

        jPanel26.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 170, 40));

        jScrollPane26.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane26.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea26.setColumns(20);
        jTextArea26.setRows(5);
        jTextArea26.setText("[Persona encargada]");
        jScrollPane26.setViewportView(jTextArea26);

        jPanel26.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 170, 40));

        jLabel103.setBackground(new java.awt.Color(0, 0, 0));
        jLabel103.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 0));
        jLabel103.setText("Cantidad de carpetas:");
        jPanel26.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 30));

        jScrollPane28.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane28.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea28.setColumns(20);
        jTextArea28.setRows(5);
        jTextArea28.setText("[Carpetas disponibles / total]");
        jScrollPane28.setViewportView(jTextArea28);

        jPanel26.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 170, 40));

        jLabel105.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel105.setText("Reserva");

        jRadioButton12.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jRadioButton12.setText("Reservar");
        jRadioButton12.setAlignmentY(2.0F);
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        jRadioButton13.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton13.setText("Cancelar reserva");
        jRadioButton13.setAlignmentY(2.0F);
        jRadioButton13.setBorderPainted(true);

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/guardar.png"))); // NOI18N
        jLabel106.setText("jLabel46");

        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Regresar al menú");

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/salir.png"))); // NOI18N
        jLabel109.setText("jLabel46");

        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("Guardar");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/salones.png"))); // NOI18N
        jLabel51.setText("jLabel51");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel102.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel102.setText("Información general");
        jPanel2.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 30));

        jPanel29.setBackground(new java.awt.Color(153, 153, 255));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel104.setBackground(new java.awt.Color(0, 0, 0));
        jLabel104.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(0, 0, 0));
        jLabel104.setText("Profesor encargado:");
        jPanel29.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, 30));

        jLabel110.setBackground(new java.awt.Color(0, 0, 0));
        jLabel110.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 0, 0));
        jLabel110.setText("Número de salón:");
        jPanel29.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 30));

        jLabel111.setBackground(new java.awt.Color(0, 0, 0));
        jLabel111.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(0, 0, 0));
        jLabel111.setText("Estado del salón:");
        jPanel29.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 220, 30));

        jScrollPane21.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane21.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        EstadoSalon.setColumns(20);
        EstadoSalon.setRows(5);
        EstadoSalon.setBorder(null);
        jScrollPane21.setViewportView(EstadoSalon);

        jPanel29.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 170, 40));

        jScrollPane27.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane27.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        NumSalon.setColumns(20);
        NumSalon.setRows(5);
        NumSalon.setBorder(null);
        jScrollPane27.setViewportView(NumSalon);

        jPanel29.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 170, 40));

        jLabel112.setBackground(new java.awt.Color(0, 0, 0));
        jLabel112.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 0));
        jLabel112.setText("Equipos:");
        jPanel29.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 220, 30));

        jScrollPane29.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane29.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        CantEquipos.setColumns(20);
        CantEquipos.setRows(5);
        CantEquipos.setBorder(null);
        jScrollPane29.setViewportView(CantEquipos);

        jPanel29.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 170, 40));

        jScrollPane30.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane30.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        ProfEncargado.setColumns(20);
        ProfEncargado.setRows(5);
        ProfEncargado.setBorder(null);
        jScrollPane30.setViewportView(ProfEncargado);

        jPanel29.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 170, 40));

        jLabel113.setBackground(new java.awt.Color(0, 0, 0));
        jLabel113.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(0, 0, 0));
        jLabel113.setText("Alumnos:");
        jPanel29.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 220, 30));

        jScrollPane31.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane31.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        CantAlumnos.setColumns(20);
        CantAlumnos.setRows(5);
        CantAlumnos.setBorder(null);
        jScrollPane31.setViewportView(CantAlumnos);

        jPanel29.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 170, 40));

        jPanel2.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 430, 370));

        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("Regresar al menú");
        jPanel2.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 150, 40));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/salir.png"))); // NOI18N
        jLabel117.setText("jLabel46");
        jPanel2.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 100, 100));

        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, -1, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplicacion/salones.png"))); // NOI18N
        jLabel52.setText("jLabel51");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 660));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
        MenuP men = new MenuP();
        men.setVisible(true);
        men.pack();
        men.setLocationRelativeTo(null);
        men.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); // Cerrar la ventana actual        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel31MouseClicked
    
    
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del salón:");
        System.out.print("Número de Salón: ");
        int numSalon = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Estado del Salón (Ej: Activo/Inactivo): ");
        String estadoSalon = scanner.nextLine();

        System.out.print("Número de Alumnos: ");
        int numAlumnos = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre del Profesor Asignado: ");
        String nomProfesor = scanner.nextLine();

        System.out.print("¿El salón tiene conexión a Internet? (true/false): ");
        boolean internet = scanner.nextBoolean();

        System.out.print("Cantidad de Carpetas: ");
        int numCarpetas = scanner.nextInt();

        // Cerrar el scanner
        scanner.close();

        // Crear la instancia con los datos ingresados
        gestionSalones1 salon = new gestionSalones1(internet, numAlumnos, numSalon, estadoSalon, nomProfesor, numCarpetas);

        // Crear el archivo de texto con los datos del salón
        salon.crearArchivoSalon();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CantAlumnos;
    private javax.swing.JTextArea CantEquipos;
    private javax.swing.JTextArea EstadoSalon;
    private javax.swing.JTextArea NumSalon;
    private javax.swing.JTextArea ProfEncargado;
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
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea26;
    private javax.swing.JTextArea jTextArea28;
    // End of variables declaration//GEN-END:variables
}
