public class Lab2_1 {
    public static class Animal{
        public void viewsound1(){
            System.out.println("Moo moo");
        }

        public void viewsound2(){
            System.out.println("Mee mee");
        }
        
        public void viewsound3(){
            System.out.println("Oink oink");
        }

    }

    public static class Cow extends Animal{

    }
    
    public static class Sheep extends Animal{

    }

    public static class Pig extends Animal{

    }

    public static void main (String[] Args){
        Lab2_1.Cow obcow = new Cow();
        Lab2_1.Sheep obsheep = new Sheep();
        Lab2_1.Pig obpig = new Pig();

        obcow.viewsound1();
        obsheep.viewsound2();
        obpig.viewsound3();
    } 
}
