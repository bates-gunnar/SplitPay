import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import javax.swing.JPasswordField;


public class CreateAccount extends JPanel {
	/**
	 * 
	 */
	
	//************************************************************************************************************************************************
   	//Create text fields to enter new account information
	
	private static final long serialVersionUID = 1L;
	private JTextField createUsername;
	private JPasswordField createPassword;
	private JPasswordField confirmPassword;
	CreateAccountLogic information = new CreateAccountLogic();

	/**
	 * Create the panel.
	 */
	public CreateAccount() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 204));
		panel.setBounds(0, 0, 484, 50);
		add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 204));
		panel_1.setBounds(0, 311, 484, 50);
		add(panel_1);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setBounds(255, 93, 75, 14);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(255, 135, 75, 14);
		add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConfirmPassword.setBounds(217, 178, 113, 14);
		add(lblConfirmPassword);
		
		//************************************************************************************************************************************************
	   	//Initialize new account text fields
		
		createUsername = new JTextField();
		createUsername.setFont(new Font("Verdana", Font.PLAIN, 11));
		createUsername.setBounds(340, 93, 109, 20);
		add(createUsername);
		createUsername.setColumns(10);
		
		createPassword = new JPasswordField();
		createPassword.setFont(new Font("Verdana", Font.PLAIN, 11));
		createPassword.setColumns(10);
		createPassword.setBounds(340, 135, 109, 20);
		add(createPassword);
		
		confirmPassword = new JPasswordField();
		confirmPassword.setFont(new Font("Verdana", Font.PLAIN, 11));
		confirmPassword.setColumns(10);
		confirmPassword.setBounds(340, 178, 109, 20);
		add(confirmPassword);
		
		//************************************************************************************************************************************************
	   	//Button to create account. Calls function from class CreateAccountLogic, then another function from EGR222_StartFrame
		final JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnCreateAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String user = createUsername.getText();
				String password = createPassword.getText();
				String confirm = confirmPassword.getText();
				try {
					if(information.ifEmptyFields(user, password, confirm) == true){
						information.writeCurrentUser();
						EGR222_StartFrame father = (EGR222_StartFrame) getTopLevelAncestor();
						father.goToProgram();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "An error has occurred. Please try again.");
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnCreateAccount.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnCreateAccount.setBounds(278, 228, 143, 23);
		add(btnCreateAccount);
		
		JTextArea txtrWelcomeToSplitpay = new JTextArea();
		txtrWelcomeToSplitpay.setEditable(false);
		txtrWelcomeToSplitpay.setFont(new Font("Sakkal Majalla", Font.PLAIN, 19));
		txtrWelcomeToSplitpay.setBackground(UIManager.getColor("Button.background"));
		txtrWelcomeToSplitpay.setText("Create your new account\r\non the right, and begin\r\nmanaging your group\r\ndebts today!");
		txtrWelcomeToSplitpay.setBounds(37, 118, 152, 112);
		add(txtrWelcomeToSplitpay);
		
		JLabel lblWelcomeToSplitpay = new JLabel("Welcome to SplitPay!");
		lblWelcomeToSplitpay.setFont(new Font("Sakkal Majalla", Font.PLAIN, 25));
		lblWelcomeToSplitpay.setBounds(37, 90, 165, 17);
		add(lblWelcomeToSplitpay);

	}
}
