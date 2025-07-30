import java.util.Scanner;
// Parent class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Price  : ₹" + price);
    }
}

// Child class
class DiscountedProduct extends Product {
    private double discountPercent;

    public DiscountedProduct(String name, double price, double discountPercent) {
        super(name, price);
        this.discountPercent = discountPercent;
    }

    // Overriding the display method
    @Override
    public void displayInfo() {
        super.displayInfo();
        double discountedPrice = (getPrice() /100) * (100-discountPercent);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Discounted Price: ₹" + discountedPrice);
    }
}

// Main class
public class MobileDiscount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int a=s.nextInt();
        int dis=s.nextInt();
        DiscountedProduct dp = new DiscountedProduct(str,a,dis);
        dp.displayInfo();
    }
}
