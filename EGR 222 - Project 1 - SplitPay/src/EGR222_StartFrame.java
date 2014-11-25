import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class EGR222_StartFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	private JPanel pnlSignIn = new SignIn();
	private JPanel pnlCreateAccount = new CreateAccount();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EGR222_StartFrame frame = new EGR222_StartFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EGR222_StartFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 488, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(pnlSignIn);
	}
	
	public void goToProgram(){
		this.dispose();
		EGR222_Frame program = new EGR222_Frame();
		program.setVisible(true);
	}

	@SuppressWarnings("deprecation")
	public void setCreateAccount() {
		pnlSignIn.hide();
		setContentPane(pnlCreateAccount);
		pnlCreateAccount.show();
			
	}
	
	
}
