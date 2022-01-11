/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateBook extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rst = null;
    Object book_code = null;
    String book_name = null;
    String book_author = null;
    String publication = null;
    String book_price = null;
    String purchse_date = null;
    String quantity = null;
    String[] cmbbook = {};
    String book = "";

    /** Creates new form UpdateBook */
    public UpdateBook() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtbookname = new javax.swing.JTextField();
        txtauthor = new javax.swing.JTextField();
        txtpublication = new javax.swing.JTextField();
        txtbookprice = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cmbdd = new javax.swing.JComboBox();
        cmbmm = new javax.swing.JComboBox();
        cmbyy = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txtquantity = new javax.swing.JTextField();
        try
        {
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            con=connection.connect.makeConnection();
            ps=con.prepareStatement("select book_code,book_name from book_master");
            rs=ps.executeQuery();
            while(rs.next())
            {
                book=book+rs.getString(1)+":-"+rs.getString(2)+":~";
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        cmbbook = book.split(":~");
        cmbbookcode = new javax.swing.JComboBox(cmbbook);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Book");
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Update Book ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setText("Book Code ");

        jLabel3.setText("Book Name");

        jLabel4.setText("Author ");

        jLabel5.setText("Publication");

        jLabel6.setText("Book Price");

        jLabel7.setText("Purchase Date");

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton6.setText("Cancel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        cmbdd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DD", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        cmbmm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MM", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        cmbyy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YYYY", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        jLabel8.setText("Quantity");

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
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbbookcode, 0, 189, Short.MAX_VALUE)
                    .addComponent(txtquantity, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbdd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbmm, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbyy, 0, 73, Short.MAX_VALUE))
                    .addComponent(txtbookname, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtauthor, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtpublication, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtbookprice, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addGap(70, 70, 70))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(cmbbookcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbookname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpublication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtbookprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbmm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        book_code = cmbbookcode.getSelectedItem();
        String bookid[] = book_code.toString().split(":-");
        if (bookid[0].equals("")) {
            JOptionPane.showMessageDialog(null, "Book Code Cannot be Blank Left!!");
            return;
        }
        book_name = txtbookname.getText();
        if (book_name.equals("")) {
            JOptionPane.showMessageDialog(null, "Book Name Cannot be Blank Left!!");
            return;
        }
        book_author = txtauthor.getText();
        if (book_author.equals("")) {
            JOptionPane.showMessageDialog(null, "Author Name Cannot be Blank Left!!");
            return;
        }
        publication = txtpublication.getText();
        if (publication.equals("")) {
            JOptionPane.showMessageDialog(null, "Book Publication Cannot be Blank Left!!");
            return;
        }
        book_price = txtbookprice.getText();
        quantity = txtquantity.getText();
        if (quantity.equals("")) {
            JOptionPane.showMessageDialog(null, "Quantity Cannot be Blank Left!!");
            return;
        }
        Object dd = cmbdd.getSelectedItem();
        Object mm = cmbmm.getSelectedItem();
        Object yy = cmbyy.getSelectedItem();
        purchse_date = dd + "-" + mm + "-" + yy;

        try {
            con = connection.connect.makeConnection();
            pst = con.prepareStatement("update book_master set book_name=?,author=?,publication=?,price=?,purchase_date=?,quantity=? where book_code='" + bookid[0] + "'");
            pst.setString(1, book_name);
            pst.setString(2, book_author);
            pst.setString(3, publication);
            pst.setString(4, book_price);
            pst.setString(5, purchse_date);
            pst.setString(6, quantity);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not Updated!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        menu mn = new menu();
        dispose();
       
}//GEN-LAST:event_jButton6ActionPerformed

    private void cmbbookcodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbookcodeItemStateChanged
        // TODO add your handling code here:
        book_code = cmbbookcode.getSelectedItem();
        String bookid[] = book_code.toString().split(":-");

        if (book_code.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Select The Book Code !!");
            return;
        }
        if (!book_code.equals("")) {

            try {
                con = connection.connect.makeConnection();
                Statement st = con.createStatement();
                String query = "select book_name,author,publication,price,purchase_date,quantity from book_master where book_code='" + bookid[0] + "'";
                rst = st.executeQuery(query);
                if (rst.next()) {
                    txtbookname.setText(rst.getString(1));
                    txtauthor.setText(rst.getString(2));
                    txtpublication.setText(rst.getString(3));
                    txtbookprice.setText(rst.getString(4));
                    String temp[] = rst.getString(5).split("-");
                    cmbdd.setSelectedItem(temp[0]);
                    cmbmm.setSelectedItem(temp[1]);
                    cmbyy.setSelectedItem(temp[2]);
                    txtquantity.setText(rst.getString(6));


                } else {
                    JOptionPane.showMessageDialog(null, "Data Not Found!!");
                }
            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_cmbbookcodeItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UpdateBook().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbbookcode;
    private javax.swing.JComboBox cmbdd;
    private javax.swing.JComboBox cmbmm;
    private javax.swing.JComboBox cmbyy;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtbookprice;
    private javax.swing.JTextField txtpublication;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
}
