import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class GroupHistory extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Create the panel.
	 */
	
	Button btnRevealSide = new Button("\u2261");
	
	public GroupHistory() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(0, 0, 484, 47);
		add(panel);
		
		JLabel lblGroupHistory = new JLabel("Group History");
		lblGroupHistory.setForeground(Color.WHITE);
		lblGroupHistory.setFont(new Font("Verdana", Font.PLAIN, 29));
		panel.add(lblGroupHistory);
		
		JPanel groupPanel = new JPanel();
		groupPanel.setBounds(30, 92, 180, 235);
		add(groupPanel);
		
		JButton btnGroupOne = new JButton("Group 1");
		groupPanel.add(btnGroupOne);
		
		JButton btnGroupTwo = new JButton("Group 2");
		groupPanel.add(btnGroupTwo);
		
		JButton btnGroupThree = new JButton("Group 3");
		groupPanel.add(btnGroupThree);
		
		JLabel lblGroups = new JLabel("Groups");
		lblGroups.setBounds(95, 64, 45, 16);
		add(lblGroups);
		
		JPanel groupHistoryOne = new JPanel();
		groupHistoryOne.setBounds(274, 92, 180, 235);
		add(groupHistoryOne);
		groupHistoryOne.setLayout(new CardLayout(0, 0));
		
		JPanel groupOnePanel = new JPanel();
		groupHistoryOne.add(groupOnePanel, "name_278162592790310");
		groupOnePanel.setLayout(null);
		
		JPanel groupTwoPanel = new JPanel();
		groupHistoryOne.add(groupTwoPanel, "name_278186482436982");
		groupTwoPanel.setLayout(null);
		
		JPanel groupThreePanel = new JPanel();
		groupHistoryOne.add(groupThreePanel, "name_278216449994626");
		groupThreePanel.setLayout(null);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setBounds(337, 64, 51, 16);
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
	}
	
	//************************************************************************************************************************************************
   	//Function to move the navigation reveal button move back to its original position upon returning to a panel
	public void moveButton(){
		btnRevealSide.setBounds(0, 50, 20, 22);
		
	}

}
