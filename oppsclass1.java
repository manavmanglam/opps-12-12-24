// Define an interface
interface Shape {
    // Abstract method
    void draw();
    
    // Abstract method
    double getArea();
    
    // Default method
    default void printShape() {
      System.out.println("This is a shape");
    }
    
    // Static method
    static void printShapeInfo() {
      System.out.println("Shape info");
    }
  }
  
  // Implement the interface
  class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
      this.radius = radius;
    }
    
    // Implement the draw method
    public void draw() {
      System.out.println("Drawing a circle");
    }
    
    // Implement the getArea method
    public double getArea() {
      return Math.PI * radius * radius;
    }
  }
  
  class Rectangle implements Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
    }
    
    // Implement the draw method
    public void draw() {
      System.out.println("Drawing a rectangle");
    }
    
    // Implement the getArea method
    public double getArea() {
      return length * width;
    }
  }
  
  // Use the interface
  public class oppsclass1 {
    public static void main(String[] args) {
      Shape circle = new Circle(5.0);
      circle.draw();
      System.out.println("Area: " + circle.getArea());
      circle.printShape();
      Shape.printShapeInfo();
      
      Shape rectangle = new Rectangle(4.0, 5.0);
      rectangle.draw();
      System.out.println("Area: " + rectangle.getArea());
      rectangle.printShape();
      Shape.printShapeInfo();
    }
  }