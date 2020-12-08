package ocp;

import java.util.List;

public class OcpDemo {

    public static void main(String[] args) {

        Product iphone = new Product("Iphone", Color.BLUE, Size.SMALL);
        Product galaxy = new Product("Galaxy", Color.RED, Size.SMALL);
        Product tv = new Product("TV", Color.GREEN, Size.MEDIUM);
        Product bed = new Product("Single Bed", Color.BLUE, Size.MEDIUM);
        Product refrigerator = new Product("Red Refrigerator", Color.RED, Size.LARGE);
        Product greenRefrigerator = new Product("Green Refrigerator", Color.GREEN, Size.LARGE);

        List<Product> listProduct = List.of(iphone, galaxy, tv,
                bed, refrigerator, greenRefrigerator);

        ProductFilter productFilter = new ProductFilter();

        System.out.println("Filter by Color");
        productFilter
                .filter(listProduct, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println("Product name by color: " + p.getName()));

        System.out.println("Filter by size");
        productFilter
                .filter(listProduct, new SizeSpecification(Size.MEDIUM))
                .forEach(p -> System.out.println("Product name by medium size: " + p.getName()));

        System.out.println("Filter AndSpecification");
        productFilter
                .filter(listProduct, new AndSpecification<>(new ColorSpecification(Color.RED),
                                                            new SizeSpecification(Size.LARGE)))
                .forEach(p -> System.out.println("Product name by coor and size: " + p.getName()));

    }

}
