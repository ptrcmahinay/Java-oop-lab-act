// this lab act uses extends as subclass

public class Lab2 {
    public static class Direction{
        public String d1 = "North";
        public String d2 = "South";
        public String d3 = "East";
        public String d4 = "West";
    }

    public static class Part1 extends Lab2.Direction{

    }
    public static class Part2 extends Lab2.Direction{

    }
    public static class Part3 extends Lab2.Direction{

    }

    public static class Part4 extends Lab2.Direction{

    }

    public static void main(String[] args){
        Lab2.Part1 obp1 = new Part1();
        Lab2.Part2 obp2 = new Part2();
        Lab2.Part3 obp3 = new Part3();
        Lab2.Part4 obp4 = new Part4();

        System.out.println("The direction is " + obp1.d1);
        System.out.println("The direction is " + obp2.d2);
        System.out.println("The direction is " + obp3.d3);
        System.out.println("The direction is " + obp4.d4);
    } 
}
