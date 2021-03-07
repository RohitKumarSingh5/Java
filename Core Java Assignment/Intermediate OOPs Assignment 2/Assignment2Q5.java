class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
        return "Rectangle";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
        return "Line";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
        return "Cube";
    }
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
        Rectangle5 r =new Rectangle5();
        Line5 l = new Line5();
        Cube5 c = new Cube5();
        System.out.println(r.draw());
        System.out.println(l.draw());
        System.out.println(c.draw());
    }
}