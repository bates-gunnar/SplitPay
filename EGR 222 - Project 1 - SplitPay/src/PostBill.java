import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;


public class PostBill extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PostBillLogic information = new PostBillLogic();
	private ViewGroupLogic informationToCheckGroupName = new ViewGroupLogic();
	private JTextField totalAmountToSplit;
	private JTextField groupMember1;
	private JTextField groupMember2;
	private JTextField groupMember3;
	private JTextField groupMember4;
	private JTextField groupMember5;
	private JTextField groupMember6;
	private String member1 = "";
	private String member2 = "";
	private String member3 = "";
	private String member4 = "";
	private String member5 = "";
	private String member6 = "";
	private String group ="";
	private String groupOneCheck = "NONE";
	private String groupTwoCheck = "NONE";
	private String groupThreeCheck = "NONE";
	private String[] groupList = {""};
	private int groupMemberCount = 0;
	Button btnRevealSide = new Button("\u2261");
	private JTextField billTitle;
	final JLabel lblDollar1 = new JLabel("$");
	final JLabel lblDollar2 = new JLabel("$");
	final JLabel lblDollar3 = new JLabel("$");
	final JLabel lblDollar4 = new JLabel("$");
	final JLabel lblDollar5 = new JLabel("$");
	final JLabel lblDollar6 = new JLabel("$");
	final JLabel lblMember1 = new JLabel("Member 1");
	final JLabel lblMember2 = new JLabel("Member 2");
	final JLabel lblMember3 = new JLabel("Member 3");
	final JLabel lblMember4 = new JLabel("Member 4");
	final JLabel lblMember5 = new JLabel("Member 5");
	final JLabel lblMember6 = new JLabel("Member 6");
		
	

	/**
	 * Create the panel.
	 */
	
	public PostBill() {
		setLayout(null);
		
		try {
			groupOneCheck = informationToCheckGroupName.showGroup1();
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try {
			groupTwoCheck = informationToCheckGroupName.showGroup2();
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try {
			groupThreeCheck = informationToCheckGroupName.showGroup3();
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
				
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 204));
		panel.setBounds(0, 0, 484, 50);
		add(panel);
		
		JLabel lblPostABill = new JLabel("Post a Bill");
		panel.add(lblPostABill);
		lblPostABill.setFont(new Font("Verdana", Font.PLAIN, 29));
		lblPostABill.setForeground(Color.WHITE);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Verdana", Font.PLAIN, 16));
		label.setBounds(174, 83, 10, 21);
		add(label);
		
		totalAmountToSplit = new JTextField();
		totalAmountToSplit.setFont(new Font("Verdana", Font.PLAIN, 13));
		totalAmountToSplit.setBounds(192, 84, 116, 20);
		add(totalAmountToSplit);
		totalAmountToSplit.setColumns(10);
		
		JLabel lblAmountToBe = new JLabel("Amount to be Split");
		lblAmountToBe.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAmountToBe.setBounds(318, 87, 124, 15);
		add(lblAmountToBe);
		
		
		
		JLabel lblGroupName = new JLabel("Group Name:");
		lblGroupName.setFont(new Font("Verdana", Font.BOLD, 13));
		lblGroupName.setBounds(20, 97, 116, 21);
		add(lblGroupName);
		
		lblDollar1.setEnabled(false);
		lblDollar1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblDollar1.setBounds(174, 115, 10, 21);
		add(lblDollar1);
		
		
		groupMember1 = new JTextField();
		groupMember1.setEnabled(false);
		groupMember1.setFont(new Font("Verdana", Font.PLAIN, 13));
		groupMember1.setColumns(10);
		groupMember1.setBounds(192, 116, 116, 20);
		add(groupMember1);
		
		
		lblMember1.setEnabled(false);
		lblMember1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember1.setBounds(318, 119, 150, 15);
		add(lblMember1);
		
		
		lblDollar2.setEnabled(false);
		lblDollar2.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblDollar2.setBounds(174, 145, 10, 21);
		add(lblDollar2);
		
		
		groupMember2 = new JTextField();
		groupMember2.setEnabled(false);
		groupMember2.setFont(new Font("Verdana", Font.PLAIN, 13));
		groupMember2.setColumns(10);
		groupMember2.setBounds(192, 146, 116, 20);
		add(groupMember2);
		
		lblMember2.setEnabled(false);
		lblMember2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember2.setBounds(318, 149, 150, 15);
		add(lblMember2);
		
		lblDollar3.setEnabled(false);
		lblDollar3.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblDollar3.setBounds(174, 175, 10, 21);
		add(lblDollar3);
		
		
		groupMember3 = new JTextField();
		groupMember3.setEnabled(false);
		groupMember3.setFont(new Font("Verdana", Font.PLAIN, 13));
		groupMember3.setColumns(10);
		groupMember3.setBounds(192, 176, 116, 20);
		add(groupMember3);
		
		lblMember3.setEnabled(false);
		lblMember3.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember3.setBounds(318, 179, 150, 15);
		add(lblMember3);
		
		lblDollar4.setEnabled(false);
		lblDollar4.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblDollar4.setBounds(174, 207, 10, 21);
		add(lblDollar4);
		
		
		groupMember4 = new JTextField();
		groupMember4.setEnabled(false);
		groupMember4.setFont(new Font("Verdana", Font.PLAIN, 13));
		groupMember4.setColumns(10);
		groupMember4.setBounds(192, 208, 116, 20);
		add(groupMember4);
		
		lblMember4.setEnabled(false);
		lblMember4.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember4.setBounds(318, 211, 150, 15);
		add(lblMember4);
		
		lblDollar5.setEnabled(false);
		lblDollar5.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblDollar5.setBounds(174, 239, 10, 21);
		add(lblDollar5);
		
		
		groupMember5 = new JTextField();
		groupMember5.setEnabled(false);
		groupMember5.setFont(new Font("Verdana", Font.PLAIN, 13));
		groupMember5.setColumns(10);
		groupMember5.setBounds(192, 240, 116, 20);
		add(groupMember5);
		
		lblMember5.setEnabled(false);
		lblMember5.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember5.setBounds(318, 243, 150, 15);
		add(lblMember5);
		
		lblDollar6.setEnabled(false);
		lblDollar6.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblDollar6.setBounds(174, 271, 10, 21);
		add(lblDollar6);
		
		
		groupMember6 = new JTextField();
		groupMember6.setEnabled(false);
		groupMember6.setFont(new Font("Verdana", Font.PLAIN, 13));
		groupMember6.setColumns(10);
		groupMember6.setBounds(192, 272, 116, 20);
		add(groupMember6);
		
		lblMember6.setEnabled(false);
		lblMember6.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember6.setBounds(318, 275, 150, 15);
		add(lblMember6);
		
		try {
			groupList = information.groupList();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I broke here at group list");
		}
		
		final JComboBox<Object> comboGroupName = new JComboBox<Object>(groupList);
		comboGroupName.setBackground(Color.WHITE);
		comboGroupName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				group = (String) comboGroupName.getSelectedItem();
				if(group.matches(groupOneCheck)) {
					try {
						groupMemberCount = information.countGroupMembers(group);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					try {
						showMembers(groupMemberCount);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				else if(group.matches(groupTwoCheck)) {
					try {
						groupMemberCount = information.countGroupMembers(group);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					try {
						showMembers(groupMemberCount);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				else if(group.matches(groupThreeCheck)) {
					try {
						groupMemberCount = information.countGroupMembers(group);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					try {
						showMembers(groupMemberCount);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				else {
					noGroupSelected();
					comboGroupName.setSelectedItem(groupList[0]);
				}
			}
		});
		
		comboGroupName.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboGroupName.setBounds(20, 129, 134, 20);
		add(comboGroupName);
		
		final JButton btnPostBill = new JButton("Post Bill");
		btnPostBill.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnPostBill.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				String billName = billTitle.getText();
				Double total = 0.0;
				Double member1Total = 0.0;
				Double member2Total = 0.0;
				Double member3Total = 0.0;
				Double member4Total = 0.0;
				Double member5Total = 0.0;
				Double member6Total = 0.0;
				String continueOn;
				try {
					
					if(!totalAmountToSplit.getText().matches("")) {
						total = Double.parseDouble(totalAmountToSplit.getText());
					}
					
					if(!groupMember1.getText().matches("")) {
						member1Total = Double.parseDouble(groupMember1.getText());
					}
					
					if(!groupMember2.getText().matches("")) {
						member2Total = Double.parseDouble(groupMember2.getText());
					}
					
					if(!groupMember3.getText().matches("")) {
						member3Total = Double.parseDouble(groupMember3.getText());
					}
					
					if(!groupMember4.getText().matches("")) {
						member4Total = Double.parseDouble(groupMember4.getText());
					}
					
					if(!groupMember5.getText().matches("")) {
						member5Total = Double.parseDouble(groupMember5.getText());
					}
					
					if(!groupMember6.getText().matches("")) {
						member6Total = Double.parseDouble(groupMember6.getText());
					}
					
					if(total != (member1Total + member2Total + member3Total + member4Total + member5Total + member6Total)) {
						JOptionPane.showMessageDialog(null, "Member debts are not equal to total debt" + 
						". Please check your math.");
						continueOn = "NO";
					}
					
					else{
						continueOn = "YES";
					}
				} catch (NumberFormatException e1) {
					//TODO
					JOptionPane.showMessageDialog(null, "Please use numbers in the amount fields.");
					continueOn = "NO";
				}
				
				try {
					if(continueOn == "YES") {
						if(information.postABill(group, billName, member1, member2, member3, member4, member5, member6, 
						   total, member1Total, member2Total, member3Total, member4Total, member5Total, member6Total) == true) {
							noGroupSelected();
							comboGroupName.setSelectedItem(groupList[0]);
							EGR222_Frame parent = (EGR222_Frame) getTopLevelAncestor();
							parent.setViewGroup();
						}
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPostBill.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnPostBill.setBounds(197, 313, 89, 23);
		add(btnPostBill);
		
		btnRevealSide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				EGR222_Frame parent = (EGR222_Frame) getTopLevelAncestor();
				if(parent.revealSidePanel()==true) {
					setComponentZOrder(btnRevealSide, 0);
					btnRevealSide.setBounds(120, 50, 20, 22);
				}
				else
					btnRevealSide.setBounds(0, 50, 20, 22);
			}
		});
		btnRevealSide.setBounds(0, 50, 20, 20);
		btnRevealSide.setBackground(Color.WHITE);
		add(btnRevealSide);
		
		JLabel lblBillName = new JLabel("Bill Title:");
		lblBillName.setFont(new Font("Verdana", Font.BOLD, 13));
		lblBillName.setBounds(20, 172, 150, 21);
		add(lblBillName);
		
		billTitle = new JTextField();
		billTitle.setEnabled(false);
		billTitle.setFont(new Font("Verdana", Font.PLAIN, 13));
		billTitle.setColumns(10);
		billTitle.setBounds(20, 208, 116, 20);
		add(billTitle);
	}
	
	public void moveButton() {
		btnRevealSide.setBounds(0, 50, 20, 22);
	}
	
	public void noGroupSelected() {
		totalAmountToSplit.setText("");
		billTitle.setText("");
		billTitle.setEnabled(false);
		
		lblDollar1.setEnabled(false);
		lblDollar2.setEnabled(false);
		lblDollar3.setEnabled(false);
		lblDollar4.setEnabled(false);
		lblDollar5.setEnabled(false);
		lblDollar6.setEnabled(false);
		lblMember1.setEnabled(false);
		lblMember1.setText("Member 1");
		lblMember2.setEnabled(false);
		lblMember2.setText("Member 2");
		lblMember3.setEnabled(false);
		lblMember3.setText("Member 3");
		lblMember4.setEnabled(false);
		lblMember4.setText("Member 4");
		lblMember5.setEnabled(false);
		lblMember5.setText("Member 5");
		lblMember6.setEnabled(false);
		lblMember6.setText("Member 6");
		groupMember1.setEnabled(false);
		groupMember1.setText("");
		groupMember2.setEnabled(false);
		groupMember2.setText("");
		groupMember3.setEnabled(false);
		groupMember3.setText("");
		groupMember4.setEnabled(false);
		groupMember4.setText("");
		groupMember5.setEnabled(false);
		groupMember5.setText("");
		groupMember6.setEnabled(false);
		groupMember6.setText("");
	}
	
	public void oneMember() throws FileNotFoundException {
		totalAmountToSplit.setText("");
		billTitle.setEnabled(true);
		
		member1 = informationToCheckGroupName.setMember1(group, member1);
		
		lblDollar1.setEnabled(true);
		lblDollar2.setEnabled(false);
		lblDollar3.setEnabled(false);
		lblDollar4.setEnabled(false);
		lblDollar5.setEnabled(false);
		lblDollar6.setEnabled(false);
		lblMember1.setEnabled(true);
		lblMember1.setText(member1);
		lblMember2.setEnabled(false);
		lblMember2.setText("Member 2");
		lblMember3.setEnabled(false);
		lblMember3.setText("Member 3");
		lblMember4.setEnabled(false);
		lblMember4.setText("Member 4");
		lblMember5.setEnabled(false);
		lblMember5.setText("Member 5");
		lblMember6.setEnabled(false);
		lblMember6.setText("Member 6");
		groupMember1.setEnabled(true);
		groupMember1.setText("");
		groupMember2.setEnabled(false);
		groupMember2.setText("");
		groupMember3.setEnabled(false);
		groupMember3.setText("");
		groupMember4.setEnabled(false);
		groupMember4.setText("");
		groupMember5.setEnabled(false);
		groupMember5.setText("");
		groupMember6.setEnabled(false);
		groupMember6.setText("");
	}
	
	public void twoMembers() throws FileNotFoundException {
		totalAmountToSplit.setText("");
		billTitle.setEnabled(true);
		
		member1 = informationToCheckGroupName.setMember1(group, member1);
		member2 = informationToCheckGroupName.setMember(group, member1, member2);
		
		lblDollar1.setEnabled(true);
		lblDollar2.setEnabled(true);
		lblDollar3.setEnabled(false);
		lblDollar4.setEnabled(false);
		lblDollar5.setEnabled(false);
		lblDollar6.setEnabled(false);
		lblMember1.setEnabled(true);
		lblMember1.setText(member1);
		lblMember2.setEnabled(true);
		lblMember2.setText(member2);
		lblMember3.setEnabled(false);
		lblMember3.setText("Member 3");
		lblMember4.setEnabled(false);
		lblMember4.setText("Member 4");
		lblMember5.setEnabled(false);
		lblMember5.setText("Member 5");
		lblMember6.setEnabled(false);
		lblMember6.setText("Member 6");
		groupMember1.setEnabled(true);
		groupMember1.setText("");
		groupMember2.setEnabled(true);
		groupMember2.setText("");
		groupMember3.setEnabled(false);
		groupMember3.setText("");
		groupMember4.setEnabled(false);
		groupMember4.setText("");
		groupMember5.setEnabled(false);
		groupMember5.setText("");
		groupMember6.setEnabled(false);
		groupMember6.setText("");
	}
	
	public void threeMembers() throws FileNotFoundException {
		totalAmountToSplit.setText("");
		billTitle.setEnabled(true);
		
		member1 = informationToCheckGroupName.setMember1(group, member1);
		member2 = informationToCheckGroupName.setMember(group, member1, member2);
		member3 = informationToCheckGroupName.setMember(group, member2, member3);
		
		lblDollar1.setEnabled(true);
		lblDollar2.setEnabled(true);
		lblDollar3.setEnabled(true);
		lblDollar4.setEnabled(false);
		lblDollar5.setEnabled(false);
		lblDollar6.setEnabled(false);
		lblMember1.setEnabled(true);
		lblMember1.setText(member1);
		lblMember2.setEnabled(true);
		lblMember2.setText(member2);
		lblMember3.setEnabled(true);
		lblMember3.setText(member3);
		lblMember4.setEnabled(false);
		lblMember4.setText("Member 4");
		lblMember5.setEnabled(false);
		lblMember5.setText("Member 5");
		lblMember6.setEnabled(false);
		lblMember6.setText("Member 6");
		groupMember1.setEnabled(true);
		groupMember1.setText("");
		groupMember2.setEnabled(true);
		groupMember2.setText("");
		groupMember3.setEnabled(true);
		groupMember3.setText("");
		groupMember4.setEnabled(false);
		groupMember4.setText("");
		groupMember5.setEnabled(false);
		groupMember5.setText("");
		groupMember6.setEnabled(false);
		groupMember6.setText("");
	}
	
	public void fourMembers() throws FileNotFoundException {
		totalAmountToSplit.setText("");
		billTitle.setEnabled(true);
		
		member1 = informationToCheckGroupName.setMember1(group, member1);
		member2 = informationToCheckGroupName.setMember(group, member1, member2);
		member3 = informationToCheckGroupName.setMember(group, member2, member3);
		member4 = informationToCheckGroupName.setMember(group, member3, member4);
		
		lblDollar1.setEnabled(true);
		lblDollar2.setEnabled(true);
		lblDollar3.setEnabled(true);
		lblDollar4.setEnabled(true);
		lblDollar5.setEnabled(false);
		lblDollar6.setEnabled(false);
		lblMember1.setEnabled(true);
		lblMember1.setText(member1);
		lblMember2.setEnabled(true);
		lblMember2.setText(member2);
		lblMember3.setEnabled(true);
		lblMember3.setText(member3);
		lblMember4.setEnabled(true);
		lblMember4.setText(member4);
		lblMember5.setEnabled(false);
		lblMember5.setText("Member 5");
		lblMember6.setEnabled(false);
		lblMember6.setText("Member 6");
		groupMember1.setEnabled(true);
		groupMember1.setText("");
		groupMember2.setEnabled(true);
		groupMember2.setText("");
		groupMember3.setEnabled(true);
		groupMember3.setText("");
		groupMember4.setEnabled(true);
		groupMember4.setText("");
		groupMember5.setEnabled(false);
		groupMember5.setText("");
		groupMember6.setEnabled(false);
		groupMember6.setText("");
	}
	
	public void fiveMembers() throws FileNotFoundException {
		totalAmountToSplit.setText("");
		billTitle.setEnabled(true);
		
		member1 = informationToCheckGroupName.setMember1(group, member1);
		member2 = informationToCheckGroupName.setMember(group, member1, member2);
		member3 = informationToCheckGroupName.setMember(group, member2, member3);
		member4 = informationToCheckGroupName.setMember(group, member3, member4);
		member5 = informationToCheckGroupName.setMember(group, member4, member5);
		
		lblDollar1.setEnabled(true);
		lblDollar2.setEnabled(true);
		lblDollar3.setEnabled(true);
		lblDollar4.setEnabled(true);
		lblDollar5.setEnabled(true);
		lblDollar6.setEnabled(false);
		lblMember1.setEnabled(true);
		lblMember1.setText(member1);
		lblMember2.setEnabled(true);
		lblMember2.setText(member2);
		lblMember3.setEnabled(true);
		lblMember3.setText(member3);
		lblMember4.setEnabled(true);
		lblMember4.setText(member4);
		lblMember5.setEnabled(true);
		lblMember5.setText(member5);
		lblMember6.setEnabled(false);
		lblMember6.setText("Member 6");
		groupMember1.setEnabled(true);
		groupMember1.setText("");
		groupMember2.setEnabled(true);
		groupMember2.setText("");
		groupMember3.setEnabled(true);
		groupMember3.setText("");
		groupMember4.setEnabled(true);
		groupMember4.setText("");
		groupMember5.setEnabled(true);
		groupMember5.setText("");
		groupMember6.setEnabled(false);
		groupMember6.setText("");
	}
	
	public void sixMembers() throws FileNotFoundException {
		totalAmountToSplit.setText("");
		billTitle.setEnabled(true);
		
		member1 = informationToCheckGroupName.setMember1(group, member1);
		member2 = informationToCheckGroupName.setMember(group, member1, member2);
		member3 = informationToCheckGroupName.setMember(group, member2, member3);
		member4 = informationToCheckGroupName.setMember(group, member3, member4);
		member5 = informationToCheckGroupName.setMember(group, member4, member5);
		member6 = informationToCheckGroupName.setMember(group, member5, member6);
		
		lblDollar1.setEnabled(true);
		lblDollar2.setEnabled(true);
		lblDollar3.setEnabled(true);
		lblDollar4.setEnabled(true);
		lblDollar5.setEnabled(true);
		lblDollar6.setEnabled(true);
		lblMember1.setEnabled(true);
		lblMember1.setText(member1);
		lblMember2.setEnabled(true);
		lblMember2.setText(member2);
		lblMember3.setEnabled(true);
		lblMember3.setText(member3);
		lblMember4.setEnabled(true);
		lblMember4.setText(member4);
		lblMember5.setEnabled(true);
		lblMember5.setText(member5);
		lblMember6.setEnabled(true);
		lblMember6.setText(member6);
		groupMember1.setEnabled(true);
		groupMember1.setText("");
		groupMember2.setEnabled(true);
		groupMember2.setText("");
		groupMember3.setEnabled(true);
		groupMember3.setText("");
		groupMember4.setEnabled(true);
		groupMember4.setText("");
		groupMember5.setEnabled(true);
		groupMember5.setText("");
		groupMember6.setEnabled(true);
		groupMember6.setText("");
	}
	
	public void showMembers(int groupCount) throws FileNotFoundException {
		switch(groupCount) {
		case 1:
			oneMember();
			break;
		case 2:
			twoMembers();
			break;
		case 3:
			threeMembers();
			break;
		case 4: 
			fourMembers();
			break;
		case 5:
			fiveMembers();
			break;
		case 6:
			sixMembers();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Something went horribly, horribly wrong");
			break;
		}
	}
	
	public void apology() {
		String newline = System.getProperty("line.separator");
		JOptionPane.showMessageDialog(null, 
		"We are sorry, but any groups created during this use of the application" + newline
		+ "are currently unable to appear immediately in your group selection box. " + newline
		+ "Please re-start the application to in order to select your new group.");
	}
}
