

public class Lab1{

    public static class Month {
        public String m1 = "January";
        public String m2 = "February";
        public String m3 = "March";
        public String m4 = "April";
        public String m5 = "May";
        public String m6 = "June";
        public String m7 = "July";
        public String m8 = "August";
        public String m9 = "September";
        public String m10 = "October";
        public String m11 = "November";
        public String m12 = "December";
    
        public void viewBirthDate(){
            System.out.println("Birthdate of Mahinay is " + m10);
        }
    }

    public static class Stone {
        public String stone1 = "Garnet";
        public String stone2 = "Amethyst";
        public String stone3 = "Aqumarine";
        public String stone4 = "Diamond";
        public String stone5 = "Emerald";
        public String stone6 = "Pearl";
        public String stone7 = "Ruby";
        public String stone8 = "Peridot";
        public String stone9 = "Sapphire";
        public String stone10 = "Pink Tourmaline";
        public String stone11 = "Yellow Topaz";
        public String stone12 = "Blue Topaz";
    
        public void viewStone(){
            System.out.println("My stone is " + stone10);
        }
    
    }
    public static void main(String[] args){
        Lab1.Month obm = new Month();
        Lab1.Stone obs = new Stone();

        obm.viewBirthDate();
        obs.viewStone();
    }
}