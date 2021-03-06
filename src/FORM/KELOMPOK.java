package FORM;
/**
 *
 * @author Alif Yonanta
 */
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KELOMPOK extends javax.swing.JFrame {
    
    private Connection  koneksi;
    private Statement   pernyataan;
    private ResultSet   pengaturanhasil;
    private String      tanggal;
    
    public KELOMPOK() {
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

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BPERBAHARUI = new javax.swing.JButton();
        TNKELOMPOK = new javax.swing.JTextField();
        BHAPUS = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TIDKELOMPOK = new javax.swing.JTextField();
        BBATAL = new javax.swing.JButton();
        BSIMPAN = new javax.swing.JButton();
        BKELUAR2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BPERBAHARUI.setBackground(new java.awt.Color(204, 204, 204));
        BPERBAHARUI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BPERBAHARUI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/editCopy (2).png"))); // NOI18N
        BPERBAHARUI.setText("PERBARUI");
        BPERBAHARUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPERBAHARUIActionPerformed(evt);
            }
        });
        getContentPane().add(BPERBAHARUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        getContentPane().add(TNKELOMPOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 129, -1));

        BHAPUS.setBackground(new java.awt.Color(204, 204, 204));
        BHAPUS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BHAPUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/cancel.png"))); // NOI18N
        BHAPUS.setText("HAPUS");
        BHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHAPUSActionPerformed(evt);
            }
        });
        getContentPane().add(BHAPUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 677, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DATA KELOMPOK");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Nama Kelompok");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ID Kelompok");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        TIDKELOMPOK.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TIDKELOMPOK.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TIDKELOMPOKCaretUpdate(evt);
            }
        });
        TIDKELOMPOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDKELOMPOKActionPerformed(evt);
            }
        });
        TIDKELOMPOK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TIDKELOMPOKKeyPressed(evt);
            }
        });
        getContentPane().add(TIDKELOMPOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 129, -1));

        BBATAL.setBackground(new java.awt.Color(204, 204, 204));
        BBATAL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BBATAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/editUndo.png"))); // NOI18N
        BBATAL.setText("BATAL");
        BBATAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBATALActionPerformed(evt);
            }
        });
        getContentPane().add(BBATAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        BSIMPAN.setBackground(new java.awt.Color(204, 204, 204));
        BSIMPAN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BSIMPAN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/save.png"))); // NOI18N
        BSIMPAN.setText("SIMPAN");
        BSIMPAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSIMPANActionPerformed(evt);
            }
        });
        getContentPane().add(BSIMPAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        BKELUAR2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BKELUAR2.setForeground(new java.awt.Color(204, 0, 0));
        BKELUAR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/edittrash.png"))); // NOI18N
        BKELUAR2.setText("KELUAR");
        BKELUAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKELUAR2ActionPerformed(evt);
            }
        });
        getContentPane().add(BKELUAR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, 70));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("LABORATORIUM FISIKA DASAR");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 394, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("UNIVERSITAS TELKOM");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 215, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel9.setText("SISTEM INFORMASI PRAKTIKUM");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 248, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Desain\\Fisdas Logo - Copy.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPERBAHARUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPERBAHARUIActionPerformed
        try{
            pernyataan.executeUpdate("update kelompok set  id_kelompok='"                +TIDKELOMPOK.getText()+
                "',nama_kelompok='"              +TNKELOMPOK.getText()+
                "' where id_kelompok='"       +TIDKELOMPOK.getText()+"'");

            JOptionPane.showMessageDialog(rootPane, "Data telah diperbarui...");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Pembaharuan gagal...");
        }   catch (HeadlessException e) {}
    }//GEN-LAST:event_BPERBAHARUIActionPerformed

    private void BHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHAPUSActionPerformed
        try {
            pernyataan.executeUpdate("delete from kelompok where id_kelompok='"+TIDKELOMPOK.getText()+"'");
            bersihkan();
            tampildata();
            JOptionPane.showMessageDialog(rootPane, "lah terhapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Error... Penghapusan gagal...");
        } catch (HeadlessException e) {}
    }//GEN-LAST:event_BHAPUSActionPerformed

    private void BBATALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBATALActionPerformed
        bersihkan();
        }
        private void bersihkan()
        {
            TIDKELOMPOK.setText("");
            TNKELOMPOK.setText("");
            TIDKELOMPOK.requestFocus();
    }//GEN-LAST:event_BBATALActionPerformed

    private void BSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIMPANActionPerformed
        try{
            pernyataan.executeUpdate("insert into kelompok set  id_kelompok='"              +TIDKELOMPOK.getText()+"',"+
                "nama_kelompok='"              +TNKELOMPOK.getText()+"'");
            JOptionPane.showMessageDialog(rootPane, "Data telah disimpan...");
            TIDKELOMPOK.requestFocus();
            bersihkan();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Penyimpanan gagal...");
        }catch (HeadlessException e) {}
    }//GEN-LAST:event_BSIMPANActionPerformed

    private void BKELUAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKELUAR2ActionPerformed
        dispose();
    }//GEN-LAST:event_BKELUAR2ActionPerformed

    private void TIDKELOMPOKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TIDKELOMPOKKeyPressed

    }//GEN-LAST:event_TIDKELOMPOKKeyPressed

    private void TIDKELOMPOKCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TIDKELOMPOKCaretUpdate
        try {

            pengaturanhasil = pernyataan.executeQuery("select * from kelompok where id_kelompok='"+TIDKELOMPOK.getText()+"'");

            while (pengaturanhasil.next()){
                TNKELOMPOK.setText(pengaturanhasil.getString("Kelas"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "gagal");
        } catch (HeadlessException e) {}        // TODO add your handling code here:
    }//GEN-LAST:event_TIDKELOMPOKCaretUpdate

    private void TIDKELOMPOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDKELOMPOKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIDKELOMPOKActionPerformed
       
    private void tampildata()
    {
        DefaultTableModel tabel1 = new DefaultTableModel();
        tabel1.addColumn("NO");
        tabel1.addColumn("ID Kelompok");
        tabel1.addColumn("Kelas");

        try{
            int n= 1;
            pengaturanhasil = pernyataan.executeQuery("select * from kelompok");
            while (pengaturanhasil.next())
            {
                tabel1.addRow(new Object []{(n++),
                pengaturanhasil.getString(1),
                pengaturanhasil.getString(2),
                pengaturanhasil.getString(3)});
            }
      
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
            java.util.logging.Logger.getLogger(KELOMPOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KELOMPOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KELOMPOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KELOMPOK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new KELOMPOK().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBATAL;
    private javax.swing.JButton BHAPUS;
    private javax.swing.JButton BKELUAR2;
    private javax.swing.JButton BPERBAHARUI;
    private javax.swing.JButton BSIMPAN;
    private javax.swing.JTextField TIDKELOMPOK;
    private javax.swing.JTextField TNKELOMPOK;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
