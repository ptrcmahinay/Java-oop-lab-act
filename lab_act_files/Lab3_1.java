// this lab act used Constructor

public class Lab3_1 {
    public static class Variables{
        public byte numSiblings;
        public short favNum;
        public int age;
        public long phoneNum;
        public float weightInKg;
        public double heightInCm;
        public char gender;
        public boolean isStudent;

        public Variables(byte numSiblings, short favNum, int age, long phoneNum, float weightInKg, double heightInCm, char gender, boolean isStudent){
            this.numSiblings = numSiblings;
            this.favNum = favNum;
            this.age = age;
            this.phoneNum = phoneNum;
            this.weightInKg = weightInKg;
            this.heightInCm = heightInCm;
            this.gender = gender;
            this.isStudent = isStudent;
        }

        public void view(){
            System.out.println("BYTE: " + numSiblings);
            System.out.println("SHORT: " + favNum);
            System.out.println("INT: " + age);
            System.out.println("LONG: " + phoneNum);
            System.out.println("FLOAT: " + weightInKg);
            System.out.println("DOUBLE: " + heightInCm);
            System.out.println("CHAR: " + gender);
            System.out.println("BOOLEAN: " + isStudent);
        }
    }

    public static void main(String[] args){
        Variables var = new Variables((byte) 5, (short) 22, 20, 9058216218L, 42f, 165.5, 'F', true);
        var.view();
    }
}
