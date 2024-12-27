package Labs_3;

public class Book extends Item{
    private String size;

    public Book(String id, String name, double price, int quantity, String size){
        super(id, name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
