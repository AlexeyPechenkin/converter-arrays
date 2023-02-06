public class Main {
    public static void main(String[] args) {
        int[][] myPoints1 = {{0, 1}, {2, 4}};
        int[][] myPoints2 = {{4, 3}, {17, 0}, {1, 8}, {11,6}};
        LimitingRectangle rectNew1 = new LimitingRectangle(myPoints1);
        LimitingRectangle rectNew2 = new LimitingRectangle(myPoints2);
        System.out.println(rectNew2.getWidth());
        System.out.println(rectNew2.getHight());
        System.out.println(rectNew2.getBorders());
        System.out.println("add out " + rectNew1.getWidth());
    }
}
