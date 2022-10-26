import java.util.Scanner; // import Scanner
public class StaffProfile {
    public static void main (String[]args){
        // user will enter name, age, salary
        //create scanner object
        Scanner object= new Scanner(System.in);
        System.out.println("Enter staff name, age and salary to this system! ");

        System.out.println("Enter staff name : ");
        String name = object.nextLine();

        System.out.println("Enter staff age : ");
        int age = object.nextInt();

        System.out.println("Enter staff salary : ");
        double salary = object.nextDouble();

        System.out.println("Staff name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Salary = " + salary);
    }
}




