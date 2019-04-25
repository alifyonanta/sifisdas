package FORM;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MODUL extends javax.swing.JFrame {
    
    private Connection  koneksi;
    private Statement   pernyataan;
    private ResultSet   pengaturanhasil;
    
  
    public MODUL() {
        initComponents();
           try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/fisdasv3","root","");
            pernyataan = koneksi.createStatement();
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal.. "+e);
        } catch (SQLException e) {}
        setLocationRelativeTo(null);
        tampildata();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        TNMODUL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TIDMODUL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABEL1 = new javax.swing.JTable();
        BSIMPAN = new javax.swing.JButton();
        BHAPUS = new javax.swing.JButton();
        BPERBAHARUI = new javax.swing.JButton();
        BBATAL = new javax.swing.JButton();
        BKELUAR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Nama Modul");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 227, -1, -1));
        getContentPane().add(TNMODUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 226, 278, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("DATA MODUL ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 172, 110, -1));

        TIDMODUL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TIDMODULKeyPressed(evt);
            }
        });
        getContentPane().add(TIDMODUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 195, 129, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("ID Modul");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 196, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 771, 10));

        TABEL1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TABEL1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 274, 580, 160));

        BSIMPAN.setBackground(new java.awt.Color(204, 204, 204));
        BSIMPAN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BSIMPAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/save.png"))); // NOI18N
        BSIMPAN.setText("SIMPAN");
        BSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSIMPANActionPerformed(evt);
            }
        });
        getContentPane().add(BSIMPAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 130, 30));

        BHAPUS.setBackground(new java.awt.Color(204, 204, 204));
        BHAPUS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BHAPUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/cancel.png"))); // NOI18N
        BHAPUS.setText("HAPUS");
        BHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHAPUSActionPerformed(evt);
            }
        });
        getContentPane().add(BHAPUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 130, 30));

        BPERBAHARUI.setBackground(new java.awt.Color(204, 204, 204));
        BPERBAHARUI.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BPERBAHARUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/editCopy (2).png"))); // NOI18N
        BPERBAHARUI.setText("PERBARUI");
        BPERBAHARUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPERBAHARUIActionPerformed(evt);
            }
        });
        getContentPane().add(BPERBAHARUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 130, -1));

        BBATAL.setBackground(new java.awt.Color(204, 204, 204));
        BBATAL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BBATAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/editUndo.png"))); // NOI18N
        BBATAL.setText("BATAL");
        BBATAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBATALActionPerformed(evt);
            }
        });
        getContentPane().add(BBATAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 130, -1));

        BKELUAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BKELUAR.setForeground(new java.awt.Color(204, 0, 0));
        BKELUAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/edittrash.png"))); // NOI18N
        BKELUAR.setText("KELUAR");
        BKELUAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKELUARActionPerformed(evt);
            }
        });
        getContentPane().add(BKELUAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Desain\\Fisdas Logo - Copy.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 240, 160));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("LABORATORIUM FISIKA DASAR");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 394, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("UNIVERSITAS TELKOM");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 215, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel9.setText("SISTEM INFORMASI PRAKTIKUM");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 248, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TIDMODULKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TIDMODULKeyPressed
    try {
            
            pengaturanhasil = pernyataan.executeQuery("select * from modul where id_modul='"+TIDMODUL.getText()+"'");
            
            while (pengaturanhasil.next()){
                   
                TNMODUL.setText(pengaturanhasil.getString("nama_modul"));
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "gagal");
        } catch (HeadlessException e) {}         
    }//GEN-LAST:event_TIDMODULKeyPressed

    private void BSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIMPANActionPerformed
        try{
            pernyataan.executeUpdate("insert into modul set  id_modul='"              +TIDMODUL.getText()+"',"+
                "nama_modul='"             +TNMODUL.getText()+"'");
            JOptionPane.showMessageDialog(rootPane, "Data telah disimpan...");
            TIDMODUL.requestFocus();
            bersihkan();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Penyimpanan gagal...");
        }catch (HeadlessException e) {}
    }//GEN-LAST:event_BSIMPANActionPerformed

    private void BHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHAPUSActionPerformed
        try {
            pernyataan.executeUpdate("delete from modul where id_modul='"+TIDMODUL.getText()+"'");
            bersihkan();
            tampildata();
            JOptionPane.showMessageDialog(rootPane, "terhapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        } catch (HeadlessException e) {}
    }//GEN-LAST:event_BHAPUSActionPerformed

    private void BPERBAHARUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPERBAHARUIActionPerformed
        try{
            pernyataan.executeUpdate("update modul set  id_modul='"                +TIDMODUL.getText()+
                "',nama_modul='"             +TNMODUL.getText()+
                "' where id_modul='"       +TIDMODUL.getText()+"'");

            JOptionPane.showMessageDialog(rootPane, "Data telah diperbarui...");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Pembaharuan gagal...");
        }   catch (HeadlessException e) {}
    }//GEN-LAST:event_BPERBAHARUIActionPerformed

    private void BBATALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBATALActionPerformed
        bersihkan();
        }
        private void bersihkan()
        {
            TIDMODUL.setText("");
            TNMODUL.setText("");
            TIDMODUL.requestFocus();
    }//GEN-LAST:event_BBATALActionPerformed

    private void BKELUARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKELUARActionPerformed
        dispose();
    }//GEN-LAST:event_BKELUARActionPerformed

    /**
     * @param args the command line arguments
     */
    private void tampildata()
    {
        DefaultTableModel tabel1 = new DefaultTableModel();
        tabel1.addColumn("NO");
        tabel1.addColumn("ID Modul");
        tabel1.addColumn("Nama Modul");

        try{
            int n= 1;
            pengaturanhasil = pernyataan.executeQuery("select * from modul");
            while (pengaturanhasil.next())
            {
                tabel1.addRow(new Object []{(n++),
                pengaturanhasil.getString(1),
                pengaturanhasil.getString(2)});
            }
            TABEL1.setModel(tabel1);
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(PRAKTIKAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRAKTIKAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRAKTIKAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRAKTIKAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MODUL().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBATAL;
    private javax.swing.JButton BHAPUS;
    private javax.swing.JButton BKELUAR;
    private javax.swing.JButton BPERBAHARUI;
    private javax.swing.JButton BSIMPAN;
    private javax.swing.JTable TABEL1;
    private javax.swing.JTextField TIDMODUL;
    private javax.swing.JTextField TNMODUL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
