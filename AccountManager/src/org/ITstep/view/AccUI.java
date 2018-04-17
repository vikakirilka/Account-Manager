//package org.ITstep.view;
//
//import javax.swing.JFrame;
//import javax.swing.JTextField;
//import javax.swing.JLabel;
//import java.awt.Font;
//import javax.swing.SwingConstants;
//
//import org.ITstep.DAO.AccountDAO;
//import org.ITstep.model.AccRandomizer;
//import org.ITstep.model.Account;
//
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.ActionEvent;
//import javax.swing.JTabbedPane;
//import javax.swing.JPanel;
//import java.awt.Color;
//
//public class AccUI extends JFrame {
//	private JTextField saveFirstName;
//	private JTextField saveSecondName;
//	private JTextField tfInfo;
//	private JTextField getFirstName;
//	private JTextField getSecondName;
//	// private JTextField fNameTf;
//	// private JTextField sNameTf;
//	// private JTextField emailTf;
//	// private JTextField passwordTf;
//	// private JTextField infoTf;
//	 private JTextField updOldFName;
//	 private JTextField updOldSName;
//	 private JTextField updNewFName;
//	 private JTextField updNewSName;
//	 private JTextField updEmail;
//	 private JTextField updPassword;
//	 private JTextField textField_6;
//	 private JTextField textField_7;
//
//	public AccUI() {
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setTitle("Account manager");
//		setLocation(200, 200);
//		setSize(670, 713);
//		setResizable(false);
//		getContentPane().setLayout(null);
//
//		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
//		tabbedPane.setBounds(15, 16, 634, 331);
//		getContentPane().add(tabbedPane);
//
//		JPanel savePanel = new JPanel();
//		tabbedPane.addTab("SAVE", null, savePanel, null);
//		savePanel.setLayout(null);
//
//		JLabel lblSaveFirstName = new JLabel("Your firstname");
//		lblSaveFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
//		lblSaveFirstName.setBounds(15, 16, 187, 55);
//		savePanel.add(lblSaveFirstName);
//
//		JLabel lblSaveSecondname = new JLabel("Your secondname");
//		lblSaveSecondname.setFont(new Font("Tahoma", Font.BOLD, 17));
//		lblSaveSecondname.setBounds(15, 90, 187, 55);
//		savePanel.add(lblSaveSecondname);
//
//		saveFirstName = new JTextField();
//		saveFirstName.setBounds(236, 31, 378, 40);
//		savePanel.add(saveFirstName);
//		saveFirstName.setColumns(10);
//
//		saveSecondName = new JTextField();
//		saveSecondName.setBounds(236, 98, 378, 40);
//		savePanel.add(saveSecondName);
//		saveSecondName.setColumns(10);
//
//		JButton btnSaveAccount = new JButton("SAVE ACCOUNT");
//		btnSaveAccount.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				saveAccount();
//				getContentPane().repaint();
//			}
//		});
//		btnSaveAccount.setFont(new Font("Tahoma", Font.BOLD, 22));
//		btnSaveAccount.setForeground(Color.RED);
//		btnSaveAccount.setBounds(0, 158, 614, 60);
//		savePanel.add(btnSaveAccount);
//
//		JPanel getPanel = new JPanel();
//		tabbedPane.addTab("GET", null, getPanel, null);
//		getPanel.setLayout(null);
//
//		JLabel lblGetFirstName = new JLabel("Your firstname");
//		lblGetFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
//		lblGetFirstName.setBounds(15, 34, 187, 55);
//		getPanel.add(lblGetFirstName);
//
//		JLabel lblGetSecondName = new JLabel("Your secondname");
//		lblGetSecondName.setFont(new Font("Tahoma", Font.BOLD, 17));
//		lblGetSecondName.setBounds(15, 108, 187, 55);
//		getPanel.add(lblGetSecondName);
//
//		getFirstName = new JTextField();
//		getFirstName.setColumns(10);
//		getFirstName.setBounds(236, 49, 378, 40);
//		getPanel.add(getFirstName);
//
//		getSecondName = new JTextField();
//		getSecondName.setColumns(10);
//		getSecondName.setBounds(236, 116, 378, 40);
//		getPanel.add(getSecondName);
//
//		JButton btnGetAccount = new JButton("GET ACCOUNT");
//		btnGetAccount.setForeground(Color.RED);
//		btnGetAccount.setFont(new Font("Tahoma", Font.BOLD, 22));
//		btnGetAccount.setBounds(0, 176, 614, 60);
//		getPanel.add(btnGetAccount);
//
//		getPanel.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				tfInfo.setText("");
//				getContentPane().repaint();
//			}
//		});
//		JPanel updatePanel = new JPanel();
//		tabbedPane.addTab("UPDATE", null, updatePanel, null);
//		updatePanel.setLayout(null);
//
//		JLabel lblOldFirstName = new JLabel("Old first name");
//		lblOldFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblOldFirstName.setBounds(10, 11, 125, 30);
//		updatePanel.add(lblOldFirstName);
//
//		JLabel lblOldSecondName = new JLabel("Old second name");
//		lblOldSecondName.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblOldSecondName.setBounds(10, 52, 125, 30);
//		updatePanel.add(lblOldSecondName);
//
//		updOldFName = new JTextField();
//		updOldFName.setColumns(10);
//		updOldFName.setBounds(145, 15, 214, 24);
//		updatePanel.add(updOldFName);
//
//		updOldSName = new JTextField();
//		updOldSName.setColumns(10);
//		updOldSName.setBounds(145, 56, 214, 24);
//		updatePanel.add(updOldSName);
//
//		JLabel lblNewFirstName = new JLabel("New first name");
//		lblNewFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblNewFirstName.setBounds(10, 93, 125, 30);
//		updatePanel.add(lblNewFirstName);
//
//		JLabel lblNewSecondName = new JLabel("New second name");
//		lblNewSecondName.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblNewSecondName.setBounds(10, 134, 125, 30);
//		updatePanel.add(lblNewSecondName);
//
//		updNewFName = new JTextField();
//		updNewFName.setColumns(10);
//		updNewFName.setBounds(145, 97, 214, 24);
//		updatePanel.add(updNewFName);
//
//		updNewSName = new JTextField();
//		updNewSName.setColumns(10);
//		updNewSName.setBounds(145, 138, 214, 24);
//		updatePanel.add(updNewSName);
//
//		JLabel lblNewEmail = new JLabel("New email");
//		lblNewEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblNewEmail.setBounds(10, 172, 125, 30);
//		updatePanel.add(lblNewEmail);
//
//		JLabel lblNewPassword = new JLabel("New password");
//		lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblNewPassword.setBounds(10, 213, 125, 30);
//		updatePanel.add(lblNewPassword);
//
//		updEmail = new JTextField();
//		updEmail.setColumns(10);
//		updEmail.setBounds(145, 176, 214, 24);
//		updatePanel.add(updEmail);
//
//		updPassword = new JTextField();
//		updPassword.setColumns(10);
//		updPassword.setBounds(145, 217, 214, 24);
//		updatePanel.add(updPassword);
//
//		JPanel updatePanel = new JPanel();
//		tabbedPane.addTab("UPDATE", null, updatePanel, null);
//		updatePanel.setLayout(null);
//
//		JPanel deletePanel = new JPanel();
//		tabbedPane.addTab("DELETE", null, deletePanel, null);
//		deletePanel.setLayout(null);
//
//		tfInfo = new JTextField();
//		tfInfo.setEditable(false);
//		tfInfo.setBounds(15, 375, 634, 222);
//		getContentPane().add(tfInfo);
//		tfInfo.setColumns(10);
//
//		// JLabel firstNameLbl = new JLabel("Your first name");
//		// firstNameLbl.setHorizontalAlignment(SwingConstants.LEFT);
//		// firstNameLbl.setFont(new Font("Tahoma", Font.BOLD, 13));
//		// firstNameLbl.setBounds(10, 11, 135, 45);
//		// getContentPane().add(firstNameLbl);
//		//
//		// JLabel secNameLbl = new JLabel("Your second name");
//		// secNameLbl.setHorizontalAlignment(SwingConstants.LEFT);
//		// secNameLbl.setFont(new Font("Tahoma", Font.BOLD, 13));
//		// secNameLbl.setBounds(10, 69, 135, 45);
//		// getContentPane().add(secNameLbl);
//		//
//		// JLabel emailLbl = new JLabel("Your email");
//		// emailLbl.setHorizontalAlignment(SwingConstants.LEFT);
//		// emailLbl.setFont(new Font("Tahoma", Font.BOLD, 13));
//		// emailLbl.setBounds(10, 125, 135, 45);
//		// getContentPane().add(emailLbl);
//		//
//		// JLabel lblYourPassword = new JLabel("Your password");
//		// lblYourPassword.setHorizontalAlignment(SwingConstants.LEFT);
//		// lblYourPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
//		// lblYourPassword.setBounds(10, 181, 135, 45);
//		// getContentPane().add(lblYourPassword);
//		//
//		// fNameTf = new JTextField();
//		// fNameTf.setBounds(155, 17, 229, 35);
//		// getContentPane().add(fNameTf);
//		// fNameTf.setColumns(10);
//		//
//		// sNameTf = new JTextField();
//		// sNameTf.setColumns(10);
//		// sNameTf.setBounds(155, 69, 229, 35);
//		// getContentPane().add(sNameTf);
//		//
//		// emailTf = new JTextField();
//		// emailTf.setColumns(10);
//		// emailTf.setBounds(155, 125, 229, 35);
//		// getContentPane().add(emailTf);
//		//
//		// passwordTf = new JTextField();
//		// passwordTf.setColumns(10);
//		// passwordTf.setBounds(155, 181, 229, 35);
//		// getContentPane().add(passwordTf);
//		//
//		// JButton saveBtn = new JButton("SAVE");
//		// saveBtn.addActionListener(new ActionListener() {
//		// public void actionPerformed(ActionEvent e) {
//		// saveAccount();
//		// getContentPane().repaint();
//		// }
//		// });
//		// saveBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
//		// saveBtn.setBounds(231, 227, 153, 35);
//		// getContentPane().add(saveBtn);
//		//
//		// JButton getBtn = new JButton("GET");
//		// getBtn.addActionListener(new ActionListener() {
//		// public void actionPerformed(ActionEvent e) {
//		// Account account = getAccount();
//		// }
//		// });
//		// getBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
//		// getBtn.setBounds(231, 273, 153, 35);
//		// getContentPane().add(getBtn);
//		//
//		// JButton updateBtn = new JButton("UPDATE");
//		// updateBtn.addActionListener(new ActionListener() {
//		// public void actionPerformed(ActionEvent e) {
//		// updateAccount();
//		// }
//		// });
//		// updateBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
//		// updateBtn.setBounds(231, 326, 153, 35);
//		// getContentPane().add(updateBtn);
//		//
//		// JButton deleteBtn = new JButton("DELETE");
//		// deleteBtn.addActionListener(new ActionListener() {
//		// public void actionPerformed(ActionEvent e) {
//		// deleteAccount();
//		// }
//		// });
//		// deleteBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
//		// deleteBtn.setBounds(231, 372, 153, 35);
//		// getContentPane().add(deleteBtn);
//		//
//		// infoTf = new JTextField();
//		// infoTf.setEnabled(false);
//		// infoTf.setEditable(false);
//		// infoTf.setBounds(10, 231, 211, 72);
//		// getContentPane().add(infoTf);
//		// infoTf.setColumns(10);
//
//		setVisible(true);
//
//	}
//
//	private void saveAccount() {
//		String fName = saveFirstName.getText();
//		String sName = saveSecondName.getText();
//		String email = AccRandomizer.getEmail(fName, sName);
//		String pass = AccRandomizer.getPassword(sName);
//
//		AccountDAO accountDAO = new AccountDAO();
//		accountDAO.save(new Account(fName, sName, email, pass));
//
//		saveFirstName.setText("");
//		saveSecondName.setText("");
//
//		tfInfo.setText("Account " + sName + " was saved!");
//
//		// AccountDAO accountDAO = new AccountDAO();
//		// accountDAO.save(new Account(fName, sName, email, pass));
//		//
//		// fNameTf.setText("");
//		// sNameTf.setText("");
//		// emailTf.setText("");
//		// passwordTf.setText("");
//		//
//		// infoTf.setText("Account was saved!");
//
//	}
//
//	private void getAccount() {
//		String fName = getFirstName.getText();
//		String sName = getSecondName.getText();
//		AccountDAO accountDAO = new AccountDAO();
//		Account accFromDb = accountDAO.get(fName, sName);
//		getFirstName.setText("");
//		getSecondName.setText("");
//		if (accFromDb.getSecondName() != null) {
//			tfInfo.setText("Account " + sName + " was found!");
//		} else {
//			tfInfo.setText("Account " + sName + " was not found!");
//		}
//
//	}
//
//	private void updateAccount() {
//
//	}
//
//	private void deleteAccount() {
//
//	}
//}






package org.ITstep.view;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import org.ITstep.DAO.AccountDAO;
import org.ITstep.model.AccRandomizer;
import org.ITstep.model.Account;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AccUI extends JFrame {
 
 private JTextField saveFirstName;
 private JTextField saveSecondName;
 private JTextField tfInfo;
 private JTextField getFirstName;
 private JTextField getSecondName;
 private JTextField updOldFName;
 private JTextField updOldSName;
 private JTextField updNewFName;
 private JTextField updNewSName;
 private JTextField updEmail;
 private JTextField updPassword;
 private JTextField delFName;
 private JTextField delSname;

 public AccUI() {
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Account manager");
  setLocation(200, 200);
  setSize(400, 490);
  setResizable(false);
  getContentPane().setLayout(null);
  
  JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
  tabbedPane.setBounds(10, 11, 374, 338);
  getContentPane().add(tabbedPane);
  
  JPanel savePanel = new JPanel();
  savePanel.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
    tfInfo.setText("");
    getContentPane().repaint();
   }
  });
  tabbedPane.addTab("SAVE", null, savePanel, null);
  savePanel.setLayout(null);
  
  JLabel lblSaveFirstName = new JLabel("Your first name");
  lblSaveFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
  lblSaveFirstName.setBounds(10, 11, 125, 30);
  savePanel.add(lblSaveFirstName);
  
  JLabel lblSaveSecondName = new JLabel("Your second name");
  lblSaveSecondName.setFont(new Font("Tahoma", Font.BOLD, 13));
  lblSaveSecondName.setBounds(10, 52, 125, 30);
  savePanel.add(lblSaveSecondName);
  
  saveFirstName = new JTextField();
  saveFirstName.setBounds(145, 15, 214, 24);
  savePanel.add(saveFirstName);
  saveFirstName.setColumns(10);
  
  saveSecondName = new JTextField();
  saveSecondName.setColumns(10);
  saveSecondName.setBounds(145, 56, 214, 24);
  savePanel.add(saveSecondName);
  
  JButton btnSave = new JButton("SAVE ACCOUNT");
  btnSave.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    saveAccount();
    getContentPane().repaint();
   }
  });
  btnSave.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnSave.setForeground(Color.RED);
  btnSave.setBounds(10, 93, 349, 30);
  savePanel.add(btnSave);
  
  JPanel getPanel = new JPanel();
  tabbedPane.addTab("GET", null, getPanel, null);
  getPanel.setLayout(null);
  
  JLabel lblGetFirstName = new JLabel("Your first name");
  lblGetFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
  lblGetFirstName.setBounds(10, 11, 125, 30);
  getPanel.add(lblGetFirstName);
  
  getFirstName = new JTextField();
  getFirstName.setColumns(10);
  getFirstName.setBounds(145, 15, 214, 24);
  getPanel.add(getFirstName);
  
  JLabel lblGetSecondName = new JLabel("Your second name");
  lblGetSecondName.setFont(new Font("Tahoma", Font.BOLD, 13));
  lblGetSecondName.setBounds(10, 52, 125, 30);
  getPanel.add(lblGetSecondName);
  
  getSecondName = new JTextField();
  getSecondName.setColumns(10);
  getSecondName.setBounds(145, 56, 214, 24);
  getPanel.add(getSecondName);
  
  JButton btnGet = new JButton("GET ACCOUNT");
  btnGet.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    getAccount();
   }
  });
  btnGet.setForeground(Color.RED);
  btnGet.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnGet.setBounds(10, 93, 349, 30);
  getPanel.add(btnGet);
  
  getPanel.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
    tfInfo.setText("");
    getContentPane().repaint();
   }
  });
  JPanel updatePanel = new JPanel();
  updatePanel.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
    tfInfo.setText("");
    getContentPane().repaint();
   }
  });
  tabbedPane.addTab("UPDATE", null, updatePanel, null);
  updatePanel.setLayout(null);
  
  JLabel lblOldFirstName = new JLabel("Old first name");
  lblOldFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
  lblOldFirstName.setBounds(10, 11, 125, 30);
  updatePanel.add(lblOldFirstName);
  
  JLabel lblOldSecondName = new JLabel("Old second name");
  lblOldSecondName.setFont(new Font("Tahoma", Font.BOLD, 13));
  lblOldSecondName.setBounds(10, 52, 125, 30);
  updatePanel.add(lblOldSecondName);
  
  updOldFName = new JTextField();
  updOldFName.setColumns(10);
  updOldFName.setBounds(145, 15, 214, 24);
  updatePanel.add(updOldFName);
  
  updOldSName = new JTextField();
  updOldSName.setColumns(10);
  updOldSName.setBounds(145, 56, 214, 24);
  updatePanel.add(updOldSName);
  
  JLabel lblNewFirstName = new JLabel("New first name");
  lblNewFirstName.setFont(new Font("Tahoma", Font.BOLD, 13));
  lblNewFirstName.setBounds(10, 93, 125, 30);
  updatePanel.add(lblNewFirstName);
  
  JLabel lblNewSecondName = new JLabel("New second name");
  lblNewSecondName.setFont(new Font("Tahoma", Font.BOLD, 13));
  lblNewSecondName.setBounds(10, 134, 125, 30);
  updatePanel.add(lblNewSecondName);
  
  updNewFName = new JTextField();
  updNewFName.setColumns(10);
  updNewFName.setBounds(145, 97, 214, 24);
  updatePanel.add(updNewFName);
  
  updNewSName = new JTextField();
  updNewSName.setColumns(10);
  updNewSName.setBounds(145, 138, 214, 24);
  updatePanel.add(updNewSName);
  
  JLabel lblNewEmail = new JLabel("New email");
  lblNewEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
  lblNewEmail.setBounds(10, 172, 125, 30);
  updatePanel.add(lblNewEmail);
  
  JLabel lblNewPassword = new JLabel("New password");
  lblNewPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
  lblNewPassword.setBounds(10, 213, 125, 30);
  updatePanel.add(lblNewPassword);
  
  updEmail = new JTextField();
  updEmail.setColumns(10);
  updEmail.setBounds(145, 176, 214, 24);
  updatePanel.add(updEmail);
  
  updPassword = new JTextField();
  updPassword.setColumns(10);
  updPassword.setBounds(145, 217, 214, 24);
  updatePanel.add(updPassword);
  
  JButton btnUpdateAccount = new JButton("UPDATE ACCOUNT");
  btnUpdateAccount.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    updateAccount();
    getContentPane().repaint();
   }
  });
  btnUpdateAccount.setForeground(Color.RED);
  btnUpdateAccount.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnUpdateAccount.setBounds(10, 254, 349, 30);
  updatePanel.add(btnUpdateAccount);
  

  JPanel deletePanel = new JPanel();
  deletePanel.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) {
    tfInfo.setText("");
    getContentPane().repaint();
   }
  });
  
  tabbedPane.addTab("DELETE", null, deletePanel, null);
  deletePanel.setLayout(null);
  
  JLabel label = new JLabel("Your first name");
  label.setFont(new Font("Tahoma", Font.BOLD, 13));
  label.setBounds(10, 11, 125, 30);
  deletePanel.add(label);
  
  delFName = new JTextField();
  delFName.setColumns(10);
  delFName.setBounds(145, 15, 214, 24);
  deletePanel.add(delFName);
  
  delSname = new JTextField();
  delSname.setColumns(10);
  delSname.setBounds(145, 56, 214, 24);
  deletePanel.add(delSname);
  
  JLabel label_6 = new JLabel("Your second name");
  label_6.setFont(new Font("Tahoma", Font.BOLD, 13));
  label_6.setBounds(10, 52, 125, 30);
  deletePanel.add(label_6);
  
  JButton btnDeleteAccount = new JButton("DELETE ACCOUNT");
  btnDeleteAccount.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    deleteAccount();
    getContentPane().repaint();
   }
  });
  btnDeleteAccount.setForeground(Color.RED);
  btnDeleteAccount.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnDeleteAccount.setBounds(10, 93, 349, 30);
  deletePanel.add(btnDeleteAccount);
  
  tfInfo = new JTextField();
  tfInfo.setFont(new Font("Tahoma", Font.BOLD, 11));
  tfInfo.setEditable(false);
  tfInfo.setForeground(Color.RED);
  tfInfo.setBounds(10, 349, 374, 102);
  getContentPane().add(tfInfo);
  tfInfo.setColumns(10);

  setVisible(true);

 }

 private void saveAccount() {
  String fName = saveFirstName.getText();
  String sName = saveSecondName.getText();
  String email = AccRandomizer.getEmail(fName, sName);
  String pass = AccRandomizer.getPassword(sName);
  
  AccountDAO accountDAO = new AccountDAO();
  accountDAO.save(new Account(fName, sName, email, pass));
  
  saveFirstName.setText("");
  saveSecondName.setText("");
  
  tfInfo.setText("Account "+sName+" was saved!");
  
  
 }

 private void getAccount() {
  String fName = getFirstName.getText();
  String sName = getSecondName.getText();
  AccountDAO accountDAO = new AccountDAO();
  Account accFromDb = accountDAO.get(fName, sName);
  getFirstName.setText("");
  getSecondName.setText("");
  if(accFromDb.getSecondName()!=null) {
  tfInfo.setText("Account "+sName+" was found!");
  } else {
   tfInfo.setText("Account "+sName+" was not found!");
  }
 }

 private void updateAccount() {
  String fName = updOldFName.getText();
  String sName = updOldSName.getText();
  AccountDAO accountDAO = new AccountDAO();
  Account accFromDb = accountDAO.get(fName, sName);
  if (accFromDb.getEmail()!=null) {
   accountDAO.update(accFromDb, new Account
     (updNewFName.getText(), updNewSName.getText(), updEmail.getText(), updPassword.getText()));
   tfInfo.setText("Account "+sName+" was updated!");
   updOldFName.setText("");
   updOldSName.setText("");
   updNewFName.setText("");
   updNewSName.setText("");
   updEmail.setText("");
   updPassword.setText("");  
  } else {
   tfInfo.setText("Account "+sName+" was not found!");
  }
 }

 private void deleteAccount() {
  String fName = delFName.getText();
  String sName = delSname.getText();
  AccountDAO accountDAO = new AccountDAO();
  accountDAO.delete(fName, sName);
  tfInfo.setText("Account "+sName+" was deleted!");
  delFName.setText("");
  delSname.setText("");
 }
}