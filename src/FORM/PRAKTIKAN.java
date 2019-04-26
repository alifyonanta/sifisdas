package FORM;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PRAKTIKAN extends javax.swing.JFrame {
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        BHAPUS = new javax.swing.JButton();
        BSIMPAN = new javax.swing.JButton();
        TNAMA = new javax.swing.JTextField();
        TKELAS = new javax.swing.JTextField();
        TIDKELOMPOK = new javax.swing.JTextField();
        LNIS = new javax.swing.JLabel();
        LJUDUL4 = new javax.swing.JLabel();
        BKELUAR = new javax.swing.JButton();
        BPERBAHARUI = new javax.swing.JButton();
        BBATAL = new javax.swing.JButton();
        LTEMPATLAHIR = new javax.swing.JLabel();
        CJENISKELAMIN = new javax.swing.JComboBox();
        TNIM = new javax.swing.JTextField();
        LJENISKELAMIN = new javax.swing.JLabel();
        TNOHP = new javax.swing.JTextField();
        LNAMASISWA = new javax.swing.JLabel();
        LALAMAT = new javax.swing.JLabel();
        LAGAMA = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABEL1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BHAPUS.setBackground(new java.awt.Color(204, 204, 204));
        BHAPUS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BHAPUS.setForeground(new java.awt.Color(0, 0, 153));
        BHAPUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/cancel.png"))); // NOI18N
        BHAPUS.setText("HAPUS");
        BHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHAPUSActionPerformed(evt);
            }
        });
        getContentPane().add(BHAPUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 100, 40));

        BSIMPAN.setBackground(new java.awt.Color(204, 204, 204));
        BSIMPAN.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BSIMPAN.setForeground(new java.awt.Color(0, 0, 153));
        BSIMPAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/save.png"))); // NOI18N
        BSIMPAN.setText("SAVE");
        BSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSIMPANActionPerformed(evt);
            }
        });
        getContentPane().add(BSIMPAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 100, 40));
        getContentPane().add(TNAMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, 30));
        getContentPane().add(TKELAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 110, 30));
        getContentPane().add(TIDKELOMPOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 110, 30));

        LNIS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LNIS.setText("NIM");
        getContentPane().add(LNIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        LJUDUL4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LJUDUL4.setText("DATA PRAKTIKAN");
        getContentPane().add(LJUDUL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        BKELUAR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BKELUAR.setForeground(new java.awt.Color(204, 0, 0));
        BKELUAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/edittrash.png"))); // NOI18N
        BKELUAR.setText("EXIT");
        BKELUAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKELUARActionPerformed(evt);
            }
        });
        getContentPane().add(BKELUAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 100, 100));

        BPERBAHARUI.setBackground(new java.awt.Color(204, 204, 204));
        BPERBAHARUI.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BPERBAHARUI.setForeground(new java.awt.Color(0, 0, 153));
        BPERBAHARUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/editCopy (2).png"))); // NOI18N
        BPERBAHARUI.setText("EDIT");
        BPERBAHARUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPERBAHARUIActionPerformed(evt);
            }
        });
        getContentPane().add(BPERBAHARUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 100, 40));

        BBATAL.setBackground(new java.awt.Color(204, 204, 204));
        BBATAL.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BBATAL.setForeground(new java.awt.Color(0, 0, 153));
        BBATAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/editUndo.png"))); // NOI18N
        BBATAL.setText("BATAL");
        BBATAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBATALActionPerformed(evt);
            }
        });
        getContentPane().add(BBATAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 100, 40));

        LTEMPATLAHIR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LTEMPATLAHIR.setText("Kelas");
        getContentPane().add(LTEMPATLAHIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        CJENISKELAMIN.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Laki-laki", "Perempuan" }));
        CJENISKELAMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CJENISKELAMINActionPerformed(evt);
            }
        });
        getContentPane().add(CJENISKELAMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        TNIM.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TNIMCaretUpdate(evt);
            }
        });
        TNIM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TNIMKeyPressed(evt);
            }
        });
        getContentPane().add(TNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 90, 30));

        LJENISKELAMIN.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LJENISKELAMIN.setText("Jenis Kelamin");
        getContentPane().add(LJENISKELAMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 20));
        getContentPane().add(TNOHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 110, 30));

        LNAMASISWA.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LNAMASISWA.setText("Nama");
        getContentPane().add(LNAMASISWA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 20));

        LALAMAT.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LALAMAT.setText("No. HP");
        getContentPane().add(LALAMAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        LAGAMA.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LAGAMA.setText("ID Kelompok");
        getContentPane().add(LAGAMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 570, 240));
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

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Desain\\Fisdas Logo - Copy.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 250, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHAPUSActionPerformed

    }//GEN-LAST:event_BHAPUSActionPerformed

    private void BSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIMPANActionPerformed

    }//GEN-LAST:event_BSIMPANActionPerformed

    private void BKELUARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKELUARActionPerformed
        dispose();
    }//GEN-LAST:event_BKELUARActionPerformed

    private void BPERBAHARUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPERBAHARUIActionPerformed

    }//GEN-LAST:event_BPERBAHARUIActionPerformed

    private void BBATALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBATALActionPerformed
        
    }//GEN-LAST:event_BBATALActionPerformed

    private void CJENISKELAMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CJENISKELAMINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CJENISKELAMINActionPerformed

    private void TNIMCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TNIMCaretUpdate

    }//GEN-LAST:event_TNIMCaretUpdate

    private void TNIMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TNIMKeyPressed

    }//GEN-LAST:event_TNIMKeyPressed
                                                                                              
    
    
    private void tampildata()
    {
        DefaultTableModel tabel1 = new DefaultTableModel();
        tabel1.addColumn("NO");
        tabel1.addColumn("NIM");
        tabel1.addColumn("Nama");
        tabel1.addColumn("Jenis Kelamin");
        tabel1.addColumn("No. HP");
        tabel1.addColumn("ID Kelompok");
        tabel1.addColumn("Kelas");

        try{
            int n = 1;
            pengaturanhasil = pernyataan.executeQuery("select * from praktikan");
            while (pengaturanhasil.next())
            {
                tabel1.addRow(new Object []{(n++),
                pengaturanhasil.getString(1),
                pengaturanhasil.getString(2),
                pengaturanhasil.getString(3),
                pengaturanhasil.getString(4),
                pengaturanhasil.getString(5),
                pengaturanhasil.getString(6)});
            }
            TABEL1.setModel(pengaturanhasil);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new PRAKTIKAN().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBATAL;
    private javax.swing.JButton BHAPUS;
    private javax.swing.JButton BKELUAR;
    private javax.swing.JButton BPERBAHARUI;
    private javax.swing.JButton BSIMPAN;
    private javax.swing.JComboBox CJENISKELAMIN;
    private javax.swing.JLabel LAGAMA;
    private javax.swing.JLabel LALAMAT;
    private javax.swing.JLabel LJENISKELAMIN;
    private javax.swing.JLabel LJUDUL4;
    private javax.swing.JLabel LNAMASISWA;
    private javax.swing.JLabel LNIS;
    private javax.swing.JLabel LTEMPATLAHIR;
    private javax.swing.JTable TABEL1;
    private javax.swing.JTextField TIDKELOMPOK;
    private javax.swing.JTextField TKELAS;
    private javax.swing.JTextField TNAMA;
    private javax.swing.JTextField TNIM;
    private javax.swing.JTextField TNOHP;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
