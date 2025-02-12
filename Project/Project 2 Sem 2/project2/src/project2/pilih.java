/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project2;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author awwal
 */
public class pilih extends javax.swing.JFrame {

    public Connection con;
    public Statement st;
    public ResultSet rs;
    public String sql="";
    
        
    
    public pilih() {
        initComponents();
        koneksi();
        showClass();
        showSeat();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbPassClass = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTimeDestination = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaFacility = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        cmbSeat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIME TO DESTINATION");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PASSENGER CLASS");

        cmbPassClass.setForeground(new java.awt.Color(153, 153, 255));
        cmbPassClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        cmbPassClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPassClassActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FACILITY");

        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtTimeDestination.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimeDestinationFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(txtTimeDestination);

        txtAreaFacility.setColumns(20);
        txtAreaFacility.setRows(5);
        txtAreaFacility.setText("Facilities Obtained");
        txtAreaFacility.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAreaFacilityFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaFacility);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CHOOSE A SEAT");

        cmbSeat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        cmbSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSeatActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DESCRIPTION");

        txtDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusGained(evt);
            }
        });
        jScrollPane3.setViewportView(txtDescription);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CHOOSE CLASS AND SEAT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPassClass, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPassClass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPassClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPassClassActionPerformed
        // TODO add your handling code here:
        String passChoose;
        
        passChoose = (String) cmbPassClass.getSelectedItem();
        
        try {
            String sql = "select * from passengerclass where passClass='" + cmbPassClass.getSelectedItem() + "'";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txtAreaFacility.setText(rs.getString("facility"));
            }
            
            if (passChoose.equals("Choose")) {
                txtAreaFacility.setText("Choose");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error saat memproses data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }     
    }//GEN-LAST:event_cmbPassClassActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        String kelas, seat, NOS;        
        
        kelas = (String) cmbPassClass.getSelectedItem();
        NOS = (String) cmbSeat.getSelectedItem();
        seat = txtDescription.getText();
          
        if (!kelas.equals("Choose")) {
            if (seat.equals("AVAILABLE")) {                
                try {
                    String updateSql = "UPDATE seat SET Ket = 'UNAVAILABLE' WHERE seatNumber = ? AND Ket = 'AVAILABLE'";
                    PreparedStatement updateStmt = con.prepareStatement(updateSql);
                    updateStmt.setString(1, NOS);
                    updateStmt.executeUpdate();
                    updateStmt.close();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Failed to update seat status: " + ex.getMessage());
                    return;
                }

                try {
                    String query = "INSERT INTO chose (passClass, Seat) values ('"+kelas+"', '"+NOS+"')";
                    st.executeUpdate(query);
                    cmbPassClass.setSelectedItem("");
                    cmbSeat.setSelectedItem("");
                    
                    query = "INSERT INTO hasil (Departure, Destination, passengerClass, Seat) " +
                            "SELECT d.Depart, d.Destination, c.passClass, c.Seat " +
                            "FROM destination d " +
                            "INNER JOIN chose c ON d.ID = c.chooseID " +
                            "WHERE NOT EXISTS (" +
                            "    SELECT 1 FROM hasil h " +
                            "    WHERE h.Departure = d.Depart AND h.Destination = d.Destination " +
                            "          AND h.passengerClass = c.passClass AND h.Seat = c.Seat" +
                            ")";
                    st.executeUpdate(query);
                    con.close();
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Failed to save selected data: " + ex.getMessage());
                    return; 
                }                 
               
                new hasil().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Seat not found or already unavailable.", "Information", JOptionPane.INFORMATION_MESSAGE);
                return;
            }        
        } else {
            JOptionPane.showMessageDialog(null, "Select Passenger Class", "Information", JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtTimeDestinationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimeDestinationFocusGained
        // TODO add your handling code here:
        txtTimeDestination.setText("3 Agustus 2024");
        txtTimeDestination.setEditable(false);
    }//GEN-LAST:event_txtTimeDestinationFocusGained

    private void txtAreaFacilityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAreaFacilityFocusGained
        // TODO add your handling code here:
        txtAreaFacility.setEditable(false);
    }//GEN-LAST:event_txtAreaFacilityFocusGained

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        try {
            sql = "DELETE FROM destination ORDER BY destinationID DESC LIMIT 1";
            st.executeUpdate(sql);
            con.close();
        } catch (Exception e) {
        }
        
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtDescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusGained
        // TODO add your handling code here:
        txtDescription.setEditable(false);
    }//GEN-LAST:event_txtDescriptionFocusGained

    private void cmbSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSeatActionPerformed
        // TODO add your handling code here:
        String seatChoose;
        
        seatChoose = (String) cmbSeat.getSelectedItem();
        
        try {
            String sql = "select * from seat where seatNumber='" + cmbSeat.getSelectedItem() + "'";
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txtDescription.setText(rs.getString("Ket"));
            }
            
            if (seatChoose.equals("Choose")) {
                txtDescription.setText("Choose");
            }
        } catch (Exception e) {
            // Tampilkan pesan error jika terjadi pengecualian
            JOptionPane.showMessageDialog(null, "Error saat memproses data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmbSeatActionPerformed

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
            java.util.logging.Logger.getLogger(pilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pilih.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pilih().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cmbPassClass;
    private javax.swing.JComboBox<String> cmbSeat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAreaFacility;
    private javax.swing.JTextPane txtDescription;
    private javax.swing.JTextPane txtTimeDestination;
    // End of variables declaration//GEN-END:variables

     private boolean koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/project2";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(url, user, pass);
            st = con.createStatement();
            return true;
        } catch (Exception e) {
            // Tampilkan pesan error jika terjadi pengecualian
            JOptionPane.showMessageDialog(null, "Koneksi ke database gagal: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return false;
        }
    }

    private void showSeat() {
        try {
            String sql = "select * from seat";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cmbSeat.addItem(rs.getString("seatNumber"));
            }
        } catch (Exception e) {
            // Tampilkan pesan error jika terjadi pengecualian
            JOptionPane.showMessageDialog(null, "Error saat menampilkan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void showClass() {
        try {
            String sql = "select * from passengerclass";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                cmbPassClass.addItem(rs.getString("passClass"));
            }
        } catch (Exception e) {
            // Tampilkan pesan error jika terjadi pengecualian
            JOptionPane.showMessageDialog(null, "Error saat menampilkan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
