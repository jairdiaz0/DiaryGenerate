/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package jframes;

/**
 *
 * @author edenj
 */
public class JDialogNewSubject extends javax.swing.JDialog {

    private javax.swing.table.DefaultTableModel model = null;
    private final listas.ListaDoblementeLigadaCircular lista = listas.ListManager.lista;

    /**
     * Creates new form JDialogNewSubject
     *
     * @param parent JFrame parent
     * @param modal boolean, true si no se puede cambiar de ventana sin
     * cerrarla, false en caso contrario.
     * @param title String con el titulo de la ventana.
     * @param model Modelo del JTable para modificarlo.
     * @param semestreDefault JSpinner con el semestre por default.
     */
    public JDialogNewSubject(java.awt.Frame parent, boolean modal, String title,
            javax.swing.table.DefaultTableModel model, javax.swing.JSpinner semestreDefault) {
        super(parent, modal);
        this.setTitle(title);
        this.model = model;
        initComponents();
        moreConfiguration(semestreDefault);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jLabelSemestre = new javax.swing.JLabel();
        jLabelClave = new javax.swing.JLabel();
        jLabelAsignatura = new javax.swing.JLabel();
        jSpinnerSemestre = new javax.swing.JSpinner();
        jTextFieldClave = new javax.swing.JTextField();
        jTextFieldAsignatura = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jSeparatorSemestre = new javax.swing.JSeparator();
        jSeparatorAsignatura = new javax.swing.JSeparator();
        jSeparatorClave = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelMain.setPreferredSize(new java.awt.Dimension(450, 400));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSemestre.setLabelFor(jSpinnerSemestre);
        jLabelSemestre.setText("Semestre :");
        jPanelMain.add(jLabelSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabelClave.setLabelFor(jTextFieldClave);
        jLabelClave.setText("Clave :");
        jPanelMain.add(jLabelClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabelAsignatura.setLabelFor(jTextFieldAsignatura);
        jLabelAsignatura.setText("Nombre de la Asignatura :");
        jPanelMain.add(jLabelAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 213, -1, -1));

        jSpinnerSemestre.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinnerSemestre.setBorder(null);
        jPanelMain.add(jSpinnerSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jTextFieldClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldClave.setText("------");
        jTextFieldClave.setBorder(null);
        jTextFieldClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldClaveFocusGained(evt);
            }
        });
        jPanelMain.add(jTextFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, 25));

        jTextFieldAsignatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAsignatura.setText("------ ------");
        jTextFieldAsignatura.setBorder(null);
        jTextFieldAsignatura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldAsignaturaFocusGained(evt);
            }
        });
        jPanelMain.add(jTextFieldAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 252, 34));

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });
        jPanelMain.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));
        jPanelMain.add(jSeparatorSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 70, -1));
        jPanelMain.add(jSeparatorAsignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 250, -1));
        jPanelMain.add(jSeparatorClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldClaveFocusGained
        this.jTextFieldClave.selectAll();
    }//GEN-LAST:event_jTextFieldClaveFocusGained

    private void jTextFieldAsignaturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAsignaturaFocusGained
        this.jTextFieldAsignatura.selectAll();
    }//GEN-LAST:event_jTextFieldAsignaturaFocusGained

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        if (tools.Interfaz.checkBlank(this.jSpinnerSemestre, this.jTextFieldClave, this.jTextFieldAsignatura)) {
            if (model != null) {
                int semestre = (int) this.jSpinnerSemestre.getValue();
                String clave = this.jTextFieldClave.getText();
                String asignatura = this.jTextFieldAsignatura.getText();
                if (this.lista.buscar(clave) == null) {
                    models.Subject subject = new models.Subject(semestre, clave, asignatura);
                    this.lista.inserta(new listas.Nodo(clave, subject));
                    this.model.addRow(new Object[]{semestre, clave, asignatura});
                    tools.JOPaneMessages.exito(this, "Asignatura agregada con éxito");
                    this.dispose();
                } else {
                    tools.JOPaneMessages.error(this, "Error, clave ya registrada");
                }
            }
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JLabel jLabelAsignatura;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelSemestre;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JSeparator jSeparatorAsignatura;
    private javax.swing.JSeparator jSeparatorClave;
    private javax.swing.JSeparator jSeparatorSemestre;
    private javax.swing.JSpinner jSpinnerSemestre;
    private javax.swing.JTextField jTextFieldAsignatura;
    private javax.swing.JTextField jTextFieldClave;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que nos permite poner más configuraciones despues de inicializar.
     *
     * @param semestreDefault JSpinner con el semestre por default.
     */
    private void moreConfiguration(javax.swing.JSpinner semestreDefault) {

        //Set Fonts
        this.jSpinnerSemestre.setFont(tools.RootVariables.fontMenu);
        this.jTextFieldClave.setFont(tools.RootVariables.fontMenu);
        this.jTextFieldAsignatura.setFont(tools.RootVariables.fontMenu);
        this.jLabelSemestre.setFont(tools.RootVariables.fontMenu);
        this.jLabelClave.setFont(tools.RootVariables.fontMenu);
        this.jLabelAsignatura.setFont(tools.RootVariables.fontMenu);
        this.jButtonAgregar.setFont(tools.RootVariables.fontMenu);

        this.jSpinnerSemestre.setValue(semestreDefault.getValue());
    }

}
