import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.CardLayout;
import java.io.FileNotFoundException;


public class EGR222_Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//************************************************************************************************************************************************
	
   	int panelRevealCount = 0;
   	JPanel splitPaySidePanel = new JPanel();
   	final Button revealPanel = new Button("\u2261");
   	final JPanel sidePanel = new JPanel();
   	JPanel screenControl = new JPanel();
   	
   	//************************************************************************************************************************************************
   	//Initialize JPanels for the application to call	
   	
	private JPanel pnlHomePage = new HomePage();
	private JPanel pnlCreateGroup = new CreateGroup();
	private JPanel pnlViewGroup = new ViewGroup();
	private JPanel pnlPostBill = new PostBill();
	private JPanel pnlPaymentHistory = new PaymentHistory();
	private JPanel pnlPayOtherMembers = new PayOtherMembers();
	private JPanel pnlSettleDebt = new SettleDebt();
	
	
	//************************************************************************************************************************************************
	//Initialize text fields for the side navigation panel
	
	private JTextField toHome = new JTextField();
	private JTextField toCreateGroup = new JTextField();
	private JTextField textField = new JTextField();
	private JTextField toPaymentHistory = new JTextField();
	private JTextField toViewGroup = new JTextField();
	private JTextField toPostBill = new JTextField();
	private JTextField toPayOtherMembers = new JTextField();
	private JTextField logout = new JTextField();
	private JTextField toSettleDebt = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EGR222_Frame frame = new EGR222_Frame();
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
	public EGR222_Frame() {
		
		
				
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 488, 390);
		getContentPane().setLayout(null);
		setResizable(false);
		
		//************************************************************************************************************************************************
		//Create the side navigation panel
		
		sidePanel.setBounds(-120, 0, 120, 361);
		sidePanel.setBackground(Color.WHITE);
		getContentPane().add(sidePanel);
		
		//************************************************************************************************************************************************
		//Create empty text field to push others into viewable range	
		
		textField.setEditable(false);
		sidePanel.add(textField);
		textField.setColumns(10);
		
		//************************************************************************************************************************************************
		//Create text fields for the side navigation panel
		
		toHome.setEditable(false);
		toHome.setBounds(0, 0, 100, 60);
		toHome.setBackground(Color.WHITE);
		toHome.setText("Home Page");
		toHome.setColumns(10);
		toHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sidePanel.setBounds(-100, 0, 100, 361);
      			setHomePage();
      			panelRevealCount++;
			}
		});
		sidePanel.add(toHome);
		
		toCreateGroup.setBounds(0, 60, 100, 60);
      	toCreateGroup.setEditable(false);
      	toCreateGroup.setBackground(Color.WHITE);
      	toCreateGroup.setText("Create Groups");
      	toCreateGroup.setColumns(10);
      	toCreateGroup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sidePanel.setBounds(-100, 0, 100, 361);
      			setCreateGroup();
      			panelRevealCount++;
			}
		});
		sidePanel.add(toCreateGroup);
		
		toViewGroup.setText("View Groups");
		toViewGroup.setBounds(0, 180, 100, 60);
		toViewGroup.setEditable(false);
		toViewGroup.setBackground(Color.WHITE);
		toViewGroup.setColumns(10);
		toViewGroup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sidePanel.setBounds(-100, 0, 100, 361);
      			try {
					setViewGroup();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
      			panelRevealCount++;
			}
		});
		sidePanel.add(toViewGroup);
		
		toSettleDebt.setText("Settle Debt");
		toSettleDebt.setEditable(false);
		toSettleDebt.setBackground(Color.WHITE);
		toSettleDebt.setColumns(10);
		toSettleDebt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sidePanel.setBounds(-100, 0, 100, 361);
      			try {
					setSettleDebt();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
      			panelRevealCount++;
			}
		});
		sidePanel.add(toSettleDebt);
				
		toPostBill.setEditable(false);
		toPostBill.setText("Post a Bill");
		toPostBill.setBackground(Color.WHITE);
		toPostBill.setColumns(10);
		toPostBill.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sidePanel.setBounds(-100, 0, 100, 361);
      			setPostBill();
      			panelRevealCount++;
			}
		});
		sidePanel.add(toPostBill);
		
		
		toPaymentHistory.setText("Payment History");
		toPaymentHistory.setBounds(0, 120, 100, 60);
		toPaymentHistory.setEditable(false);
		toPaymentHistory.setColumns(10);
		toPaymentHistory.setBackground(Color.WHITE);
		toPaymentHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sidePanel.setBounds(-100, 0, 100, 361);
      			setPaymentHistory();
      			panelRevealCount++;
			}
		});
		sidePanel.add(toPaymentHistory);
		
		toPayOtherMembers.setText("Pay Other Members");
		toPayOtherMembers.setBounds(0, 240, 100, 60);
		toPayOtherMembers.setEditable(false);
		toPayOtherMembers.setBackground(Color.WHITE);
		toPayOtherMembers.setColumns(10);
		toPayOtherMembers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sidePanel.setBounds(-100, 0, 100, 361);
      			setPayOtherMembers();
      			panelRevealCount++;
			}
		});
		sidePanel.add(toPayOtherMembers);
				
				
		logout.setBackground(Color.WHITE);
		logout.setEditable(false);
		logout.setText("Logout");
		logout.setColumns(10);
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				logout();
			}
		});
		sidePanel.add(logout);
		
		
		screenControl.setBounds(0, 0, 484, 361);
		getContentPane().add(screenControl);
		screenControl.setLayout(new CardLayout(0, 0));
		screenControl.add(pnlHomePage);
		screenControl.add(pnlCreateGroup);
		screenControl.add(pnlViewGroup);
		screenControl.add(pnlPostBill);
		screenControl.add(pnlSettleDebt);
		screenControl.add(pnlPaymentHistory);
		screenControl.add(pnlPayOtherMembers);
		
		
		
		
		
		//************************************************************************************************************************************************
		
		
	
		
}

    //************************************************************************************************************************************************
	//Function to pull out the side navigation panel from the JPanels	
	
	public boolean revealSidePanel(){
		if(panelRevealCount%2 == 0 || panelRevealCount == 0) {
				setComponentZOrder(sidePanel, 0);
				sidePanel.setBounds(0, 0, 120, 361);
				panelRevealCount++;
				return true;
			}
			else{
				sidePanel.setBounds(-120, 0, 120, 361);
				panelRevealCount++;
				return false;
			}
	}
	
	//************************************************************************************************************************************************
	//Functions to link JPanels to one another from the side navigation panel
	
	@SuppressWarnings("deprecation")
	public void setHomePage() {
		setContentPane(pnlHomePage);
		pnlHomePage.show();
		((HomePage) pnlHomePage).moveButton();
		
	}
	
	@SuppressWarnings("deprecation")
	public void setCreateGroup() {
		setContentPane(pnlCreateGroup);
		pnlCreateGroup.show();
		((CreateGroup) pnlCreateGroup).moveButton();
		
	}
	
	@SuppressWarnings("deprecation")
	public void setViewGroup() throws FileNotFoundException {
		setContentPane(pnlViewGroup);
		pnlViewGroup.show();
		((ViewGroup) pnlViewGroup).setVisibleGroups();
		((ViewGroup) pnlViewGroup).moveButton();
	}
	
	@SuppressWarnings("deprecation")
	public void setSettleDebt() throws FileNotFoundException {
		setContentPane(pnlSettleDebt);
		pnlSettleDebt.show();
		((SettleDebt) pnlSettleDebt).moveButton();
		((SettleDebt) pnlSettleDebt).setVisibleGroups();
	}
	
	@SuppressWarnings("deprecation")
	public void setPostBill() {
		setContentPane(pnlPostBill);
		pnlPostBill.show();
		((PostBill) pnlPostBill).moveButton();
		((PostBill) pnlPostBill).apology();
	}
	
	@SuppressWarnings("deprecation")
	public void setPaymentHistory() {
		setContentPane(pnlPaymentHistory);
		pnlPaymentHistory.show();
		((PaymentHistory) pnlPaymentHistory).moveButton();
	}
	
	@SuppressWarnings("deprecation")
	public void setPayOtherMembers() {
		setContentPane(pnlPayOtherMembers);
		pnlPayOtherMembers.show();
		((PayOtherMembers) pnlPayOtherMembers).moveButton();
	}
	
		
	//************************************************************************************************************************************************
	//Function to logout of the program and return to the Sign In page
	
	public void logout() {
		this.dispose();
		EGR222_StartFrame program = new EGR222_StartFrame();
		program.setVisible(true);
	}
		
}
