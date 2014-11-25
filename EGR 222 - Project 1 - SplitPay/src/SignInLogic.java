import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SignInLogic {

		String userPassAlong = null;
		
		public Boolean ifEmptyFields(String user, String password) throws FileNotFoundException {
			
			if((user.matches("") == true) & (password.matches("") == true)) {
				JOptionPane.showMessageDialog(null, "Please enter a valid username and password");
				return false;
			}
			
			else if(user.matches("") == true) {
				JOptionPane.showMessageDialog(null, "Please enter a valid username");
				return false;
			}
			
			else if(password.matches("") == true) {
				JOptionPane.showMessageDialog(null, "Please enter a valid password");
				return false;
			}
			else {
				File file = new File(user+".txt");
				Scanner inputFile = new Scanner(file);
				String checkUser = null;
				String checkPassword = null;
				
				if(inputFile.hasNext()) {
					checkUser = inputFile.nextLine();
				}
				if(inputFile.hasNext()) {
					checkPassword = inputFile.nextLine();
				}
				
				inputFile.close();
				if((user.matches(checkUser) == true) & (password.matches(checkPassword) == true)){
					userPassAlong = user;
					return true;
				}
				
				else
					JOptionPane.showMessageDialog(null, "Username or Password is incorrect. Please re-enter.");
					return false;
			}
		}
		
		public void writeCurrentUser() throws FileNotFoundException {
			PrintWriter output = new PrintWriter("currentUser.txt");
			output.println(userPassAlong);
			output.close();
		}
}
