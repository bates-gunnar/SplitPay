import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class PaymentHistory extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Button btnRevealSide = new Button("\u2261");
	
	public int panelRevealCount = 0;
	private JTextField paymentHistoryWelcome;
	private JTextField paymentHistoryAmount1;
	private JTextField paymentHistoryPerson1;
	private JTextField paymentHistoryPerson2;
	private JTextField paymentHistoryAmount2;
	private JTextField paymentHistoryPerson3;
	private JTextField paymentHistoryAmount3;
	private JTextField paymentHistoryPerson4;
	private JTextField paymentHistoryAmount4;
	private JTextField paymentHistoryPerson5;
	private JTextField paymentHistoryAmount5;
	private JTextField paymentHistoryPerson6;
	private JTextField paymentHistoryAmount6;
	public PaymentHistory () {
	
	
	setLayout(null);
	btnRevealSide.setBackground(Color.WHITE);
	btnRevealSide.setBounds(0, 65, 20, 22);
	add(btnRevealSide);
			
			paymentHistoryWelcome = new JTextField();
			paymentHistoryWelcome.setText("Payment History");
			paymentHistoryWelcome.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryWelcome.setForeground(Color.WHITE);
			paymentHistoryWelcome.setFont(new Font("Verdana", Font.PLAIN, 24));
			paymentHistoryWelcome.setEditable(false);
			paymentHistoryWelcome.setColumns(10);
			paymentHistoryWelcome.setBorder(null);
			paymentHistoryWelcome.setBackground(Color.BLUE);
			paymentHistoryWelcome.setBounds(0, 0, 484, 50);
			add(paymentHistoryWelcome);
			
			JLabel label = new JLabel("$");
			label.setBounds(105, 93, 20, 14);
			add(label);
			
			paymentHistoryAmount1 = new JTextField();
			paymentHistoryAmount1.setBackground(Color.WHITE);
			paymentHistoryAmount1.setEditable(false);
			paymentHistoryAmount1.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryAmount1.setText("0.00");
			paymentHistoryAmount1.setBounds(128, 90, 86, 20);
			add(paymentHistoryAmount1);
			paymentHistoryAmount1.setColumns(10);
			
			paymentHistoryPerson1 = new JTextField();
			paymentHistoryPerson1.setBackground(Color.WHITE);
			paymentHistoryPerson1.setEditable(false);
			paymentHistoryPerson1.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryPerson1.setText("Zach");
			paymentHistoryPerson1.setColumns(10);
			paymentHistoryPerson1.setBounds(265, 90, 86, 20);
			add(paymentHistoryPerson1);
			
			JLabel lblTo = new JLabel("to");
			lblTo.setBounds(224, 93, 20, 14);
			add(lblTo);
			
			paymentHistoryPerson2 = new JTextField();
			paymentHistoryPerson2.setBackground(Color.WHITE);
			paymentHistoryPerson2.setEditable(false);
			paymentHistoryPerson2.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryPerson2.setText("Colin");
			paymentHistoryPerson2.setColumns(10);
			paymentHistoryPerson2.setBounds(265, 120, 86, 20);
			add(paymentHistoryPerson2);
			
			JLabel label_1 = new JLabel("to");
			label_1.setBounds(224, 123, 20, 14);
			add(label_1);
			
			paymentHistoryAmount2 = new JTextField();
			paymentHistoryAmount2.setBackground(Color.WHITE);
			paymentHistoryAmount2.setEditable(false);
			paymentHistoryAmount2.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryAmount2.setText("0.00");
			paymentHistoryAmount2.setColumns(10);
			paymentHistoryAmount2.setBounds(128, 120, 86, 20);
			add(paymentHistoryAmount2);
			
			JLabel label_2 = new JLabel("$");
			label_2.setBounds(105, 123, 20, 14);
			add(label_2);
			
			paymentHistoryPerson3 = new JTextField();
			paymentHistoryPerson3.setBackground(Color.WHITE);
			paymentHistoryPerson3.setEditable(false);
			paymentHistoryPerson3.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryPerson3.setText("Gunnar");
			paymentHistoryPerson3.setColumns(10);
			paymentHistoryPerson3.setBounds(265, 150, 86, 20);
			add(paymentHistoryPerson3);
			
			JLabel label_3 = new JLabel("to");
			label_3.setBounds(224, 153, 20, 14);
			add(label_3);
			
			paymentHistoryAmount3 = new JTextField();
			paymentHistoryAmount3.setBackground(Color.WHITE);
			paymentHistoryAmount3.setEditable(false);
			paymentHistoryAmount3.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryAmount3.setText("0.00");
			paymentHistoryAmount3.setColumns(10);
			paymentHistoryAmount3.setBounds(128, 150, 86, 20);
			add(paymentHistoryAmount3);
			
			JLabel label_4 = new JLabel("$");
			label_4.setBounds(105, 153, 20, 14);
			add(label_4);
			
			paymentHistoryPerson4 = new JTextField();
			paymentHistoryPerson4.setBackground(Color.WHITE);
			paymentHistoryPerson4.setEditable(false);
			paymentHistoryPerson4.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryPerson4.setText("Colin");
			paymentHistoryPerson4.setColumns(10);
			paymentHistoryPerson4.setBounds(265, 180, 86, 20);
			add(paymentHistoryPerson4);
			
			JLabel label_5 = new JLabel("to");
			label_5.setBounds(224, 183, 20, 14);
			add(label_5);
			
			paymentHistoryAmount4 = new JTextField();
			paymentHistoryAmount4.setBackground(Color.WHITE);
			paymentHistoryAmount4.setEditable(false);
			paymentHistoryAmount4.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryAmount4.setText("0.00");
			paymentHistoryAmount4.setColumns(10);
			paymentHistoryAmount4.setBounds(128, 180, 86, 20);
			add(paymentHistoryAmount4);
			
			JLabel label_6 = new JLabel("$");
			label_6.setBounds(105, 183, 20, 14);
			add(label_6);
			
			paymentHistoryPerson5 = new JTextField();
			paymentHistoryPerson5.setBackground(Color.WHITE);
			paymentHistoryPerson5.setEditable(false);
			paymentHistoryPerson5.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryPerson5.setText("Zach");
			paymentHistoryPerson5.setColumns(10);
			paymentHistoryPerson5.setBounds(265, 210, 86, 20);
			add(paymentHistoryPerson5);
			
			JLabel label_7 = new JLabel("to");
			label_7.setBounds(224, 213, 20, 14);
			add(label_7);
			
			paymentHistoryAmount5 = new JTextField();
			paymentHistoryAmount5.setBackground(Color.WHITE);
			paymentHistoryAmount5.setEditable(false);
			paymentHistoryAmount5.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryAmount5.setText("0.00");
			paymentHistoryAmount5.setColumns(10);
			paymentHistoryAmount5.setBounds(128, 210, 86, 20);
			add(paymentHistoryAmount5);
			
			JLabel label_8 = new JLabel("$");
			label_8.setBounds(105, 213, 20, 14);
			add(label_8);
			
			paymentHistoryPerson6 = new JTextField();
			paymentHistoryPerson6.setBackground(Color.WHITE);
			paymentHistoryPerson6.setEditable(false);
			paymentHistoryPerson6.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryPerson6.setText("Colin");
			paymentHistoryPerson6.setColumns(10);
			paymentHistoryPerson6.setBounds(265, 240, 86, 20);
			add(paymentHistoryPerson6);
			
			JLabel label_9 = new JLabel("to");
			label_9.setBounds(224, 243, 20, 14);
			add(label_9);
			
			paymentHistoryAmount6 = new JTextField();
			paymentHistoryAmount6.setBackground(Color.WHITE);
			paymentHistoryAmount6.setEditable(false);
			paymentHistoryAmount6.setHorizontalAlignment(SwingConstants.CENTER);
			paymentHistoryAmount6.setText("0.00");
			paymentHistoryAmount6.setColumns(10);
			paymentHistoryAmount6.setBounds(128, 240, 86, 20);
			add(paymentHistoryAmount6);
			
			JLabel label_10 = new JLabel("$");
			label_10.setBounds(105, 243, 20, 14);
			add(label_10);
			
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
			
	}
	
	public void moveButton(){
		btnRevealSide.setBounds(0, 50, 20, 22);
	}
	
}


