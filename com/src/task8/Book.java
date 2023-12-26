package task8;



class Book {
    private String title;
    private int quantity;

    Book (String title, int quantity) {
        this.title = title;
        this.quantity = quantity;
    }

    String getTitle() {return this.title;}

    int getQuantity() {return this.quantity;}
}
