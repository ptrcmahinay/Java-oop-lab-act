// Copy Constructors

public class Exam {
    private double width;
    private double height;

    public Exam(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor to create a square
    public Exam(double side) {
        this.width = side;
        this.height = side;
    }

    // Copy constructor
    public Exam(Exam Exam) {
        this.width = Exam.width;
        this.height = Exam.height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle {width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Exam exam1 = new Exam(10.0, 5.0);
        Exam exam2 = new Exam(8.0);

        System.out.println("Rectangle 1: " + exam1);
        System.out.println("Rectangle 2: " + exam2);

        Exam exam3 = new Exam(exam2);
        System.out.println("Rectangle 3: (copy of Rectangle2) " + exam3);
    }
}
