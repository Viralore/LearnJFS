package main;

import java.util.List;
import java.util.Scanner;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class Main 
{
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		StudentService studentService = new StudentServiceImpl();
		int choice = 0;
		boolean adminLogined = false;
		while(choice != 1)
		{
			System.out.println("!. Exit");
			System.out.println("2. Student Login");
			System.out.println("3. Admin Login");
			System.out.println("4. List all the Students\n");
			System.out.print("Enter your choice : ");
			choice = in.nextInt();
			switch(choice)
			{
				case 1 : return;
				case 2 : break;
				case 3 :
					System.out.println("Enter the password");
//					in.nextLine();
					String pass = in.next();
					if(pass.equals("hello123"))
					{
						adminLogined = true;
					}
					else adminLogined = false;
					break;
				case 4 :
					if(!adminLogined) 
					{
						System.out.println("Enter as admin first\n");
						break;
					}
					List<Student> list = studentService.findAll();
					System.out.println(list);
					break;
			}
		}
		in.close();
	}
}
