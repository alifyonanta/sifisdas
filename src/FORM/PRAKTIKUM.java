package FORM;

import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PRAKTIKUM extends javax.swing.JFrame {
    private Connection  koneksi;
    private Statement   pernyataan;
    private ResultSet   pengaturanhasil;
    String sql="";
  
    public PRAKTIKUM() {
        initComponents();               
        koneksi();
        bersihkan();
        combo();
        combonis();
        combomapel();
        comboasprak();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BKELUAR = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BHAPUS = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BPERBAHARUI = new javax.swing.JButton();
        BBATAL = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BSIMPAN = new javax.swing.JButton();
        TNAMA = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TNKELOMPOK = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TNMODUL = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TWAK = new javax.swing.JTextField();
        TINDK = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TPRAK = new javax.swing.JTextField();
        TTP = new javax.swing.JTextField();
        TTA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TIDKELOMPOK = new javax.swing.JComboBox();
        TNIM = new javax.swing.JComboBox();
        TIDMODUL = new javax.swing.JComboBox();
        BTambah_Beli = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TNIS1 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        TKASPRAK = new javax.swing.JComboBox();
        TJUR = new javax.swing.JTextField();
        TPRE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BKELUAR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BKELUAR.setForeground(new java.awt.Color(204, 0, 0));
        BKELUAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/edittrash.png"))); // NOI18N
        BKELUAR.setText("EXIT");
        BKELUAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKELUARActionPerformed(evt);
            }
        });
        getContentPane().add(BKELUAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 100, 40));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 20));

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
        getContentPane().add(BHAPUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 100, 40));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

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
        getContentPane().add(BPERBAHARUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 100, 40));

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
        getContentPane().add(BBATAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 100, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("ID Modul");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

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
        getContentPane().add(BSIMPAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 100, 40));
        getContentPane().add(TNAMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 200, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("NIM");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 30, 20));
        getContentPane().add(TNKELOMPOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 200, 30));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("ID Kelompok");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setText("Nama Kelompok");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, 30));
        getContentPane().add(TNMODUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 200, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setText("Nama Modul");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, 20));

        TWAK.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TWAKCaretUpdate(evt);
            }
        });
        getContentPane().add(TWAK, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 150, 30));
        getContentPane().add(TINDK, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 80, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setText("Waktu");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 80, 20));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setText("Indeks ");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Presentasi");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        TPRAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPRAKActionPerformed(evt);
            }
        });
        TPRAK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TPRAKKeyPressed(evt);
            }
        });
        getContentPane().add(TPRAK, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 80, 30));

        TTP.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TTPCaretUpdate(evt);
            }
        });
        TTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTPActionPerformed(evt);
            }
        });
        getContentPane().add(TTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 80, 30));

        TTA.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TTACaretUpdate(evt);
            }
        });
        TTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TTAKeyPressed(evt);
            }
        });
        getContentPane().add(TTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 80, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Kode Asprak");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("TP");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Praktikum");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Jurnal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("DATA NILAI PRAKTIKAN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        TIDKELOMPOK.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        TIDKELOMPOK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TIDKELOMPOKItemStateChanged(evt);
            }
        });
        TIDKELOMPOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDKELOMPOKActionPerformed(evt);
            }
        });
        getContentPane().add(TIDKELOMPOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 200, 30));

        TNIM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        TNIM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TNIMItemStateChanged(evt);
            }
        });
        TNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNIMActionPerformed(evt);
            }
        });
        getContentPane().add(TNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 200, 30));

        TIDMODUL.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        TIDMODUL.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TIDMODULItemStateChanged(evt);
            }
        });
        TIDMODUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDMODULActionPerformed(evt);
            }
        });
        getContentPane().add(TIDMODUL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 200, 30));

        BTambah_Beli.setText("TAMBAH");
        BTambah_Beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambah_BeliActionPerformed(evt);
            }
        });
        getContentPane().add(BTambah_Beli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon("D:\\Desain\\Fisdas Logo - Copy.png")); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 250, 160));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("LABORATORIUM FISIKA DASAR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 394, 30));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setText("UNIVERSITAS TELKOM");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 215, -1));

        jLabel26.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel26.setText("SISTEM INFORMASI PRAKTIKUM");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 248, 20));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel21.setText("NIM");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 30, 20));

        TNIS1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        TNIS1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TNIS1ItemStateChanged(evt);
            }
        });
        TNIS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNIS1ActionPerformed(evt);
            }
        });
        getContentPane().add(TNIS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 200, 30));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("TA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        TKASPRAK.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        TKASPRAK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TKASPRAKItemStateChanged(evt);
            }
        });
        TKASPRAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKASPRAKActionPerformed(evt);
            }
        });
        getContentPane().add(TKASPRAK, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 150, 30));

        TJUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TJURActionPerformed(evt);
            }
        });
        TJUR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TJURKeyPressed(evt);
            }
        });
        getContentPane().add(TJUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 80, 30));

        TPRE.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TPRECaretUpdate(evt);
            }
        });
        TPRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TPREActionPerformed(evt);
            }
        });
        getContentPane().add(TPRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Simpan(){
    
}
private void Tambah(){

}
    private void BKELUARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKELUARActionPerformed
        dispose();
    }//GEN-LAST:event_BKELUARActionPerformed

    private void BHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHAPUSActionPerformed
        try {
            pernyataan.executeUpdate("delete from praktikum where TNIS='"+TNIM.getSelectedItem()+"'");
            bersihkan();
           
            JOptionPane.showMessageDialog(rootPane, "TERHAPUS");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "ERROR");
        } catch (HeadlessException e) {}
    }//GEN-LAST:event_BHAPUSActionPerformed

    private void BPERBAHARUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPERBAHARUIActionPerformed
        try{
            sql="update praktikum set   TNIS='"          +TNIM.getSelectedItem()+"',"+

                
                "TA='"      +TTA.getText()+"',"+
                "TP='"      +TTP.getText()+"',"+
                "PRAKTIKUM='"      +TPRAK.getText()+"',"+
                "JURNAL='"      +TJUR.getText()+"',"+
                "PRESENTASI='"      +TPRE.getText()+"',"+
                "Huruf='"      +TINDK.getText()+"',"+
                "Keterangan='"      +TWAK.getText()+"' where TNIS='"+TNIM.getSelectedItem()+"'";

            pernyataan=koneksi.createStatement();
            pernyataan.execute(sql);
            JOptionPane.showMessageDialog(null, "DATA TELAH DIPERBAHARUI");

            bersihkan();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "DATA BATAL DIPERBAHARUI"+e);
        }
    }//GEN-LAST:event_BPERBAHARUIActionPerformed

    private void BBATALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBATALActionPerformed
        bersihkan();
    }//GEN-LAST:event_BBATALActionPerformed

    private void BSIMPANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSIMPANActionPerformed
        try {

            sql="insert into praktikum values('"+TNIM.getSelectedItem()+"','"+
                    
                    TIDKELOMPOK.getSelectedItem()+"','"+
                    TIDMODUL.getSelectedItem()+"','"+                                      
                    TKASPRAK.getSelectedItem()+"','"+
                    TTA.getText()+"','"+
                    TTP.getText()+"','"+
                    TPRAK.getText()+"','"+
                    TJUR.getText()+"','"+
                    TPRE.getText()+"','"+
                    TINDK.getText()+"','"+
                    TWAK.getText()+"')";
                    
            pernyataan=koneksi.createStatement();
            pernyataan.execute(sql);
            JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
            bersihkan();
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "DATA TERSIMPAN");
        }
    }//GEN-LAST:event_BSIMPANActionPerformed

    private void TWAKCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TWAKCaretUpdate

    }//GEN-LAST:event_TWAKCaretUpdate

    private void TPRAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPRAKActionPerformed
        int nil1=Integer.parseInt(TTA.getText());
        int nil2=Integer.parseInt(TTP.getText());
        int nil3=Integer.parseInt(TPRAK.getText());
        int nil4=Integer.parseInt(TJUR.getText());
        int nil5=Integer.parseInt(TPRE.getText());
        int hsl=nil1+nil2+nil3+nil4+nil5;
        
        

               // TODO add your handling code here:
    }//GEN-LAST:event_TPRAKActionPerformed

    private void TPRAKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TPRAKKeyPressed
       // TODO add your handling code here:
    }//GEN-LAST:event_TPRAKKeyPressed

    private void TTPCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TTPCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_TTPCaretUpdate

    private void TTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTPActionPerformed

    private void TTACaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TTACaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_TTACaretUpdate

    private void TTAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TTAKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTAKeyPressed

    private void TIDKELOMPOKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TIDKELOMPOKItemStateChanged
 try {

            pernyataan=koneksi.createStatement();
            pengaturanhasil=pernyataan.executeQuery("select * from kelompok where id_kelompok='"+TIDKELOMPOK.getSelectedItem()+"'");
            if (pengaturanhasil.next()) {

                TNKELOMPOK.setText(pengaturanhasil.getString("nama_kelompok"));

            }
        } catch (Exception e) {
        }         // TODO add your handling code here:
    }//GEN-LAST:event_TIDKELOMPOKItemStateChanged

    private void TIDKELOMPOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDKELOMPOKActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_TIDKELOMPOKActionPerformed

    private void TNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNIMActionPerformed
       // TODO add your handling code here:
        try {
                    pernyataan=koneksi.createStatement();
                    pengaturanhasil=pernyataan.executeQuery("select * from praktikum where nim='"+TNIM.getSelectedItem()+"'");
                    if (pengaturanhasil.next()) {
                    TIDKELOMPOK.setSelectedItem(pengaturanhasil.getString("id_kelompok"));
   
        }

                } catch (Exception e) {
                }
    }//GEN-LAST:event_TNIMActionPerformed

    private void TIDMODULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDMODULActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_TIDMODULActionPerformed

    private void TIDMODULItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TIDMODULItemStateChanged
 try {

            pernyataan=koneksi.createStatement();
            pengaturanhasil=pernyataan.executeQuery("select * from modul where id_modul='"+TIDMODUL.getSelectedItem()+"'");
            if (pengaturanhasil.next()) {

                TNMODUL.setText(pengaturanhasil.getString("nama_modul"));
                try {
                pernyataan=koneksi.createStatement();
                pengaturanhasil=pernyataan.executeQuery("select * from praktikum where nim='"+TNIM.getSelectedItem()+"'" +
                    " AND id_kelompok='"+TIDKELOMPOK.getSelectedItem()+"'"+
                    " AND id_modul='"+TIDKELOMPOK.getSelectedItem()+"'"+
                    " AND kode_asprak='"+TKASPRAK.getSelectedItem()+ "'");
                if (pengaturanhasil.next()) {
                   
                    TTA.setText(pengaturanhasil.getString("TP"));
                    TTP.setText(pengaturanhasil.getString("TA"));
                    TPRAK.setText(pengaturanhasil.getString("PRAKTIK"));
                    
                    TINDK.setText(pengaturanhasil.getString("Huruf"));
                    TWAK.setText(pengaturanhasil.getString("WAKTU"));

                    
                    
            }
        } catch (Exception e) {
        }
            }
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TIDMODULItemStateChanged

    private void TNIMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TNIMItemStateChanged
 try {

            pernyataan=koneksi.createStatement();
            pengaturanhasil=pernyataan.executeQuery("select * from praktikan where nim='"+TNIM.getSelectedItem()+"'");
            if (pengaturanhasil.next()) {

                TNAMA.setText(pengaturanhasil.getString("nama_praktikan"));

            }
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_TNIMItemStateChanged

    private void BTambah_BeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambah_BeliActionPerformed
        Simpan();
        Tambah();

    }//GEN-LAST:event_BTambah_BeliActionPerformed

    private void TNIS1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TNIS1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TNIS1ItemStateChanged

    private void TNIS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNIS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNIS1ActionPerformed

    private void TKASPRAKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TKASPRAKItemStateChanged
        try {

            pernyataan=koneksi.createStatement();
            pengaturanhasil=pernyataan.executeQuery("select * from asprak where kode_asprak='"+TKASPRAK.getSelectedItem()+"'");
            
        } catch (Exception e) {
        }   // TODO add your handling code here:
    }//GEN-LAST:event_TKASPRAKItemStateChanged

    private void TKASPRAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKASPRAKActionPerformed
       try {

            pernyataan=koneksi.createStatement();
            pengaturanhasil=pernyataan.executeQuery("select * from asprak where kode_asprak='"+TKASPRAK.getSelectedItem()+"'");
           
        } catch (Exception e) {
        }   // TODO add your handling code here:
    }//GEN-LAST:event_TKASPRAKActionPerformed

    private void TJURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TJURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TJURActionPerformed

    private void TJURKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TJURKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TJURKeyPressed

    private void TPRECaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TPRECaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_TPRECaretUpdate

    private void TPREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TPREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TPREActionPerformed
     private void bersihkan()
    {
        TNIM.setSelectedItem("");
        TNAMA.setText("");
        TIDKELOMPOK.setSelectedItem("");
        TNKELOMPOK.setText("");
        TIDMODUL.setSelectedItem("");
        TNMODUL.setText("");
        TKASPRAK.setSelectedItem("");
        TTA.setText("");
        TTP.setText("");
        TPRAK.setText("");
       TPRE.setText("");
        TJUR.setText("");
        TINDK.setText("");
        TWAK.setText("");
       
        TNIM.requestFocus();
    }      
    
     
    /**
     * @param args the command line arguments
     */
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
                new PRAKTIKUM().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBATAL;
    private javax.swing.JButton BHAPUS;
    private javax.swing.JButton BKELUAR;
    private javax.swing.JButton BPERBAHARUI;
    private javax.swing.JButton BSIMPAN;
    private javax.swing.JButton BTambah_Beli;
    private javax.swing.JComboBox TIDKELOMPOK;
    private javax.swing.JComboBox TIDMODUL;
    private javax.swing.JTextField TINDK;
    private javax.swing.JTextField TJUR;
    private javax.swing.JComboBox TKASPRAK;
    private javax.swing.JTextField TNAMA;
    private javax.swing.JComboBox TNIM;
    private javax.swing.JComboBox TNIS1;
    private javax.swing.JTextField TNKELOMPOK;
    private javax.swing.JTextField TNMODUL;
    private javax.swing.JTextField TPRAK;
    private javax.swing.JTextField TPRE;
    private javax.swing.JTextField TTA;
    private javax.swing.JTextField TTP;
    private javax.swing.JTextField TWAK;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
 private void combonis() {
        try {
            TNIM.addItem("");
            pengaturanhasil=(ResultSet) pernyataan.executeQuery("select * from praktikan");
            while (pengaturanhasil.next()) {
                    TNIM.addItem(pengaturanhasil.getString(1));
            }
        } catch (Exception e) {
        }
 }
 private void combo() {
        try {
            TIDKELOMPOK.addItem("");
            pengaturanhasil=(ResultSet) pernyataan.executeQuery("select * from kelompok");
            while (pengaturanhasil.next()) {
                    TIDKELOMPOK.addItem(pengaturanhasil.getString(1));
            }
        } catch (Exception e) {
        }
 }
 private void combomapel() {
        try {
            TIDMODUL.addItem("");
            pengaturanhasil=(ResultSet) pernyataan.executeQuery("select * from modul");
            while (pengaturanhasil.next()) {
                    TIDMODUL.addItem(pengaturanhasil.getString(1));
            }
        } catch (Exception e) {
        }
 }
 
  private void comboasprak() {
        try {
            TKASPRAK.addItem("");
            pengaturanhasil=(ResultSet) pernyataan.executeQuery("select * from asprak");
            while (pengaturanhasil.next()) {
                    TKASPRAK.addItem(pengaturanhasil.getString(1));
            }
        } catch (Exception e) {
        }
 }
 

private void koneksi(){
try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/fisdasv3","root","");
            pernyataan = koneksi.createStatement();
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal.. "+e);
        } catch (SQLException e) {}

}
}
