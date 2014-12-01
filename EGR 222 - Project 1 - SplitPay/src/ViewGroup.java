import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import javax.swing.JButton;


public class ViewGroup extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel ViewGroups;

	/**
	 * Create the panel.
	 */
	
	Button btnRevealSide = new Button("\u2261");
	ViewGroupLogic information = new ViewGroupLogic();
	private String groupOne;
	private String groupTwo;
	private String groupThree;
	private JLabel viewGroupsName1;
	private JLabel viewGroupsName2;
	private JLabel viewGroupsName3;
	private String member1 = "";
	private String member2 = "";
	private String member3 = "";
	private String member4 = "";
	private String member5 = "";
	private String member6 = "";
	private String bill1 = "";
	private String bill2 = "";
	private String bill3 = "";
	private JLabel lblMember1 = new JLabel("No Member");
	private JLabel lblMember2 = new JLabel("No Member");
	private JLabel lblMember3 = new JLabel("No Member");
	private JLabel lblMember4 = new JLabel("No Member");
	private JLabel lblMember5 = new JLabel("No Member");
	private JLabel lblMember6 = new JLabel("No Member");
	private JLabel lblBill1 = new JLabel("No Bill");
	private JLabel lblBill2 = new JLabel("No Bill");
	private JLabel lblBill3 = new JLabel("No Bill");
	
	public ViewGroup() {
		setLayout(null);
		
		viewGroupsName1 = new JLabel();
		viewGroupsName2 = new JLabel();
		viewGroupsName3 = new JLabel();
		
		try {
			setVisibleGroups();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ViewGroups = new JLabel();
		ViewGroups.setFont(new Font("Verdana", Font.BOLD, 14));
		ViewGroups.setText("My Groups");
		ViewGroups.setHorizontalAlignment(SwingConstants.CENTER);
		ViewGroups.setBounds(10, 93, 99, 24);
		add(ViewGroups);
		
		lblMember1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMember1.setBounds(164, 100, 98, 14);
		add(lblMember1);
		
		lblMember2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMember2.setBounds(164, 127, 98, 14);
		lblMember2.setVisible(false);
		add(lblMember2);
		
		lblMember3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMember3.setBounds(164, 154, 98, 14);
		lblMember3.setVisible(false);
		add(lblMember3);
		
		lblMember4.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMember4.setBounds(164, 181, 98, 14);
		lblMember4.setVisible(false);
		add(lblMember4);
		
		lblMember5.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMember5.setBounds(164, 208, 98, 14);
		lblMember5.setVisible(false);
		add(lblMember5);
		
		lblMember6.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblMember6.setBounds(164, 235, 98, 14);
		lblMember6.setVisible(false);
		add(lblMember6);
		
		lblBill1.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblBill1.setBounds(336, 99, 86, 14);
		add(lblBill1);
		
		viewGroupsName1.setFont(new Font("Verdana", Font.PLAIN, 13));
		viewGroupsName1.setForeground(Color.BLUE);
		viewGroupsName1.setBackground(Color.WHITE);
		viewGroupsName1.setHorizontalAlignment(SwingConstants.CENTER);
		viewGroupsName1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setGroupOneMembers();
				setGroupOneBills();
				viewGroupsName1.setForeground(Color.RED);
				viewGroupsName2.setForeground(Color.BLUE);
				viewGroupsName3.setForeground(Color.BLUE);
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				viewGroupsName1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		viewGroupsName1.setBounds(10, 117, 99, 33);
		add(viewGroupsName1);
		
		
		viewGroupsName2.setFont(new Font("Verdana", Font.PLAIN, 13));
		viewGroupsName2.setForeground(Color.BLUE);
		viewGroupsName2.setHorizontalAlignment(SwingConstants.CENTER);
		viewGroupsName2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent f) {
				setGroupTwoMembers();
				setGroupTwoBills();
				viewGroupsName1.setForeground(Color.BLUE);
				viewGroupsName2.setForeground(Color.RED);
				viewGroupsName3.setForeground(Color.BLUE);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				viewGroupsName2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		viewGroupsName2.setBounds(10, 161, 99, 39);
		add(viewGroupsName2);
		
		
		viewGroupsName3.setFont(new Font("Verdana", Font.PLAIN, 13));
		viewGroupsName3.setForeground(Color.BLUE);
		viewGroupsName3.setHorizontalAlignment(SwingConstants.CENTER);
		viewGroupsName3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent g) {
				setGroupThreeMembers();
				setGroupThreeBills();
				viewGroupsName1.setForeground(Color.BLUE);
				viewGroupsName2.setForeground(Color.BLUE);
				viewGroupsName3.setForeground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				viewGroupsName3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		viewGroupsName3.setBounds(10, 210, 99, 33);
		add(viewGroupsName3);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 485, 50);
		add(panel);
		
		JTextPane txtpnViewGroups = new JTextPane();
		txtpnViewGroups.setEditable(false);
		txtpnViewGroups.setBackground(Color.BLUE);
		txtpnViewGroups.setForeground(Color.WHITE);
		txtpnViewGroups.setFont(new Font("Verdana", Font.PLAIN, 29));
		txtpnViewGroups.setText("View Groups");
		panel.add(txtpnViewGroups);

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
		btnRevealSide.setBounds(0, 50, 20, 20);
		btnRevealSide.setBackground(Color.WHITE);
		add(btnRevealSide);
		
		final JButton btnRefreshGroups = new JButton("Refresh Groups");
		btnRefreshGroups.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					setVisibleGroups();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRefreshGroups.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnRefreshGroups.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnRefreshGroups.setBounds(168, 264, 148, 23);
		add(btnRefreshGroups);
		
		JLabel lblifANew = new JLabel("*If a NEW GROUP does not appear, please refresh");
		lblifANew.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		lblifANew.setBounds(76, 336, 332, 14);
		add(lblifANew);
		
		JLabel lblGroupMembers = new JLabel("Group Members");
		lblGroupMembers.setFont(new Font("Verdana", Font.BOLD, 14));
		lblGroupMembers.setBounds(139, 76, 123, 19);
		add(lblGroupMembers);
		
		JLabel lblOutstandingBills = new JLabel("Outstanding Bills");
		lblOutstandingBills.setFont(new Font("Verdana", Font.BOLD, 14));
		lblOutstandingBills.setBounds(296, 73, 137, 24);
		add(lblOutstandingBills);
		
		JLabel lblifNewGroup = new JLabel("*If new GROUP INFO does not appear, please re-select GROUP");
		lblifNewGroup.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 11));
		lblifNewGroup.setBounds(41, 309, 402, 14);
		add(lblifNewGroup);
		
		lblBill2.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblBill2.setBounds(336, 127, 86, 14);
		add(lblBill2);
		
		lblBill3.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblBill3.setBounds(336, 154, 86, 14);
		add(lblBill3);
		
		
	}
	
	public void moveButton(){
		btnRevealSide.setBounds(0, 50, 20, 22);
	}
	
	public void setVisibleGroups() throws FileNotFoundException {
		groupOne = information.showGroup1();
		groupTwo = information.showGroup2();
		groupThree = information.showGroup3();
		
		viewGroupsName1.setText(groupOne);
		viewGroupsName2.setText(groupTwo);
		viewGroupsName3.setText(groupThree);
	}
	
	public void setGroupOneMembers() {
		String groupSeparation = "---";
		
		try {
			member1 = information.setMember1(groupOne, member1);
			lblMember1.setText(member1);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member2 = information.setMember(groupOne, member1, member2);
			if(!member2.matches(groupSeparation)) {
				lblMember2.setText(member2);
				lblMember2.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member3 = information.setMember(groupOne, member2, member3);
			if((!member2.matches(groupSeparation)) & (!member3.matches(groupSeparation))) {
				lblMember3.setText(member3);
				lblMember3.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member4 = information.setMember(groupOne, member3, member4);
			if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation)) {
				lblMember4.setText(member4);
				lblMember4.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member5 = information.setMember(groupOne, member4, member5);
			if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
			   !member5.matches(groupSeparation)) {
				lblMember5.setText(member5);
				lblMember5.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member6 = information.setMember(groupOne, member5, member6);
			if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
			   !member5.matches(groupSeparation) & !member6.matches(groupSeparation)) {
				lblMember6.setText(member6);
				lblMember6.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(member2.matches(groupSeparation)) {
			lblMember2.setVisible(false);
			lblMember3.setVisible(false);
			lblMember4.setVisible(false);
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & member3.matches(groupSeparation)) {
			lblMember3.setVisible(false);
			lblMember4.setVisible(false);
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & member4.matches(groupSeparation)) {
			lblMember4.setVisible(false);
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
		   member5.matches(groupSeparation)) {
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
		   !member5.matches(groupSeparation) & member6.matches(groupSeparation)) {
			lblMember6.setVisible(false);
		}
	}
	
	public void setGroupTwoMembers() {
		String groupSeparation = "---";
		
		try {
			member1 = information.setMember1(groupTwo, member1);
			lblMember1.setText(member1);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member2 = information.setMember(groupTwo, member1, member2);
			if(!member2.matches(groupSeparation)) {
				lblMember2.setText(member2);
				lblMember2.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member3 = information.setMember(groupTwo, member2, member3);
			if((!member2.matches(groupSeparation)) & (!member3.matches(groupSeparation))) {
				lblMember3.setText(member3);
				lblMember3.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member4 = information.setMember(groupTwo, member3, member4);
			if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation)) {
				lblMember4.setText(member4);
				lblMember4.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member5 = information.setMember(groupTwo, member4, member5);
			if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
			   !member5.matches(groupSeparation)) {
				lblMember5.setText(member5);
				lblMember5.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member6 = information.setMember(groupTwo, member5, member6);
			if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
			   !member5.matches(groupSeparation) & !member6.matches(groupSeparation)) {
				lblMember6.setText(member6);
				lblMember6.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(member2.matches(groupSeparation)) {
			lblMember2.setVisible(false);
			lblMember3.setVisible(false);
			lblMember4.setVisible(false);
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & member3.matches(groupSeparation)) {
			lblMember3.setVisible(false);
			lblMember4.setVisible(false);
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & member4.matches(groupSeparation)) {
			lblMember4.setVisible(false);
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
		   member5.matches(groupSeparation)) {
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
		   !member5.matches(groupSeparation) & member6.matches(groupSeparation)) {
			lblMember6.setVisible(false);
		}
	}
	
	public void setGroupThreeMembers() {
		String groupSeparation = "---";
		
		try {
			member1 = information.setMember1(groupThree, member1);
			lblMember1.setText(member1);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member2 = information.setMember(groupThree, member1, member2);
			if(!member2.matches(groupSeparation)) {
				lblMember2.setText(member2);
				lblMember2.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member3 = information.setMember(groupThree, member2, member3);
			if((!member2.matches(groupSeparation)) & (!member3.matches(groupSeparation))) {
				lblMember3.setText(member3);
				lblMember3.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member4 = information.setMember(groupThree, member3, member4);
			if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation)) {
				lblMember4.setText(member4);
				lblMember4.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member5 = information.setMember(groupThree, member4, member5);
			if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
			   !member5.matches(groupSeparation)) {
				lblMember5.setText(member5);
				lblMember5.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			member6 = information.setMember(groupThree, member5, member6);
			if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
			   !member5.matches(groupSeparation) & !member6.matches(groupSeparation)) {
				lblMember6.setText(member6);
				lblMember6.setVisible(true);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(member2.matches(groupSeparation)) {
			lblMember2.setVisible(false);
			lblMember3.setVisible(false);
			lblMember4.setVisible(false);
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & member3.matches(groupSeparation)) {
			lblMember3.setVisible(false);
			lblMember4.setVisible(false);
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & member4.matches(groupSeparation)) {
			lblMember4.setVisible(false);
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
		   member5.matches(groupSeparation)) {
			lblMember5.setVisible(false);
			lblMember6.setVisible(false);
		}
		
		if(!member2.matches(groupSeparation) & !member3.matches(groupSeparation) & !member4.matches(groupSeparation) & 
		   !member5.matches(groupSeparation) & member6.matches(groupSeparation)) {
			lblMember6.setVisible(false);
		}
	}
	
	public void setGroupOneBills() {
		try {
			bill1 = information.setFirstBill(groupOne);
			lblBill1.setText(bill1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill2 = information.setOtherBills(groupOne, bill1);
			lblBill2.setText(bill2);
			lblBill2.setVisible(true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill3 = information.setOtherBills(groupOne, bill2);
			lblBill3.setText(bill3);
			lblBill3.setVisible(true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(bill1.matches("No Bill")) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
		}
		
		if(bill2.matches(bill1)) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
		}
		
		if(bill3.matches(bill2)) {
			lblBill3.setVisible(false);
		}
	}
	
	public void setGroupTwoBills() {
		try {
			bill1 = information.setFirstBill(groupTwo);
			lblBill1.setText(bill1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill2 = information.setOtherBills(groupTwo, bill1);
			lblBill2.setText(bill2);
			lblBill2.setVisible(true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill3 = information.setOtherBills(groupTwo, bill2);
			lblBill3.setText(bill3);
			lblBill3.setVisible(true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(bill1.matches("No Bill")) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
		}
		
		if(bill2.matches(bill1)) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
		}
		
		if(bill3.matches(bill2)) {
			lblBill3.setVisible(false);
		}
	}
	
	public void setGroupThreeBills() {
		try {
			bill1 = information.setFirstBill(groupThree);
			lblBill1.setText(bill1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill2 = information.setOtherBills(groupThree, bill1);
			lblBill2.setText(bill2);
			lblBill2.setVisible(true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			bill3 = information.setOtherBills(groupThree, bill2);
			lblBill3.setText(bill3);
			lblBill3.setVisible(true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(bill1.matches("No Bill")) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
		}
		
		if(bill2.matches(bill1)) {
			lblBill2.setVisible(false);
			lblBill3.setVisible(false);
		}
		
		if(bill3.matches(bill2)) {
			lblBill3.setVisible(false);
		}
	}
}
