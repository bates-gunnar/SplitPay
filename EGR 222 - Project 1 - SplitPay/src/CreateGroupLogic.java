import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class CreateGroupLogic {

	String groupName;
	String member1;
	String member2;
	String member3;
	String member4;
	String member5;
	String member6;
	
	public boolean createGroup(String name, String one, String two, String three, String four, String five, String six) throws IOException {
		groupName = name.toUpperCase();
		member1 = one.toUpperCase();
		member2 = two.toUpperCase();
		member3 = three.toUpperCase();
		member4 = four.toUpperCase();
		member5 = five.toUpperCase();
		member6 = six.toUpperCase();
		
		if(groupName.matches("ENTER A GROUP NAME...")) {
			JOptionPane.showMessageDialog(null, "Please enter a group name.");
			return false;
		}
		
		else if(member1.matches("MEMBER'S NAME...")) {
			JOptionPane.showMessageDialog(null, "Please enter a name for member number 1.");
			return false;
		}
		
		else {
			//GRAB THE CURRENT USER
			File file = new File("currentUser.txt");
			Scanner inputFile = new Scanner(file);
			String user = inputFile.nextLine();
			inputFile.close();
			
			//VARIABLE TO SEPARATE A USER'S GROUPS IN USER TEXT PROFILE
			final String groupSeparation = "---";
			
			//STRING TO LOCATE THE USER'S PROFILE 
			final String OUTPUT_NAME = user+".txt";
			
			//FILE TO WRITE OUT A USER'S GROUPS
			File checkFile = new File(user + "Groups.txt");
			
			//DOUBLE CHECKING TO MAKE SURE THAT THE GROUP FILE EXISTS. IF NOT, THERE IS A MAJOR PROBLEM.
			if(checkFile.isFile()) {
				
				//CHECKING IF USER ALREADY HAS THIS GROUP
				PrintWriter checkOutput = new PrintWriter(new BufferedWriter(new FileWriter(checkFile, true)));
				String checkGroup;
				String makeGroup = "YES";
				int numberOfGroups = 0;
				Scanner scanGroups = new Scanner(checkFile);
				while(scanGroups.hasNext()) {
					checkGroup = scanGroups.nextLine();
					if(checkGroup.matches(groupName)) {
						makeGroup = "NO";
						JOptionPane.showMessageDialog(null, "Group name already exists. Please try again.");
						break;
					}
					//CHECK TO SEE IF THERE ARE 3 GROUPS. LIMIT CURRENT MAX GROUPS TO 3
					numberOfGroups++;
					if(numberOfGroups == 3) {
						makeGroup = "NO";
						JOptionPane.showMessageDialog(null, "Maximum number of groups has been reached. Please settle previous debt before continuing.");
						break;
					}
				}
				scanGroups.close();
				
				//WRITING GROUP TO USER PROFILE
				if(makeGroup == "YES") {
					
					checkOutput.println(groupName);
					checkOutput.close();
					PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(OUTPUT_NAME, true)));
			
					output.println(groupName);
					output.println(member1);
			
					if(member2.matches("MEMBER'S NAME...") == false) {
						output.println(member2);
					}
			
					if(member3.matches("MEMBER'S NAME...") == false) {
						output.println(member3);
					}
				
					if(member4.matches("MEMBER'S NAME...") == false) {
						output.println(member4);
					}
				
					if(member5.matches("MEMBER'S NAME...") == false) {
						output.println(member5);
					}
				
					if(member6.matches("MEMBER'S NAME...") == false) {
						output.println(member6);
					}
				
					output.println(groupSeparation);
					output.close();
					return true;
				}
				
				else {
					checkOutput.close();
					return false;
				}
			}
			
			else if(!checkFile.isFile()) {
				JOptionPane.showMessageDialog(null, "The file does not exist. There is a disturbance in the Force.");
				return false;
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Group name already exists. Please select a new group name.");
				return false;
			}
		}
	}
}
