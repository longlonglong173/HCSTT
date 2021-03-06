/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cstt;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HUYLV
 */
public class SuKienForm extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ArrayList<Rule> dssk = new ArrayList<>();
	public static int indexsk;

	public static void docDuLieu(String fileName) throws IOException, FileNotFoundException, ClassNotFoundException {
		dssk = Rule.docsk(fileName);
	}

	/**
	 * Creates new form SuKienForm
	 */
	public SuKienForm() throws IOException, FileNotFoundException, ClassNotFoundException, Exception {
		initComponents();
		docDuLieu("tapluat2.dat");
		loadFile(tb, dssk);
		this.setLocationRelativeTo(null);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException ex) {
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		tf_sk = new javax.swing.JTextField();
		tf_nn = new javax.swing.JTextField();
		btn_add = new javax.swing.JButton();
		btn_edit = new javax.swing.JButton();
		btn_del = new javax.swing.JButton();
		btn_exit = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		tb = new javax.swing.JTable();
		btn_save = new javax.swing.JButton();
		txtMaLuat = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel1.setText("Law Code");

		jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel2.setText("THEN :");

		tf_sk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tf_skActionPerformed(evt);
			}
		});

		btn_add.setText("Add");
		btn_add.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_addActionPerformed(evt);
			}
		});

		btn_edit.setText("Edit");
		btn_edit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_editActionPerformed(evt);
			}
		});

		btn_del.setText("Delete");
		btn_del.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_delActionPerformed(evt);
			}
		});

		btn_exit.setText("Exit");
		btn_exit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_exitActionPerformed(evt);
			}
		});

		tb.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
		tb.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null }, { null, null }, { null, null }, { null, null }, { null, null } },
				new String[] { "IF", "Then" }));
		tb.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tbMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(tb);

		btn_save.setText("Save");
		btn_save.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_saveActionPerformed(evt);
			}
		});

		txtMaLuat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				txtMaLuatActionPerformed(evt);
			}
		});

		jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
		jLabel3.setText("IF :");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 88,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(54, 54, 54)
								.addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32))
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(33, 33, 33)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel2))
								.addGap(27, 27, 27)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(tf_sk, javax.swing.GroupLayout.PREFERRED_SIZE, 213,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(tf_nn, javax.swing.GroupLayout.PREFERRED_SIZE, 213,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtMaLuat, javax.swing.GroupLayout.PREFERRED_SIZE, 213,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(61, 61, 61)
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 137,
												Short.MAX_VALUE)
										.addComponent(btn_del, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(20, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(txtMaLuat, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(btn_add,
										javax.swing.GroupLayout.PREFERRED_SIZE, 43,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(13, 13, 13)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(jPanel1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(tf_sk, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
																24, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(76, 76, 76)
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(tf_nn, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
										javax.swing.GroupLayout.PREFERRED_SIZE))));

		jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { tf_nn, tf_sk, txtMaLuat });

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void tf_skActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tf_skActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tf_skActionPerformed

	private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_addActionPerformed
		Add ad1 = new Add();
		ad1.setVisible(true);
	}// GEN-LAST:event_btn_addActionPerformed

	private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_editActionPerformed
		// TODO add your handling code here:
		indexsk = tb.getSelectedRow();
		Edit edit1 = new Edit(indexsk);
		edit1.setVisible(true);
	}// GEN-LAST:event_btn_editActionPerformed

	private void tbMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbMouseClicked
		// TODO add your handling code here:
		int n = tb.getSelectedRow();
		txtMaLuat.setText(Integer.toString(dssk.get(n).getMaLuat()));
		tf_nn.setText(dssk.get(n).getTHEN());
		tf_sk.setText(dssk.get(n).getIF());
	}// GEN-LAST:event_tbMouseClicked

	private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_saveActionPerformed
		try {
			// TODO add your handling code here:
			Rule.ghi("sukien.dat", dssk);
		} catch (IOException ex) {
			Logger.getLogger(SuKienForm.class.getName()).log(Level.SEVERE, null, ex);
		}
		this.dispose();
	}// GEN-LAST:event_btn_saveActionPerformed

	private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_delActionPerformed
		// TODO add your handling code here:
		int n = tb.getSelectedRow();
		dssk.remove(n);
		loadFile(tb, dssk);
	}// GEN-LAST:event_btn_delActionPerformed

	private void txtMaLuatActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtMaLuatActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_txtMaLuatActionPerformed

	private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_exitActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btn_exitActionPerformed

	public static void loadFile(JTable tb, ArrayList<Rule> dssk) {
		String[] title1 = new String[3];

		title1[0] = "Law Code";
		title1[1] = "IF";
		title1[2] = "THEN";
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(title1);
		String[] array = new String[400];

		for (int i = 0; i < dssk.size(); i++) {
			array[0] = Integer.toString(dssk.get(i).getMaLuat());
			array[1] = dssk.get(i).getIF();
//			array[1] = Arrays.toString(dssk.get(i).getCodeIf());
			array[2] = dssk.get(i).getTHEN();
			model.addRow(array);
		}
		tb.setModel(model);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(SuKienForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SuKienForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SuKienForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SuKienForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new SuKienForm().setVisible(true);
				} catch (IOException ex) {
					Logger.getLogger(SuKienForm.class.getName()).log(Level.SEVERE, null, ex);
				} catch (ClassNotFoundException ex) {
					Logger.getLogger(SuKienForm.class.getName()).log(Level.SEVERE, null, ex);
				} catch (Exception ex) {
					Logger.getLogger(SuKienForm.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btn_add;
	private javax.swing.JButton btn_del;
	private javax.swing.JButton btn_edit;
	private javax.swing.JButton btn_exit;
	private javax.swing.JButton btn_save;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	public static javax.swing.JTable tb;
	private javax.swing.JTextField tf_nn;
	private javax.swing.JTextField tf_sk;
	private javax.swing.JTextField txtMaLuat;
	// End of variables declaration//GEN-END:variables
}
