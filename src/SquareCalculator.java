import java.util.Scanner; // importing scanner class

public class SquareCalculator {
    public static void main (String[]args){
        //this calculator will calculate area and perimeter of square
        //ask user to enter the height and width

        //create scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the width ");
        double width = myObj.nextDouble(); // reading user input, width

        System.out.println("Enter the width ");
        double height = myObj.nextDouble(); // reading user input, width


        double perimeter = 2 * (width + height); //calculate perimeter
        double area = width*height;

        System.out.println("Perimeter of the rectangle is : " + perimeter);
        System.out.println("Area of the rectangle is : " + area);

    }
}


//    double width =13.5;
//     double height =25.3;
