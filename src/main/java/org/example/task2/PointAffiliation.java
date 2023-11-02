package org.example.task2;

public class PointAffiliation {

    public static boolean checkRectangle(float x, float y, int x1, int y1, int x2, int y2) {

        if (x < x1) {
            return false;
        }
        if (x > x2) {
            return false;
        }
        if (y > y1) {
            return false;
        }
        if (y < y2) {
            return false;
        }

        return true;
    }

    public static boolean checkFigure(float x, float y) {

        return PointAffiliation.checkRectangle(x, y, -4, 5, 4, 0) || PointAffiliation.checkRectangle(x, y, -6, 0, 6, -3);
    }
}
