import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class PostBillLogic {
	
	//Function to get the group names from text and put them in the post bill group selection box
	public String[] groupList() throws FileNotFoundException {
		String[] groupList = {"Select Groups...", "", "", ""};
		String user = "";
		File getUser = new File("currentUser.txt");
		Scanner input = new Scanner(getUser);
		
		//gets the user
		while(input.hasNext()) {
			user = input.nextLine();
		}
		input.close();
		
		File userGroups = new File(user + "Groups.txt");
		if(userGroups.exists()) {
			input = new Scanner(userGroups);
			for(int i = 1; input.hasNext(); i++) {
				groupList[i] = input.nextLine();
			}
		}
				
		input.close();
		
		return groupList;
	}
	
	public int countGroupMembers(String group) throws FileNotFoundException {
		int memberCount = 0;
		String user = "";
		String temp = "";
		File getUser = new File("currentUser.txt");
		Scanner userInput = new Scanner(getUser);
		
		while(userInput.hasNext()) {
			user = userInput.nextLine();
		}
		userInput.close();
		
		File userInfo = new File(user + ".txt");
		Scanner member = new Scanner(userInfo);
		
		if(!group.matches("---")) {
			while(member.hasNext()) {
				temp = member.nextLine();
				if(temp.matches(group)) {
					while(member.hasNext()) {
						temp = member.nextLine();
						memberCount++;
						if(temp.matches("---")) {
							memberCount--;
							break;
						}
					}
				}
			}
		}
		member.close();
		return memberCount;
	}
	
	public Boolean postABill(String group, String billName, String member1, String member2, String member3, 
						  String member4, String member5, String member6, Double total, Double member1Total,
						  Double member2Total, Double member3Total, Double member4Total, Double member5Total,
						  Double member6Total) throws IOException {
		group = group.toUpperCase();
		billName = billName.toUpperCase();
		member1 = member1.toUpperCase();
		member2 = member2.toUpperCase();
		member3 = member3.toUpperCase();
		member4 = member4.toUpperCase();
		member5 = member5.toUpperCase();
		member6 = member6.toUpperCase();
		
		String endOfLine = System.getProperty("line.separator");
		String user = "";
		String bill = "";
		String makeBill = "YES";
		int numberOfBills = 0;
			
		if(billName.matches("")) {
			JOptionPane.showMessageDialog(null, "Please enter a Bill Title.");
			return false;
		}
		
		else if(total == 0.0) {
			JOptionPane.showMessageDialog(null, "Please enter a total amount to split.");
			return false;
		}
		
		else {
			//GETS USER
			File getUser = new File("currentUser.txt");
			Scanner userInput = new Scanner(getUser);
			while(userInput.hasNext()) {
				user = userInput.nextLine();
			}
			userInput.close();
			
			//FILE TO CHECK WHAT BILLS A GROUP HAS
			File checkBills = new File(user + group + "Bills.txt");
			Scanner scanBills = new Scanner(checkBills);
			
			if(checkBills.isFile()) {
				PrintWriter BILLS = new PrintWriter(new BufferedWriter(new FileWriter(checkBills, true)));
				while(scanBills.hasNext()) {
					bill = scanBills.nextLine();
					if(bill.matches(billName)) {
						makeBill = "NO";
						JOptionPane.showMessageDialog(null, "A bill with this name already exists for this group. You have two options:" + endOfLine +
						"1) Settle previous bill with the same name" + endOfLine +
						"2) Use a different name to create this bill");
						BILLS.close();
						return false;
					}
					
					//MAXIMUM OF 3 BILLS
					numberOfBills++;
					if(numberOfBills == 3) {
						makeBill = "NO";
						JOptionPane.showMessageDialog(null, "Maximum number of bills (3) has been reached. Please settle past debt before continuing.");
						BILLS.close();
						return false;
					}
				}
				scanBills.close();
								
				if(makeBill == "YES") {
					BILLS.println(billName.toUpperCase());
					BILLS.close();
					
					PrintWriter newBill = new PrintWriter(user + group + billName + ".txt");
					newBill.println(billName);
					newBill.println("TOTAL AMOUNT");
					newBill.println(total);
					
					if(!member1.matches("")) {
						newBill.println(member1);
						newBill.println(member1Total);
					}
					
					if(!member2.matches("")) {
						newBill.println(member2);
						newBill.println(member2Total);
					}
					
					if(!member3.matches("")) {
						newBill.println(member3);
						newBill.println(member3Total);
					}
					
					if(!member4.matches("")) {
						newBill.println(member4);
						newBill.println(member4Total);
					}
					
					if(!member5.matches("")) {
						newBill.println(member5);
						newBill.println(member5Total);
					}
					
					if(!member6.matches("")) {
						newBill.println(member6);
						newBill.println(member6Total);
					}
					newBill.close();
					JOptionPane.showMessageDialog(null, "Bill successfully posted");
					return true;
				}
				BILLS.close();
			}
			
			else{
				scanBills.close();
				return false;
			}
			JOptionPane.showMessageDialog(null, "Something went wrong, the program should not be here. Please exit.");
			return false;
		}
	}

}
