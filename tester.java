package Projek;

import java.util.Scanner;
public class tester {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("masukkan Student atau teacher");
        String input = n.nextLine();

        if (input.equals("Student")) {
            System.out.println("----Student-----");
            System.out.println("name  = ");
            String name = n.nextLine();
            System.out.println("Major = ");
            int Major = n.nextInt();
            System.out.println("Age = ");
            int Age = n.nextInt();
            System.out.println("Student Number = ");
            int studetnumber = n.nextInt();
            System.out.println("Score = ");
            int Score = n.nextInt();


            System.out.println();
            System.out.println("------Information-------");
            System.out.println("Name =" + name);
            System.out.println("Major = " + Major);
            System.out.println("Student Number = " + studetnumber);
            System.out.println("Score = " + Score);
            System.out.println("Age = " + Age);

        } else if (input.equals("Teacher")) {

            System.out.println("-----teacher-----");
        System.out.println("apakah full time atau part time?");
        String inputteacher = n.nextLine();

        if(inputteacher.equals("full time")){

            System.out.println("-----fulltime------");
            System.out.println("name = ");
            String name = n.nextLine();
            System.out.println("Subject =");
            String Subject = n.nextLine();
            System.out.println("Unit = ");
            String Unit = n.nextLine();
            System.out.println("Age = ");            
            int age = n.nextInt();
            System.out.println("Salary = ");
            int salary = n.nextInt();
            
            System.out.println("------Information-----");
            System.out.println("Name = "+name);
            System.out.println("Age = "+age);
            System.out.println("Salary = "+salary);
            System.out.println("Subject = "+Subject);
            System.out.println("Unit = "+Unit);
            
        }
        else if(inputteacher.equalsIgnoreCase("Part time"))
        System.out.println("Name = ");
        String name = n.nextLine();
        System.out.println("subject = ");
        String Subject = n.nextLine();
        System.out.println("Age = ");
        int age = n.nextInt();
        System.out.println("Hours Worked");
        int hoursWorked = n.nextInt();
        int salary = hoursWorked * 5000;
        System.out.println();

        
        System.out.println("----Information-----");
    
    System.out.println("name = "+name);
    System.out.println("Subject = "+Subject);
    System.out.println("Age = "+age);
    System.out.println("Hours Worked = "+hoursWorked);
    System.out.println("salary ="+salary);
    
}
}

}
