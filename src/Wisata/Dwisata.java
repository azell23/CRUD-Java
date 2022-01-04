/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Wisata;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

/**
 *
 * @author hildanrizky
 */
public class Dwisata extends javax.swing.JFrame {

    DefaultTableModel model;
    int id;

    public Dwisata() {
        initComponents();

        refreshData("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        txtJenis = new javax.swing.JTextField();
        txtHTM = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbKota = new javax.swing.JRadioButton();
        rbKab = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtJam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnPDF = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(104, 106, 253));

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama Wisata", "Jenis Wisata", "Jam Operasi", "HTM", "Kota/Kabupaten", "Alamat"
            }
        ));
        tbData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDataMouseClicked(evt);
            }
        });
        tbData.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                tbDataComponentResized(evt);
            }
        });
        jScrollPane1.setViewportView(tbData);

        jLabel1.setText("Nama Wisata");

        jLabel2.setText("Jenis Wisata");

        jLabel3.setText("HTM");

        rbKota.setText("Kota Tegal");
        rbKota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKotaActionPerformed(evt);
            }
        });

        rbKab.setText("Kabupaten Tegal");
        rbKab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKabActionPerformed(evt);
            }
        });

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        jLabel4.setText("Alamat");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel5.setText("Jam Operasi");

        btnPDF.setText("PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        btnExcel.setText("Excel");

        btnLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNama)
                        .addComponent(txtJenis)
                        .addComponent(txtHTM, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbKota)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJam)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbKab)
                                .addGap(0, 80, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogout)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbKota)
                        .addComponent(rbKab)
                        .addComponent(btnPDF)
                        .addComponent(btnExcel)
                        .addComponent(btnLogout)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnReset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbDataComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tbDataComponentResized
    }//GEN-LAST:event_tbDataComponentResized

    private void rbKotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbKotaActionPerformed

    private void rbKabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbKabActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        CreateData();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tbDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDataMouseClicked
       int indeks = tbData.getSelectedRow();
        if (indeks != -1) {
            
            String _id = (String) tbData.getValueAt(indeks, 0);
            String nama = tbData.getValueAt(indeks, 1).toString();
            String jenis = tbData.getValueAt(indeks, 2).toString();
            String jam = tbData.getValueAt(indeks, 3).toString();
            String htm = tbData.getValueAt(indeks, 4).toString();
            String domisili = tbData.getValueAt(indeks, 5).toString();
            String alamat = tbData.getValueAt(indeks, 6).toString();
             id = Integer.parseInt(_id);

            txtNama.setText(nama);
            txtJenis.setText(jenis);
            txtJam.setText(jam);
            txtAlamat.setText(alamat);
            txtHTM.setText(htm);
            if (domisili.equals("Kota")) {
                rbKota.setSelected(true);
            } else {
                rbKab.setSelected(true);
            }
        }
    }//GEN-LAST:event_tbDataMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        updateData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        resetData();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        searchData();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        
    }//GEN-LAST:event_btnPDFActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
       searchData();
    }//GEN-LAST:event_txtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Dwisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dwisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dwisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dwisata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dwisata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbKab;
    private javax.swing.JRadioButton rbKota;
    private javax.swing.JTable tbData;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtHTM;
    private javax.swing.JTextField txtJam;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void CreateData() {
        
        String nama = txtNama.getText();
        String jenis = txtJenis.getText();
        String htm = txtHTM.getText();
        int htmm  = Integer.parseInt(htm);
        String alamat = txtAlamat.getText();
        String jam = txtJam.getText();
        String domisili = rbKota.isSelected() ? "Kota Tegal" : "Kabupaten Tegal";

        try {
            Connection c = koneksi.sambungDB();
            Statement st = c.createStatement();
            String q = "INSERT INTO wisata "
                    + "(nama,jenis,htm,alamat, jam_operasi, domisili) "
                    + "VALUES ('" + nama + "','" + jenis + "','" + htmm + 
                                "','" + alamat + "','" + jam + "','" + domisili + "')";
//            System.out.println(q);
            st.executeUpdate(q);
            refreshData("");
            resetData();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Data GAGAL disimpan "
                    + "\nError: " + e.getMessage());
        }

    }

    private void refreshData(String where) {
        try {
            Object[] kolom = {"ID","Nama Wisata", "Jenis Wisata", "Jam Operasi", "HTM"
                                , "Kota/Kabupaten", "Alamat"};
            model = new DefaultTableModel(null, kolom);
            tbData.setModel(model);

            Connection c = koneksi.sambungDB();
            Statement st = c.createStatement();
            String q = "SELECT * FROM wisata "+where;
            ResultSet rs = st.executeQuery(q);
            while (rs.next()) {
                String id = rs.getString("id");
                String nama = rs.getString("nama");
                String jenis = rs.getString("jenis");
                String jam = rs.getString("jam_operasi");
                String htm = rs.getString("htm");
                String domisili = rs.getString("domisili");
                String alamat = rs.getString("alamat");
                Object[] data = {id,nama,jenis , jam, htm, domisili, alamat};
                model.addRow(data);
            }

        } catch (SQLException e) {
        }
    }



    private void deleteData() {
        try {
            Connection c = koneksi.sambungDB();
            Statement st = c.createStatement();
            String q = "DELETE FROM wisata WHERE id=" +id+ "";
            if (id > 0) {
                st.executeUpdate(q);
                refreshData("");
                resetData();

                JOptionPane.showMessageDialog(this, "Data telah dihapus");
            } else {
                JOptionPane.showMessageDialog(this, "Anda belum memilih data");
            }
        } catch (HeadlessException|SQLException e) {
                 JOptionPane.showMessageDialog(this, "Data GAGAL diubah "
                    + "\nError: " + e.getMessage());
        }
    }

    private void updateData() {
        if (id <= 0) {
            return;
        }
        String nama = txtNama.getText();
        String jenis = txtJenis.getText();
        String htm = txtHTM.getText();
        int htmm  = Integer.parseInt(htm);
        String alamat = txtAlamat.getText();
        String jam = txtJam.getText();
        String domisili = rbKota.isSelected() ? "Kota Tegal" : "Kabupaten Tegal";

        try {
            Connection c = koneksi.sambungDB();
            Statement st = c.createStatement();
            String q = "UPDATE wisata SET "
                    + "nama='"+nama+"',"
                    + "jenis='" +jenis+ "',"
                    + "htm="+htmm+","
                    + "domisili='"+domisili+"',"
                    + "jam_operasi='"+jam+"',"
                    + "alamat='"+alamat+"'"
                    + "WHERE id="+id+"";
            st.executeUpdate(q);
            refreshData("");
            resetData();
            JOptionPane.showMessageDialog(this, "Data berhasil diubah");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Data GAGAL diubah "
                    + "\nError: " + e.getMessage());
        }
    }

    private void resetData() {
        txtNama.setText("");
        txtAlamat.setText("");
        txtJenis.setText("");
        txtJam.setText("");
        txtAlamat.setText("");
        rbKab.setSelected(true);
        txtSearch.setText("");
        tbData.clearSelection();
        id = 0;
        txtNama.requestFocus();
    }

    private void searchData() {
        try {
            String key = txtSearch.getText();
            if (key.isEmpty()) {
                refreshData("");
            } else {
                String where = " WHERE "
                        + "id LIKE '%" + key + "%' OR "
                        + "nama LIKE '%" + key + "%' OR "
                        + "jenis LIKE '%" + key + "%' OR "
                        + "jam_operasi LIKE '%" + key + "%' OR "
                        + "domisili LIKE '%" + key + "%' OR "
                        + "alamat LIKE '%" + key + "%' ";
                refreshData(where);
            }

        } catch (Exception e) {
        }
    }

//    private void ExportPDF() throws DocumentException {
//        String path = "";
//        JFileChooser j = new JFileChooser();
//        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//        int x = j.showSaveDialog(this);
//
//        if (x == JFileChooser.APPROVE_OPTION) {
//            path = j.getSelectedFile().getPath();
//
//        }
//        Document doc = new Document();
//
//        try {
//            PdfWriter.getInstance(doc, new FileOutputStream(path + ".pdf"));
//            doc.open();
//            PdfPTable tbl = new PdfPTable(5);
//            tbl.addCell("ID");
//            tbl.addCell("NAMA WISATA");
//            tbl.addCell("ALAMAT");
//            tbl.addCell("KECAMATAN");
//            tbl.addCell("KABUPATEN/KOTA");
////                String Kecamatan = tbData.getValueAt(i, 3).toString();

//            for (int i = 0; i < tbData.getRowCount(); i++) {
//                String ID = tbData.getValueAt(i, 0).toString();
//                String NamaWisata = tbData.getValueAt(i, 1).toString();
//                String Alamat = tbData.getValueAt(i, 2).toString();
//                String Kabupaten_Kota = tbData.getValueAt(i, 4).toString();
//
//                tbl.addCell(ID);
//                tbl.addCell(NamaWisata);
//                tbl.addCell(Alamat);
//                tbl.addCell(Kecamatan);
//                tbl.addCell(Kabupaten_Kota);
//
//            }
//
//            doc.add(tbl);
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Dwisata.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        doc.close();
//
//    }
//    }
}
  