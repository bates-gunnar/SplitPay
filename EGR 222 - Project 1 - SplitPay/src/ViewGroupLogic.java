import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ViewGroupLogic {
	String user = null;
	
	public String getUser() throws FileNotFoundException{
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		return user;
	}
	
	//FUNCTIONS TO SHOW GROUP TITLES
	public String showGroup1() throws FileNotFoundException {
		String group;
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		
		//LOCATES USER INFORMTION FILE AND MIGRATES PAST GENERAL INFO TO THE START OF GROUP INFO
		File inFile = new File(user+".txt");
		Scanner input = new Scanner(inFile);
		while(input.hasNext()) {
			group = input.nextLine();
			if(group.matches("---")){
				break;
			}
		}
		
		//GETS FIRST GROUP
		if(input.hasNext()) {
			group = input.nextLine();
		}
		
		else {
			group = "No Groups";
		}
		
		input.close();
		return group;
	}
	
	public String showGroup2() throws FileNotFoundException {
		String group = "";
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		
		File inFile = new File(user+".txt");
		Scanner input = new Scanner(inFile);
		while(input.hasNext()) {
			group = input.nextLine();
			if(group.matches("---")){
				break;
			}
		}
		
		//GETS FIRST GROUP
		if(input.hasNext()) {
			while(input.hasNext()) {
				group = input.nextLine();
				if(group.matches("---")){
					break;
				}
			}
			
			//GETS SECOND GROUP
			if(input.hasNext()) {
				group = input.nextLine();
			}
		}
		
		input.close();
		return group;
	}
	
	public String showGroup3() throws FileNotFoundException {
		String group = "";
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		
		File inFile = new File(user+".txt");
		Scanner input = new Scanner(inFile);
		while(input.hasNext()) {
			group = input.nextLine();
			if(group.matches("---")){
				break;
			}
		}
		
		//GETS FIRST GROUP
		if(input.hasNext()) {
			while(input.hasNext()) {
				group = input.nextLine();
				if(group.matches("---")){
					break;
				}
			}
			
			//GETS SECOND GROUP
			if(input.hasNext()) {
				while(input.hasNext()) {
					group = input.nextLine();
					if(group.matches("---")) {
						break;
					}
				}
				
				//GETS THIRD GROUP
				if(input.hasNext()) {
					group = input.nextLine();
				}	
			}
		}
		
		input.close();
		return group;
	}
	
	//FUNCTION TO SET FIRST GROUP MEMBER
	public String setMember1(String group, String member1) throws FileNotFoundException {
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		
		//SEARCH FILE FOR SPECIFIED GROUP
		String temp = "";
		File inFile = new File(user + ".txt");
		Scanner input = new Scanner(inFile);
		
		if(!group.matches("---")) {
			while(input.hasNext()) {
				temp = input.nextLine();
				if(temp.matches(group)) {
					member1 = input.nextLine();
					break;
				}
			}
		}
		
		else{
			member1 = "No Member";
		}
		input.close();
		return member1;
	}
	
	//FUNCTION TO SET FIRST GROUP MEMBER
	public String setMember(String group, String previousMember, String nextMember) throws FileNotFoundException {
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		
		//SEARCH FILE FOR SPECIFIED GROUP
		String temp = "";
		File inFile = new File(user + ".txt");
		Scanner input = new Scanner(inFile);
		
		if(!group.matches("---")) {
			while(input.hasNext()) {
				temp = input.nextLine();
				//FINDS GROUP
				if(temp.matches(group)) {
					while(input.hasNext()) {
						temp = input.nextLine();
						//FINDS LAST MEMBER AND SETS NEXT MEMBER
						if(temp.matches(previousMember)) {
							if(input.hasNext()) {
								nextMember = input.nextLine();
								break;
							}
							else{
								nextMember = "";
								break;
							}
						}
					}
				}
			}		
		}
		
		else{
			nextMember = "";
		}
		input.close();
		return nextMember;
	}
	
	public String setFirstBill(String group) throws FileNotFoundException {
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		
		String bill = "";
		File billFile = new File(user + group + "Bills.txt");

		if(billFile.exists()) {		
			Scanner searchBills = new Scanner(billFile);
			if(searchBills.hasNext()) {
				bill = searchBills.nextLine();
			}
			
			else {
				bill = "No Bill";
			}
			searchBills.close();
		}
		
		else{
			bill = "No Bill";
		}
		return bill;
	}
	
	public String setOtherBills(String group, String previousBill) throws FileNotFoundException {
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		
		String bill = "";
		File billFile = new File(user + group + "Bills.txt");
		
		if(billFile.exists()) {
			Scanner searchBills = new Scanner(billFile);
			while(searchBills.hasNext()) {
				bill = searchBills.nextLine();
				if(bill.matches(previousBill)) {
					if(searchBills.hasNext()) {
						bill = searchBills.nextLine();
						break;
					}
					
					else{
						break;
					}
				}
				
				else {
					bill = "";
				}
			}
			searchBills.close();
		}
		return bill;
	}
		
}