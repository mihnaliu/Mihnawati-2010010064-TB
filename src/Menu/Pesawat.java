/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Pesawat extends javax.swing.JFrame {
    
    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql="";

    /**
     * Creates new form Pesawat
     */
    public Pesawat() {
        initComponents();
        KoneksiDatabase();
        table();
    }
    
    void hapus(){
        tide.setText("");
        cbclass.setSelectedIndex(0);
        tasal.setText("");
        tujuan.setText("");
        tharga.setText(""); 
   }

     private void KoneksiDatabase() {
        try {
            //Menentukan Driver Database
            Class.forName("com.mysql.jdbc.Driver");
            //untuk mengkoneksikan DB ke Driver
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_ppesawat", "root", "");
            //pesan Koneksi Berhasil
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e) {
            //pesan Koneksi Gagal
            System.out.println("Koneksi Gagal" + e.getMessage());
        }
    }
     
     public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID Pesawat");
        tbl.addColumn("Maskapai dan Class");
        tbl.addColumn("Kota Awal");
        tbl.addColumn("Kota Tujuan");
        tbl.addColumn("Harga Tiket");
        
        
        try {
            Statement st = (Statement) Koneksi.getConnections().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_pesawat");
            while(rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("id_pesawat"),
                    rs.getString("maskapai_class"),
                    rs.getString("kota_awal"),
                    rs.getString("kota_tujuan"),
                    rs.getString("harga_tiket"),
                    
                    
                });
                TblPesawat.setModel(tbl);
                TblPesawat.enable(false);
                tide.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan Data Pesawat \n"+e);
        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tide = new javax.swing.JTextField();
        cbclass = new javax.swing.JComboBox<>();
        tasal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tujuan = new javax.swing.JTextField();
        tharga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPesawat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("DATA PESAWAT TERBANG");

        jLabel2.setText("ID Pesawat");

        jLabel3.setText("Maskapai dan Class");

        jLabel6.setText("Kota Asal");

        jLabel7.setText("Kota Tujuan");

        jLabel8.setText("Harga Tiket");

        cbclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LION AIR - Ekonomi", "LION AIR - Bisnis", "LION AIR - First Class", "GARUDA - Ekonomi", "GARUDA - Bisnis", "GARUDA - First Class", "SRIWIJAYA - Ekonomi", "SRIWIJAYA - Bisnis", "SRIWIJAYA - First Class", "CITILINK - Ekonomi", "CITILINK - Bisnis", "CITILINK - First Class" }));
        cbclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbclassActionPerformed(evt);
            }
        });

        tasal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasalActionPerformed(evt);
            }
        });

        jButton1.setText("Simpan");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tampil");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Edit");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Hapus");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        tujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuanActionPerformed(evt);
            }
        });

        TblPesawat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TblPesawat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblPesawatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblPesawat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tasal, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tharga)
                                    .addComponent(tide, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbclass, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tujuan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(tasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tasalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tasalActionPerformed

    private void tujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tujuanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cbclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbclassActionPerformed
        // TODO add your handling code here:
        switch(cbclass.getSelectedIndex()){
            case 0:
                tharga.setText("1416000");
                break;
            case 1:
                tharga.setText("1989000");
                break;
            case 2:
                tharga.setText("2258000");
                break;
            case 3:
                tharga.setText("3685000");
                break;
            case 4:
                tharga.setText("4367000");
                break;
            case 5:
                tharga.setText("5289000");
                break;
            case 6:
                tharga.setText("1385000");
                break;
            case 7:
                tharga.setText("1768000");
                break;
            case 8:
                tharga.setText("2324000");
                break;
            case 9:
                tharga.setText("1105000");
                break;
            case 10:
                tharga.setText("1561000");
                break;
            case 11:
                tharga.setText("1989000");
                break;
            default:
                tharga.setText("1000");
        }
    }//GEN-LAST:event_cbclassActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try {
            //Create SQL statement
        String sql = "INSERT INTO tb_pesawat VALUES(?,?,?,?,?)";
        //Establish connection to database
        Connection con = (Connection) Koneksi.getConnections();
        //Create prepared statement
        PreparedStatement pst = con.prepareStatement(sql);
        //Add values to prepared statement
        pst.setString(1, tide.getText());
        pst.setString(2, (String) cbclass.getSelectedItem());
        pst.setString(3, tasal.getText());
        pst.setString(4, tujuan.getText());
        pst.setString(5, tharga.getText());
        
        //Execute the prepared statement
        pst.execute();
            
        //Show success message
        JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        } catch (Exception e) {
            //Show error message
        JOptionPane.showMessageDialog(null, "Gagal Menyimpan"+ e.getMessage());
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM tb_pesawat WHERE id_pesawat ='" + tide.getText() + "'";
            Connection con = (Connection) Koneksi.getConnections();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        table();
        hapus();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        try {
        String updateSQL = "UPDATE tb_pesawat SET id_pesawat=?, maskapai_class=?, kota_awal=?, kota_tujuan=?, harga_tiket=? WHERE id_pesawat=?";
        Connection con = (Connection) Koneksi.getConnections();
        PreparedStatement pst = con.prepareStatement(updateSQL);
        // Set the new values for the columns
        pst.setString(1, tide.getText());
        pst.setString(2, (String) cbclass.getSelectedItem());
        pst.setString(3, tasal.getText());
        pst.setString(4, tujuan.getText());
        pst.setString(5, tharga.getText());
        pst.setString(6, tide.getText());

        // Execute the update
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil diedit");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e);
    }
    }//GEN-LAST:event_jButton3MouseClicked

    private void TblPesawatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblPesawatMouseClicked
        // TODO add your handling code here:
        int selectedRow = TblPesawat.rowAtPoint(evt.getPoint());
    
    // Get the values from the selected row's columns
    String id_pesawat = TblPesawat.getValueAt(selectedRow, 0).toString();
    String maskapai_class = TblPesawat.getValueAt(selectedRow, 1).toString();
    String kota_asal = TblPesawat.getValueAt(selectedRow, 2).toString();
    String kota_tujuan = TblPesawat.getValueAt(selectedRow, 3).toString();
    String harga_tiket = TblPesawat.getValueAt(selectedRow, 4).toString();
   
    
    // Set the values as the text in the corresponding text fields
    tide.setText(id_pesawat);
    cbclass.setSelectedItem(maskapai_class);
    tasal.setText(kota_asal);
    tujuan.setText(kota_tujuan);
    tharga.setText(harga_tiket);
    }//GEN-LAST:event_TblPesawatMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
    int dialogResult = JOptionPane.showConfirmDialog (null, "Apakah Anda yakin ingin menghapus data ini?","Warning", dialogButton);
    if(dialogResult == JOptionPane.YES_OPTION){
        try {
            //Create SQL statement
            String sql = "DELETE FROM tb_pesawat WHERE id_pesawat = ?";
            //Establish connection to database
            Connection con = (Connection) Koneksi.getConnections();
            //Create prepared statement
            PreparedStatement pst = con.prepareStatement(sql);
            //Add values to prepared statement
            pst.setString(1, tide.getText());
            //Execute the prepared statement
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menghapus"+ e.getMessage());
        }
    }
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblPesawat;
    private javax.swing.JComboBox<String> cbclass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tasal;
    private javax.swing.JTextField tharga;
    private javax.swing.JTextField tide;
    private javax.swing.JTextField tujuan;
    // End of variables declaration//GEN-END:variables
}
