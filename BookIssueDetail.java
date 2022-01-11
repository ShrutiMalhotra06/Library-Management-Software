/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BookIssueDetail.java
 *
 * Created on Nov 10, 2010, 12:47:35 PM
 */
package library;

import java.sql.*;
import javax.swing.JOptionPane;

public class BookIssueDetail extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    Object studentID = null;
    Object book_code = null;
    String book_name = null;
    String issue_date = null;
    String due_date = null;
    String return_date = null;
    String[] cmbStudentID = {};
    String student = "";
    String[] cmbbook = {};
    String book = "";

    /** Creates new form BookIssueDetail */
    public BookIssueDetail() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtbookname = new javax.swing.JTextField();
        try
        {
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            con=connection.connect.makeConnection();
            ps=con.prepareStatement("select id,name from student_master");
            rs=ps.executeQuery();
            while(rs.next())
            {
                student=student+rs.getString(1)+":-"+rs.getString(2)+":~";
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        cmbStudentID = student.split(":~");
        cmbstudent = new javax.swing.JComboBox(cmbStudentID);
        jLabel8 = new javax.swing.JLabel();
        try
        {
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            con=connection.connect.makeConnection();
            ps=con.prepareStatement("select book_code from book_master");
            rs=ps.executeQuery();
            while(rs.next())
            {
                book=book+rs.getString(1)+":-";
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        cmbbook = book.split(":-");
        cmbbookcode = new javax.swing.JComboBox(cmbbook);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Book Issue");
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("BOOK ISSUE DETAIL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel3.setText("Book Code");

        jLabel4.setText("Book Name");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton1.setText("Issued");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Studen ID");

        cmbbookcode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbookcodeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbookname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(cmbstudent, javax.swing.GroupLayout.Alignment.LEADING, 0, 216, Short.MAX_VALUE)
                            .addComponent(cmbbookcode, javax.swing.GroupLayout.Alignment.LEADING, 0, 216, Short.MAX_VALUE))
                        .addGap(117, 117, 117))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbstudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbbookcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtbookname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        studentID = cmbstudent.getSelectedItem();
        String temp[] = studentID.toString().split(":-");
        if (temp[0].equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select Student ID !!");
            return;
        }
        book_code = cmbbookcode.getSelectedItem();
        if (book_code.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select Book Code !!");
            return;
        }
        book_name = txtbookname.getText();
        if (!book_code.equals(" ")) {

            //check from book name book is available or not
            int bookav = getBookAvaility(book_code.toString());
            System.out.println("bookav : "+bookav);

            if (bookav > 0) {
                try {
                    con = connection.connect.makeConnection();
                    pst = con.prepareStatement("Insert into book_issue (book_code,book_name,student_id,student_name,status,issue_date) values(?,?,?,?,?,now())");
                    pst.setString(1, book_code.toString());
                    pst.setString(2, book_name);
                    pst.setString(3, temp[0]);
                    pst.setString(4, temp[1]);
                    pst.setString(5,"true");

                    int i = pst.executeUpdate();
                    if (i > 0) {
                        // Reduced Book Quantiy
                        reducedBookQuantity(book_code.toString(), bookav);
                        JOptionPane.showMessageDialog(null, "New Book is Successfully Issued");
                    } else {
                        JOptionPane.showMessageDialog(null, "New Book is Not Issued");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                JOptionPane.showMessageDialog(null, "This Book is already Issued For another Stuent!!");
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        menu mn = new menu();
        dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmbbookcodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbookcodeItemStateChanged
        // TODO add your handling code here:

        book_code = cmbbookcode.getSelectedItem();
        if (book_code.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select The Book Code !!");
            return;
        }
        try {
            con = connection.connect.makeConnection();
            Statement st = con.createStatement();
            String query = "select book_name from book_master where book_code='" + book_code.toString() + "'";
            rst = st.executeQuery(query);
            if (rst.next()) {
                txtbookname.setText(rst.getString(1));
            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found!!");
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_cmbbookcodeItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BookIssueDetail().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbbookcode;
    private javax.swing.JComboBox cmbstudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtbookname;
    // End of variables declaration//GEN-END:variables

    //get Book Availity
    public int getBookAvaility(String id) {
        int res = 0;
        try {
            Connection con11 = connection.connect.makeConnection();
            Statement st11 = con11.createStatement();
            String query = "select quantity from book_master where book_code='" + id + "'";
            ResultSet rst11 = st11.executeQuery(query);
            if (rst11.next()) {
                String quan = rst11.getString(1);
                res = Integer.parseInt(quan);
            } else {
                JOptionPane.showMessageDialog(null, "Data Not Found!!");
            }
            st11.close();
            con11.close();
        } catch (Exception e) {
        }

        return res;
    }

    //reduce book quantity
    public void reducedBookQuantity(String bookid, int qty) {

        int quan = qty - 1;
        try {
            Connection con22 = connection.connect.makeConnection();
            PreparedStatement pstt = con22.prepareStatement("update book_master set quantity='" + quan + "' where book_code='" + bookid + "'");
            pstt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}