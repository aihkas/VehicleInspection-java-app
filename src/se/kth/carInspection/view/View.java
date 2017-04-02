package se.kth.carInspection.view;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/


import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import se.kth.carInspection.control.Control;
import se.kth.carInspection.model.CreditCardDTO;
import se.kth.carInspection.model.Reciept;
import javax.swing.event.*;
import se.kth.carInspection.model.InvalidLicenseException;
import se.kth.carInspection.model.NegativeAmountException;
import se.kth.carInspection.model.RegistrationLiscenceDTO;



/**
 *
 * @author tmpuser-10215
 */
public class View extends javax.swing.JFrame implements FocusListener  {
    
    /**
     * Creates new form View
     */
    Control control;
    int garageNumberState;
    String garageDoorState;
    String enteredRegistrationNumber="123";
    int cost=0;
    int paidMoney = 5;
    String reciept = "";
    Reciept Reciept;
    ListSelectionModel listSelectionModel;
    int[] pos=new int[20];
    ButtonGroup buttonGroup = new ButtonGroup();
    int radio=0;
    boolean radiostate;
    InspectionStatsView inspectionStats=new InspectionStatsView();
    boolean paymentStatus;
    
    
    RegistrationLiscenceDTO licenseNum;
     

    
    public View(Control control) {
        this.control=control;
        initComponents();
        myInit();
    }
    
    public void cashInput() throws NegativeAmountException {
        
        JLabel totalcost = new JLabel();
        totalcost.setText(Integer.toString(cost));
        JTextField paid = new JTextField();
      
        final JComponent[] inputs = new JComponent[] {
            new JLabel("Amount to pay:"),
            totalcost,
            new JLabel("Paid amount"),
            paid,
          
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, "Cash payment", JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            Reciept=control.payCash(cost,Integer.parseInt(paid.getText()));
            if (Integer.parseInt(paid.getText())>cost)
            {
                jTextArea1.setText("Payment successful");
                paymentStatus=true;
            }
            else
                jTextArea1.setText("Amount not enough");
        } else {
           jTextArea1.setText("User canceled / closed the dialog");
            
        }
        
    }
    public void cardInput (){
        
        
        JTextField card = new JTextField();
        JTextField cardholder=new JTextField();
        JPasswordField cvc = new JPasswordField();
        JTextField expiration = new JTextField();
        final JComponent[] inputs = new JComponent[] {
            new JLabel("Card Number:"),
            card,
            new JLabel("Card Holder:"),
            cardholder,
            new JLabel("CVC:"),
            cvc,
            new JLabel("Expiry Date:"),
            expiration
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, "Add card info", JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            CreditCardDTO creditCard = new CreditCardDTO(card.getText(),cardholder.getText(),Integer.parseInt(cvc.getText()),Integer.parseInt(expiration.getText()));
           Reciept=control.payByCard(cost,creditCard);
           jTextArea1.setText("Payment successful");
           paymentStatus=true;
        } else {
                       jTextArea1.setText("User canceled / closed the dialog");
            
        }
        
    }
    
    public void vehicleInput () throws InvalidLicenseException{
        JTextField RegistrationNumber = new JTextField();
        
        final JComponent[] inputs = new JComponent[] {
            new JLabel("Enter vehicle number"),
            RegistrationNumber,
            
        };
        int result = JOptionPane.showConfirmDialog(null, inputs, "Vehicle info", JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            // int enteredRegistrationNumber= Integer.parseInt();
            licenseNum = new RegistrationLiscenceDTO(RegistrationNumber.getText());
            cost = control.enterRegistrationNum(RegistrationNumber.getText());
            if(cost > 0){
                JOptionPane.showConfirmDialog(null,new JLabel("Car is found and your total cost is "+ cost), "Vehicle info", JOptionPane.PLAIN_MESSAGE);
                jTabbedPane1.setSelectedIndex(1);
                
            }
            else {
                JOptionPane.showConfirmDialog(null,new JLabel("Please Enter a Valid Number"), "Vehicle info", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    public void myInit(){
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jList1.addListSelectionListener(new ListSelectionListener() {
  public void valueChanged(ListSelectionEvent evt) {
    if (!evt.getValueIsAdjusting()) {
        if(pos[jList1.getSelectedIndex()]==1)
                {
    jLabel10.setText("This Test is stored, you can edit the results");
                }
        else     jLabel10.setText("This Test is not done yet");

    }
  }
});
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Start a new inspection");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Queue:");

        jLabel3.setText("Door Status:");

        jLabel4.setText(" Status info:");

        jButton3.setText("Open");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Closed");

        jLabel7.setFont(new java.awt.Font("Lato", 0, 36)); // NOI18N
        jLabel7.setText("0");

        jLabel19.setText("Enter 123 as a license number for test purposes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jButton3))
                .addGap(46, 46, 46)
                .addComponent(jLabel19)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Start", jPanel1);

        jLabel5.setText("Payment info:");

        jButton2.setText("Cash Payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Card Payment");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton6.setText("Print reciept");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(135, 135, 135))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114)))
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jTabbedPane1.addTab("Payment", jPanel2);

        jLabel8.setText("List of inspections:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return control.displayInspectionList().length; }
            public String getElementAt(int i) {return control.displayInspectionList()[i]; }
        }
    );
    jScrollPane2.setViewportView(jList1);

    jLabel9.setText("Describtion of selected inspection:");

    jLabel10.setText("Select an isnpection");

    jButton5.setText("Next");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });

    jRadioButton1.setText("Passed");
    jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButton1ActionPerformed(evt);
        }
    });

    jButton7.setText("Store Result");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
        }
    });

    jButton8.setText("Print all results");
    jButton8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton8ActionPerformed(evt);
        }
    });

    jTextArea2.setColumns(20);
    jTextArea2.setRows(5);
    jScrollPane3.setViewportView(jTextArea2);

    jRadioButton2.setText("Failed");
    jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButton2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jButton7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton1)
                                        .addComponent(jRadioButton2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))))))
            .addGap(31, 31, 31))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(jLabel9))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(jRadioButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jRadioButton2)
                    .addGap(40, 40, 40)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton5)
                        .addComponent(jButton7)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jButton8)
            .addGap(27, 27, 27)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(82, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Inspection", jPanel3);

    jPanel4.addFocusListener(this);

    jLabel1.setText("Statistics of all Inspections:");

    jLabel11.setText("Total");

    jLabel12.setText("Passed");

    jLabel13.setText("Failed");

    jLabel14.setText("jLabel14");

    jLabel15.setText("jLabel15");

    jLabel16.setText("jLabel16");

    jLabel17.setText("Success Percentage");

    jLabel18.setText("jLabel18");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel1))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel17))
                    .addGap(110, 110, 110)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14)
                        .addComponent(jLabel18))))
            .addContainerGap(215, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(jLabel1)
            .addGap(66, 66, 66)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(jLabel14))
            .addGap(52, 52, 52)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(jLabel15))
            .addGap(55, 55, 55)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13)
                .addComponent(jLabel16))
            .addGap(70, 70, 70)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel17)
                .addComponent(jLabel18))
            .addContainerGap(208, Short.MAX_VALUE))
    );

    jTabbedPane1.addTab("Stats", jPanel4);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 20, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jTabbedPane1)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        control.startNewInsection();
        paymentStatus=false;
        licenseNum=null;
        garageNumberState = control.getDisplayNumber();    
        jLabel6.setForeground(Color.green);
        //int queue=Integer.parseInt(jLabel7.getText());
        jLabel7.setText(""+(garageNumberState));
        control.openDoor();
        garageDoorState = control.displayDoorState();
        jButton3.setText("Close");
        jLabel6.setText(""+garageDoorState);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jButton3.getText().contentEquals("Close")) {
       try{
        control.closeDoor();
        jButton3.setText("Close")   ;
        jLabel6.setText(control.displayDoorState());
        jLabel6.setForeground(Color.red);
        vehicleInput();
       }
       catch (InvalidLicenseException e) {
         JOptionPane.showConfirmDialog(null,new JLabel("caught InvalidLicenseException: "+e.getMessage()), "Exception", JOptionPane.PLAIN_MESSAGE);
       

       }
       }
        else jLabel19.setText("please wait for a queue number");
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (licenseNum!=null){
            if (paymentStatus) JOptionPane.showMessageDialog(null,"You already paid");
            else{
        try {
            cashInput();
        } catch (NegativeAmountException ex) {
            System.out.println(ex);
       
        }
        }}
        else JOptionPane.showMessageDialog(null,"Please Enter a car license first");
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (licenseNum!=null){
            if (paymentStatus) JOptionPane.showMessageDialog(null,"You already paid");
            else  cardInput();  
         }
        else JOptionPane.showMessageDialog(null,"Please Enter a car license first");
        
    }//GEN-LAST:event_jButton4ActionPerformed
        
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
if (jList1.getSelectedIndex()==control.displayInspectionList().length-1)
    jList1.setSelectedIndex(0);
else
        jList1.setSelectedIndex(jList1.getSelectedIndex()+1);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    if (Reciept!=null)  
    jTextArea1.setText(Reciept.toString());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 if (licenseNum!=null){
     if(paymentStatus!=false)   {
    	if (jList1.getSelectedIndex()>=0){
        
        if(jRadioButton1.isSelected()) {
        	radio=1;
        	radiostate=true;
        }
        	else {
        	if(jRadioButton2.isSelected()) {radio=2;radiostate=false;}
        			
        			else   jLabel10.setText("Please select the inspection result");
        	}
        
        
if (radio!=0){
	
    control.saveInspection(jList1.getSelectedIndex(), radiostate,licenseNum.getRegistrationNumber(),inspectionStats);
    if(jList1.getSelectedIndex()>=0) pos[jList1.getSelectedIndex()]=1;
 jLabel10.setText("This inspection is stored, you can edit the results");
}
        }
         else     jLabel10.setText("select an inspection");
     // TODO add your handling code here:
 }//GEN-LAST:event_jButton7ActionPerformed
     else    jLabel10.setText("Pay First!");  
     


    }
 else   jTextArea2.setText("You can't perform inspections before Entering car info");
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    jTextArea2.setText(control.printInspection(control.getResult()));        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    
        public void focusGained(FocusEvent e) {
        jLabel14.setText(""+inspectionStats.getTotal());
        jLabel15.setText(""+inspectionStats.getPassed());
        jLabel16.setText(""+inspectionStats.getFailed());
        jLabel18.setText(""+inspectionStats.getPercentage());
    }
    
    
    /**
     * @param args the command line arguments
     */
    

      

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void focusLost(FocusEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

