//0 0 0 60 100 0 50 0 30 0

package edu.esksiehir;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Khan
 */
public class DemandInput extends javax.swing.JFrame {

    static DemandInput demandInput;
    static LinkedList<Integer> demandInt = new LinkedList<>();
    boolean flag = true;

    public DemandInput() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNext = new javax.swing.JButton();
        lblDemand = new javax.swing.JLabel();
        lblConsole = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txt9 = new javax.swing.JTextField();
        btnChange = new javax.swing.JButton();
        btnDefaultValues = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Demand Input Screen");
        setBounds(new java.awt.Rectangle(700, 400, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnNext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblDemand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDemand.setText("Enter demand :");

        lblConsole.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblConsole.setForeground(new java.awt.Color(204, 0, 0));

        btnCheck.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        lblTitle.setText("    1         2         3         4          5          6          7          8          9        10");

        btnChange.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnChange.setText("I want to change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });

        btnDefaultValues.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDefaultValues.setText("Fill the demand with default values");
        btnDefaultValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefaultValuesActionPerformed(evt);
            }
        });

        btnHelp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblDemand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDefaultValues, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCheck)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHelp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHelp)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDemand)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDefaultValues)
                            .addComponent(btnChange)
                            .addComponent(btnCheck))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNext))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) throws IOException {
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
            java.util.logging.Logger.getLogger(DemandInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemandInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemandInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemandInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                DemandInput demandInput = new DemandInput();
                demandInput.setVisible(true);
                demandInput.setResizable(false);

            }
        });

    }

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        if (!flag) {
            String[] temp = {"Periods", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            Tables.periods = temp;
            try {
                File file = new File("src/main/resources/itemConstants.txt");
                BufferedReader br = new BufferedReader(new FileReader(file));
                String st;
                int counter = 0;
                int i = 0;

                while ((st = br.readLine()) != null) {
                    String name = "";
                    if (counter != 0) {
                        String[] lines = st.split(" ");
                        for (int j = 6; j < lines.length; j++) {
                            name += (" " + lines[j]);
                        }
                        Item item = new Item(lines[0], 0, 0, 0, Integer.parseInt(lines[1]), lines[2].toLowerCase(), Integer.parseInt(lines[3]),
                                Integer.parseInt(lines[4]), lines[5], name);
                        if (i == 0) {
                            SecondFrame.inputTable[i][0] = lines[0];
                            SecondFrame.inputTable[i][1] = "0";
                            SecondFrame.inputTable[i][2] = "0";
                            SecondFrame.inputTable[i][3] = "0";
                            SecondFrame.inputTable[i][4] = lines[1];
                            SecondFrame.inputTable[i][5] = lines[2];
                            i++;
                        } else {
                            if (!SecondFrame.inputTable[i - 1][0].equals(lines[0])) {
                                SecondFrame.inputTable[i][0] = lines[0];
                                SecondFrame.inputTable[i][1] = "0";
                                SecondFrame.inputTable[i][2] = "0";
                                SecondFrame.inputTable[i][3] = "0";
                                SecondFrame.inputTable[i][4] = lines[1];
                                SecondFrame.inputTable[i][5] = lines[2];
                                i++;
                            }

                        }
                        item.bill = new int[7][demandInt.size()];
                        SecondFrame.items.add(item);
                    }
                    counter++;
                }
            } catch (IOException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Initial item constant file isn't found.\nBy default this file should be in 'src/main/resources' ", "Warning", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
        }

        if (!flag) {
            setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    SecondFrame demand_Input_Ekranı = new SecondFrame();
                    demand_Input_Ekranı.setVisible(true);
                    demand_Input_Ekranı.setResizable(false);
                }
            });
        } else {
            lblConsole.setForeground(new java.awt.Color(204, 0, 0));
            lblConsole.setText("Once, you should fill!");
        }

    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed

        if (flag) {

            if (!(txt1.getText().equals("") || txt2.getText().equals("") || txt3.getText().equals("")
                    || txt4.getText().equals("") || txt5.getText().equals("") || txt6.getText().equals("")
                    || txt7.getText().equals("") || txt8.getText().equals("") || txt9.getText().equals("")
                    || txt10.getText().equals(""))) {
                lblConsole.setText("");

                try {

                    demandInt.add(Integer.parseInt(txt1.getText()));
                    demandInt.add(Integer.parseInt(txt2.getText()));
                    demandInt.add(Integer.parseInt(txt3.getText()));
                    demandInt.add(Integer.parseInt(txt4.getText()));
                    demandInt.add(Integer.parseInt(txt5.getText()));
                    demandInt.add(Integer.parseInt(txt6.getText()));
                    demandInt.add(Integer.parseInt(txt7.getText()));
                    demandInt.add(Integer.parseInt(txt8.getText()));
                    demandInt.add(Integer.parseInt(txt9.getText()));
                    demandInt.add(Integer.parseInt(txt10.getText()));
                    clearInputs();

                    lblConsole.setForeground(new java.awt.Color(0, 204, 0));
                    lblConsole.setText("Successful, press next!");

                   
                    flag = false;
                } catch (NumberFormatException ex) {
                    lblConsole.setForeground(new java.awt.Color(204, 0, 0));
                    lblConsole.setText("Illegal input!");

                    clearInputs();
                    flag = true;

                }

            } else {
                flag = true;
                lblConsole.setForeground(new java.awt.Color(204, 0, 0));
                lblConsole.setText("Some cells are empty!");

            }

        } else {
            lblConsole.setForeground(new java.awt.Color(0, 0, 128));
            lblConsole.setText("Already checked, press next!");
        }


    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        if (!flag) {
            demandInt.clear();
            flag = true;
            lblConsole.setForeground(new java.awt.Color(0, 0, 128));
            lblConsole.setText("Now, you can change!");
        } else {
            lblConsole.setForeground(new java.awt.Color(0, 0, 128));
            lblConsole.setText("First, you should check!");
        }

    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnDefaultValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefaultValuesActionPerformed

        txt1.setText("0");
        txt2.setText("0");
        txt3.setText("0");
        txt4.setText("60");
        txt5.setText("100");
        txt6.setText("0");
        txt7.setText("50");
        txt8.setText("0");
        txt9.setText("30");
        txt10.setText("0");

        lblConsole.setForeground(new java.awt.Color(0, 0, 128));
        lblConsole.setText("Please press check button!");

    }//GEN-LAST:event_btnDefaultValuesActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        JOptionPane.showMessageDialog(null, "To fill with ");
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        clearInputs();

    }//GEN-LAST:event_btnClearActionPerformed

    private void clearInputs() {
        try {
            for (int i = 0; i < 10; i++) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
                txt6.setText("");
                txt7.setText("");
                txt8.setText("");
                txt9.setText("");
                txt10.setText("");
            }
        } catch (NullPointerException e) {
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDefaultValues;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel lblConsole;
    private javax.swing.JLabel lblDemand;
    private javax.swing.JLabel lblTitle;
    private static javax.swing.JTextField txt1;
    private static javax.swing.JTextField txt10;
    private static javax.swing.JTextField txt2;
    private static javax.swing.JTextField txt3;
    private static javax.swing.JTextField txt4;
    private static javax.swing.JTextField txt5;
    private static javax.swing.JTextField txt6;
    private static javax.swing.JTextField txt7;
    private static javax.swing.JTextField txt8;
    private static javax.swing.JTextField txt9;
    // End of variables declaration//GEN-END:variables
}
