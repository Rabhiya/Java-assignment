package p1;

import java.util.Scanner;
import java.util.ArrayList;
import p1.*;

public class Assignment {

		public static void main(String[] args) throws Exception
		{
			ArrayList<Employee> list1 = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			char ch ;

			    System.out.println("Welcome\n");
			
				System.out.println("Press 1 to ADD Employee details");
				System.out.print("Enter your choice : ");
				
				int choice = sc.nextInt();
				sc.nextLine();
                try
                {
				switch(choice)
				{
				case 1:
					Add(list1);
					break;
					
				default:
					System.out.println("Invalid Choice");
				}
                }
                catch(Exception e)
                {
                	System.out.println("I/O Error");
                }
				
				
		}

		public static void Add(ArrayList<Employee> list1)
		{
			Scanner sc = new Scanner(System.in);

				System.out.print("Enter Employee Name : ");
				String empName = sc.nextLine();
				System.out.print("Enter Employee Age : ");
				int empAge = sc.nextInt();
				System.out.print("Enter Employee Address : ");
				String empAddress = sc.nextLine();
				sc.nextLine();
				Employee employee = new Employee(empName,empAge,empAddress);
				list1.add(employee);
				System.out.println(" Data added Successfully");
			}
		
		}			


					


