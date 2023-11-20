
# Java OOP - Lab Activity in School
Hello, World! I wanted to document and put these lab activities in my github repo as I learned Java language which is used in my OOP subject for second year at my University.

### 1. [Lab Activity 1](lab_act_files/Lab1.java) 
 
   - I learned here how to make `variables` and `methods` in class and how to initialize an object using `new` keyword.

### 2. [Lab Activity 2 - part 1 ](lab_act_files/Lab2.java) and [part 2](lab_act_files/Lab2_1.java) 
   - In this lab we use the `inheritance` using the `extends` keyword to have a subclass.

### 3. [Lab Activity 3 - part 1 ](lab_act_files/Lab3.java) and [part 2](lab_act_files/Lab3_1.java) 
- In this lab I learned how to use a `parameterized method` and a method that `returns` a value

### 4. [Lab Activity 4](lab_act_files/Lab4.java) 
- In this lab I learned how to use the `getter` and `setter` methods and the `private` access modifier to variables. We also used the `this` keyword and the `Scanner` class.

### 5. [Lab Activity 5](lab_act_files/Lab5.java) 
- In this lab we used `parameterized constructors` and `if-else` statements to print the whether the average is ood or even.



## Midterm Examination [Code](lab_act_files/Exam.java) 
- The exam about copy constructors.

<details>
<summary>The exam with fill in the blanks</summary>
<br>

```java

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor to create a square
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    // Copy constructor
    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.________;
        this.height = rectangle.________;
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
        Rectangle ________ = new Rectangle(10.0, 5.0);
        Rectangle ________ = new Rectangle(8.0);

        System.out.println("Rectangle 1: " + rectangle1);
        System.out.println("Rectangle 2: " + rectangle2);

        Rectangle ________ = new Rectangle(________);
        System.out.println("Rectangle 3: " + rectangle3);
    }

   //  What is the output of this code?
   // _____________________________________
   // _____________________________________
   // _____________________________________
}
```

</details>


