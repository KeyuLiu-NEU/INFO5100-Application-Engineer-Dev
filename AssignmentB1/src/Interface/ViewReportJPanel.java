/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Address;
import Business.CheckingAccount;
import Business.Demographic;
import Business.Driverlicense;
import Business.MedicalRecord;
import Business.SavingAccount;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keyu Liu
 */
public class ViewReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewReportJPanel
     */
    private Address address;
    private CheckingAccount checkingAccount;
    private Demographic demographic;
    private Driverlicense driverlicense;
    private MedicalRecord medicalRecord;
    private SavingAccount savingAccount;
    
    public ViewReportJPanel(Address address, CheckingAccount checkingAccount, Demographic demographic, Driverlicense driverlicense, MedicalRecord medicalRecord, SavingAccount savingAccount) {
        initComponents();
        
        this.address = address;
        this.checkingAccount = checkingAccount;
        this.demographic = demographic;
        this.driverlicense = driverlicense;
        this.medicalRecord = medicalRecord;
        this.savingAccount = savingAccount;
        Image productPicture = driverlicense.getPicture();
        pictureJLabel.setIcon(new ImageIcon(productPicture));
        
        populate();
    }
    
     public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblDemographic.getModel();
        dtm.setRowCount(0);
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= null;
            row[1]= demographic.getFirstName();
            row[2]= demographic.getLastName();
            row[3]= demographic.getPhoneNum();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            row[4]= ft.format(demographic.getDateOfBirth());
            row[5]= demographic.getAge();
            row[6]= demographic.getHeight();
            row[7]= demographic.getWeight();
            row[8]= demographic.getSocialSecurityNum();
            dtm.addRow(row);
            
        DefaultTableModel dtmAddress = (DefaultTableModel)tblAddress.getModel();
        dtmAddress.setRowCount(0);
            Object[] rowAddress = new Object[dtmAddress.getColumnCount()];
            rowAddress[0]= null;
            rowAddress[1]= address.getStreetAddress();
            rowAddress[2]= address.getCity();
            rowAddress[3]= address.getState();
            rowAddress[4]= address.getZipCode();
            dtmAddress.addRow(row);
        
        DefaultTableModel dtmSavingAccount = (DefaultTableModel)tblSavingAccount.getModel();
        dtmSavingAccount.setRowCount(0);
            Object[] rowSavingAccount = new Object[dtmSavingAccount.getColumnCount()];
            rowSavingAccount[0]= null;
            rowSavingAccount[1]= savingAccount.getBankName();
            rowSavingAccount[2]= savingAccount.getRoutingNum();
            rowSavingAccount[3]= savingAccount.getBankAccountNum();
            rowSavingAccount[4]= savingAccount.getAccountBalance();
            rowSavingAccount[5]= savingAccount.getAccountType();          
            dtmSavingAccount.addRow(row);

        DefaultTableModel dtmCheckingAccount = (DefaultTableModel)tblCheckingAccount.getModel();
        dtmCheckingAccount.setRowCount(0);
            Object[] rowCheckingAccount = new Object[dtmCheckingAccount.getColumnCount()];
            rowCheckingAccount[0]= null;
            rowCheckingAccount[1]= checkingAccount.getBankName();
            rowCheckingAccount[2]= checkingAccount.getRoutingNum();
            rowCheckingAccount[3]= checkingAccount.getBankAccountNum();
            rowCheckingAccount[4]= checkingAccount.getAccountBalance();
            rowCheckingAccount[5]= checkingAccount.getAccountType();   
            dtmCheckingAccount.addRow(row);
            
        DefaultTableModel dtmDriverLicense = (DefaultTableModel)tblDriverLicense.getModel();
        dtmDriverLicense.setRowCount(0);
            Object[] rowDriverLicense = new Object[dtmDriverLicense.getColumnCount()];
            rowDriverLicense[0]= null;
            rowDriverLicense[1]= driverlicense.getLicenseNum();
            rowDriverLicense[2]= driverlicense.getIssuedDate();
            rowDriverLicense[3]= driverlicense.getExpirationDate();
            rowDriverLicense[4]= driverlicense.getBloodType();

            dtmDriverLicense.addRow(row);
            
        DefaultTableModel dtmMedicalRecord = (DefaultTableModel)tblMedicalRecord.getModel();
        dtmMedicalRecord.setRowCount(0);
            Object[] rowMedicalRecord = new Object[dtmMedicalRecord.getColumnCount()];
            rowMedicalRecord[0]= null;
            rowMedicalRecord[1]= medicalRecord.getRecordNum();
            rowMedicalRecord[2]= medicalRecord.getAlergy1();
            rowMedicalRecord[3]= medicalRecord.getAlergy2();
            rowMedicalRecord[4]= medicalRecord.getAlergy3();

            dtmMedicalRecord.addRow(row);
            
        
            
        
            
         
        
            
        
     

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDemographic = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddress = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSavingAccount = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCheckingAccount = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDriverLicense = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblMedicalRecord = new javax.swing.JTable();
        pictureJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 255));

        tblDemographic.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tblDemographic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Demographic", "First name", "Last name", "Phone number", "Date of birth", "Age", "Height", "Weight", "Social security number"
            }
        ));
        jScrollPane1.setViewportView(tblDemographic);

        tblAddress.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tblAddress.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Address", "Street address", "City", "State", "Zip code"
            }
        ));
        jScrollPane2.setViewportView(tblAddress);

        tblSavingAccount.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tblSavingAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Saving Account", "Bank name", "Bank routing number", "Bank account number", "Account balance", "Account type"
            }
        ));
        jScrollPane3.setViewportView(tblSavingAccount);
        if (tblSavingAccount.getColumnModel().getColumnCount() > 0) {
            tblSavingAccount.getColumnModel().getColumn(5).setHeaderValue("Account type");
        }

        tblCheckingAccount.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tblCheckingAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Checking Account", "Bank name", "Bank routing number", "Bank account number", "Account balance", "Account type"
            }
        ));
        jScrollPane4.setViewportView(tblCheckingAccount);
        if (tblCheckingAccount.getColumnModel().getColumnCount() > 0) {
            tblCheckingAccount.getColumnModel().getColumn(5).setHeaderValue("Account type");
        }

        tblDriverLicense.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tblDriverLicense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Driver License", "License number", "Issued Date", "Expiration Date", "Blood type"
            }
        ));
        jScrollPane5.setViewportView(tblDriverLicense);

        tblMedicalRecord.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tblMedicalRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Medical Record", " Medical record number", "Alergy1", "Alergy2", "Alergy3"
            }
        ));
        jScrollPane6.setViewportView(tblMedicalRecord);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Picture");

        jLabel12.setBackground(new java.awt.Color(0, 102, 102));
        jLabel12.setFont(new java.awt.Font("宋体", 3, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Your Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1222, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pictureJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(464, 464, 464))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(pictureJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel pictureJLabel;
    private javax.swing.JTable tblAddress;
    private javax.swing.JTable tblCheckingAccount;
    private javax.swing.JTable tblDemographic;
    private javax.swing.JTable tblDriverLicense;
    private javax.swing.JTable tblMedicalRecord;
    private javax.swing.JTable tblSavingAccount;
    // End of variables declaration//GEN-END:variables
}
