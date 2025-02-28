public class Segment {
     public Point start,end;
     public double length(){
         return Math.sqrt(Math.pow((this.end.x - this.start.y), 2) + Math.pow((this.end.y - this.start.y), 2));
    }
    public Segment(Point start, Point end) {
         this.start=start;
         this.end=end;

    }

    public static Segment longestSegment(Segment[]  arr) {
        Segment longest =arr[0];
        for (Segment s:arr) {
            if (s.length()>longest.length()){
                longest = s;
            }
        }
        return longest;
    }
}


