/***********************************
 * Kyle Szalai (E01006866)
 * Rob Kendall (E00958364)
 * Greg McKinstry (E00000000)
 * Bryan Andrews (E00000000)
 * COSC 374
 * Project 3
 * 
 * MoneyOrder.java
 * 
 * [Add a description for the MoneyOrder
 * class later]
 ***********************************/
// i will update this as we go through it
import java.util.*;

public class MoneyOrder {
// variables for customer info
	private String fName;
	private String lName;
	private String strNum;
	private String strNa;
	private String strTy;
	private String ci;
	private String st;
	private String zi;
	private String MO_ID;
	
	// variables for:
	// 1) amount
	// 2) number of money orders to generate
	// 3) large string with all the info concatinated excluding the number of money orders generated
	private double am;
	private int MO_nums;
	private int ID_String;
	
	// parameterized constructor
	public MoneyOrder(String first, String last, String strNumber, String strName, String strType, String city, String state, String zip,String MonOrdID, double amount,int MonOrdNums) {
		fName = first;
		lName = last;
		strNum = strNumber;
		strNa = strName;
		strTy = strType;
		ci = city;
		st = state;
		zi = zip;
		MO_ID = MonOrdID;
		am= amount;
		MO_nums = MonOrdNums;
		
	}
	
	public String toString() { // return parameters to the display method
		// in MoneyOrder class
return (fName + " " + lName + " " + strNum + " " + strNa + " " + strTy + " " + ci + " " + st + " " + zi + " " + MO_ID + " " + am + " " + MO_nums);
}
	
}
