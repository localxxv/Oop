public class SvgScene {
    private Polygon[] polygons;
    private int replaceIndex=0;
    public SvgScene() {
        this.polygons = new Polygon[3];
        
    }

    public  void addPolygon(Polygon polygon) {
        for (int i =0; i < this.polygons.length; i++) {
            if (this.polygons[i] == null) {
                this.polygons[i] = polygon;
                return;
            }
        }
    

    this.polygons[this.replaceIndex]=polygon;
    this.replaceIndex++;
    if (this.replaceIndex == this.polygons.length){
        this.replaceIndex = 0;
    }
}

public String toSvg() {
    String result = "";
    for (int i=0; i<this.polygons.length; i++) {
        result += "Polygon nr. " + (i+1) + "\n" + this.polygons[i].toSvg();
    }
}
return result;

}
