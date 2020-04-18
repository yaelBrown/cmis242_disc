package W5;

public class Week5 extends SizeAbst {
    private int width = 0;
    private int height = 0;
    private String name;
    private int area = 0;
    private int circ = 0;

    public Week5(String n) {
        this.name = n;
    }

    public void setDemensions(int w, int l) {
        this.width = w;
        this.height = l;
    }

    public String build() {
        return "Currently building !";
    }

    public void computeArea() {
        this.area = this.height * this.width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public int getCirc() {
        return (int) 3.14 * (this.width / 2);
    }

    public static void main(String[] args) {

        Week5 square = new Week5("Square");
        square.setDemensions(4,6);
        square.computeArea();

        System.out.println(square.getName() + " has an area of " + square.getArea());

        System.out.println("square.getWidth() = " + square.getWidth());
        System.out.println("square.getHeight() = " + square.getHeight());

        Week5 circle = new Week5("circle");
        circle.setDemensions(6,0);

        System.out.println("circle.getCirc() = " + circle.getCirc());

    }

}
