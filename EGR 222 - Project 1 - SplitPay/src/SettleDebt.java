import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;


public class SettleDebt extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	
	Button btnRevealSide = new Button("\u2261");
	private ViewGroupLogic groupInformation = new ViewGroupLogic();
	private SettleDebtLogic billInformation = new SettleDebtLogic();
	private JLabel btnGroupOne = new JLabel("Group 1");
	private JLabel btnGroupTwo = new JLabel("Group 2");
	private JLabel btnGroupThree = new JLabel("Group 3");
	private String groupOne = "";
	private String groupTwo = "";
	private String groupThree = "";
	private String currentGroup = "";
	private String bill1 = "";
	private String bill2 = "";
	private String bill3 = "";
	private String billToDelete = "";
	private JLabel lblBill1 = new JLabel("---");
	private JLabel lblBill2 = new JLabel("---");
	private JLabel lblBill3 = new JLabel("---");
	private JLabel lblBill1Debt = new JLabel("---");
	private JLabel lblBill2Debt = new JLabel("---");
	private JLabel lblBill3Debt = new JLabel("---");
	private JButton btnSettleBill1 = new JButton("Settle");
	private JButton btnSettleBill2 = new JButton("Settle");
	private JButton btnSettleBill3 = new JButton("Settle");
	private JButton btnSettleAllBills = new JButton("Settle All Debts");
	
	public SettleDebt() {
		setLayout(null);
		
		try {
			setVisibleGroups();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 484, 47);
		add(panel);
		
		JLabel lblGroupHistory = new JLabel("Settle Debt");
		lblGroupHistory.setForeground(Color.WHITE);
		lblGroupHistory.setFont(new Font("Verdana", Font.PLAIN, 29));
		panel.add(lblGroupHistory);
		
		JPanel groupPanel = new JPanel();
		groupPanel.setBounds(10, 91, 234, 235);
		add(groupPanel);
		groupPanel.setLayout(null);
		btnGroupOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnGroupOne.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					setGroupOneBills();
					currentGroup = btnGroupOne.getText();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				btnGroupOne.setForeground(Color.RED);
				btnGroupTwo.setForeground(Color.BLUE);
				btnGroupThree.setForeground(Color.BLUE);
			}
		});
		btnGroupOne.setForeground(Color.BLUE);
		
		btnGroupOne.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnGroupOne.setBounds(5, 5, 93, 23);
		groupPanel.add(btnGroupOne);
		btnGroupTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnGroupTwo.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setGroupTwoBills();
				currentGroup = btnGroupTwo.getText();
				btnGroupOne.setForeground(Color.BLUE);
				btnGroupTwo.setForeground(Color.RED);
				btnGroupThree.setForeground(Color.BLUE);
			}
		});
		btnGroupTwo.setForeground(Color.BLUE);
		
		btnGroupTwo.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnGroupTwo.setBounds(5, 73, 93, 23);
		groupPanel.add(btnGroupTwo);
		btnGroupThree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnGroupThree.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setGroupThreeBills();
				currentGroup = btnGroupThree.getText();
				btnGroupOne.setForeground(Color.BLUE);
				btnGroupTwo.setForeground(Color.BLUE);
				btnGroupThree.setForeground(Color.RED);
			}
		});
		btnGroupThree.setForeground(Color.BLUE);
		
		btnGroupThree.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnGroupThree.setBounds(5, 139, 93, 23);
		groupPanel.add(btnGroupThree);
		lblBill1.setFont(new Font("Verdana", Font.PLAIN, 11));
		
		lblBill1.setBounds(151, 9, 73, 14);
		groupPanel.add(lblBill1);
		lblBill2.setFont(new Font("Verdana", Font.PLAIN, 11));
		
		lblBill2.setBounds(151, 77, 73, 14);
		groupPanel.add(lblBill2);
		lblBill3.setFont(new Font("Verdana", Font.PLAIN, 11));
		
		lblBill3.setBounds(151, 143, 73, 14);
		groupPanel.add(lblBill3);
		
		JLabel lblGroups = new JLabel("Groups");
		lblGroups.setFont(new Font("Verdana", Font.BOLD, 11));
		lblGroups.setBounds(32, 64, 58, 16);
		add(lblGroups);
		
		JPanel groupHistoryOne = new JPanel();
		groupHistoryOne.setBounds(274, 92, 180, 235);
		add(groupHistoryOne);
		groupHistoryOne.setLayout(new CardLayout(0, 0));
		
		JPanel groupOnePanel = new JPanel();
		groupHistoryOne.add(groupOnePanel, "name_278162592790310");
		groupOnePanel.setLayout(null);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Verdana", Font.PLAIN, 11));
		label.setBounds(10, 11, 13, 14);
		groupOnePanel.add(label);
		
		JLabel label_1 = new JLabel("$");
		label_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		label_1.setBounds(10, 76, 13, 14);
		groupOnePanel.add(label_1);
		
		JLabel label_2 = new JLabel("$");
		label_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		label_2.setBounds(10, 143, 13, 14);
		groupOnePanel.add(label_2);
		
		lblBill1Debt.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblBill1Debt.setBounds(20, 11, 60, 14);
		groupOnePanel.add(lblBill1Debt);
		
		lblBill2Debt.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblBill2Debt.setBounds(20, 76, 60, 14);
		groupOnePanel.add(lblBill2Debt);
		
		lblBill3Debt.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblBill3Debt.setBounds(20, 143, 60, 14);
		groupOnePanel.add(lblBill3Debt);
		btnSettleBill1.setEnabled(false);
		
		btnSettleBill1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnSettleBill1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					billToDelete = lblBill1.getText();
					System.out.println(billToDelete); //**************************************************************************
					billInformation.settleDebt(currentGroup, billToDelete);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSettleBill1.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnSettleBill1.setBounds(90, 8, 89, 23);
		groupOnePanel.add(btnSettleBill1);
		btnSettleBill2.setEnabled(false);
		
		btnSettleBill2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSettleBill2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					billToDelete = lblBill2.getText();
					System.out.println(billToDelete); //**************************************************************************
					billInformation.settleDebt(currentGroup, billToDelete);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSettleBill2.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnSettleBill2.setBounds(90, 73, 89, 23);
		groupOnePanel.add(btnSettleBill2);
		btnSettleBill3.setEnabled(false);
		
		btnSettleBill3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSettleBill3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					billToDelete = lblBill3.getText();
					System.out.println(billToDelete); //**************************************************************************
					billInformation.settleDebt(currentGroup, billToDelete);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSettleBill3.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnSettleBill3.setBounds(90, 140, 89, 23);
		groupOnePanel.add(btnSettleBill3);
		btnSettleAllBills.setEnabled(false);
		
		btnSettleAllBills.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSettleAllBills.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					billInformation.settleAllDebt(currentGroup, lblBill1.getText(), lblBill2.getText(), lblBill3.getText());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSettleAllBills.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnSettleAllBills.setBounds(31, 188, 122, 23);
		groupOnePanel.add(btnSettleAllBills);
		
		JPanel groupTwoPanel = new JPanel();
		groupHistoryOne.add(groupTwoPanel, "name_278186482436982");
		groupTwoPanel.setLayout(null);
		
		JPanel groupThreePanel = new JPanel();
		groupHistoryOne.add(groupThreePanel, "name_278216449994626");
		groupThreePanel.setLayout(null);
		
		JLabel lblHistory = new JLabel("My Debt");
		lblHistory.setFont(new Font("Verdana", Font.BOLD, 11));
		lblHistory.setBounds(337, 64, 66, 16);
		add(lblHistory);

		//************************************************************************************************************************************************
	   	//On click function to reveal navigation panel
		btnRevealSide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				EGR222_Frame parent = (EGR222_Frame) getTopLevelAncestor();
				
				if(parent.revealSidePanel()==true)
					btnRevealSide.setBounds(120, 50, 20, 22);
				else
					btnRevealSide.setBounds(0, 50, 20, 22);
			}
		});
		btnRevealSide.setBounds(0, 50, 20, 22);
		btnRevealSide.setBackground(Color.WHITE);
		add(btnRevealSide);
		
		JLabel lblBills = new JLabel("Bills");
		lblBills.setFont(new Font("Verdana", Font.BOLD, 11));
		lblBills.setBounds(172, 66, 36, 14);
		add(lblBills);
	}
	
	//************************************************************************************************************************************************
   	//Function to move the navigation reveal button move back to its original position upon returning to a panel
	public void moveButton(){
		btnRevealSide.setBounds(0, 50, 20, 22);
		
	}
	
	public void setVisibleGroups() throws FileNotFoundException {
		groupOne = groupInformation.showGroup1();
		groupTwo = groupInformation.showGroup2();
		groupThree = groupInformation.showGroup3();
		
		btnGroupOne.setText(groupOne);
		btnGroupTwo.setText(groupTwo);
		btnGroupThree.setText(groupThree);
	}
	
	
	
	
	public void setGroupOneBills() throws FileNotFoundException {
		try {
			bill1 = groupInformation.setFirstBill(groupOne);
			lblBill1.setText(bill1);
			lblBill1Debt.setText(billInformation.getDebt(groupOne, bill1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill2 = groupInformation.setOtherBills(groupOne, bill1);
			lblBill2.setText(bill2);
			lblBill2.setVisible(true);
			lblBill2Debt.setText(billInformation.getDebt(groupOne, bill2));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill3 = groupInformation.setOtherBills(groupOne, bill2);
			lblBill3.setText(bill3);
			lblBill3.setVisible(true);
			lblBill3Debt.setText(billInformation.getDebt(groupOne, bill3));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(bill1.matches("No Bill")) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
			lblBill1Debt.setText("---");
			lblBill2Debt.setText("---");
			lblBill3Debt.setText("---");
		}
		
		if(bill2.matches(bill1)) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
			lblBill2Debt.setText("---");
			lblBill3Debt.setText("---");
		}
		
		if(bill3.matches(bill2)) {
			lblBill3.setVisible(false);
			lblBill3Debt.setText("---");
		}
		
		if(lblBill1Debt.getText().matches("---")){
			btnSettleBill1.setEnabled(false);
			btnSettleAllBills.setEnabled(false);
		}
		
		else {
			btnSettleBill1.setEnabled(true);
			btnSettleAllBills.setEnabled(true);
		}
		
		if(lblBill2Debt.getText().matches("---")){
			btnSettleBill2.setEnabled(false);
		}
		
		else {
			btnSettleBill2.setEnabled(true);
			btnSettleAllBills.setEnabled(true);
		}
		
		if(lblBill3Debt.getText().matches("---")){
			btnSettleBill3.setEnabled(false);
		}
		
		else {
			btnSettleBill3.setEnabled(true);
			btnSettleAllBills.setEnabled(true);
		}
		
	}
	
	public void setGroupTwoBills() {
		try {
			bill1 = groupInformation.setFirstBill(groupTwo);
			lblBill1.setText(bill1);
			lblBill1Debt.setText(billInformation.getDebt(groupTwo, bill1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill2 = groupInformation.setOtherBills(groupTwo, bill1);
			lblBill2.setText(bill2);
			lblBill2.setVisible(true);
			lblBill2Debt.setText(billInformation.getDebt(groupTwo, bill2));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill3 = groupInformation.setOtherBills(groupTwo, bill2);
			lblBill3.setText(bill3);
			lblBill3.setVisible(true);
			lblBill3Debt.setText(billInformation.getDebt(groupTwo, bill3));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(bill1.matches("No Bill")) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
			lblBill1Debt.setText("---");
			lblBill2Debt.setText("---");
			lblBill3Debt.setText("---");
		}
		
		if(bill2.matches(bill1)) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
			lblBill2Debt.setText("---");
			lblBill3Debt.setText("---");
		}
		
		if(bill3.matches(bill2)) {
			lblBill3.setVisible(false);
			lblBill3Debt.setText("---");
		}
	}
	
	public void setGroupThreeBills() {
		try {
			bill1 = groupInformation.setFirstBill(groupThree);
			lblBill1.setText(bill1);
			lblBill1Debt.setText(billInformation.getDebt(groupThree, bill1));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill2 = groupInformation.setOtherBills(groupThree, bill1);
			lblBill2.setText(bill2);
			lblBill2.setVisible(true);
			lblBill2Debt.setText(billInformation.getDebt(groupThree, bill2));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill3 = groupInformation.setOtherBills(groupThree, bill2);
			lblBill3.setText(bill3);
			lblBill3.setVisible(true);
			lblBill3Debt.setText(billInformation.getDebt(groupThree, bill3));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(bill1.matches("No Bill")) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
			lblBill1Debt.setText("---");
			lblBill2Debt.setText("---");
			lblBill3Debt.setText("---");
		}
		
		if(bill2.matches(bill1)) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
			lblBill2Debt.setText("---");
			lblBill3Debt.setText("---");
		}
		
		if(bill3.matches(bill2)) {
			lblBill3.setVisible(false);
			lblBill3Debt.setText("---");
		}
	}
	
	
}
