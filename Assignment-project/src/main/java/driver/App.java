package driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import services.Employee;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Trainer Management System Project");
		System.out.println();
		System.out.println("Enter your choice :");
		System.out.println("1. Employee");
		System.out.println("2. Trainer");
		System.out.println("3. TOC");
		System.out.println("4. Exit");
		System.out.println("------------");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char choice = br.readLine().charAt(0);

		System.out.println(choice);
		switch (choice) {
		case '1':
			employee();
			break;
		case '2':
//			Trainer();
			break;
		// case '3':
		// TOC();
		// break;
		case '4':
			System.exit(0);
			break;
		default:
			System.out.println("Enter a valid choice");
			break;

		}
	}

	public static void employee() throws IOException {
		System.out.println("Welcome to trainer module");
		System.out.println("Enter your choice");
		System.out.println("1. Registration");
		System.out.println("2. Login");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char choice = br.readLine().charAt(0);
		Employee employee = new Employee();
		switch (choice) {
		case '1':
			employee.register();
			break;
		case '2':
			employee.loginEmp();
			break;
		default:
			System.out.println("You have enter a Invalid choice");
			break;
		}

	}

//		public static void Trainer() {
//			System.out.println("Welcome to Employee module");
//			System.out.println("Enter your choice");
//			System.out.println("1. Registration");
//			System.out.println("2. Login");
//			
//			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//			char choice=br.readLine().charAt(0);
//			
//			switch (choice) {
//			case '1':
//				Trainer.register();
//				break;
//			case '2':
//				Trainer.login();
//				break;
//			default:
//				System.out.println("You have enter a Invalid choice");
//				break;
//			}
//		}

}
