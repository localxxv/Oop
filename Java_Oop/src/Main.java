public class Main {
    public static void main(String[] args) {
        // final Point p1 = new Point(19, 23);

        // System.out.println(p1.toString());

        // p1.translate(1, 1);

        // System.out.println(p1.toString());

        // Point p2 = p1.translated(1, 1);
        // Point p3 = p2.translated(2, 2);
        // Point p4 = p3.translated(3, 3);

        // Segment seg2 = new Segment(p3, p4);
        // System.out.println(p2.toString());

        // Segment seg1 = new Segment(p1, p2);
        // System.out.println(seg1.length());

        // Segment[] segs = {seg1, seg2};
        // System.out.println(Segment.longestSegment(segs));

        Point p1 = new Point( 11, 12);
        Point p2 = new Point( 21, 22);
        Point p3 = new Point( 31, 32);

        Point[] points = {p1,p2,p3};
        Polygon polygon1 = new Polygon(points);
        System.out.println(polygon1);

        p1.setY(765);
        System.out.println(polygon1);
        Polygon polygon2 = new Polygon(polygon1);
        polygon2.getPoints()[1].setX(234);
        
    }
}