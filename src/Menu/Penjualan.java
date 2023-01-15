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


public class Penjualan extends javax.swing.JFrame {
    int nil1;
    int nil2;
    int total;
    private Statement St;
    private Connection Con;
    private ResultSet Rs;
    private String sql="";
    

    /**
     * Creates new form Penjualan
     */
    public Penjualan() {
        initComponents();
        KoneksiDatabase();
        table();
    }
    
    void hapus(){
        tpenjual.setText("");
        tnama.setText("");
        cbclass.setSelectedIndex(0);
        tharga.setText("");
        tbeli.setText("");
        ttotal.setText(""); 
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
        tbl.addColumn("ID Penjualan");
        tbl.addColumn("Nama Penumpang");
        tbl.addColumn("Maskapai dan Class");
        tbl.addColumn("Harga Tiket");
        tbl.addColumn("Jumlah Tiket Yang Dibeli");
        tbl.addColumn("Total");
        
        try {
            Statement st = (Statement) Koneksi.getConnections().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_penjualan");
            while(rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("id_penjualan"),
                    rs.getString("nama_penumpang"),
                    rs.getString("maskapai_class"),
                    rs.getString("harga_tiket"),
                    rs.getString("jumlah_tiket"),
                    rs.getString("total"),
                    
                });
                TblPenjualan.setModel(tbl);
                TblPenjualan.enable(false);
                tpenjual.requestFocus();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tpenjual = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        cbclass = new javax.swing.JComboBox<>();
        tharga = new javax.swing.JTextField();
        tbeli = new javax.swing.JTextField();
        ttotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPenjualan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setText("DATA PENJUALAN TIKET PESAWAT");

        jLabel2.setText("ID Penjualan");

        jLabel3.setText("Nama Penumpang");

        jLabel5.setText("Maskapai dan Class");

        jLabel6.setText("Harga Tiket");

        jLabel7.setText("Jumlah Tiket yang Dibeli");

        jLabel8.setText("Total");

        cbclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LION AIR - Ekonomi", "LION AIR - Bisnis", "LION AIR - First Class", "GARUDA - Ekonomi", "GARUDA - Bisnis", "GARUDA - First Class", "SRIWIJAYA - Ekonomi", "SRIWIJAYA - Bisnis", "SRIWIJAYA - First Class", "CITILINK - Ekonomi", "CITILINK - Bisnis", "CITILINK - First Class" }));
        cbclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbclassActionPerformed(evt);
            }
        });

        jButton1.setText("HITUNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Simpan");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Tampil");
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

        jButton4.setText("Edit");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Hapus");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        TblPenjualan.setModel(new javax.swing.table.DefaultTableModel(
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
        TblPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblPenjualanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblPenjualan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tpenjual)
                                    .addComponent(tnama)
                                    .addComponent(cbclass, 0, 241, Short.MAX_VALUE)
                                    .addComponent(tharga)
                                    .addComponent(ttotal)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(505, 505, 505))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tpenjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel6)
                    .addComponent(tharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(ttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        nil1=Integer.parseInt(tharga.getText());
        nil2=Integer.parseInt(tbeli.getText());
        total=nil1*nil2;
        ttotal.setText(String.valueOf(total));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
         try {
            String sql = "SELECT * FROM tb_penjualan WHERE id_penjualan ='" + tpenjual.getText() + "'";
            Connection con = (Connection) Koneksi.getConnections();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        table();
        hapus();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        try {
            //Create SQL statement
        String sql = "INSERT INTO tb_penjualan VALUES(?,?,?,?,?,?)";
        //Establish connection to database
        Connection con = (Connection) Koneksi.getConnections();
        //Create prepared statement
        PreparedStatement pst = con.prepareStatement(sql);
        //Add values to prepared statement
        pst.setString(1, tpenjual.getText());
        pst.setString(2, tnama.getText());
        pst.setString(3, (String) cbclass.getSelectedItem());
        pst.setString(4, tharga.getText());
        pst.setString(5, tbeli.getText());
        pst.setString(6, ttotal.getText());
        //Execute the prepared statement
        pst.execute();
            
        //Show success message
        JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        } catch (Exception e) {
            //Show error message
        JOptionPane.showMessageDialog(null, "Gagal Menyimpan"+ e.getMessage());
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
         try {
        String updateSQL = "UPDATE tb_penjualan SET id_penjualan=?, nama_penumpang=?, maskapai_class=?, harga_tiket=?, jumlah_tiket=?, total=? WHERE id_penjualan=?";
        Connection con = (Connection) Koneksi.getConnections();
        PreparedStatement pst = con.prepareStatement(updateSQL);
        // Set the new values for the columns
        pst.setString(1, tpenjual.getText());
        pst.setString(2, tnama.getText());
        pst.setString(3, (String) cbclass.getSelectedItem());
        pst.setString(4, tharga.getText());
        pst.setString(5, tbeli.getText());
        pst.setString(6, ttotal.getText());
        pst.setString(7, tpenjual.getText());

        // Execute the update
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data berhasil diedit");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e);
    }
      
    }//GEN-LAST:event_jButton4MouseClicked

    private void TblPenjualanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblPenjualanMouseClicked
        // TODO add your handling code here:
        int selectedRow = TblPenjualan.rowAtPoint(evt.getPoint());
    
    // Get the values from the selected row's columns
    String id_penjualan = TblPenjualan.getValueAt(selectedRow, 0).toString();
    String nama_penumpang = TblPenjualan.getValueAt(selectedRow, 1).toString();
    String maskapai_class = TblPenjualan.getValueAt(selectedRow, 2).toString();
    String harga_tiket = TblPenjualan.getValueAt(selectedRow, 3).toString();
    String jumlah_tiket = TblPenjualan.getValueAt(selectedRow, 4).toString();
    String total = TblPenjualan.getValueAt(selectedRow, 5).toString();
    
    // Set the values as the text in the corresponding text fields
    tpenjual.setText(id_penjualan);
    tnama.setText(nama_penumpang);
    cbclass.setSelectedItem(maskapai_class);
    tharga.setText(harga_tiket);
    tbeli.setText(jumlah_tiket);
    ttotal.setText(total);
    }//GEN-LAST:event_TblPenjualanMouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
    int dialogResult = JOptionPane.showConfirmDialog (null, "Apakah Anda yakin ingin menghapus data ini?","Warning", dialogButton);
    if(dialogResult == JOptionPane.YES_OPTION){
        try {
            //Create SQL statement
            String sql = "DELETE FROM tb_penjualan WHERE id_penjualan = ?";
            //Establish connection to database
            Connection con = (Connection) Koneksi.getConnections();
            //Create prepared statement
            PreparedStatement pst = con.prepareStatement(sql);
            //Add values to prepared statement
            pst.setString(1, tpenjual.getText());
            //Execute the prepared statement
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menghapus"+ e.getMessage());
        }
    }
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblPenjualan;
    private javax.swing.JComboBox<String> cbclass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tbeli;
    private javax.swing.JTextField tharga;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tpenjual;
    private javax.swing.JTextField ttotal;
    // End of variables declaration//GEN-END:variables

    
}
