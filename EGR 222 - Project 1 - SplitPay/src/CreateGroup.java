import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.awt.Button;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

import javax.swing.JButton;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.SystemColor;


public class CreateGroup extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel CreateGroupCurrent;
	private JLabel CreateGroupNewHeader;
	private JTextField CreateGroupName;
	private JTextField CreateGroupMember1;
	private JTextField CreateGroupMember2;
	private JTextField CreateGroupMember3;
	private JTextField CreateGroupMember4;
	private JTextField CreateGroupMember5;
	private JTextField CreateGroupMember6;
	Button btnRevealSide = new Button("\u2261");
	CreateGroupLogic information = new CreateGroupLogic();
	
	/**
	 * Create the panel.
	 */
	public CreateGroup() {
		setLayout(null);
		
		CreateGroupCurrent = new JLabel();
		CreateGroupCurrent.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		CreateGroupCurrent.setHorizontalAlignment(SwingConstants.CENTER);
		CreateGroupCurrent.setText("**Limitations");
		CreateGroupCurrent.setBounds(342, 106, 122, 24);
		add(CreateGroupCurrent);
		
		CreateGroupNewHeader = new JLabel();
		CreateGroupNewHeader.setBackground(UIManager.getColor("Button.background"));
		CreateGroupNewHeader.setFont(new Font("Verdana", Font.BOLD, 14));
		CreateGroupNewHeader.setHorizontalAlignment(SwingConstants.CENTER);
		CreateGroupNewHeader.setText("Group Info");
		CreateGroupNewHeader.setBounds(91, 87, 157, 24);
		add(CreateGroupNewHeader);
		
		CreateGroupName = new JTextField();
		CreateGroupName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CreateGroupName.setText("");
				CreateGroupName.setForeground(Color.BLACK);
			}
			
		});
		
			
		CreateGroupName.setForeground(Color.GRAY);
		CreateGroupName.setFont(new Font("Verdana", Font.PLAIN, 12));
		CreateGroupName.setText("Enter a group name...");
		CreateGroupName.setBounds(91, 117, 157, 20);
		add(CreateGroupName);
		CreateGroupName.setColumns(10);
		
		CreateGroupMember1 = new JTextField();
		CreateGroupMember1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent f) {
				CreateGroupMember1.setText("");
				CreateGroupMember1.setForeground(Color.BLACK);
			}
		});
		CreateGroupMember1.setForeground(Color.GRAY);
		CreateGroupMember1.setFont(new Font("Verdana", Font.PLAIN, 12));
		CreateGroupMember1.setText("Member's name...");
		CreateGroupMember1.setBounds(43, 157, 122, 20);
		add(CreateGroupMember1);
		CreateGroupMember1.setColumns(10);
		
		CreateGroupMember2 = new JTextField();
		CreateGroupMember2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent g) {
				CreateGroupMember2.setText("");
				CreateGroupMember2.setForeground(Color.BLACK);
			}
		});
		CreateGroupMember2.setForeground(Color.GRAY);
		CreateGroupMember2.setFont(new Font("Verdana", Font.PLAIN, 12));
		CreateGroupMember2.setText("Member's name...");
		CreateGroupMember2.setBounds(193, 157, 125, 20);
		add(CreateGroupMember2);
		CreateGroupMember2.setColumns(10);
		
		CreateGroupMember3 = new JTextField();
		CreateGroupMember3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent a) {
				CreateGroupMember3.setText("");
				CreateGroupMember3.setForeground(Color.BLACK);
			}
		});
		CreateGroupMember3.setForeground(Color.GRAY);
		CreateGroupMember3.setFont(new Font("Verdana", Font.PLAIN, 12));
		CreateGroupMember3.setText("Member's name...");
		CreateGroupMember3.setBounds(43, 188, 122, 20);
		add(CreateGroupMember3);
		CreateGroupMember3.setColumns(10);
		
		CreateGroupMember4 = new JTextField();
		CreateGroupMember4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent b) {
				CreateGroupMember4.setText("");
				CreateGroupMember4.setForeground(Color.BLACK);
			}
		});
		CreateGroupMember4.setForeground(Color.GRAY);
		CreateGroupMember4.setFont(new Font("Verdana", Font.PLAIN, 12));
		CreateGroupMember4.setText("Member's name...");
		CreateGroupMember4.setBounds(193, 188, 125, 20);
		add(CreateGroupMember4);
		CreateGroupMember4.setColumns(10);
		
		CreateGroupMember5 = new JTextField();
		CreateGroupMember5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent c) {
				CreateGroupMember5.setText("");
				CreateGroupMember5.setForeground(Color.BLACK);
			}
		});
		CreateGroupMember5.setForeground(Color.GRAY);
		CreateGroupMember5.setFont(new Font("Verdana", Font.PLAIN, 12));
		CreateGroupMember5.setText("Member's name...");
		CreateGroupMember5.setBounds(43, 219, 122, 20);
		add(CreateGroupMember5);
		CreateGroupMember5.setColumns(10);
		
		CreateGroupMember6 = new JTextField();
		CreateGroupMember6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent d) {
				CreateGroupMember6.setText("");
				CreateGroupMember6.setForeground(Color.BLACK);
			}
		});
		CreateGroupMember6.setForeground(Color.GRAY);
		CreateGroupMember6.setFont(new Font("Verdana", Font.PLAIN, 12));
		CreateGroupMember6.setText("Member's name...");
		CreateGroupMember6.setBounds(193, 219, 125, 20);
		add(CreateGroupMember6);
		CreateGroupMember6.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setFont(new Font("Verdana", Font.PLAIN, 11));
		textPane.setBackground(UIManager.getColor("Button.background"));
		textPane.setText("1.");
		textPane.setBounds(27, 157, 16, 20);
		add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setFont(new Font("Verdana", Font.PLAIN, 11));
		textPane_1.setBackground(UIManager.getColor("Button.background"));
		textPane_1.setText("3.");
		textPane_1.setBounds(27, 188, 16, 20);
		add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setFont(new Font("Verdana", Font.PLAIN, 11));
		textPane_2.setBackground(UIManager.getColor("Button.background"));
		textPane_2.setText("5.");
		textPane_2.setBounds(27, 219, 16, 20);
		add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setFont(new Font("Verdana", Font.PLAIN, 11));
		textPane_3.setBackground(UIManager.getColor("Button.background"));
		textPane_3.setText("2.");
		textPane_3.setBounds(175, 157, 16, 20);
		add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEditable(false);
		textPane_4.setFont(new Font("Verdana", Font.PLAIN, 11));
		textPane_4.setBackground(UIManager.getColor("Button.background"));
		textPane_4.setText("4.");
		textPane_4.setBounds(175, 188, 16, 20);
		add(textPane_4);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setEditable(false);
		textPane_5.setFont(new Font("Verdana", Font.PLAIN, 11));
		textPane_5.setBackground(UIManager.getColor("Button.background"));
		textPane_5.setText("6.");
		textPane_5.setBounds(175, 219, 16, 20);
		add(textPane_5);
		
		final JButton btnSaveGroup = new JButton("Save Group");
		btnSaveGroup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String groupName = CreateGroupName.getText();
				String member1 = CreateGroupMember1.getText();
				String member2 = CreateGroupMember2.getText();
				String member3 = CreateGroupMember3.getText();
				String member4 = CreateGroupMember4.getText();
				String member5 = CreateGroupMember5.getText();
				String member6 = CreateGroupMember6.getText();
				try {
					if(information.createGroup(groupName, member1, member2, member3, member4, member5, member6) == true) {
						JOptionPane.showMessageDialog(null, "New Group "+groupName.toUpperCase()+" has been saved.");
						
						CreateGroupName.setForeground(Color.GRAY);
						CreateGroupName.setText("Enter a group name...");
						
						CreateGroupMember1.setForeground(Color.GRAY);
						CreateGroupMember1.setText("Member's name...");
						
						CreateGroupMember2.setForeground(Color.GRAY);
						CreateGroupMember2.setText("Member's name...");
						
						CreateGroupMember3.setForeground(Color.GRAY);
						CreateGroupMember3.setText("Member's name...");
						
						CreateGroupMember4.setForeground(Color.GRAY);
						CreateGroupMember4.setText("Member's name...");
						
						CreateGroupMember5.setForeground(Color.GRAY);
						CreateGroupMember5.setText("Member's name...");
						
						CreateGroupMember6.setForeground(Color.GRAY);
						CreateGroupMember6.setText("Member's name...");
						
						EGR222_Frame parent = (EGR222_Frame) getTopLevelAncestor();
						parent.setViewGroup();
					}
					
					else{
						CreateGroupName.setForeground(Color.GRAY);
						CreateGroupName.setText("Enter a group name...");
						
						CreateGroupMember1.setForeground(Color.GRAY);
						CreateGroupMember1.setText("Member's name...");
						
						CreateGroupMember2.setForeground(Color.GRAY);
						CreateGroupMember2.setText("Member's name...");
						
						CreateGroupMember3.setForeground(Color.GRAY);
						CreateGroupMember3.setText("Member's name...");
						
						CreateGroupMember4.setForeground(Color.GRAY);
						CreateGroupMember4.setText("Member's name...");
						
						CreateGroupMember5.setForeground(Color.GRAY);
						CreateGroupMember5.setText("Member's name...");
						
						CreateGroupMember6.setForeground(Color.GRAY);
						CreateGroupMember6.setText("Member's name...");
					}
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "I broke on Headless");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "I couldn't find the file");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Something went horribly wrong");
				}
			
				
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnSaveGroup.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnSaveGroup.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnSaveGroup.setBounds(105, 260, 125, 23);
		add(btnSaveGroup);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 484, 50);
		add(panel);
		
		JLabel lblCreateGroup = new JLabel("Create Group");
		lblCreateGroup.setFont(new Font("Verdana", Font.PLAIN, 27));
		lblCreateGroup.setForeground(Color.WHITE);
		panel.add(lblCreateGroup);
		
		
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
		
		JTextPane txtpnAsdfasdf = new JTextPane();
		txtpnAsdfasdf.setEditable(false);
		txtpnAsdfasdf.setFont(new Font("Verdana", Font.ITALIC, 11));
		txtpnAsdfasdf.setBackground(SystemColor.menu);
		txtpnAsdfasdf.setText("Maximum Number of \r\nGroups: 3\r\n\r\nMaximum Number of\r\nMembers per Group: 6");
		txtpnAsdfasdf.setBounds(342, 141, 142, 98);
		add(txtpnAsdfasdf);
		
		
	}
	
	public void moveButton(){
		btnRevealSide.setBounds(0, 50, 20, 22);
	}
}
		
		
		
	

