import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Cursor;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import javax.swing.JPasswordField;


public class SignIn extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	SignInLogic information = new SignInLogic();
		
	/**
	 * Create the panel.
	 */
	public SignIn() {
		
		setLayout(null);
		
		JLabel lblLogin = new JLabel("Sign In");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblLogin.setBounds(201, 75, 81, 29);
		add(lblLogin);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtUsername.setBounds(217, 116, 130, 20);
		add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtPassword.setBounds(217, 147, 130, 20);
		add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblUsername.setBounds(112, 115, 95, 17);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Verdana", Font.PLAIN, 14));
		lblPassword.setBounds(112, 147, 95, 14);
		add(lblPassword);
		
		JLabel lblNoAccount = new JLabel("No Account?");
		lblNoAccount.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNoAccount.setBounds(134, 234, 70, 14);
		add(lblNoAccount);

		final JLabel lblCreateAnAccount = new JLabel("Create an Account Here");
		lblCreateAnAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				EGR222_StartFrame father = (EGR222_StartFrame) getTopLevelAncestor();
				father.setCreateAccount();
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblCreateAnAccount.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		lblCreateAnAccount.setForeground(Color.BLUE);
		lblCreateAnAccount.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblCreateAnAccount.setBounds(212, 234, 145, 14);
		add(lblCreateAnAccount);
		
		final JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String user = txtUsername.getText();
			    String password = txtPassword.getText();
			    try {
					if(information.ifEmptyFields(user, password) == true){
						information.writeCurrentUser();
						EGR222_StartFrame father = (EGR222_StartFrame) getTopLevelAncestor();
						father.goToProgram();	
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Username and/or Password is incorrect. Please re-enter.");
				}
			    
			    
			    
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnSignIn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnSignIn.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnSignIn.setBounds(201, 188, 89, 23);
		add(btnSignIn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 204));
		panel_1.setBounds(0, 314, 484, 50);
		add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 204));
		panel.setBounds(0, 0, 484, 50);
		add(panel);

	}
	
	
}
