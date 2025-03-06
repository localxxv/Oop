public class Point {
    public double x;
    public double y;

    public String toString() {
        return "Wsp x= " + this.x + "\nWsp y= " + this.y;
    }

    public String toSvg() {
        return "<circle r=\"45\" cx=\"" + this.x + "\" cy=\"" + this.y + "\" fill=\"red\"/>";
    }

    public void translate(double dx, double dy)  {
        this.x=this.x + dx;
        this.y=this.y + dy;

    }

    public Point translated(double dx, double dy) {
        Point result = new Point();
        result.x=this.x+dx;
        result.y=this.y+dy;
        return result;
    }




}
