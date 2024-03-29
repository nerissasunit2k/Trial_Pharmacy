/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samples;

/**
 *
 * @author sunitne_sd2082
 */
public class JavaProject extends javax.swing.JFrame { //Replace class name with yours


    public JavaProject() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        toysComboBox = new javax.swing.JComboBox();
        addToyLabel = new javax.swing.JLabel();
        addToCartButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        shoppingCartTable = new javax.swing.JTable();
        shoppingCartLabel = new javax.swing.JLabel();
        subtotalLabel = new javax.swing.JLabel();
        subtotalValueLabel = new javax.swing.JLabel();
        salesTaxLabel = new javax.swing.JLabel();
        salesTaxValueLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        totalValueLabel = new javax.swing.JLabel();
        checkOutButton = new javax.swing.JButton();
        removeSelectedButton = new javax.swing.JButton();
        toyStoreLabel = new javax.swing.JLabel();
        clearCartButton = new javax.swing.JButton();
        splitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toysComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Myracof - 35.00", "Diclofenac - 25.00", "Allerta Dermatec - 25.00", "Alaxan - 25.00", "Expel OD - 35.00", "UHP Fevertab- 35.00", "Allerta- 35.00", "Rexidol- 35.00","Solmux - 35.00","Biogesic 325 - 35.00","Allerkid - 35.00","Medicol Advance- 35.00","phenylephrine - 35.00","Naproxen - 35.00","Alavert - 35.00","Tylenol - 35.00" }));
        toysComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toysComboBoxActionPerformed(evt);
            }
        });

        addToyLabel.setText("Add Medicine:");

        addToCartButton.setText("Add to Cart");

        shoppingCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Cost"
            }
        ));
        jScrollPane1.setViewportView(shoppingCartTable);

        shoppingCartLabel.setText("Shopping Cart");

        subtotalLabel.setText("Subtotal:");

        subtotalValueLabel.setText("0.00");

        salesTaxLabel.setText("Sales Tax:");

        salesTaxValueLabel.setText("0.00");

        totalLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        totalLabel.setText("Total:");

        totalValueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        totalValueLabel.setText("0.00");

        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        removeSelectedButton.setText("Remove Selected Item");

        toyStoreLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        toyStoreLabel.setText("HealMae");

        clearCartButton.setText("Clear Cart");

        splitLabel.setText("_____________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addToyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(toysComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(toyStoreLabel))))
                            .addComponent(shoppingCartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(clearCartButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(removeSelectedButton))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(salesTaxLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(salesTaxValueLabel)
                                        .addGap(257, 257, 257))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(subtotalLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(subtotalValueLabel))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(totalLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(totalValueLabel))))))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(splitLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(toyStoreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addToyLabel)
                            .addComponent(toysComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addToCartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(shoppingCartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeSelectedButton)
                            .addComponent(clearCartButton))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtotalLabel)
                            .addComponent(subtotalValueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salesTaxLabel)
                            .addComponent(salesTaxValueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(splitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalLabel)
                            .addComponent(totalValueLabel))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void toysComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaProject().setVisible(true);
            }
        });
    }

    private javax.swing.JButton addToCartButton;
    private javax.swing.JLabel addToyLabel;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JButton clearCartButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeSelectedButton;
    private javax.swing.JLabel salesTaxLabel;
    private javax.swing.JLabel salesTaxValueLabel;
    private javax.swing.JLabel shoppingCartLabel;
    private javax.swing.JTable shoppingCartTable;
    private javax.swing.JLabel splitLabel;
    private javax.swing.JLabel subtotalLabel;
    private javax.swing.JLabel subtotalValueLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel totalValueLabel;
    private javax.swing.JLabel toyStoreLabel;
    private javax.swing.JComboBox toysComboBox;
}