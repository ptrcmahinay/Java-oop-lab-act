// This lab activity includes the return type 
public class Lab3{
    public static class Calc{
        public void add(int x, int y){
            int a = x;
            int b = y;
            int c = a + b;
            System.out.println("Sum is " + c);
        }

        public int sub(int r, int j){
            int m = r;
            int n = j;
            int o = m - n;
            return o;
        }
    }

    public static void main(String[] Args){
        Calc ob = new Calc();
        ob.add(10, 5);
        int subResult = ob.sub(10, 5);
        System.out.println(subResult);
    }
}