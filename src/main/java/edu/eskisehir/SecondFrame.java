//0 0 0 60 100 0 50 0 30 0
package edu.esksiehir;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Khan
 */
public class SecondFrame extends javax.swing.JFrame {

    static LinkedList<Item> items = new LinkedList<>();
    static String[][] inputTable = new String[13][6];

    String[] title = {
        "Item ID", "Amound on Hand", "Scheduled Receipt", "Arrival on week", "Lead Time", "Lot Sizing Rule"
    };

    public SecondFrame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selector = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        input_table = new javax.swing.JTable();
        lblSelect_item_id = new javax.swing.JLabel();
        lblConsole = new javax.swing.JLabel();
        btnCalculateMRP = new javax.swing.JButton();
        txtOnHand = new javax.swing.JTextField();
        txtScheduledReceipt = new javax.swing.JTextField();
        txtArrivalOnWeek = new javax.swing.JTextField();
        lblAmountOnHand = new javax.swing.JLabel();
        lblScheduledReceipt = new javax.swing.JLabel();
        lblArrivalOnWeek = new javax.swing.JLabel();
        btnDefaultValues = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Input Table");
        setBounds(new java.awt.Rectangle(700, 400, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        selector.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1605", "13122", "048", "118", "314", "062", "14127", "457", "11495", "129", "1118", "2142", "019" }));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        input_table.setModel(new javax.swing.table.DefaultTableModel(inputTable,title)
            {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            }
        );
        if (input_table.getColumnModel().getColumnCount() > 0) {
            input_table.getColumnModel().getColumn(0).setResizable(false);
            input_table.getColumnModel().getColumn(2).setResizable(false);
            input_table.getColumnModel().getColumn(1).setResizable(false);
            input_table.getColumnModel().getColumn(3).setResizable(false);
            input_table.getColumnModel().getColumn(4).setResizable(false);
            input_table.getColumnModel().getColumn(5).setResizable(false);
        }
        input_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        input_table.setCellSelectionEnabled(true);
        input_table.getColumnModel().getColumn(0).setPreferredWidth(50);
        input_table.getColumnModel().getColumn(1).setPreferredWidth(110);
        input_table.getColumnModel().getColumn(2).setPreferredWidth(120);
        input_table.getColumnModel().getColumn(3).setPreferredWidth(100);
        input_table.getColumnModel().getColumn(4).setPreferredWidth(75);
        input_table.getColumnModel().getColumn(5).setPreferredWidth(100);
        jScrollPane2.setViewportView(input_table);

        lblSelect_item_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSelect_item_id.setText("Select item ID :");

        lblConsole.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblConsole.setForeground(new java.awt.Color(204, 0, 0));

        btnCalculateMRP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCalculateMRP.setText("Calculate MRP tables");
        btnCalculateMRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateMRPActionPerformed(evt);
            }
        });

        lblAmountOnHand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAmountOnHand.setText("Amount on Hand");

        lblScheduledReceipt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblScheduledReceipt.setText("Scheduled Receipt");

        lblArrivalOnWeek.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblArrivalOnWeek.setText("Arrival on week");

        btnDefaultValues.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDefaultValues.setText("Fill the table with default values");
        btnDefaultValues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefaultValuesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSelect_item_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(selector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAmountOnHand, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(txtOnHand))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblScheduledReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtScheduledReceipt)))
                            .addComponent(lblConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtArrivalOnWeek)
                            .addComponent(lblArrivalOnWeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnUpdate))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDefaultValues)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculateMRP)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblConsole, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelect_item_id)
                    .addComponent(lblAmountOnHand)
                    .addComponent(lblScheduledReceipt)
                    .addComponent(lblArrivalOnWeek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOnHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtScheduledReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArrivalOnWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculateMRP)
                    .addComponent(btnDefaultValues))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        if (check(txtOnHand.getText().trim()) || check(txtArrivalOnWeek.getText().trim()) || check(txtScheduledReceipt.getText().trim())) {
            lblConsole.setForeground(new java.awt.Color(204, 0, 0));
            lblConsole.setText("Error!");
        } else {
            lblConsole.setText("");
            inputTable[selector.getSelectedIndex()][1] = txtOnHand.getText().trim();
            inputTable[selector.getSelectedIndex()][2] = txtScheduledReceipt.getText().trim();
            inputTable[selector.getSelectedIndex()][3] = txtArrivalOnWeek.getText().trim();
            lblConsole.setForeground(new java.awt.Color(0, 204, 0));
            lblConsole.setText("Update is successful!");

            Item item = Item.search(selector.getSelectedItem().toString());
            item.amountOnHand = Integer.parseInt(txtOnHand.getText().trim());
            item.scheduledReceipt = Integer.parseInt(txtScheduledReceipt.getText().trim());
            item.arrivalOnWeek = Integer.parseInt(txtArrivalOnWeek.getText().trim());

            txtArrivalOnWeek.setText("");
            txtOnHand.setText("");
            txtScheduledReceipt.setText("");
        }

        input_table.setModel(new javax.swing.table.DefaultTableModel(inputTable, title));

        for (int i = 0; i < 6; i++) {
            input_table.getColumnModel().getColumn(i).setPreferredWidth(92);
            if (input_table.getColumnModel().getColumnCount() > 0) {
                input_table.getColumnModel().getColumn(i).setResizable(false);
            }
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCalculateMRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateMRPActionPerformed
        setVisible(false);

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null) {
                Tables.product(items.get(i));
            }
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tables tablo = new Tables();
                tablo.setVisible(true);
                tablo.setResizable(false);
            }
        });

        try {
            Document document = new Document();
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("MRP.pdf"));
            document.open();
            document.add(new Paragraph(DemandInput.demandInt.size() + "-WEEK ORDER PLAN.\n"));
            String str = "";
            for (int i = 0; i < 10; i++) {
                int counter = 0;
                str += ("---------------------------------------------------------------------------------------------------------------------------" + "\n    Week " + (i + 1) + "\n---------------------------------------------------------------------------------------------------------------------------");

                for (int j = 0; j < items.size(); j++) {
                    if (items.get(j).isBillFull) {
                        if (items.get(j).bill[5][i] != 0) {
                            str += ("\n      " + items.get(j).name + " (" + items.get(j).itemID + ") >>> " + items.get(j).bill[5][i] + " pieces should be produced.\n");
                            counter++;
                        }

                    }
                }
                if (counter != 0) {
                    document.add(new Paragraph(str));
                } else {
                    document.add(new Paragraph(str + "\n      There are no need to produce any product."));
                }
                str = "";
            }

            document.close();
            pdfWriter.close();
        } catch (DocumentException | FileNotFoundException ex) {/////////////////////////////////////////////////////////////
            System.out.println(ex.getMessage());

        }


    }//GEN-LAST:event_btnCalculateMRPActionPerformed

    private void btnDefaultValuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefaultValuesActionPerformed

        try {
            File file = new File("src/main/resources/defaultTable.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;

            int i = 0;
            while ((st = br.readLine()) != null) {
                String[] lines = st.split(" ");
                inputTable[i][1] = lines[1];
                inputTable[i][2] = lines[2];
                inputTable[i][3] = lines[3];

                i++;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No default constant file found.\nBy default this file should be in 'src/main/resources' ", "Warning", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

        for (int i = 0; i < 13; i++) {
            LinkedList<Item> list = Tables.findOccuredItemList(inputTable[i][0]);
            for (int j = 0; j < list.size(); j++) {
                list.get(j).amountOnHand = Integer.parseInt(inputTable[i][1]);
                list.get(j).scheduledReceipt = Integer.parseInt(inputTable[i][2]);
                list.get(j).arrivalOnWeek = Integer.parseInt(inputTable[i][3]);
            }
        }

        input_table.setModel(new javax.swing.table.DefaultTableModel(inputTable, title));

        for (int i = 0; i < 6; i++) {
            if (input_table.getColumnModel().getColumnCount() > 0) {
                input_table.getColumnModel().getColumn(i).setResizable(false);
            }
        }
        input_table.getColumnModel().getColumn(0).setPreferredWidth(50);
        input_table.getColumnModel().getColumn(1).setPreferredWidth(110);
        input_table.getColumnModel().getColumn(2).setPreferredWidth(120);
        input_table.getColumnModel().getColumn(3).setPreferredWidth(100);
        input_table.getColumnModel().getColumn(4).setPreferredWidth(75);
        input_table.getColumnModel().getColumn(5).setPreferredWidth(100);
    }//GEN-LAST:event_btnDefaultValuesActionPerformed

    public boolean check(String s) {
        try {
            Integer.parseInt(s);

        } catch (NumberFormatException ex) {
            return true;
        }

        return false;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateMRP;
    private javax.swing.JButton btnDefaultValues;
    private javax.swing.JButton btnUpdate;
    public javax.swing.JTable input_table;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAmountOnHand;
    private javax.swing.JLabel lblArrivalOnWeek;
    private javax.swing.JLabel lblConsole;
    private javax.swing.JLabel lblScheduledReceipt;
    private javax.swing.JLabel lblSelect_item_id;
    private javax.swing.JComboBox<String> selector;
    private javax.swing.JTextField txtArrivalOnWeek;
    private javax.swing.JTextField txtOnHand;
    private javax.swing.JTextField txtScheduledReceipt;
    // End of variables declaration//GEN-END:variables
}
