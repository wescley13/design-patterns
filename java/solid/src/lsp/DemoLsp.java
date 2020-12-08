package lsp;

public class DemoLsp {

    static void useIt(Rectangle rectangle){
        int width = rectangle.getWidth();

        rectangle.setHeight(10);
        System.out
                .println("Expected area of " + width * 10 + ", got " + rectangle.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        useIt(rectangle);

        Rectangle square = new Square();
        square.setHeight(2);
        square.setWidth(3);
        useIt(square);
    }

}
