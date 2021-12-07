package at.ac.fhcampuswien.rect.solution2;

public class Square extends GeometryObject {

    private int edgeLength;

    public Square(int x, int y, int edgeLength) {
        super(x, y);
        this.edgeLength = edgeLength;
    }

    public void setSize(int edgeLength) {
        this.edgeLength = edgeLength;
    }
}
