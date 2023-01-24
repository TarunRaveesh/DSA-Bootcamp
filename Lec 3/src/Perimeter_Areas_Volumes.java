import java.util.Scanner;
public class Perimeter_Areas_Volumes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Perimeter, Area, TSA, CSA, Volume, pi = Math.PI;
        while (true) {
            System.out.print("Input Shape: ");
            String Shape = in.next();
            if (Shape.equals("q") || Shape.equals("Q")) {
                break;
            } else {
                switch (Shape) {
                    case ("Circle") -> {
                        System.out.print("Input Radius: ");
                        double r = in.nextDouble();

                        Perimeter = 2 * pi * r;
                        Area = pi * r * r;
                        System.out.println("Area of Circle: " + Area);
                        System.out.println("Perimeter of Circle: " + Perimeter);

                    }
                    case ("Triangle") -> {
                        System.out.println("Input Sides of Triangle: ");
                        System.out.print("A = ");
                        double a = in.nextDouble();
                        System.out.print("B = ");
                        double b = in.nextDouble();
                        System.out.print("C = ");
                        double c = in.nextDouble();
                        System.out.println();

                        Perimeter = a + b + c;
                        double s = Perimeter / 2;
                        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                        System.out.println("Area of Triangle: " + Area);
                        System.out.println("Perimeter of Triangle: " + Perimeter);
                    }
                    case ("Rectangle") -> {
                        System.out.println("Input Sides of Rectangle: ");
                        System.out.print("Length = ");
                        double l = in.nextDouble();
                        System.out.print("Breadth = ");
                        double b = in.nextDouble();

                        Perimeter = 2 * (l + b);
                        Area = l * b;
                        System.out.println("Area of Rectangle: " + Area);
                        System.out.println("Perimeter of Rectangle: " + Perimeter);
                    }
                    case ("Square") -> {
                        System.out.println("Input Side of Square: ");
                        System.out.print("A = ");
                        double a = in.nextDouble();

                        Perimeter = 4 * a;
                        Area = a * a;
                        System.out.println("Area of Square: " + Area);
                        System.out.println("Perimeter of Square: " + Perimeter);
                    }
                    case ("Parallelogram") -> {
                        System.out.println("Input Sides & Height of Parallelogram: ");
                        System.out.print("A = ");
                        double a = in.nextDouble();
                        System.out.print("B = ");
                        double b = in.nextDouble();
                        System.out.print("H = ");
                        double h = in.nextDouble();

                        Perimeter = 2 * (a + b);
                        Area = b * h;
                        System.out.println("Area of Parallelogram: " + Area);
                        System.out.println("Perimeter of Parallelogram: " + Perimeter);
                    }
                    case ("Rhombus") -> {
                        System.out.println("Input Side and Diagonals of Rhombus: ");
                        System.out.print("Side = ");
                        double a = in.nextDouble();
                        System.out.print("Diagonal 1 = ");
                        double d1 = in.nextDouble();
                        System.out.print("Diagonal 2 = ");
                        double d2 = in.nextDouble();

                        Perimeter = 4 * a;
                        Area = d1 * d2 / 2;
                        System.out.println("Area of Rhombus: " + Area);
                        System.out.println("Perimeter of Rhombus: " + Perimeter);
                    }
                    case ("Cube") -> {
                        System.out.println("Input Side of Cube: ");
                        System.out.println("A = ");
                        double a = in.nextDouble();

                        CSA = 4 * a * a;
                        TSA = 6 * a * a;
                        Volume = a * a * a;
                        System.out.println("CSA of Cube: " + CSA);
                        System.out.println("TSA of Cube: " + TSA);
                        System.out.println("Volume of Cube = " + Volume);
                    }
                    case ("Cuboid") -> {
                        System.out.println("Input Sides od Cuboid: ");
                        System.out.print("Length = ");
                        double l = in.nextDouble();
                        System.out.print("Breadth = ");
                        double b = in.nextDouble();
                        System.out.print("Height = ");
                        double h = in.nextDouble();

                        CSA = 2 * ((l * b) + (h * b));
                        TSA = 2 * ((l * b) + (b * h) + (h * l));
                        Volume = l * b * h;
                        System.out.println("CSA of Cuboid: " + CSA);
                        System.out.println("TSA of Cuboid: " + TSA);
                        System.out.println("Volume of Cuboid = " + Volume);
                    }
                    case ("Sphere") -> {
                        System.out.println("Input Radius of Sphere: ");
                        System.out.print("R = ");
                        double r = in.nextDouble();

                        TSA = 4 * pi * r * r;
                        Volume = 4/3 * pi * r * r * r;
                        System.out.println("TSA of Sphere: " + TSA);
                        System.out.println("Volume of Sphere = " + Volume);
                    }
                    case ("Cylinder") -> {
                        System.out.println("Input Radius & Height of Cylinder: ");
                        System.out.print("Radius = ");
                        double r = in.nextDouble();
                        System.out.print("Height = ");
                        double h = in.nextDouble();

                        CSA = 2 * pi * r * h;
                        TSA = 2 * pi * r * (r + h);
                        Volume = pi * r * r * h;
                        System.out.println("CSA of Cylinder: " + CSA);
                        System.out.println("TSA of Cylinder: " + TSA);
                        System.out.println("Volume of Cylinder = " + Volume);
                    }
                    case ("Cone") -> {
                        System.out.println("Input Radius & Height of Cone: ");
                        System.out.print("Radius = ");
                        double r = in.nextDouble();
                        System.out.print("Height = ");
                        double h = in.nextDouble();

                        double l = Math.sqrt((r * r) + (h * h));  // Slant height
                        CSA = pi * r * l;
                        TSA = (pi * r * r) + CSA;
                        Volume = 1/3 * pi * r * r * h;
                        System.out.println("CSA of Cone: " + CSA);
                        System.out.println("TSA of Cone: " + TSA);
                        System.out.println("Volume of Cone = " + Volume);
                    }
                    case ("Prism") -> {
                        System.out.println("Input Sides & Height of a Prism: ");
                        System.out.print("A = ");
                        double a = in.nextDouble();
                        System.out.print("B = ");
                        double b = in.nextDouble();
                        System.out.print("C = ");
                        double c = in.nextDouble();
                        System.out.print("H = ");
                        double h = in.nextDouble();

                        double s = (a + b + c) / 2;
                        Area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Base Area
                        CSA = (h * a) + (h * b) + (h * c);
                        TSA = CSA + (2 * Area);
                        Volume = Area * h;
                        System.out.println("CSA of Prism: " + CSA);
                        System.out.println("TSA of Prism: " + TSA);
                        System.out.println("Volume of Prism = " + Volume);
                    }
                    case ("Pyramid") -> {
                        System.out.println("Input Sides & Height of Pyramid: ");
                        System.out.print("Base Length = ");
                        double l = in.nextDouble();
                        System.out.print("Base Width = ");
                        double b = in.nextDouble();
                        System.out.print("Height = ");
                        double h = in.nextDouble();

                        CSA = (l * Math.sqrt((b/2 * b/2) + (h * h))) + (b * Math.sqrt((l/2 * l/2) + (h * h)));
                        TSA = CSA + (l * b);
                        Volume = l * b * h / 3;
                        System.out.println("CSA of Pyramid: " + CSA);
                        System.out.println("TSA of Pyramid: " + TSA);
                        System.out.println("Volume of Pyramid = " + Volume);
                    }
                    default -> System.out.println("Input a Valid Shape or Press Q to Exit");
                }
            }
        }
    }
}
