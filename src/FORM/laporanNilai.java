package FORM;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class laporanNilai extends javax.swing.JFrame {
    
    private Connection  koneksi;
    private Statement   pernyataan;
    private ResultSet   pengaturanhasil;
    private String      tanggal;
    
    public laporanNilai() {
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

        jButton5 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABEL1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(204, 0, 0));
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 200, 100));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 570, 240));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("LABORATORIUM FISIKA DASAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 394, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("UNIVERSITAS TELKOM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 215, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setText("SISTEM INFORMASI PRAKTIKUM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 248, 20));

        jButton7.setText("Profile Saya");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 120, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new pilihanLogin().setVisible(true);  // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed
                                                                                              
   
    
    private void tampildata()
    {
        DefaultTableModel tabel1 = new DefaultTableModel();
        tabel1.addColumn("NO");
        tabel1.addColumn("NIM");
        tabel1.addColumn("TP");
        tabel1.addColumn("TA");
        tabel1.addColumn("Praktik");
        tabel1.addColumn("Jurnal");
        tabel1.addColumn("Presentasi");
        tabel1.addColumn("Huruf");
        tabel1.addColumn("Waktu");
        


        try{
            int n= 1;
            pengaturanhasil = pernyataan.executeQuery("select NIM,tp,ta,praktik,jurnal,presentasi,huruf,waktu from praktikum");
            while (pengaturanhasil.next())
            {
                tabel1.addRow(new Object []{(n++),
                pengaturanhasil.getString(1),
                pengaturanhasil.getString(2),
                pengaturanhasil.getString(3),
                pengaturanhasil.getString(4),
                pengaturanhasil.getString(5),
                pengaturanhasil.getString(6),
                pengaturanhasil.getString(7)});
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
            java.util.logging.Logger.getLogger(laporanNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(laporanNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(laporanNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(laporanNilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new laporanNilai().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TABEL1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
