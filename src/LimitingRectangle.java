public class LimitingRectangle {
    public int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    int getMin(int ind) {
        int someMin = points[0][ind];
        for (int i = 0; i < points.length; i++) {
            if (points[i][ind] < someMin) {
                someMin = points[i][ind];
            }
        }
        return someMin;
    }

    int getMax(int ind) {
        int someMax = points[0][ind];
        for (int i = 0; i < points.length; i++) {
            if (points[i][ind] > someMax) {
                someMax = points[i][ind];
            }
        }
        return someMax;
    }

    int getWidth() {
        return this.getMax(0) - this.getMin(0);
    }

    int getHight() {
        return this.getMax(1) - this.getMin(1);
    }

    String getBorders() {
        return this.getMin(1) + ", " + this.getMax(1) + ", " + this.getMin(0) + ", " + getMax(0);
    }
}
