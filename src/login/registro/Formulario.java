package login.registro;

import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {
    
    int xx;
    int xy;
    int x;
    int y;
    
    public Formulario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cerrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlContenedor = new javax.swing.JPanel();
        pnlLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        CbxMPass = new javax.swing.JCheckBox();
        btnIngresar = new javax.swing.JButton();
        btnRegistro2 = new javax.swing.JButton();
        pnlRegistro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCorreoR = new javax.swing.JLabel();
        lblUsuarioR = new javax.swing.JLabel();
        lblPassR = new javax.swing.JLabel();
        lblRepPassR = new javax.swing.JLabel();
        txtCorreoR = new javax.swing.JTextField();
        txtUsuarioR = new javax.swing.JTextField();
        txtPassR = new javax.swing.JPasswordField();
        txtRepePassR = new javax.swing.JPasswordField();
        btnRegistro = new javax.swing.JButton();
        btnRegistro1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1486564399-close_81512.png"))); // NOI18N
        cerrar.setToolTipText("Salir Del Programa");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/borrar.png"))); // NOI18N
        minimizar.setToolTipText("Minimizar Ventana");
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MisiónTic 2022");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 784, Short.MAX_VALUE)
                .addComponent(minimizar)
                .addGap(18, 18, 18)
                .addComponent(cerrar)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minimizar)
                    .addComponent(cerrar)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pnlFormulario.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1044, 48));

        pnlContenedor.setLayout(new java.awt.CardLayout());

        pnlLogin.setBackground(new java.awt.Color(255, 255, 255));

        lblLogin.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(0, 51, 102));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN");

        lblUsuario.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 51, 102));
        lblUsuario.setText("Usuario");

        lblPass.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(0, 51, 102));
        lblPass.setText("Contraseña");

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        CbxMPass.setBackground(new java.awt.Color(255, 255, 255));
        CbxMPass.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        CbxMPass.setForeground(new java.awt.Color(0, 51, 102));
        CbxMPass.setText("Mostrar Contraseña");

        btnIngresar.setBackground(new java.awt.Color(0, 255, 0));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");

        btnRegistro2.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistro2.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro2.setText("REGISTRARME");
        btnRegistro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPass)
                    .addComponent(CbxMPass)
                    .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlLoginLayout.createSequentialGroup()
                            .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistro2))
                        .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(lblUsuario)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPass)
                .addGap(18, 18, 18)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CbxMPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistro2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pnlContenedor.add(pnlLogin, "card2");

        pnlRegistro.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Russo One", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO");

        lblCorreoR.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblCorreoR.setForeground(new java.awt.Color(0, 51, 102));
        lblCorreoR.setText("Correo");

        lblUsuarioR.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblUsuarioR.setForeground(new java.awt.Color(0, 51, 102));
        lblUsuarioR.setText("Usuario");

        lblPassR.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblPassR.setForeground(new java.awt.Color(0, 51, 102));
        lblPassR.setText("Contraseña");

        lblRepPassR.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lblRepPassR.setForeground(new java.awt.Color(0, 51, 102));
        lblRepPassR.setText("<html>Repetir Contraseña</html>");

        txtCorreoR.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoR.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        txtUsuarioR.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuarioR.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        txtPassR.setBackground(new java.awt.Color(255, 255, 255));
        txtPassR.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        txtRepePassR.setBackground(new java.awt.Color(255, 255, 255));
        txtRepePassR.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        btnRegistro.setBackground(new java.awt.Color(204, 102, 0));
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("REGISTRARME");

        btnRegistro1.setBackground(new java.awt.Color(0, 51, 102));
        btnRegistro1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro1.setText("LOGIN");
        btnRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistro1ActionPerformed(evt);
            }
        });

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 51, 102));
        jCheckBox1.setText("Mostrar Contraseña");

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlRegistroLayout.createSequentialGroup()
                            .addComponent(btnRegistro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                            .addComponent(btnRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblRepPassR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPassR, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblUsuarioR, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCorreoR, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRepePassR, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPassR, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUsuarioR, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCorreoR, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(lblCorreoR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCorreoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsuarioR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRepPassR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRepePassR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(24, 24, 24)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlRegistro, "card3");

        pnlFormulario.add(pnlContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 564, 588));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mision-tic-removebg-preview (1).png"))); // NOI18N
        pnlFormulario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 192, 468, 300));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mision-tic-removebg-preview.png"))); // NOI18N
        pnlFormulario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 48, 216, 312));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro1ActionPerformed
        pnlLogin.setVisible(true);
        pnlRegistro.setVisible(false);
    }//GEN-LAST:event_btnRegistro1ActionPerformed

    private void btnRegistro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistro2ActionPerformed
        pnlRegistro.setVisible(true);
        pnlLogin.setVisible(false);
    }//GEN-LAST:event_btnRegistro2ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        xx = evt.getXOnScreen();
        xy = evt.getYOnScreen();
        
        this.setLocation(xx-x, xy-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_minimizarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CbxMPass;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRegistro1;
    private javax.swing.JButton btnRegistro2;
    private javax.swing.JLabel cerrar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCorreoR;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPassR;
    private javax.swing.JLabel lblRepPassR;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioR;
    private javax.swing.JLabel minimizar;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTextField txtCorreoR;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPassR;
    private javax.swing.JPasswordField txtRepePassR;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioR;
    // End of variables declaration//GEN-END:variables
}
