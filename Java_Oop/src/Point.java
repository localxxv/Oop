class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public String toString() {
        return "Wsp x= " + this.x + "\nWsp y= " + this.y;
    }

    public String toSvg() {
        return "<circle r=\"45\" cx=\"" + this.x + "\" cy=\"" + this.y + "\" fill=\"red\"/>";
    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public Point translated(double dx, double dy) {
        return new Point(this.x + dx, this.y + dy);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) { 
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {  
        this.y = y;
    }

    
}