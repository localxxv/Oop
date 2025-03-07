class Segment {
    Point start;
    private Point end;

    public Segment(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double length() {
        return Math.sqrt(Math.pow((this.end.x - this.start.x), 2) + Math.pow((this.end.y - this.start.y), 2));
    }

    @Override
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