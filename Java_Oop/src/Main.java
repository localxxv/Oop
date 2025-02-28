public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 19;
        p1.y = 23;

        System.out.println(p1.toString());

        p1.translate(1, 1);

        System.out.println(p1.toString());


        Point p2 = p1.translated(1, 1);
        Point p3 = p2.translated(2, 2);
        Point p4 = p3.translated(3, 3);
        Segment seg2 = new Segment();
        seg2.start = p3;
        seg2.end = p4;
        System.out.println(p2.toString());

        Segment seg1 = new Segment();
        seg1.start = p1;
        seg1.end = p2;

        System.out.println(seg1.length());

        Segment[] segs = {seg1,seg2};
        System.out.println(Segment.longestSegment(segs));
    }
}