package lsp;

public class Square extends Rectangle {

    public Square(){}

    public Square(int size){
        super.width = super.height = size;
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        // Violated de Liskov principle
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        // Violated de Liskov principle
        super.setHeight(width);
    }
}
