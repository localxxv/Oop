public class SolidFilledPolygon {

    private String color; 
    public  SolidFilledPolygon(Vec2[] points, String color) {
     super(points);
     this.color = color;
    }
    public String toSvg(String param);
    
}
