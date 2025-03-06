public class Segment {
    public Point start, end;

    
    public Segment() {
        this.start = new Point();
        this.end = new Point();
    }

   
    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double length() {
        return Math.sqrt(Math.pow((this.end.x - this.start.x), 2) + Math.pow((this.end.y - this.start.y), 2));
    }

    
    public String toString() {
        return "Segment[start=" + start.toString() + ", end=" + end.toString() + "]";
    }

    public static Segment longestSegment(Segment[] arr) {
        Segment longest = arr[0];
        for (Segment s : arr) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }
}
