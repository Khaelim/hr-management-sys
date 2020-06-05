package com.amazingsoftware.hr.utils;



import java.util.*;

public class MainMenu {
	
	public static void menu() {
		int option;
		
		Scanner keyIn = new Scanner(System.in);

		do {
			System.out.println("Enter option as integer");
			
			System.out.println(
					"1. List all Employees\n2. List all Departments\n3. Add a new Employee  \n4. Edit an Employee by id\n5. Delete an Employee by id");
			System.out.println(
					"6. View all Managers\n7. View all Developers\n8. View number of staff within a department\n9. Payment\n10. Show help\n11. Exit Menu");
			
			try {
				option = keyIn.nextInt();
				
				if (!(option >= 1 && option <= 11)) 
					throw new InputMismatchException("Option outside range");
				
				break;
			} catch (InputMismatchException e) {
				System.out.println("Selection must be an integer");
				// e.printStackTrace();
				
				// System.out.println(e.getMessage());
				
				keyIn.nextLine();
				
				continue;
			}
		} while (true);
		// maybe do it this way i.e. returning int
		// if (option >= 1 && option <= 11) {
		// 	return option;
		// } else {
		// 	return -1;
		// }
		// or call the other method directly

		switch (option) {
		case 1: //call the list all employees method

			break;
			
		case 2: //call the list all departments method
		
			break;	
		case 3: //call the add employee method
			
			break;
		case 4: //call the edit employee by id method
						
			break;
		case 5: //call the delete employee by id method
						
			break;
		case 6: //call the view all managers method
						
			break;
		case 7: //call the view all developers method
						
			break;
		case 8: //call the view number of staff within a dept method
						
			break;
		case 9: //call the payment method
						
			break;
		case 10: //call the show help method
						
			break;
		case 11: //git out
						
			break;
		default:
			//appropriate message or throw error
		}

	}

}