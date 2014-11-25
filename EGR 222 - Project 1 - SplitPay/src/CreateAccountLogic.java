import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;



public class CreateAccountLogic {
	
	String userPassAlong = null;
	
	public Boolean ifEmptyFields(String user, String password, String confirmPassword) throws FileNotFoundException {
		if((user.matches("") == true) & (password.matches("") == true)) {
			JOptionPane.showMessageDialog(null, "Please enter a username and password");
			return false;
		}
		
		else if(user.matches("") == true) {
			JOptionPane.showMessageDialog(null, "Please enter a username");
			return false;
		}
		
		else if(password.matches("") == true) {
			JOptionPane.showMessageDialog(null, "Please enter a password");
			return false;
		}
		
		else if(password.matches(confirmPassword) == false) {
			JOptionPane.showMessageDialog(null, "Password confirmation invalid. Please re-enter");
			return false;
		}
		
		else if(password.matches(confirmPassword) == true & user.matches("") == false) {
			
			File check = new File(user+".txt");
			if(!check.isFile()){
				String groupSeparation = "---";
				PrintWriter output = new PrintWriter(user+".txt");
				output.println(user);
				output.println(password);
				output.println(groupSeparation);
				output.close();
				
				//FILE TO HOLD USER GROUP NAMES
				File file = new File(user + "Groups.txt");
				PrintWriter checkFile = new PrintWriter(file);
				checkFile.close();
				
				JOptionPane.showMessageDialog(null, "Account successfully created");
				userPassAlong = user;
				return true;
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Account already exists. Please choose a different username.");
				return false;
			}
		}
		return false;
	}
	
	public void writeCurrentUser() throws FileNotFoundException {
		PrintWriter output = new PrintWriter("currentUser.txt");
		output.println(userPassAlong);
		output.close();
	}
}
