
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ِAnas Omar Obaid
 */
public class addNewProduct extends javax.swing.JFrame {
static Collection<String> namePrro;
    static Product product[] = new Product[1000];
   String displayproductName,
          displaPriceString,
          displaQuanitityString,
          displaDiscription,
          displaDepartmentProduct;
        double displayPrice;
        int dispayQuanity ;
    String nameProduct[] ;
static Collection<String>  nameProductTest;  
static int countiner = 0;
Iterator<String> iteratorProduct;
String involsProductiterator[];
/**
     * Creates new form addNewProduct
     */
    public addNewProduct() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        getProductName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        getPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        getQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        getDescription = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        getDepartment = new javax.swing.JComboBox<>();
        addNewProduct = new javax.swing.JButton();
        doneWork = new javax.swing.JButton();

        setTitle("Add New Product");

        jPanel1.setBackground(new java.awt.Color(33, 131, 226));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New Product :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 131, 226));
        jLabel2.setText("Product Name :");

        getProductName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getProductName.setMargin(new java.awt.Insets(5, 5, 5, 5));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 131, 226));
        jLabel3.setText("Price :");

        getPrice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getPrice.setMargin(new java.awt.Insets(5, 5, 5, 5));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 131, 226));
        jLabel4.setText("Quantity:");

        getQuantity.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getQuantity.setMargin(new java.awt.Insets(5, 5, 5, 5));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 131, 226));
        jLabel5.setText("Decscription :");

        getDescription.setColumns(20);
        getDescription.setFont(new java.awt.Font("Courier New", 1, 15)); // NOI18N
        getDescription.setRows(5);
        jScrollPane1.setViewportView(getDescription);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 131, 226));
        jLabel6.setText("Department :");

        getDepartment.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addNewProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addNewProduct.setForeground(new java.awt.Color(33, 131, 226));
        addNewProduct.setText("Add New Product");
        addNewProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewProductActionPerformed(evt);
            }
        });

        doneWork.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doneWork.setForeground(new java.awt.Color(33, 131, 226));
        doneWork.setText("Confirm Add");
        doneWork.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doneWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneWorkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(getQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(getPrice, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(getDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(addNewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(doneWork, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doneWork, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewProductActionPerformed
        
   try {
    displayproductName = getProductName.getText().trim();
    displaQuanitityString = getQuantity.getText().trim();
    displaPriceString = getPrice.getText().trim();
    displaDiscription = getDescription.getText().trim();
    displaDepartmentProduct = (String) getDepartment.getSelectedItem();

  
    if (displayproductName.isEmpty() || displaQuanitityString.isEmpty() ||
        displaPriceString.isEmpty() || displaDiscription.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all product fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }


    displayPrice = Double.parseDouble(displaPriceString);
    dispayQuanity = Integer.parseInt(displaQuanitityString);

    if (displayPrice <= 0 || dispayQuanity <= 0) {
        JOptionPane.showMessageDialog(this, "Price and quantity must be positive numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    namePrro = new LinkedList<>();
    for (int i = 0; i < countiner; ++i) {
        namePrro.add(product[i].getNameProdect());
    }

    if (!namePrro.contains(displayproductName)) {
        product[countiner] = new Product(displayproductName, displayPrice, dispayQuanity, displaDiscription, displaDepartmentProduct);
        JOptionPane.showMessageDialog(this, "Added successfully", "Note", JOptionPane.INFORMATION_MESSAGE);
        countiner++;
        doneWork.setEnabled(true);
    } else {
        JOptionPane.showMessageDialog(this, "Product already exists", "Error", JOptionPane.ERROR_MESSAGE);
    }

} catch (NumberFormatException x) {
    JOptionPane.showMessageDialog(this, "Invalid number input: " + x.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} catch (HeadlessException x) {
    JOptionPane.showMessageDialog(this, x.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_addNewProductActionPerformed

// =========================================================================================================================================

    private void doneWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneWorkActionPerformed
     
// For Loop To Get The Name Project To Added Collection
 nameProductTest = new LinkedList();
for(int i = 0; i < countiner ; ++i){
 nameProductTest.add(product[i].getNameProdect());   
}
// Made Iratator And Save The Data
int sizeProduct = 0 ;
iteratorProduct = nameProductTest.iterator();
involsProductiterator = new String[countiner];
while(iteratorProduct.hasNext()){
 involsProductiterator[sizeProduct] =   iteratorProduct.next();
 sizeProduct ++;
}

// Trow The Element Into jList 
ManagerWindow.jListProduct.setListData(involsProductiterator);

this.dispose();

/* 
  
**End Work 

*/
    }//GEN-LAST:event_doneWorkActionPerformed

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
            java.util.logging.Logger.getLogger(addNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewProduct;
    private javax.swing.JButton doneWork;
    public javax.swing.JComboBox<String> getDepartment;
    private javax.swing.JTextArea getDescription;
    private javax.swing.JTextField getPrice;
    private javax.swing.JTextField getProductName;
    private javax.swing.JTextField getQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables



}

