/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6Lab1;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import TP6Lab1.modelo.Producto;


public class PorPrecio extends javax.swing.JInternalFrame {

      
    public PorPrecio() {
        
     
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLDesde = new javax.swing.JLabel();
        JLHasta = new javax.swing.JLabel();
        JTF1 = new javax.swing.JTextField();
        JTF2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTBusqueda = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setForeground(new java.awt.Color(255, 102, 102));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultas Por Precio");

        JLDesde.setText("Desde :");

        JLHasta.setText("Hasta :");

        JTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TP6Lab1/imagen/Magnifier_29783.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(JLDesde)
                .addGap(18, 18, 18)
                .addComponent(JTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLHasta)
                .addGap(18, 18, 18)
                .addComponent(JTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLHasta)
                        .addComponent(JTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLDesde)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        JTBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        JTBusqueda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTBusqueda.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 12)); // NOI18N
        JTBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripcion", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTBusquedaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTBusqueda);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Búsqueda Por Precio");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TP6Lab1/imagen/icons8-exportar-48.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF1ActionPerformed
      try {
            double pMin, pMax;
            // Precios ingresados: si vienen vacíos, les asigno 0 para evitar una excepción.
            // Si no, el cartel por esa excepción se volvía muy repetitivo.
            if (JTF1.getText().trim().equals("") || JTF2.getText().trim().equals("")) {
                pMin = 0;
                pMax = 0;
            } else {
                pMin = Double.parseDouble(JTF1.getText().trim());
                pMax = Double.parseDouble(JTF2.getText().trim());
            }

            DefaultTableModel modelo = (DefaultTableModel) JTBusqueda.getModel();
            modelo.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos

            for (Producto elem : MenuGeneral.productos) {
                if (elem.getPrecio() >= pMin && elem.getPrecio() <= pMax) {
                    modelo.addRow(new Object[]{
                        elem.getCodigo(),
                        elem.getDescripcion(),
                        elem.getPrecio(),
                        elem.getStock(),
                    });
                }
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Datos incorrectos: deben ingresar números");
            JTF1.setText("");
            JTF2.setText("");
        }
    }

    private void JTF2ActionPerformed(ActionEvent evt) {
    }//GEN-LAST:event_JTF1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          JTF1ActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JTBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTBusquedaMouseClicked
      
        // Agregar un MouseListener a la tabla JTBusqueda
        JTBusqueda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Verificar si es un doble clic
                    int filaSeleccionada = JTBusqueda.getSelectedRow();
                    if (filaSeleccionada != -1) { // Verificar si se ha seleccionado una fila
                        // Obtener los datos de la fila seleccionada
                        String nombreProducto = (String) JTBusqueda.getValueAt(filaSeleccionada, 1); // Índice 1 para el nombre del producto
                        double precio = (double) JTBusqueda.getValueAt(filaSeleccionada, 2); // Índice 2 para el precio
                        
                        // Mostrar el mensaje con el nombre del producto y su precio
                        JOptionPane.showMessageDialog(null, "Nombre del Producto: " + nombreProducto + "\nPrecio: " + precio);
                    }
                }
            }
        });
               
    }//GEN-LAST:event_JTBusquedaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLDesde;
    private javax.swing.JLabel JLHasta;
    private javax.swing.JTable JTBusqueda;
    private javax.swing.JTextField JTF1;
    private javax.swing.JTextField JTF2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
