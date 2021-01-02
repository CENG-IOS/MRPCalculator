//0 0 0 60 100 0 50 0 30 0
package edu.eskisehir;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Khan
 */
public class Tables extends javax.swing.JFrame {

    static String[] periods = new String[11];

    static Object[][] tablo1 = {
        {"Gross Requirements", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {"Scheduled receipts", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {"On hand from prior period", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {"Net requirements", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {"Time-phased Net Req.", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {"Planned order releases", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {"Planned order delivery", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public Tables() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectTables = new javax.swing.JComboBox<>();
        btnShowTable = new javax.swing.JButton();
        lblTableName = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablo = new javax.swing.JTable();
        btnOpenPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MRP Tables");
        setBounds(new java.awt.Rectangle(400, 400, 0, 0));

        selectTables.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectTables.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1605", "13122", "048", "118", "314", "062", "14127", "457", "11495", "129", "1118", "2142", "019" }));

        btnShowTable.setBackground(new java.awt.Color(54, 88, 128));
        btnShowTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnShowTable.setForeground(new java.awt.Color(230, 230, 230));
        btnShowTable.setText("Show");
        btnShowTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTableActionPerformed(evt);
            }
        });

        lblTableName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTableName.setForeground(new java.awt.Color(0, 0, 128));
        lblTableName.setText("Table Name :  Shovel (1605)");

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jTablo.setModel(new javax.swing.table.DefaultTableModel(tablo1,periods){
            boolean[] canEdit = new boolean [] {
                false, false, false, false,false,false,false,false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        if (jTablo.getColumnModel().getColumnCount() > 0) {
            jTablo.getColumnModel().getColumn(0).setResizable(false);
            jTablo.getColumnModel().getColumn(2).setResizable(false);
            jTablo.getColumnModel().getColumn(1).setResizable(false);
            jTablo.getColumnModel().getColumn(3).setResizable(false);
            jTablo.getColumnModel().getColumn(4).setResizable(false);
            jTablo.getColumnModel().getColumn(5).setResizable(false);
            jTablo.getColumnModel().getColumn(6).setResizable(false);
            jTablo.getColumnModel().getColumn(7).setResizable(false);
            jTablo.getColumnModel().getColumn(8).setResizable(false);
            jTablo.getColumnModel().getColumn(9).setResizable(false);
            jTablo.getColumnModel().getColumn(10).setResizable(false);
        }
        for(int i = 0 ;i<7;i++){
            jTablo.setRowHeight(i, 25);
        }
        jTablo.setCellSelectionEnabled(true);
        jTablo.getColumnModel().getColumn(0).setPreferredWidth(200);
        if (jTablo.getColumnModel().getColumnCount() > 0) {
            jTablo.getColumnModel().getColumn(0).setResizable(false);
            jTablo.getColumnModel().getColumn(1).setResizable(false);
            jTablo.getColumnModel().getColumn(3).setResizable(false);
        }
        jScrollPane1.setViewportView(jTablo);

        btnOpenPDF.setBackground(new java.awt.Color(54, 88, 128));
        btnOpenPDF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnOpenPDF.setForeground(new java.awt.Color(230, 230, 230));
        btnOpenPDF.setText("Open PDF");
        btnOpenPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectTables, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowTable)
                        .addGap(18, 18, 18)
                        .addComponent(btnOpenPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTableName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectTables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowTable)
                    .addComponent(btnOpenPDF)
                    .addComponent(btnExit))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTableActionPerformed

        int index = selectTables.getSelectedIndex();
        lblTableName.setForeground(new java.awt.Color(0, 0, 128));
        Item temp = Item.search(selectTables.getItemAt(index));
        lblTableName.setText("Table Name : " + temp.name + " (" + selectTables.getItemAt(index) + ")");

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < periods.length; j++) {
                LinkedList<Item> list = findOccuredItemList(selectTables.getItemAt(index));
                for (int k = 0; k < list.size(); k++) {
                    if (j != 0 && list.get(k).isBillFull) {
                        tablo1[i][j] = list.get(k).bill[i][j - 1];
                    }
                }
            }
        }

        jTablo.setModel(new javax.swing.table.DefaultTableModel(tablo1, periods) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTablo.getColumnModel().getColumn(0).setPreferredWidth(200);
        for (int i = 1; i < periods.length; i++) {
            jTablo.getColumnModel().getColumn(i).setPreferredWidth(75);
        }
        for (int i = 0; i < 7; i++) {
            jTablo.setRowHeight(i, 25);
        }
        for (int i = 0; i < periods.length; i++) {
            if (jTablo.getColumnModel().getColumnCount() > 0) {
                jTablo.getColumnModel().getColumn(i).setResizable(false);
            }
        }
        jTablo.setCellSelectionEnabled(true);

    }//GEN-LAST:event_btnShowTableActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOpenPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenPDFActionPerformed

        try {

            File pdfFile = new File("MRP.pdf");
            if (pdfFile.exists()) {

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    JOptionPane.showMessageDialog(null, "Awt Desktop is not supported!", "Warning", JOptionPane.WARNING_MESSAGE);/////////////////////////////////////////             
                }

            } else {
                JOptionPane.showMessageDialog(null, "File is not exists!", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | IOException ex) {
        }


    }//GEN-LAST:event_btnOpenPDFActionPerformed

    public static void product(Item item) {
        for (Integer demandInt : DemandInput.demandInt) {
            item.pReleases.add(0);
        }

        Item parent = whichParent(item.materialFor, SecondFrame.items);

        int scheduledRec;
        int netReq;
        int grossReq = 0;
        int timePhasedNetReq;
        int plannedOrderReleases;
        int plannedOrderDelivery;
        int onHand = item.amountOnHand;

        Item duplicate = item.findDuplicate();

        if (item.level == 0) {
            item.grossReqList = new LinkedList<>(DemandInput.demandInt);
        } else {

            if (duplicate != null) {
                if (!duplicate.isBillFull) {
                    Item duplicateParent = whichParent(duplicate.materialFor, SecondFrame.items);

                    item.grossReqList = new LinkedList<>();
                    for (int i = 0; i < Objects.requireNonNull(duplicateParent).grossReqList.size(); i++) {
                        item.grossReqList.add(parent.pReleases.get(i) * item.needed + duplicateParent.pReleases.get(i) * duplicate.needed);
                    }

                } else {
                    return;
                }

            } else {
                item.grossReqList = new LinkedList<>(parent.pReleases);
            }
        }

        item.bill[2][0] = onHand;

        if (item.arrivalOnWeek > 0) {
            item.bill[1][item.arrivalOnWeek - 1] = item.scheduledReceipt;
        }
        if (item.grossReqList.get(0) <= item.bill[1][0] + item.bill[2][0]) {
            for (int i = 0; i < DemandInput.demandInt.size(); i++) {
                if (item.level == 0) {
                    grossReq = item.grossReqList.get(i);
                } else {
                    if (duplicate == null) {
                        grossReq = item.grossReqList.get(i) * item.needed;
                    } else {
                        grossReq = item.grossReqList.get(i);
                    }
                }
                scheduledRec = item.bill[1][i];

                item.bill[0][i] = grossReq;
                if (grossReq != 0) {
                    netReq = grossReq - (onHand + scheduledRec);
                    if (netReq > 0) {
                        item.bill[3][i] = netReq;
                        if (item.lotSizingRule.equals("l4l")) {
                            timePhasedNetReq = netReq;
                            plannedOrderReleases = netReq;
                            plannedOrderDelivery = netReq;
                        } else {
                            double lotSizingRule = Double.parseDouble(item.lotSizingRule);
                            int temp = (int) Math.ceil(netReq / lotSizingRule);
                            timePhasedNetReq = netReq;
                            plannedOrderReleases = (int) (lotSizingRule * temp);
                            plannedOrderDelivery = plannedOrderReleases;

                        }

                        if (i >= item.leadTime) {
                            item.bill[4][i - item.leadTime] = timePhasedNetReq;
                            item.bill[5][i - item.leadTime] = plannedOrderReleases;
                            item.pReleases.set(i - item.leadTime, plannedOrderReleases);
                            item.bill[6][i] = plannedOrderDelivery;

                        } else {
                            int week = i + 1;
                            JOptionPane.showMessageDialog(null, "Lead Time Exception" + "\n" + week + ". week order isn't possible for" + item.name + " (" + item.itemID + ").", "Warning", JOptionPane.WARNING_MESSAGE);
                            System.exit(0);
                        }

                        onHand = plannedOrderDelivery - netReq;
                        if (i == 9) {
                            item.bill[2][i] = (onHand);
                        } else {
                            item.bill[2][i + 1] = (onHand);
                        }
                    } else {
                        onHand = (onHand + scheduledRec) - grossReq;
                        if (i == 9) {
                            item.bill[2][i] = (onHand);
                        } else {
                            item.bill[2][i + 1] = (onHand);
                        }
                    }

                } else {
                    onHand += scheduledRec;
                    if (i == 9) {
                        item.bill[2][i] = (onHand);
                    } else {
                        item.bill[2][i + 1] = (onHand);
                    }

                }
            }
            item.isBillFull = true;
        } else {
            JOptionPane.showMessageDialog(null, "For item " + item.itemID + " on hand amount isn't enough to start this order.\nPlease try again.", "Warning",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }

    }

    private static Item whichParent(String materialFor, LinkedList<Item> items) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i) != null && materialFor.equals(items.get(i).itemID)) {
                return items.get(i);
            }
        }
        return null;
    }

    public static LinkedList<Item> findOccuredItemList(String itemID) {
        LinkedList<Item> list = new LinkedList<>();
        for (int i = 0; i < SecondFrame.items.size(); i++) {
            if (SecondFrame.items.get(i).itemID.equals(itemID)) {
                list.add(SecondFrame.items.get(i));
            }
        }

        return list;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOpenPDF;
    private javax.swing.JButton btnShowTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablo;
    public static javax.swing.JLabel lblTableName;
    private javax.swing.JComboBox<String> selectTables;
    // End of variables declaration//GEN-END:variables
}
