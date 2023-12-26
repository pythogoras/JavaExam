/*Написати клас, який виконувати роль бази продуктів складу. Він повинен зберігати в собі назву продукту та її 
кількість на складі. Також в класі повинні бути реалізовані функції додавання, видалення продукту, показу списку 
усіх продуктів*/
//java 20.0.1
package task2;

import java.util.ArrayList;
import java.util.Scanner;



public class ProductsDatabase {
    private ArrayList<Product> products;
    private static Scanner input;
    private static boolean terminal;
    private static final String help = "Commands:\nadd - for adding product\ndel - for remove productn\nshow - for show products\nexit - for exit";

    private ProductsDatabase () {
        this.products = new ArrayList<>();
    }

    static {
        input = new Scanner(System.in);
        terminal = true;
    }
    public static void main(String[] args) {
        ProductsDatabase productsDB = new ProductsDatabase();
        while (terminal) {
            System.out.println(help);
            System.out.print("Input please command: ");
            String command = input.next();
            switch (command) {
                case "add":
                    productsDB.addProduct();
                    break;
                case "del":
                    productsDB.removeProduct();
                    break;
                case "show":
                    productsDB.showProducts();
                    break;
                case "exit":
                    terminal = false;
                    break;
                default:
                    System.out.println("Error! Not exist command " + command);
                    break;
            }
        }
    }

    void addProduct() {
        String name = null;
        int quantity = 0;
        while (quantity == 0 && name == null) {
            System.out.print("Input please name product: ");
            name = input.next();
            System.out.print("Input please quantity of product: ");
            quantity = input.nextInt();
        }
        Product product = new Product(name, quantity);
        this.products.add(product);
    }

    void removeProduct() {
        System.out.print("Input please name product: ");
        String name = input.next();
        boolean existProduct = false;
        for (Product product : this.products) {
           if (product.getName().equals(name)) {
                this.products.remove(product);
                existProduct = true;
                System.out.println("product " + name + " deleted");
                break;
           } 
        }
        if (!existProduct) {System.out.println("product " + name + " not exist");}
    }

    void showProducts() {
        for (Product product : this.products) {
            System.out.println(product.getName() + " - " + product.getQuantity());
        }
    }
}
