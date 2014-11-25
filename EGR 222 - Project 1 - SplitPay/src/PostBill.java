import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class PostBill extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private JTextField textField;
	private JTextField debtMember1;
	private JTextField groupMember2;
	private JTextField groupMember3;
	private JTextField groupMember4;
	private JTextField groupMember5;
	private JTextField groupMember6;
	private String group ="";
	Button btnRevealSide = new Button("\u2261");
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	
	public PostBill() {
		setLayout(null);
		
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
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField.setBounds(192, 84, 116, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblAmountToBe = new JLabel("Amount to be Split");
		lblAmountToBe.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblAmountToBe.setBounds(318, 87, 124, 15);
		add(lblAmountToBe);
		
		
		
		JLabel lblGroupName = new JLabel("Group Name:");
		lblGroupName.setFont(new Font("Verdana", Font.BOLD, 13));
		lblGroupName.setBounds(20, 97, 116, 21);
		add(lblGroupName);
		
		final JLabel lblDollar1 = new JLabel("$");
		lblDollar1.setEnabled(false);
		lblDollar1.setFont(new Font("Verdana", Font.PLAIN, 16));
		lblDollar1.setBounds(174, 115, 10, 21);
		add(lblDollar1);
		
		
		debtMember1 = new JTextField();
		debtMember1.setEnabled(false);
		debtMember1.setFont(new Font("Verdana", Font.PLAIN, 13));
		debtMember1.setColumns(10);
		debtMember1.setBounds(192, 116, 116, 20);
		add(debtMember1);
		
		JLabel lblMember1 = new JLabel("Member 1");
		lblMember1.setEnabled(false);
		lblMember1.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember1.setBounds(318, 119, 150, 15);
		add(lblMember1);
		
		JLabel lblDollar2 = new JLabel("$");
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
		
		JLabel lblMember2 = new JLabel("Member 2");
		lblMember2.setEnabled(false);
		lblMember2.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember2.setBounds(318, 149, 150, 15);
		add(lblMember2);
		
		JLabel lblDollar3 = new JLabel("$");
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
		
		JLabel lblMember3 = new JLabel("Member 3");
		lblMember3.setEnabled(false);
		lblMember3.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember3.setBounds(318, 179, 150, 15);
		add(lblMember3);
		
		JLabel lblDollar4 = new JLabel("$");
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
		
		JLabel lblMember4 = new JLabel("Member 4");
		lblMember4.setEnabled(false);
		lblMember4.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember4.setBounds(318, 211, 150, 15);
		add(lblMember4);
		
		JLabel lblDollar5 = new JLabel("$");
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
		
		JLabel lblMember5 = new JLabel("Member 5");
		lblMember5.setEnabled(false);
		lblMember5.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember5.setBounds(318, 243, 150, 15);
		add(lblMember5);
		
		JLabel lblDollar6 = new JLabel("$");
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
		
		JLabel lblMember6 = new JLabel("Member 6");
		lblMember6.setEnabled(false);
		lblMember6.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblMember6.setBounds(318, 275, 150, 15);
		add(lblMember6);
		
		JButton btnPostBill = new JButton("Post Bill");
		btnPostBill.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnPostBill.setBounds(197, 313, 89, 23);
		add(btnPostBill);
		
		
		final JComboBox<Object> comboGroupName = new JComboBox<Object>();
		comboGroupName.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				group = (String) comboGroupName.getSelectedItem();
				if(!group.matches("Select Group...")){
					lblDollar1.setEnabled(true);
				}
				System.out.print(group);
				
			}
		});
		
		
		comboGroupName.setFont(new Font("Verdana", Font.PLAIN, 12));
		comboGroupName.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select Group...", "asdf"}));
		comboGroupName.setBounds(20, 129, 134, 20);
		add(comboGroupName);
		
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
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(20, 208, 116, 20);
		add(textField_1);
	}
	
	public void moveButton(){
		btnRevealSide.setBounds(0, 50, 20, 22);
	}
}
