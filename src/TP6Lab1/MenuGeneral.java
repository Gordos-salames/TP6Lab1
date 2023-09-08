/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TP6Lab1;


import imagenfondo.Index;
import java.awt.Graphics;
import java.awt.Image;
import java.util.TreeSet;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import TP6Lab1.modelo.Producto;


public class MenuGeneral extends javax.swing.JFrame {

    public static TreeSet<Producto> productos = new TreeSet<>();
    static Iterable<Producto> listaProductos;

    
    public MenuGeneral() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon Fondo = new ImageIcon(getClass().getResource("imagen/DeTodoSA.png"));
        Image Fondos = Fondo.getImage();
        escritorio =  new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage(Fondos, 0, 0, getWidth(), getHeight(), this);
            }
        }
        ;
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiProducto = new javax.swing.JMenuItem();
        jmiRubro = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jmiNombre = new javax.swing.JMenuItem();
        jmiPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jMenu1.setForeground(new java.awt.Color(255, 51, 51));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TP6Lab1/imagen/icons8-checklist-32.png"))); // NOI18N
        jMenu1.setText("Administracion");
        jMenu1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N

        jmiProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TP6Lab1/imagen/productos.png"))); // NOI18N
        jmiProducto.setText("Productos");
        jmiProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiProducto);

        jMenuBar1.add(jMenu1);

        jmiRubro.setForeground(new java.awt.Color(255, 102, 51));
        jmiRubro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TP6Lab1/imagen/operador.png"))); // NOI18N
        jmiRubro.setText("Consultas");
        jmiRubro.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TP6Lab1/imagen/etiqueta.png"))); // NOI18N
        jMenuItem2.setText("Por Rubro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmiRubro.add(jMenuItem2);

        jmiNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TP6Lab1/imagen/nombre.png"))); // NOI18N
        jmiNombre.setText("Por Nombre");
        jmiNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNombreActionPerformed(evt);
            }
        });
        jmiRubro.add(jmiNombre);

        jmiPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TP6Lab1/imagen/precio.png"))); // NOI18N
        jmiPrecio.setText("Por Precio");
        jmiPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPrecioActionPerformed(evt);
            }
        });
        jmiRubro.add(jmiPrecio);

        jMenuBar1.add(jmiRubro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:

        escritorio.removeAll();
        escritorio.repaint();
        Rubro_ventana vr = new Rubro_ventana();
        vr.setVisible(true);
        escritorio.add(vr);
        escritorio.moveToFront(vr);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jmiPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPrecioActionPerformed
        // TODO add your handling code here:
        
         escritorio.removeAll();
        escritorio.repaint();
        PorPrecio pp = new PorPrecio();
        pp.setVisible(true);
        escritorio.add(pp);
        escritorio.moveToFront(pp);
        
    }//GEN-LAST:event_jmiPrecioActionPerformed

    private void jmiProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductoActionPerformed
        // TODO add your handling code here:

        escritorio.removeAll();
        escritorio.repaint();
        GestiondeProductos gdp = new GestiondeProductos();
        gdp.setVisible(true);
        escritorio.add(gdp);
        escritorio.moveToFront(gdp);


    }//GEN-LAST:event_jmiProductoActionPerformed

    private void jmiNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNombreActionPerformed
        // TODO add your handling code here:

        escritorio.removeAll();
        escritorio.repaint();
        PorNombre pn = new PorNombre();
        pn.setVisible(true);
        escritorio.add(pn);
        escritorio.moveToFront(pn);

    }//GEN-LAST:event_jmiNombreActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jmiNombre;
    private javax.swing.JMenuItem jmiPrecio;
    private javax.swing.JMenuItem jmiProducto;
    private javax.swing.JMenu jmiRubro;
    // End of variables declaration//GEN-END:variables

    private static class Precio {

        public Precio() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
