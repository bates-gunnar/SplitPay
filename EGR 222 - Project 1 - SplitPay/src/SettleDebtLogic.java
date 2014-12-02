import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class SettleDebtLogic {

	public String getDebt(String group, String billName) throws FileNotFoundException {
		String user = "";
		String amountTxt = "";
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		
		File billFile = new File(user + group + billName +".txt");
		
		if(billFile.exists()) {
			Scanner billInput = new Scanner(billFile);
			if(billInput.hasNext()) {
				while(billInput.hasNext()) {
					amountTxt = billInput.nextLine();
					
					//FINDS MY "ACCOUNT" IN THE BILL, THEN TAKES MY AMOUNT
					if(amountTxt.matches("ME")) {
						amountTxt = billInput.nextLine();
						break;
					}
				}
			}
			billInput.close();
		}
		
		return amountTxt;
	}
	
	public void settleDebt(String group, String billName) throws FileNotFoundException {
		String user = "";
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		
		Boolean fileDeleted = (new File(user + group + billName + ".txt")).delete();
		if(fileDeleted) {
			removeLineFromFile(user + group + "Bills.txt", billName);
			JOptionPane.showMessageDialog(null, "Your debt for " + group + "--> " + billName + " has been settled.");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Debt was not cleared. Check to see if bill still exists.");
		}
		
		
	}
	
	public void settleAllDebt(String group, String billName1, String billName2, String billName3) throws FileNotFoundException {
		String user = "";
		File file = new File("currentUser.txt");
		Scanner inputFile = new Scanner(file);
		user = inputFile.nextLine();
		inputFile.close();
		
		Boolean bill1Deleted;
		Boolean bill2Deleted;
		Boolean bill3Deleted;
		
		bill1Deleted = (new File(user + group + billName1 + ".txt")).delete();
		if(bill1Deleted) {
			removeLineFromFile(user + group + "Bills.txt", billName1);
			JOptionPane.showMessageDialog(null, billName1 + " debt has been settled.");
		}
		
		bill2Deleted = (new File(user + group + billName2 + ".txt")).delete();
		if(bill2Deleted) {
			removeLineFromFile(user + group + "Bills.txt", billName2);
			JOptionPane.showMessageDialog(null, billName2 + " debt has been settled.");
		}
		
		bill3Deleted = (new File(user + group + billName3 + ".txt")).delete();
		if(bill3Deleted) {
			removeLineFromFile(user + group + "Bills.txt", billName3);
			JOptionPane.showMessageDialog(null, billName3 + " debt has been settled.");
		}
		
		
	}
	

	
	
	
	//CODE FOUND ONLINE TO HELP WITH DELETING A LINE FROM A FILE
	
	public void removeLineFromFile(String file, String lineToRemove) {
		 
	    try {
	 
	      File inFile = new File(file);
	      
	      if (!inFile.isFile()) {
	        System.out.println("Parameter is not an existing file");
	        return;
	      }
	       
	      //Construct the new file that will later be renamed to the original filename. 
	      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
	      
	      BufferedReader br = new BufferedReader(new FileReader(file));
	      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
	      
	      String line = null;
	 
	      //Read from the original file and write to the new 
	      //unless content matches data to be removed.
	      while ((line = br.readLine()) != null) {
	        
	        if (!line.trim().equals(lineToRemove)) {
	 
	          pw.println(line);
	          pw.flush();
	        }
	      }
	      pw.close();
	      br.close();
	      
	      //Delete the original file
	      if (!inFile.delete()) {
	        System.out.println("Could not delete file");
	        return;
	      } 
	      
	      //Rename the new file to the filename the original file had.
	      if (!tempFile.renameTo(inFile))
	        System.out.println("Could not rename file");
	      
	    }
	    catch (FileNotFoundException ex) {
	      ex.printStackTrace();
	    }
	    catch (IOException ex) {
	      ex.printStackTrace();
	    }
	  }
	
	
	
	
	
}
