public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int c = 7;
        Test t = new Test();
        long b = t.calcArea(1,2);
//        System.out.println("Area is : " + t.calcArea(c,10));

    }
    static class Test {
        int calcArea (int height, int width) {
            return height * width;
        }
    }
}
