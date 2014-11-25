 import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class HomePage extends JPanel {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Create the panel.
	 */
	
	//************************************************************************************************************************************************
   	//Initialize button to reveal side navigation panel
	
	Button btnRevealSide = new Button("\u2261");
	
	public HomePage() {
		setLayout(null);
				
				JScrollBar scrollBar = new JScrollBar();
				scrollBar.setBounds(340, 74, 17, 256);
				add(scrollBar);
				scrollBar.setForeground(Color.WHITE);
				scrollBar.setBackground(Color.WHITE);
				scrollBar.setEnabled(false);
		
				JPanel homePageCurrent = new JPanel();
				homePageCurrent.setBorder(new LineBorder(Color.black, 1));
				homePageCurrent.setBounds(126, 73, 232, 258);
				add(homePageCurrent);
				homePageCurrent.setLayout(null);
				
				JTextField txtNoCurrentEvents = new JTextField();
				txtNoCurrentEvents.setHorizontalAlignment(SwingConstants.CENTER);
				txtNoCurrentEvents.setText("No current events");
				txtNoCurrentEvents.setBorder(new LineBorder(Color.black, 1));
				txtNoCurrentEvents.setEditable(false);
				txtNoCurrentEvents.setBounds(0, 0, 214, 70);
				homePageCurrent.add(txtNoCurrentEvents);
				txtNoCurrentEvents.setColumns(10);
				
				JTextField textField_1 = new JTextField();
				textField_1.setText("No current events");
				textField_1.setHorizontalAlignment(SwingConstants.CENTER);
				textField_1.setEditable(false);
				textField_1.setColumns(10);
				textField_1.setBorder(new LineBorder(Color.black, 1));
				textField_1.setBounds(0, 69, 214, 70);
				homePageCurrent.add(textField_1);
				
				JTextField textField_2 = new JTextField();
				textField_2.setText("No current events");
				textField_2.setHorizontalAlignment(SwingConstants.CENTER);
				textField_2.setEditable(false);
				textField_2.setColumns(10);
				textField_2.setBorder(new LineBorder(Color.black, 1));
				textField_2.setBounds(0, 138, 214, 70);
				homePageCurrent.add(textField_2);
				
				JTextField homePageWelcome = new JTextField();
				homePageWelcome.setEditable(false);
				homePageWelcome.setBounds(0, 0, 484, 50);
				add(homePageWelcome);
				homePageWelcome.setHorizontalAlignment(SwingConstants.CENTER);
				homePageWelcome.setForeground(Color.WHITE);
				homePageWelcome.setBackground(Color.BLUE);
				homePageWelcome.setFont(new Font("Verdana", Font.PLAIN, 24));
				homePageWelcome.setText("Welcome!");
				homePageWelcome.setBorder(null);
				
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


