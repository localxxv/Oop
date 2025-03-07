import java.util.Arrays;

public class Polygon {
    private Point[] points;

    public Point[] getPoints() {
        return this.points;
    }

    public Polygon(Point[] points) {
        this.points = new Point[points.length];
        for (int i=0; i < this.points.length; i++) {
            this.points[i] = new Point(points[i]);

        }

    }


    public Polygon(Polygon old) {
        Point[] oldPoints = old.getPoints();
        this.points = new Point[old.getPoints().length];
        for (int i=0; i < this.points.length; i++) {
            this.points[i] = new Point(oldPoints[i]);

        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.points.length; i++) {
            result += "\nPunkt nr. " + (i + 1) + "\n" + this.points[i].toString();
        }
        return result; 
    }

    public String toSvg() {
        String result = "<polygon points=\"";
        for (int i = 0; i < this.points.length; i++) {
            result += this.points[i].getX() + "," + this.points[i].getX(); 
            if (i < this.points.length - 1) {
                result += " ";
            }
        }
        result += "\" style=\"fill:none;stroke:black;stroke-width:1\" />";
        return result;
    }
}
