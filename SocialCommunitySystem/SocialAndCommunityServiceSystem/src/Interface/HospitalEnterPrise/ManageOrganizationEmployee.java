/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.HospitalEnterPrise;
import Business.Employee.Employee;
import Business.Organization.DoctorOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
//import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyEvent;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author adhar
 */
public class ManageOrganizationEmployee extends javax.swing.JPanel {
    private OrganizationDirectory organizationDirectory;
    private JPanel downJPanel;
    /**
     * Creates new form ManageOrganizationEmployee
     */
    public ManageOrganizationEmployee(JPanel downJPanel, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.downJPanel = downJPanel;
        this.organizationDirectory = organizationDirectory;
        
        populateOrgJComboBox();
        populateOrgEmpJComboBox();
    }
    
    public void populateOrgJComboBox(){
        organizationJComboBox.removeAllItems();
        
        for (Organization organization : organizationDirectory.getOrganizationList())
        {
            if(organization instanceof DoctorOrganization)
            organizationJComboBox.addItem(organization);
        }
    }
    
    public void populateOrgEmpJComboBox(){
        selectOrganizationJComboBox.removeAllItems();
        
        for (Organization organization : organizationDirectory.getOrganizationList())
        {
            if(organization instanceof DoctorOrganization)
            selectOrganizationJComboBox.addItem(organization);
        }
    }
    
    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[3];
            row[2] = employee.getId();
            row[0] = employee.getEmpname();
            row[1] = organization.getName();
            model.addRow(row);
        }
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
        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        selectOrganizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(66, 160, 236));

        jLabel1.setFont(new java.awt.Font("Malayalam MN", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Organization Employee");

        backBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(238, 238, 238))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel3.setText("Organization: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 161, -1, -1));

        add(selectOrganizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 159, 240, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel4.setText("Name          :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 194, 92, -1));

        nameTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameTxtFieldKeyTyped(evt);
            }
        });
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 194, 240, -1));

        addBtn.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 229, 87, -1));

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Type of Organization", "ID"
            }
        ));
        jScrollPane1.setViewportView(employeeTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 159, 355, 409));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel2.setText("Organization: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 121, -1, -1));

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 119, 246, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        downJPanel.remove(this);
        CardLayout layout = (CardLayout) downJPanel.getLayout();
        layout.previous(downJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void nameTxtFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTxtFieldKeyTyped
        char c= evt.getKeyChar();
        if(!(Character.isAlphabetic(c)) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldKeyTyped

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(nameTxtField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"The Text Field can't be Empty");
        }else{
            Organization organization =(Organization) selectOrganizationJComboBox.getSelectedItem();
            String name = nameTxtField.getText();

            organization.getEmployeeDirectory().createEmployee(name);

            populateTable(organization);
            nameTxtField.setText("");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization)organizationJComboBox.getSelectedItem();

        if (organization != null)
        {
            populateTable(organization);

        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JComboBox selectOrganizationJComboBox;
    // End of variables declaration//GEN-END:variables
}

