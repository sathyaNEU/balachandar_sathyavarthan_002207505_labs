/*
 * CreateProductJPanel.java
 *
 */
package ui.supplier;

import model.Product;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.DebugGraphics;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Feature;
import model.GlobalFeatureList;
import model.Feature;

/**
 *
 * @author Rushabh
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    JPanel workArea;
    Product product;
    ImageIcon logoImage;
    private final JFileChooser fileChooser = new JFileChooser();
    GlobalFeatureList globalFeatureList;

    /**
     * Creates new form CreateProductJPanel
     */
    public ViewProductDetailJPanel(JPanel workArea, Product product, GlobalFeatureList globalFeatureList) {
        initComponents();
        this.workArea = workArea;
        this.product = product;
        this.globalFeatureList = globalFeatureList;
        this.useFeatureBtn.setEnabled(false);
        
        this.featureComboBox.removeAllItems();
        for(Feature feature : this.globalFeatureList.getGlobalFeatureList()){
            this.featureComboBox.addItem(feature.getName());
        }
        
        txtName.setEditable(false);
        txtPrice.setEditable(false);
        txtId.setEditable(false);

        txtName.setText(this.product.getName());
        txtId.setText(String.valueOf(this.product.getId()));
        txtPrice.setText(String.valueOf(this.product.getPrice()));
        if(product.getLogoImage()!=null)
            imgLogo.setIcon(product.getLogoImage());
        
        FileFilter jpegFilter = new FileNameExtensionFilter("JPEG file", "jpg","jpeg");
        FileFilter pngFilter = new FileNameExtensionFilter("PNG file", "png","png");
        
        fileChooser.addChoosableFileFilter(jpegFilter);
        fileChooser.addChoosableFileFilter(jpegFilter);
        fileChooser.setFileFilter(pngFilter);

        refreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        backButton1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFeatures = new javax.swing.JTable();
        btnAddFeature = new javax.swing.JButton();
        btnRemoveFeature = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        btnAttach = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        featureComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        useFeatureBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setText("View Product Details");

        lblName.setText("Product Name:");

        lblPrice.setText("Price:");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        txtId.setEditable(false);

        lblId.setText("ID:");

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblFeatures.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Feature Name", "Value"
            }
        ));
        tblFeatures.setEnabled(false);
        jScrollPane1.setViewportView(tblFeatures);

        btnAddFeature.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddFeature.setText("Add Feature");
        btnAddFeature.setEnabled(false);
        btnAddFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFeatureActionPerformed(evt);
            }
        });

        btnRemoveFeature.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemoveFeature.setText("Remove Feature");
        btnRemoveFeature.setEnabled(false);
        btnRemoveFeature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFeatureActionPerformed(evt);
            }
        });

        lblLogo.setText("Logo:");

        imgLogo.setText("<No Image>");
        imgLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnAttach.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAttach.setText("Attach");
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        featureComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Existing Features");

        useFeatureBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        useFeatureBtn.setText("Use Feature");
        useFeatureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useFeatureBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddFeature)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveFeature)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(lblLogo)
                        .addGap(18, 18, 18)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemove))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton1)
                        .addGap(38, 38, 38)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(useFeatureBtn)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(featureComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblId)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrice)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtId, txtName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSave, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(backButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrice))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(featureComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(useFeatureBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnAttach)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemove)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnUpdate)
                            .addComponent(btnAddFeature)
                            .addComponent(btnRemoveFeature)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLogo)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtId, txtName, txtPrice});

    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(true);
        txtPrice.setEditable(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        useFeatureBtn.setEnabled(true);
        tblFeatures.setEnabled(true);
        btnAddFeature.setEnabled(true);
        btnRemoveFeature.setEnabled(true);

}//GEN-LAST:event_btnUpdateActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void backAction() {

        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tblFeatures.getModel();
        if(dtm.getRowCount()==0){
         int returnVal = JOptionPane.showConfirmDialog(this, "Do you want to proceed with no features ?","Info",JOptionPane.YES_NO_OPTION);
         if(returnVal==JOptionPane.YES_OPTION){
             saveFeatures();
         }
         else
            return;
        }
        else{
        saveFeatures();
        }
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void saveFeatures() {
       DefaultTableModel dtm = (DefaultTableModel)tblFeatures.getModel();
        ArrayList<Feature> featureList = new ArrayList<>();
        for(int i = 0 ; i<dtm.getRowCount();i++){
            if(dtm.getValueAt(i, 0)==null || dtm.getValueAt(i, 1)==null){
                System.out.println(dtm.getValueAt(i, 0)+" "+dtm.getValueAt(i, 1));
                JOptionPane.showMessageDialog(this, "White space characters encountered", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            else{
                 if(dtm.getValueAt(i, 0).toString().isBlank() || dtm.getValueAt(i, 1).toString().isBlank()){
                System.out.println(dtm.getValueAt(i, 0).toString()+" "+dtm.getValueAt(i, 1).toString());
                JOptionPane.showMessageDialog(this, "White space characters encountered", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
                }   
                else{
                  Feature feature = new Feature();
                  String name = dtm.getValueAt(i, 0).toString();
                  feature.setName(name);
                  boolean isPresent = this.globalFeatureList.searchFeatureFromGlobalFeatureList(name);
                  if(!isPresent)
                    this.globalFeatureList.addFeatureToGlobalFeatureList(name);
                  feature.setDesc(dtm.getValueAt(i, 1).toString());   
                  featureList.add(feature);
             }
            }
        }
        String p_name = txtName.getText();
        String p_price = txtPrice.getText();
        int pi_price=0;
        try{
            pi_price = Integer.parseInt(p_price);
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Invalid Price Attribute", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!p_name.isBlank() && pi_price>=0){
            this.product.setFeatureList(featureList);
            this.product.setName(p_name);
            this.product.setPrice(pi_price);
            this.product.setLogoImage(logoImage);
            JOptionPane.showMessageDialog(this, "Features saved Successfully");
        }
    }

    private void btnAddFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFeatureActionPerformed
        // TODO add your handling code here:
     DefaultTableModel dtm = (DefaultTableModel)tblFeatures.getModel();
     Object[] obj = new Object[2];
     dtm.addRow(obj);

        
       
    }//GEN-LAST:event_btnAddFeatureActionPerformed

    private void btnRemoveFeatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFeatureActionPerformed
        // TODO add your handling code here:
        int index = tblFeatures.getSelectedRow();
        if(index==-1){
            JOptionPane.showMessageDialog(this, "No rows Selected", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            DefaultTableModel dtm = (DefaultTableModel)tblFeatures.getModel();
            if(dtm.getValueAt(index, 0)!=null){
            String keyWord = dtm.getValueAt(index, 0).toString();
            this.product.removeFeature(dtm.getValueAt(index, 0).toString());
            refreshTable();
            }
        }

       
    }//GEN-LAST:event_btnRemoveFeatureActionPerformed

    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            URL url;
            try{
                url = file.toURI().toURL();
                logoImage = new ImageIcon(url);
                logoImage = new ImageIcon(logoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                imgLogo.setIcon(logoImage);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnAttachActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:

        imgLogo.setIcon(null);
        this.logoImage = null;

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void useFeatureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useFeatureBtnActionPerformed
        // TODO add your handling code here:
        if(this.featureComboBox.getSelectedItem()!=null){
        String name = this.featureComboBox.getSelectedItem().toString();
        if(!name.isBlank()){
            DefaultTableModel dtm = (DefaultTableModel)tblFeatures.getModel();
             Object[] obj = new Object[2];
             obj[0] = name;
             dtm.addRow(obj);
        }
        }
    }//GEN-LAST:event_useFeatureBtnActionPerformed

    public void refreshTable() {
        DefaultTableModel dtm = (DefaultTableModel)tblFeatures.getModel();
        dtm.setRowCount(0);
        for(Feature feature : this.product.getFeatureList()){
            Object[] obj = new Object[2];
            obj[0] = feature.getName();
            obj[1] = feature.getDesc();
            dtm.addRow(obj);
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JButton btnAddFeature;
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnRemoveFeature;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> featureComboBox;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblFeatures;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JButton useFeatureBtn;
    // End of variables declaration//GEN-END:variables
}
