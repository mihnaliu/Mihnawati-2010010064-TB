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
public class PenumpangPesawat extends javax.swing.JFrame {
    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql="";
    /**
     * Creates new form PenumpangPesawat
     */
    public PenumpangPesawat() {
        initComponents();
        KoneksiDatabase();
        table();
        
    }
    
    void hapus(){
        tkode.setText("");
        tnama.setText("");
        tidentitas.setText("");
        tusia.setText("");
        ttelpon.setText("");
        talamat.setText(""); 
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
        tbl.addColumn("Kode Penumpang");
        tbl.addColumn("Nama Penumpang");
        tbl.addColumn("No Identitas");
        tbl.addColumn("Jenis Kelamin");
        tbl.addColumn("Usia");
        tbl.addColumn("No Telpon");
        tbl.addColumn("Alamat");
        try {
            Statement st = (Statement) Koneksi.getConnections().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_penumpang");
            while(rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("kode_penumpang"),
                    rs.getString("nama_penumpang"),
                    rs.getString("no_identitas"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("usia"),
                    rs.getString("no_telpon"),
                    rs.getString("alamat")
                });
                TblPenumpang.setModel(tbl);
                TblPenumpang.enable(false);
                tkode.requestFocus();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tkode = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        tidentitas = new javax.swing.JTextField();
        rlaki = new javax.swing.JRadioButton();
        rperempuan = new javax.swing.JRadioButton();
        tusia = new javax.swing.JTextField();
        ttelpon = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblPenumpang = new javax.swing.JTable();
        talamat = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("DATA PENUMPANG PESAWAT");

        jLabel2.setText("Kode Penumpang");

        jLabel3.setText("Nama Penumpang");

        jLabel4.setText("No Identitas");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Usia");

        jLabel7.setText("No Telpon");

        jLabel8.setText("Alamat");

        rlaki.setText("Laki-laki");

        rperempuan.setText("Perempuan");

        jButton1.setText("Simpan");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
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

        jButton4.setText("Hapus");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TblPenumpang.setModel(new javax.swing.table.DefaultTableModel(
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
        TblPenumpang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblPenumpangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TblPenumpang);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("KELUAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rlaki)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(rperempuan))
                            .addComponent(tkode)
                            .addComponent(tnama)
                            .addComponent(tidentitas)
                            .addComponent(tusia)
                            .addComponent(ttelpon)
                            .addComponent(talamat))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tidentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rlaki)
                            .addComponent(rperempuan))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tusia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ttelpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String jk = null;
        
    if(rlaki.isSelected()){
        jk = "Laki-laki";
    }else if(rperempuan.isSelected()){
        jk = "Perempuan";
    }
        
    try {
        //Create SQL statement
        String sql = "INSERT INTO tb_penumpang VALUES(?,?,?,?,?,?,?)";
        //Establish connection to database
        Connection con = (Connection) Koneksi.getConnections();
        //Create prepared statement
        PreparedStatement pst = con.prepareStatement(sql);
        //Add values to prepared statement
        pst.setString(1, tkode.getText());
        pst.setString(2, tnama.getText());
        pst.setString(3, tidentitas.getText());
        pst.setString(4, jk);
        pst.setString(5, tusia.getText());
        pst.setString(6, ttelpon.getText());
        pst.setString(7, talamat.getText());
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
            String sql = "SELECT * FROM tb_penumpang WHERE kode_penumpang ='" + tkode.getText() + "'";
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
        
        String jk = null;
    if(rlaki.isSelected()){
        jk = "Laki-laki";
    }else if(rperempuan.isSelected()){
        jk = "Perempuan";
    }

    // Update data in the database
    try {
        String updateSQL = "UPDATE tb_penumpang SET kode_penumpang=?, nama_penumpang=?, no_identitas=?, jenis_kelamin=?, usia=?, no_telpon=?, alamat=? WHERE kode_penumpang=?";
        Connection con = (Connection) Koneksi.getConnections();
        PreparedStatement pst = con.prepareStatement(updateSQL);
        
        // Set the new values for the columns
        pst.setString(1, tkode.getText());
        pst.setString(2, tnama.getText());
        pst.setString(3, tidentitas.getText());
        pst.setString(4, jk);
        pst.setString(5, tusia.getText());
        pst.setString(6, ttelpon.getText());
        pst.setString(7, talamat.getText());
        pst.setString(8, tkode.getText());
        
        // Execute the update
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil diedit");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e);
    }
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void TblPenumpangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblPenumpangMouseClicked
        // TODO add your handling code here:
        
         int selectedRow = TblPenumpang.rowAtPoint(evt.getPoint());
    
    // Get the values from the selected row's columns
    String kode_penumpang = TblPenumpang.getValueAt(selectedRow, 0).toString();
    String nama_penumpang = TblPenumpang.getValueAt(selectedRow, 1).toString();
    String no_identitas = TblPenumpang.getValueAt(selectedRow, 2).toString();
    String usia = TblPenumpang.getValueAt(selectedRow, 4).toString();
    String no_telpon = TblPenumpang.getValueAt(selectedRow, 5).toString();
    String alamat = TblPenumpang.getValueAt(selectedRow, 6).toString();
    
    // Set the values as the text in the corresponding text fields
    tkode.setText(kode_penumpang);
    tnama.setText(nama_penumpang);
    tidentitas.setText(no_identitas);
    tusia.setText(usia);
    ttelpon.setText(no_telpon);
    talamat.setText(alamat);
    }//GEN-LAST:event_TblPenumpangMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
    int dialogResult = JOptionPane.showConfirmDialog (null, "Apakah Anda yakin ingin menghapus data ini?","Warning", dialogButton);
    if(dialogResult == JOptionPane.YES_OPTION){
        try {
            //Create SQL statement
            String sql = "DELETE FROM tb_penumpang WHERE kode_penumpang = ?";
            //Establish connection to database
            Connection con = (Connection) Koneksi.getConnections();
            //Create prepared statement
            PreparedStatement pst = con.prepareStatement(sql);
            //Add values to prepared statement
            pst.setString(1, tkode.getText());
            //Execute the prepared statement
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menghapus"+ e.getMessage());
        }
    }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Yakin nih mau keluar?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(PenumpangPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenumpangPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenumpangPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenumpangPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenumpangPesawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblPenumpang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rlaki;
    private javax.swing.JRadioButton rperempuan;
    private javax.swing.JTextField talamat;
    private javax.swing.JTextField tidentitas;
    private javax.swing.JTextField tkode;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField ttelpon;
    private javax.swing.JTextField tusia;
    // End of variables declaration//GEN-END:variables

   

}
