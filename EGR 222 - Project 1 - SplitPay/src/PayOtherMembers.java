import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PayOtherMembers extends JPanel {
	private JTextField amountTotal;
	private JTextField amountOne;
	private JTextField amountTwo;
	private JTextField amountThree;
	private JTextField amountFour;
	private JTextField amountFive;
	private JTextField amountSix;
	private JTextField personOne;
	private JTextField personTwo;
	private JTextField personThree;
	private JTextField personFour;
	private JTextField personFive;
	private JTextField personSix;

	/**
	 * Create the panel.
	 */
	
	Button btnRevealSide = new Button("\u2261");
	
	public PayOtherMembers() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 484, 50);
		add(panel);
		
		JLabel lblPayOtherMembers = new JLabel("Pay Other Members");
		panel.add(lblPayOtherMembers);
		lblPayOtherMembers.setForeground(Color.WHITE);
		lblPayOtherMembers.setFont(new Font("Verdana", Font.PLAIN, 29));
		
		amountTotal = new JTextField();
		amountTotal.setEditable(false);
		amountTotal.setText("0.00");
		amountTotal.setFont(new Font("Verdana", Font.PLAIN, 13));
		amountTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		amountTotal.setBounds(190, 87, 116, 20);
		add(amountTotal);
		amountTotal.setColumns(10);
		
		amountOne = new JTextField();
		amountOne.setEditable(false);
		amountOne.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				amountOne.setText("");
				amountOne.setForeground(Color.BLACK);
			}
		});
		amountOne.setText("Amount");
		amountOne.setForeground(Color.LIGHT_GRAY);
		amountOne.setFont(new Font("Verdana", Font.PLAIN, 13));
		amountOne.setColumns(10);
		amountOne.setBounds(62, 129, 116, 20);
		add(amountOne);
		
		amountTwo = new JTextField();
		amountTwo.setEditable(false);
		amountTwo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent f) {
				amountTwo.setText("");
				amountTwo.setForeground(Color.BLACK);
			}
		});
		amountTwo.setForeground(Color.LIGHT_GRAY);
		amountTwo.setFont(new Font("Verdana", Font.PLAIN, 13));
		amountTwo.setText("Amount");
		amountTwo.setColumns(10);
		amountTwo.setBounds(62, 161, 116, 20);
		add(amountTwo);
		
		amountThree = new JTextField();
		amountThree.setEditable(false);
		amountThree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent g) {
				amountThree.setText("");
				amountThree.setForeground(Color.BLACK);
			}
		});
		amountThree.setForeground(Color.LIGHT_GRAY);
		amountThree.setFont(new Font("Verdana", Font.PLAIN, 13));
		amountThree.setText("Amount");
		amountThree.setColumns(10);
		amountThree.setBounds(62, 193, 116, 20);
		add(amountThree);
		
		amountFour = new JTextField();
		amountFour.setEditable(false);
		amountFour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent h) {
				amountFour.setText("");
				amountFour.setForeground(Color.BLACK);
			}
		});
		amountFour.setForeground(Color.LIGHT_GRAY);
		amountFour.setFont(new Font("Verdana", Font.PLAIN, 13));
		amountFour.setText("Amount");
		amountFour.setColumns(10);
		amountFour.setBounds(62, 225, 116, 20);
		add(amountFour);
		
		amountFive = new JTextField();
		amountFive.setEditable(false);
		amountFive.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent i) {
				amountFive.setText("");
				amountFive.setForeground(Color.BLACK);
			}
		});
		amountFive.setForeground(Color.LIGHT_GRAY);
		amountFive.setFont(new Font("Verdana", Font.PLAIN, 13));
		amountFive.setText("Amount");
		amountFive.setColumns(10);
		amountFive.setBounds(62, 257, 116, 20);
		add(amountFive);
		
		amountSix = new JTextField();
		amountSix.setEditable(false);
		amountSix.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent j) {
				amountSix.setText("");
				amountSix.setForeground(Color.BLACK);
			}
		});
		amountSix.setForeground(Color.LIGHT_GRAY);
		amountSix.setFont(new Font("Verdana", Font.PLAIN, 13));
		amountSix.setText("Amount");
		amountSix.setColumns(10);
		amountSix.setBounds(62, 289, 116, 20);
		add(amountSix);
		
		JLabel label_1 = new JLabel("$");
		label_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_1.setBounds(42, 131, 8, 16);
		add(label_1);
		
		JButton payPersonOne = new JButton("Pay");
		payPersonOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		payPersonOne.setBounds(365, 129, 80, 24);
		add(payPersonOne);
		
		JButton payPersonTwo = new JButton("Pay");
		payPersonTwo.setBounds(365, 161, 80, 24);
		add(payPersonTwo);
		
		JButton payPersonThree = new JButton("Pay");
		payPersonThree.setBounds(365, 193, 80, 24);
		add(payPersonThree);
		
		JButton payPersonFour = new JButton("Pay");
		payPersonFour.setBounds(365, 225, 80, 24);
		add(payPersonFour);
		
		JButton payPersonFive = new JButton("Pay");
		payPersonFive.setBounds(365, 257, 80, 24);
		add(payPersonFive);
		
		JButton payPersonSix = new JButton("Pay");
		payPersonSix.setBounds(365, 289, 80, 24);
		add(payPersonSix);
		
		personOne = new JTextField();
		personOne.setEditable(false);
		personOne.setText("Person You Owe");
		personOne.setFont(new Font("Verdana", Font.PLAIN, 13));
		personOne.setForeground(Color.LIGHT_GRAY);
		personOne.setColumns(10);
		personOne.setBounds(200, 129, 134, 20);
		add(personOne);
		
		personTwo = new JTextField();
		personTwo.setEditable(false);
		personTwo.setForeground(Color.LIGHT_GRAY);
		personTwo.setFont(new Font("Verdana", Font.PLAIN, 13));
		personTwo.setText("Person You Owe");
		personTwo.setColumns(10);
		personTwo.setBounds(200, 161, 134, 20);
		add(personTwo);
		
		personThree = new JTextField();
		personThree.setEditable(false);
		personThree.setForeground(Color.LIGHT_GRAY);
		personThree.setFont(new Font("Verdana", Font.PLAIN, 13));
		personThree.setText("Person You Owe");
		personThree.setColumns(10);
		personThree.setBounds(200, 193, 134, 20);
		add(personThree);
		
		personFour = new JTextField();
		personFour.setEditable(false);
		personFour.setForeground(Color.LIGHT_GRAY);
		personFour.setFont(new Font("Verdana", Font.PLAIN, 13));
		personFour.setText("Person You Owe");
		personFour.setColumns(10);
		personFour.setBounds(200, 225, 134, 20);
		add(personFour);
		
		personFive = new JTextField();
		personFive.setEditable(false);
		personFive.setForeground(Color.LIGHT_GRAY);
		personFive.setFont(new Font("Verdana", Font.PLAIN, 13));
		personFive.setText("Person You Owe");
		personFive.setColumns(10);
		personFive.setBounds(200, 257, 134, 20);
		add(personFive);
		
		personSix = new JTextField();
		personSix.setEditable(false);
		personSix.setForeground(Color.LIGHT_GRAY);
		personSix.setFont(new Font("Verdana", Font.PLAIN, 13));
		personSix.setText("Person You Owe");
		personSix.setColumns(10);
		personSix.setBounds(200, 289, 134, 20);
		add(personSix);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Verdana", Font.PLAIN, 13));
		label.setBounds(170, 89, 8, 16);
		add(label);
		
		JLabel label_2 = new JLabel("$");
		label_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_2.setBounds(42, 163, 8, 16);
		add(label_2);
		
		JLabel label_3 = new JLabel("$");
		label_3.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_3.setBounds(42, 195, 8, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel("$");
		label_4.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_4.setBounds(42, 227, 8, 16);
		add(label_4);
		
		JLabel label_5 = new JLabel("$");
		label_5.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_5.setBounds(42, 259, 8, 16);
		add(label_5);
		
		JLabel label_6 = new JLabel("$");
		label_6.setFont(new Font("Verdana", Font.PLAIN, 13));
		label_6.setBounds(42, 291, 8, 16);
		add(label_6);
		
		JLabel lblTotalDebt = new JLabel("Total Debt");
		lblTotalDebt.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblTotalDebt.setBounds(205, 59, 80, 16);
		add(lblTotalDebt);
		
		JButton btnHistory = new JButton("History");
		btnHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent j) {
				EGR222_Frame father = (EGR222_Frame) getTopLevelAncestor();
				//father.setHistoryPane();
			}
		});
		btnHistory.setBounds(361, 325, 90, 29);
		add(btnHistory);

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
	}
	
	//************************************************************************************************************************************************
   	//Function to move the navigation reveal button move back to its original position upon returning to a panel
	public void moveButton(){
		btnRevealSide.setBounds(0, 50, 20, 22);
		
	}
}
