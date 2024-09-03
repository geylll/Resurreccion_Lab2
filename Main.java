// Cylinder class
import java.util.Scanner;

class Cylinder {
    protected double radius;
    protected double height;
    protected double area;

    // Method to get input for radius and height
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder: ");
        radius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        height = scanner.nextDouble();
    }

    // Method to compute the area of the cylinder
    public void area() {
        area = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
        System.out.println("Surface Area of the Cylinder: " + area);
    }
}

// CylinderVol class inheriting from Cylinder
class CylinderVol extends Cylinder {
    private double volume;

    // Method to compute the volume of the cylinder
    public void volume() {
        volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the Cylinder: " + volume);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        CylinderVol cylinderVol = new CylinderVol();
        cylinderVol.getInput(); // Get the radius and height
        cylinderVol.area();     // Compute the area
        cylinderVol.volume();   // Compute the volume
    }
}
